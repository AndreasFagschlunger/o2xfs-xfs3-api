package at.o2xfs.xfs.v3.cdm;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.Pointer;
import at.o2xfs.memory.databind.annotation.win32.UShort;

@MemoryPropertyOrder({ "tellerId", "mixNumber", "denomination" })
public class Denominate3 {

	public static class Builder {

		private int tellerId;
		private int mixNumber;
		private Denomination3 denomination;

		public Builder() {
		}

		public Builder tellerId(int tellerId) {
			this.tellerId = tellerId;
			return this;
		}

		public Builder mixNumber(int mixNumber) {
			this.mixNumber = mixNumber;
			return this;
		}

		public Builder denomination(Denomination3 denomination) {
			this.denomination = denomination;
			return this;
		}

		public Denominate3 build() {
			return new Denominate3(this);
		}
	}

	@UShort
	private final int tellerId;

	@UShort
	private final int mixNumber;

	@Pointer
	private final Denomination3 denomination;

	protected Denominate3(Builder builder) {
		tellerId = builder.tellerId;
		mixNumber = builder.mixNumber;
		denomination = builder.denomination;
	}

	public int getTellerId() {
		return tellerId;
	}

	public int getMixNumber() {
		return mixNumber;
	}

	public Denomination3 getDenomination() {
		return denomination;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Denominate3) {
			Denominate3 denominate = (Denominate3) obj;
			return new EqualsBuilder().append(tellerId, denominate.tellerId).append(mixNumber, denominate.mixNumber)
					.append(denomination, denominate.denomination).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(tellerId).append(mixNumber).append(denomination).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("tellerId", tellerId).append("mixNumber", mixNumber)
				.append("denomination", denomination).toString();
	}
}
