package at.o2xfs.xfs.v3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import at.o2xfs.memory.core.util.ByteArrayMemoryGenerator;
import at.o2xfs.memory.core.util.ByteArrayMemorySystem;
import at.o2xfs.memory.databind.MemoryMapper;
import at.o2xfs.memory.databind.ReadableMemory;

public abstract class BaseTest {

	protected final MemoryMapper mapper;

	private final ByteArrayMemorySystem memorySystem;

	public BaseTest() {
		mapper = new MemoryMapper();
		memorySystem = new ByteArrayMemorySystem();
	}

	public abstract Object getValue();

	@Test
	public final void deserializedValueShouldBeEqualToExpectedValue() throws IOException {
		testDeSerializable(getValue());
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
