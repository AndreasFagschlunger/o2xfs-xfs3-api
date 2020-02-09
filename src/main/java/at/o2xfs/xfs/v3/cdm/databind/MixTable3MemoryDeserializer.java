package at.o2xfs.xfs.v3.cdm.databind;

import java.util.ArrayList;
import java.util.List;

import at.o2xfs.memory.databind.DeserializationContext;
import at.o2xfs.memory.databind.ReadableMemory;
import at.o2xfs.memory.databind.deser.std.StdDeserializer;
import at.o2xfs.memory.databind.deser.win32.ULongArrayDeserializer;
import at.o2xfs.xfs.v3.cdm.MixRow3;
import at.o2xfs.xfs.v3.cdm.MixTable3;

public class MixTable3MemoryDeserializer extends StdDeserializer<MixTable3> {

	public MixTable3MemoryDeserializer() {
		super(MixTable3.class);
	}

	@Override
	public MixTable3 deserialize(ReadableMemory memory, DeserializationContext ctxt) {
		MixTable3.Builder builder = new MixTable3.Builder().mixNumber(memory.nextUnsignedShort())
				.name(memory.nextReference().nextString());
		int rows = memory.nextUnsignedShort();
		long[] mixHeader = new ULongArrayDeserializer().deserialize(memory, ctxt);
		builder.mixHeader(mixHeader);
		builder.mixRows(deserializeMixRows(memory.nextReference(), rows, mixHeader.length));
		return builder.build();
	}

	private List<MixRow3> deserializeMixRows(ReadableMemory memory, int rows, int cols) {
		List<MixRow3> result = new ArrayList<>(rows);
		for (int i = 0; i < rows; i++) {
			result.add(nextMixRow(memory.nextReference(), cols));
		}
		return result;
	}

	private MixRow3 nextMixRow(ReadableMemory memory, int cols) {
		long amount = memory.nextUnsignedLong();
		return new MixRow3.Builder().amount(amount).mixture(deserializeUShortArray(memory.nextReference(), cols))
				.build();
	}

	private int[] deserializeUShortArray(ReadableMemory memory, int length) {
		int[] result = new int[length];
		for (int i = 0; i < result.length; i++) {
			result[i] = memory.nextUnsignedShort();
		}
		return result;
	}
}
