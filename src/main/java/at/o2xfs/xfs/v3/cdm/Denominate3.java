package at.o2xfs.xfs.v3.cdm;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.UShort;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import at.o2xfs.xfs.v3.cdm.Denomination3;
import org.apache.commons.lang3.builder.EqualsBuilder;

@MemoryPropertyOrder({"tellerId", "mixNumber", "denomination" })
public class Denominate3 {

	public static class Builder {

		private int tellerId;
		private int mixNumber;
		private Denomination3 denomination;

		public Builder() { }

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

	public boolean equals(Object obj) {
		if(obj instanceof Denominate3) {
			Denominate3 denominate = (Denominate3) obj;
			return new EqualsBuilder().append(tellerId, denominate.tellerId).append(mixNumber, denominate.mixNumber).append(denomination, denominate.denomination).isEquals();
		}
		return false;
	}

	public int hashCode() {
		return new HashCodeBuilder().append(tellerId).append(mixNumber).append(denomination).toHashCode();
	}

	public String toString() {
		return new ToStringBuilder(this).append("tellerId", tellerId).append("mixNumber", mixNumber).append("denomination", denomination).toString();
	}
}
