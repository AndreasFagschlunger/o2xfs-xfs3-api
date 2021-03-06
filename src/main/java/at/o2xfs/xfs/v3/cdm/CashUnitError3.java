package at.o2xfs.xfs.v3.cdm;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.Pointer;
import at.o2xfs.xfs.cdm.Failure;
import at.o2xfs.xfs.databind.annotation.XfsEnum16;

@JsonDeserialize(builder = CashUnitError3.Builder.class)
@MemoryPropertyOrder({ "failure", "cashUnit" })
public class CashUnitError3 {

	@JsonPOJOBuilder(withPrefix = "")
	public static class Builder {

		private Failure failure;
		private CashUnit3 cashUnit;

		public Builder() {
		}

		public Builder failure(Failure failure) {
			this.failure = failure;
			return this;
		}

		public Builder cashUnit(CashUnit3 cashUnit) {
			this.cashUnit = cashUnit;
			return this;
		}

		public CashUnitError3 build() {
			return new CashUnitError3(this);
		}
	}

	@XfsEnum16
	private final Failure failure;

	@Pointer
	private final CashUnit3 cashUnit;

	protected CashUnitError3(Builder builder) {
		failure = builder.failure;
		cashUnit = builder.cashUnit;
	}

	public Failure getFailure() {
		return failure;
	}

	public CashUnit3 getCashUnit() {
		return cashUnit;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof CashUnitError3) {
			CashUnitError3 cashUnitError = (CashUnitError3) obj;
			return new EqualsBuilder().append(failure, cashUnitError.failure).append(cashUnit, cashUnitError.cashUnit)
					.isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(failure).append(cashUnit).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("failure", failure).append("cashUnit", cashUnit).toString();
	}
}
