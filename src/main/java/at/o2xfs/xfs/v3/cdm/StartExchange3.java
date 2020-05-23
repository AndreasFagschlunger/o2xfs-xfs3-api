package at.o2xfs.xfs.v3.cdm;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.UShort;
import at.o2xfs.memory.databind.annotation.win32.UShortArray;
import at.o2xfs.xfs.cdm.ExchangeType;
import at.o2xfs.xfs.databind.annotation.XfsEnum16;

@JsonDeserialize(builder = StartExchange3.Builder.class)
@MemoryPropertyOrder({ "exchangeType", "tellerId", "cashUnitNumbers" })
public class StartExchange3 {

	@JsonPOJOBuilder(withPrefix = "")
	public static class Builder {

		private ExchangeType exchangeType;
		private int tellerId;
		private int[] cashUnitNumbers;

		public Builder() {
		}

		public Builder exchangeType(ExchangeType exchangeType) {
			this.exchangeType = exchangeType;
			return this;
		}

		public Builder tellerId(int tellerId) {
			this.tellerId = tellerId;
			return this;
		}

		public Builder cashUnitNumbers(int... cashUnitNumbers) {
			this.cashUnitNumbers = cashUnitNumbers.clone();
			return this;
		}

		public StartExchange3 build() {
			return new StartExchange3(this);
		}
	}

	@XfsEnum16
	private final ExchangeType exchangeType;

	@UShort
	private final int tellerId;

	@UShortArray
	private final int[] cashUnitNumbers;

	protected StartExchange3(Builder builder) {
		exchangeType = builder.exchangeType;
		tellerId = builder.tellerId;
		cashUnitNumbers = builder.cashUnitNumbers;
	}

	public ExchangeType getExchangeType() {
		return exchangeType;
	}

	public int getTellerId() {
		return tellerId;
	}

	public int[] getCashUnitNumbers() {
		return cashUnitNumbers.clone();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof StartExchange3) {
			StartExchange3 startEx = (StartExchange3) obj;
			return new EqualsBuilder().append(exchangeType, startEx.exchangeType).append(tellerId, startEx.tellerId)
					.append(cashUnitNumbers, startEx.cashUnitNumbers).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(exchangeType).append(tellerId).append(cashUnitNumbers).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("exchangeType", exchangeType).append("tellerId", tellerId)
				.append("cashUnitNumbers", cashUnitNumbers).toString();
	}
}
