package at.o2xfs.xfs.v3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import at.o2xfs.memory.databind.MemoryMapper;
import at.o2xfs.memory.databind.ReadableMemory;
import at.o2xfs.memory.databind.impl.ByteArrayMemoryGenerator;
import at.o2xfs.memory.databind.impl.ByteArrayMemorySystem;

public abstract class BaseTest {

	protected final MemoryMapper mapper;

	public BaseTest() {
		mapper = new MemoryMapper();
	}

	public abstract Object getValue();

	@Test
	public void test() {
		Object expected = getValue();
		ByteArrayMemorySystem memorySystem = new ByteArrayMemorySystem();
		ReadableMemory memory;
		try (ByteArrayMemoryGenerator gen = memorySystem.createGenerator()) {
			mapper.write(gen, expected);
			memory = gen.getMemory();
		}
		System.out.println("memory=" + memory);
		Object actual = mapper.read(memory, expected.getClass());
		assertEquals(expected, actual);
	}
}