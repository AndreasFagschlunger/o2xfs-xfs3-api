package at.o2xfs.xfs.v3.cdm;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.UShort;
import at.o2xfs.xfs.cdm.MixType;
import at.o2xfs.xfs.databind.annotation.XfsEnum16;

@JsonDeserialize(builder = MixType3.Builder.class)
@MemoryPropertyOrder({ "mixNumber", "mixType", "subType", "name" })
public class MixType3 {

	@JsonPOJOBuilder(withPrefix = "")
	public static class Builder {

		private int mixNumber;
		private MixType mixType;
		private int subType;
		private String name;

		public Builder() {
		}

		public Builder mixNumber(int mixNumber) {
			this.mixNumber = mixNumber;
			return this;
		}

		public Builder mixType(MixType mixType) {
			this.mixType = mixType;
			return this;
		}

		public Builder subType(int subType) {
			this.subType = subType;
			return this;
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public MixType3 build() {
			return new MixType3(this);
		}
	}

	@UShort
	private final int mixNumber;

	@XfsEnum16
	private final MixType mixType;

	@UShort
	private final int subType;

	private final String name;

	protected MixType3(Builder builder) {
		mixNumber = builder.mixNumber;
		mixType = builder.mixType;
		subType = builder.subType;
		name = builder.name;
	}

	public int getMixNumber() {
		return mixNumber;
	}

	public MixType getMixType() {
		return mixType;
	}

	public int getSubType() {
		return subType;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MixType3) {
			MixType3 mixType3 = (MixType3) obj;
			return new EqualsBuilder().append(mixNumber, mixType3.mixNumber).append(mixType, mixType3.mixType)
					.append(subType, mixType3.subType).append(name, mixType3.name).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(mixNumber).append(mixType).append(subType).append(name).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("mixNumber", mixNumber).append("mixType", mixType)
				.append("subType", subType).append("name", name).toString();
	}
}
