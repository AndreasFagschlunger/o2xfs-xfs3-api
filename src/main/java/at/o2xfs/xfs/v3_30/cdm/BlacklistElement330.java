package at.o2xfs.xfs.v3_30.cdm;

import at.o2xfs.memory.databind.annotation.win32.UnicodeString;
import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.ULong;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import at.o2xfs.xfs.util.CurrencyId;
import org.apache.commons.lang3.builder.EqualsBuilder;

@MemoryPropertyOrder({"serialNumber", "currencyId", "value" })
public class BlacklistElement330 {

	public static class Builder {

		private String serialNumber;
		private CurrencyId currencyId;
		private long value;

		public Builder() { }

		public Builder serialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
			return this;
		}

		public Builder currencyId(CurrencyId currencyId) {
			this.currencyId = currencyId;
			return this;
		}

		public Builder value(long value) {
			this.value = value;
			return this;
		}

		public BlacklistElement330 build() {
			return new BlacklistElement330(this);
		}
	}

	@UnicodeString
	private final String serialNumber;

	private final CurrencyId currencyId;

	@ULong
	private final long value;

	protected BlacklistElement330(Builder builder) {
		serialNumber = builder.serialNumber;
		currencyId = builder.currencyId;
		value = builder.value;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public CurrencyId getCurrencyId() {
		return currencyId;
	}

	public long getValue() {
		return value;
	}

	public boolean equals(Object obj) {
		if(obj instanceof BlacklistElement330) {
			BlacklistElement330 blacklistElement = (BlacklistElement330) obj;
			return new EqualsBuilder().append(serialNumber, blacklistElement.serialNumber).append(currencyId, blacklistElement.currencyId).append(value, blacklistElement.value).isEquals();
		}
		return false;
	}

	public int hashCode() {
		return new HashCodeBuilder().append(serialNumber).append(currencyId).append(value).toHashCode();
	}

	public String toString() {
		return new ToStringBuilder(this).append("serialNumber", serialNumber).append("currencyId", currencyId).append("value", value).toString();
	}
}
