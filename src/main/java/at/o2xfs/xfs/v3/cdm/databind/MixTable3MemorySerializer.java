package at.o2xfs.xfs.v3.cdm.databind;

import java.io.IOException;

import at.o2xfs.memory.core.MemoryGenerator;
import at.o2xfs.memory.databind.MemorySerializer;
import at.o2xfs.memory.databind.SerializerProvider;
import at.o2xfs.xfs.v3.cdm.MixRow3;
import at.o2xfs.xfs.v3.cdm.MixTable3;

public class MixTable3MemorySerializer extends MemorySerializer<MixTable3> {

	@Override
	public void serialize(MixTable3 value, MemoryGenerator gen, SerializerProvider provider) throws IOException {
		gen.writeUnsignedShort(value.getMixNumber());
		gen.writeString(value.getName());
		gen.writeUnsignedShort(value.getMixRows().size());
		gen.writeUnsignedShort(value.getMixRows().get(0).getMixture().length);

		gen.startPointer();
		for (long each : value.getMixHeader()) {
			gen.writeUnsignedLong(each);
		}
		gen.endPointer();

		gen.startPointer();
		for (MixRow3 mixRow : value.getMixRows()) {
			gen.startPointer();
			gen.writeUnsignedLong(mixRow.getAmount());
			gen.startPointer();
			for (int each : mixRow.getMixture()) {
				gen.writeUnsignedShort(each);
			}
			gen.endPointer();
			gen.endPointer();
		}
		gen.endPointer();
	}
}
