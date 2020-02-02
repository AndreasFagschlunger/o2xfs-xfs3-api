package at.o2xfs.xfs.v3.cdm;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import at.o2xfs.memory.databind.annotation.MemoryDeserialize;
import at.o2xfs.memory.databind.annotation.MemorySerialize;
import at.o2xfs.xfs.v3.cdm.databind.MixTable3MemoryDeserializer;
import at.o2xfs.xfs.v3.cdm.databind.MixTable3MemorySerializer;

@MemorySerialize(using = MixTable3MemorySerializer.class)
@MemoryDeserialize(using = MixTable3MemoryDeserializer.class)
public class MixTable3 {

	public static class Builder {

		private int mixNumber;
		private String name;
		private long[] mixHeader;
		private final List<MixRow3> mixRows;

		public Builder() {
			mixHeader = new long[0];
			mixRows = new ArrayList<>();
		}

		public Builder mixNumber(int mixNumber) {
			this.mixNumber = mixNumber;
			return this;
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder mixHeader(long... mixHeader) {
			this.mixHeader = mixHeader.clone();
			return this;
		}

		public Builder addMixRows(MixRow3 element) {
			this.mixRows.add(element);
			return this;
		}

		public Builder addMixRows(MixRow3... elements) {
			for (MixRow3 each : elements) {
				this.mixRows.add(each);
			}
			return this;
		}

		public Builder mixRows(Iterable<MixRow3> elements) {
			this.mixRows.clear();
			return addAllMixRows(elements);
		}

		public Builder addAllMixRows(Iterable<MixRow3> elements) {
			for (MixRow3 each : elements) {
				this.mixRows.add(each);
			}
			return this;
		}

		public MixTable3 build() {
			return new MixTable3(this);
		}
	}

	private final int mixNumber;

	private final String name;

	private final long[] mixHeader;

	private final List<MixRow3> mixRows;

	protected MixTable3(Builder builder) {
		mixNumber = builder.mixNumber;
		name = builder.name;
		mixHeader = builder.mixHeader;
		mixRows = builder.mixRows;
	}

	public int getMixNumber() {
		return mixNumber;
	}

	public String getName() {
		return name;
	}

	public long[] getMixHeader() {
		return mixHeader.clone();
	}

	public List<MixRow3> getMixRows() {
		return mixRows;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MixTable3) {
			MixTable3 mixTable = (MixTable3) obj;
			return new EqualsBuilder().append(mixNumber, mixTable.mixNumber).append(name, mixTable.name)
					.append(mixHeader, mixTable.mixHeader).append(mixRows, mixTable.mixRows).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(mixNumber).append(name).append(mixHeader).append(mixRows).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("mixNumber", mixNumber).append("name", name)
				.append("mixHeader", mixHeader).append("mixRows", mixRows).toString();
	}
}
