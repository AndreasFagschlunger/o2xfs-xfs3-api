package at.o2xfs.xfs.v3_30.cdm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import at.o2xfs.memory.core.util.ByteArrayMemoryGenerator;
import at.o2xfs.memory.core.util.ByteArrayMemorySystem;
import at.o2xfs.memory.databind.MemoryMapper;
import at.o2xfs.memory.databind.ReadableMemory;
import at.o2xfs.xfs.cdm.CdmExecuteCommand;
import at.o2xfs.xfs.cdm.Position;
import at.o2xfs.xfs.databind.deser.XfsEnum16Deserializer;
import at.o2xfs.xfs.v3.cdm.PhysicalCu3;

class SynchronizeCommand330Test {

	private MemoryMapper mapper;
	private ByteArrayMemorySystem memorySystem;

	public SynchronizeCommand330Test() {
		mapper = new MemoryMapper();
		memorySystem = new ByteArrayMemorySystem();
	}

	@Test
	final void test() throws IOException {
		SynchronizeCommand330 expected = new SynchronizeCommand330.Builder().command(CdmExecuteCommand.COUNT.getValue())
				.cmdData(new PhysicalCu3.Builder().emptyAll(true).position(Position.FRONT).physicalPositionName("SLOT2")
						.build())
				.build();
		ReadableMemory memory;
		try (ByteArrayMemoryGenerator gen = memorySystem.createGenerator()) {
			mapper.write(gen, expected);
			memory = memorySystem.dereference(gen.allocate());
		}
		SynchronizeCommand330 actual = new SynchronizeCommand330.Builder().command(memory.nextUnsignedLong())
				.cmdData(deserializeCmdData(memory.nextReference())).build();
		assertEquals(expected, actual);
	}

	private Object deserializeCmdData(ReadableMemory memory) {
		return new PhysicalCu3.Builder().emptyAll(memory.nextUnsignedLong() != 0)
				.position((Position) new XfsEnum16Deserializer(Position.class).deserialize(memory, null))
				.physicalPositionName(memory.nextReference().nextString()).build();
	}

}
