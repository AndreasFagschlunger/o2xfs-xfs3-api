package at.o2xfs.xfs.v3.cdm;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.Short;
import at.o2xfs.xfs.util.CurrencyId;

@MemoryPropertyOrder({ "currencyId", "exponent" })
public class CurrencyExp3 {

	public static class Builder {

		private CurrencyId currencyId;
		private int exponent;

		public Builder() {
		}

		public Builder currencyId(CurrencyId currencyId) {
			this.currencyId = currencyId;
			return this;
		}

		public Builder exponent(int exponent) {
			this.exponent = exponent;
			return this;
		}

		public CurrencyExp3 build() {
			return new CurrencyExp3(this);
		}
	}

	private final CurrencyId currencyId;

	@Short
	private final int exponent;

	protected CurrencyExp3(Builder builder) {
		currencyId = builder.currencyId;
		exponent = builder.exponent;
	}

	public CurrencyId getCurrencyId() {
		return currencyId;
	}

	public int getExponent() {
		return exponent;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof CurrencyExp3) {
			CurrencyExp3 currencyExp = (CurrencyExp3) obj;
			return new EqualsBuilder().append(currencyId, currencyExp.currencyId).append(exponent, currencyExp.exponent)
					.isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(currencyId).append(exponent).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("currencyId", currencyId).append("exponent", exponent).toString();
	}
}
