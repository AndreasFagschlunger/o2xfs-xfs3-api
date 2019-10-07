package at.o2xfs.xfs.v3.cdm;

import at.o2xfs.xfs.cdm.Failure;
import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.xfs.databind.annotation.XfsEnum16;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import at.o2xfs.xfs.v3.cdm.CashUnit3;
import org.apache.commons.lang3.builder.EqualsBuilder;

@MemoryPropertyOrder({"failure", "cashUnit" })
public class CashUnitError3 {

	public static class Builder {

		private Failure failure;
		private CashUnit3 cashUnit;

		public Builder() { }

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

	public boolean equals(Object obj) {
		if(obj instanceof CashUnitError3) {
			CashUnitError3 cashUnitError = (CashUnitError3) obj;
			return new EqualsBuilder().append(failure, cashUnitError.failure).append(cashUnit, cashUnitError.cashUnit).isEquals();
		}
		return false;
	}

	public int hashCode() {
		return new HashCodeBuilder().append(failure).append(cashUnit).toHashCode();
	}

	public String toString() {
		return new ToStringBuilder(this).append("failure", failure).append("cashUnit", cashUnit).toString();
	}
}
