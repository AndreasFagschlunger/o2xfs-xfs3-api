package at.o2xfs.xfs.v3.cdm;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.UShort;
import at.o2xfs.xfs.cdm.SubType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import at.o2xfs.xfs.cdm.MixType;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import at.o2xfs.xfs.cdm.MixNumber;
import org.apache.commons.lang3.builder.EqualsBuilder;

@MemoryPropertyOrder({"mixNumber", "mixType", "subType", "name" })
public class MixType3 {

	public static class Builder {

		private MixNumber mixNumber;
		private MixType mixType;
		private SubType subType;
		private String name;

		public Builder() { }

		public Builder mixNumber(MixNumber mixNumber) {
			this.mixNumber = mixNumber;
			return this;
		}

		public Builder mixType(MixType mixType) {
			this.mixType = mixType;
			return this;
		}

		public Builder subType(SubType subType) {
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
	private final MixNumber mixNumber;

	@UShort
	private final MixType mixType;

	@UShort
	private final SubType subType;

	private final String name;

	protected MixType3(Builder builder) {
		mixNumber = builder.mixNumber;
		mixType = builder.mixType;
		subType = builder.subType;
		name = builder.name;
	}

	public MixNumber getMixNumber() {
		return mixNumber;
	}

	public MixType getMixType() {
		return mixType;
	}

	public SubType getSubType() {
		return subType;
	}

	public String getName() {
		return name;
	}

	public boolean equals(Object obj) {
		if(obj instanceof MixType3) {
			MixType3 mixType = (MixType3) obj;
			return new EqualsBuilder().append(mixNumber, mixType.mixNumber).append(mixType, mixType.mixType).append(subType, mixType.subType).append(name, mixType.name).isEquals();
		}
		return false;
	}

	public int hashCode() {
		return new HashCodeBuilder().append(mixNumber).append(mixType).append(subType).append(name).toHashCode();
	}

	public String toString() {
		return new ToStringBuilder(this).append("mixNumber", mixNumber).append("mixType", mixType).append("subType", subType).append("name", name).toString();
	}
}
