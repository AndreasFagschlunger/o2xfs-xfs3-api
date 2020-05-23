package at.o2xfs.xfs.v3.cdm;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.UShortArray;

@JsonDeserialize(builder = CountsChanged3.Builder.class)
@MemoryPropertyOrder({ "cashUnitNumbers" })
public class CountsChanged3 {

	@JsonPOJOBuilder(withPrefix = "")
	public static class Builder {

		private int[] cashUnitNumbers;

		public Builder() {
		}

		public Builder cashUnitNumbers(int... cashUnitNumbers) {
			this.cashUnitNumbers = cashUnitNumbers.clone();
			return this;
		}

		public CountsChanged3 build() {
			return new CountsChanged3(this);
		}
	}

	@UShortArray
	private final int[] cashUnitNumbers;

	protected CountsChanged3(Builder builder) {
		cashUnitNumbers = builder.cashUnitNumbers;
	}

	public int[] getCashUnitNumbers() {
		return cashUnitNumbers.clone();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof CountsChanged3) {
			CountsChanged3 countsChanged = (CountsChanged3) obj;
			return new EqualsBuilder().append(cashUnitNumbers, countsChanged.cashUnitNumbers).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(cashUnitNumbers).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("cashUnitNumbers", cashUnitNumbers).toString();
	}
}
