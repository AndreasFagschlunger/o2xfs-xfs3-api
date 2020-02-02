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

	public BaseTest() {
		mapper = new MemoryMapper();
	}

	public abstract Object getValue();

	@Test
	public void test() throws IOException {
		Object expected = getValue();
		ByteArrayMemorySystem memorySystem = new ByteArrayMemorySystem();
		ReadableMemory memory;
		try (ByteArrayMemoryGenerator gen = memorySystem.createGenerator()) {
			mapper.write(gen, expected);
			memory = memorySystem.dereference(gen.allocate());
		}
		System.out.println("memory=" + memory);
		Object actual = mapper.read(memory, expected.getClass());
		assertEquals(expected, actual);
	}
}
