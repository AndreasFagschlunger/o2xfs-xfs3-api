package at.o2xfs.xfs.v3.cdm;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.ULong;
import at.o2xfs.memory.databind.annotation.win32.ULongArray;
import at.o2xfs.xfs.util.CurrencyId;

@MemoryPropertyOrder({ "currencyId", "amount", "count", "values", "cashBox" })
public class Denomination3 {

	public static class Builder {

		private CurrencyId currencyId;
		private long amount;
		private long[] values;
		private long cashBox;

		public Builder() {
			currencyId = CurrencyId.empty();
			values = new long[0];
		}

		public Builder currencyId(CurrencyId currencyId) {
			this.currencyId = currencyId;
			return this;
		}

		public Builder amount(long amount) {
			this.amount = amount;
			return this;
		}

		public Builder values(long... values) {
			this.values = values.clone();
			return this;
		}

		public Builder cashBox(long cashBox) {
			this.cashBox = cashBox;
			return this;
		}

		public Denomination3 build() {
			return new Denomination3(this);
		}
	}

	private final CurrencyId currencyId;

	@ULong
	private final long amount;

	@ULongArray
	private final long[] values;

	@ULong
	private final long cashBox;

	protected Denomination3(Builder builder) {
		currencyId = builder.currencyId;
		amount = builder.amount;
		values = builder.values;
		cashBox = builder.cashBox;
	}

	public CurrencyId getCurrencyId() {
		return currencyId;
	}

	public long getAmount() {
		return amount;
	}

	public long[] getValues() {
		return values.clone();
	}

	public long getCashBox() {
		return cashBox;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Denomination3) {
			Denomination3 denomination = (Denomination3) obj;
			return new EqualsBuilder().append(currencyId, denomination.currencyId).append(amount, denomination.amount)
					.append(values, denomination.values).append(cashBox, denomination.cashBox).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(currencyId).append(amount).append(values).append(cashBox).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("currencyId", currencyId).append("amount", amount)
				.append("values", values).append("cashBox", cashBox).toString();
	}
}
