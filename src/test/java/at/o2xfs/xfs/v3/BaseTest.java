package at.o2xfs.xfs.v3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;

import at.o2xfs.memory.core.util.ByteArrayMemoryGenerator;
import at.o2xfs.memory.core.util.ByteArrayMemorySystem;
import at.o2xfs.memory.databind.MemoryMapper;
import at.o2xfs.memory.databind.ReadableMemory;

public abstract class BaseTest {

	protected final MemoryMapper mapper;

	protected final ObjectMapper objectMapper;

	private final ByteArrayMemorySystem memorySystem;

	public BaseTest() {
		mapper = new MemoryMapper();
		memorySystem = new ByteArrayMemorySystem();
		objectMapper = new ObjectMapper().registerModule(new Jdk8Module());
	}

	public abstract Object getValue();

	@Test
	public final void deserializedValueShouldBeEqualToExpectedValue() throws IOException {
		testDeSerializable(getValue());
	}

	@Test
	public void shouldSerializeAndDesrializeFromJson() throws JsonProcessingException {
		Object expected = getValue();
		String content = objectMapper.writeValueAsString(expected);
		Object actual = objectMapper.readValue(content, expected.getClass());
		assertEquals(expected, actual);
	}

	protected ReadableMemory serialize(Object value) throws IOException {
		ReadableMemory result;
		try (ByteArrayMemoryGenerator gen = memorySystem.createGenerator()) {
			mapper.write(gen, value);
			result = memorySystem.dereference(gen.allocate());
		}
		return result;
	}

	protected void testDeSerializable(Object expected) throws IOException {
		ReadableMemory memory = serialize(expected);
		System.out.println("memory=" + memory);
		Object actual = mapper.read(memory, expected.getClass());
		System.out.println("actual=" + actual);
		assertEquals(expected, actual);
	}
}
