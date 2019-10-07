package at.o2xfs.xfs.v3.cdm;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.ULong;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import at.o2xfs.xfs.util.CurrencyId;
import org.apache.commons.lang3.builder.EqualsBuilder;

@MemoryPropertyOrder({"currencyId", "itemsReceived", "itemsDispensed", "coinsReceived", "coinsDispensed", "cashBoxReceived", "cashBoxDispensed" })
public class TellerTotals3 {

	public static class Builder {

		private CurrencyId currencyId;
		private long itemsReceived;
		private long itemsDispensed;
		private long coinsReceived;
		private long coinsDispensed;
		private long cashBoxReceived;
		private long cashBoxDispensed;

		public Builder() { }

		public Builder currencyId(CurrencyId currencyId) {
			this.currencyId = currencyId;
			return this;
		}

		public Builder itemsReceived(long itemsReceived) {
			this.itemsReceived = itemsReceived;
			return this;
		}

		public Builder itemsDispensed(long itemsDispensed) {
			this.itemsDispensed = itemsDispensed;
			return this;
		}

		public Builder coinsReceived(long coinsReceived) {
			this.coinsReceived = coinsReceived;
			return this;
		}

		public Builder coinsDispensed(long coinsDispensed) {
			this.coinsDispensed = coinsDispensed;
			return this;
		}

		public Builder cashBoxReceived(long cashBoxReceived) {
			this.cashBoxReceived = cashBoxReceived;
			return this;
		}

		public Builder cashBoxDispensed(long cashBoxDispensed) {
			this.cashBoxDispensed = cashBoxDispensed;
			return this;
		}

		public TellerTotals3 build() {
			return new TellerTotals3(this);
		}
	}

	private final CurrencyId currencyId;

	@ULong
	private final long itemsReceived;

	@ULong
	private final long itemsDispensed;

	@ULong
	private final long coinsReceived;

	@ULong
	private final long coinsDispensed;

	@ULong
	private final long cashBoxReceived;

	@ULong
	private final long cashBoxDispensed;

	protected TellerTotals3(Builder builder) {
		currencyId = builder.currencyId;
		itemsReceived = builder.itemsReceived;
		itemsDispensed = builder.itemsDispensed;
		coinsReceived = builder.coinsReceived;
		coinsDispensed = builder.coinsDispensed;
		cashBoxReceived = builder.cashBoxReceived;
		cashBoxDispensed = builder.cashBoxDispensed;
	}

	public CurrencyId getCurrencyId() {
		return currencyId;
	}

	public long getItemsReceived() {
		return itemsReceived;
	}

	public long getItemsDispensed() {
		return itemsDispensed;
	}

	public long getCoinsReceived() {
		return coinsReceived;
	}

	public long getCoinsDispensed() {
		return coinsDispensed;
	}

	public long getCashBoxReceived() {
		return cashBoxReceived;
	}

	public long getCashBoxDispensed() {
		return cashBoxDispensed;
	}

	public boolean equals(Object obj) {
		if(obj instanceof TellerTotals3) {
			TellerTotals3 tellerTotals = (TellerTotals3) obj;
			return new EqualsBuilder().append(currencyId, tellerTotals.currencyId).append(itemsReceived, tellerTotals.itemsReceived).append(itemsDispensed, tellerTotals.itemsDispensed).append(coinsReceived, tellerTotals.coinsReceived).append(coinsDispensed, tellerTotals.coinsDispensed).append(cashBoxReceived, tellerTotals.cashBoxReceived).append(cashBoxDispensed, tellerTotals.cashBoxDispensed).isEquals();
		}
		return false;
	}

	public int hashCode() {
		return new HashCodeBuilder().append(currencyId).append(itemsReceived).append(itemsDispensed).append(coinsReceived).append(coinsDispensed).append(cashBoxReceived).append(cashBoxDispensed).toHashCode();
	}

	public String toString() {
		return new ToStringBuilder(this).append("currencyId", currencyId).append("itemsReceived", itemsReceived).append("itemsDispensed", itemsDispensed).append("coinsReceived", coinsReceived).append("coinsDispensed", coinsDispensed).append("cashBoxReceived", cashBoxReceived).append("cashBoxDispensed", cashBoxDispensed).toString();
	}
}
