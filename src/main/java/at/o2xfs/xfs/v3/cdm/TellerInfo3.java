package at.o2xfs.xfs.v3.cdm;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.UShort;
import at.o2xfs.xfs.util.CurrencyId;

@JsonDeserialize(builder = TellerInfo3.Builder.class)
@MemoryPropertyOrder({"tellerId", "currencyId" })
public class TellerInfo3 {

	@JsonPOJOBuilder(withPrefix = "")
	public static class Builder {

		private int tellerId;
		private CurrencyId currencyId;

		public Builder() { }

		public Builder tellerId(int tellerId) {
			this.tellerId = tellerId;
			return this;
		}

		public Builder currencyId(CurrencyId currencyId) {
			this.currencyId = currencyId;
			return this;
		}

		public TellerInfo3 build() {
			return new TellerInfo3(this);
		}
	}

	@UShort
	private final int tellerId;

	private final CurrencyId currencyId;

	protected TellerInfo3(Builder builder) {
		tellerId = builder.tellerId;
		currencyId = builder.currencyId;
	}

	public int getTellerId() {
		return tellerId;
	}

	public CurrencyId getCurrencyId() {
		return currencyId;
	}

	public boolean equals(Object obj) {
		if(obj instanceof TellerInfo3) {
			TellerInfo3 tellerInfo = (TellerInfo3) obj;
			return new EqualsBuilder().append(tellerId, tellerInfo.tellerId).append(currencyId, tellerInfo.currencyId).isEquals();
		}
		return false;
	}

	public int hashCode() {
		return new HashCodeBuilder().append(tellerId).append(currencyId).toHashCode();
	}

	public String toString() {
		return new ToStringBuilder(this).append("tellerId", tellerId).append("currencyId", currencyId).toString();
	}
}
