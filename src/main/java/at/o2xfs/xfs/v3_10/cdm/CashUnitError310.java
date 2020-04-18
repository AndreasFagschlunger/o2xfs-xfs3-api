package at.o2xfs.xfs.v3_10.cdm;

import at.o2xfs.xfs.cdm.Failure;
import at.o2xfs.xfs.v3.cdm.CashUnitError3;

public class CashUnitError310 extends CashUnitError3 {

	public static class Builder {

		private Failure failure;
		private CashUnit310 cashUnit;

		public Builder() {
		}

		public Builder failure(Failure failure) {
			return this;
		}

		public Builder cashUnit(CashUnit310 cashUnit) {
			this.cashUnit = cashUnit;
			return this;
		}

		public CashUnitError310 build() {
			return new CashUnitError310(this);
		}
	}

	protected CashUnitError310(Builder builder) {
		super(new CashUnitError3.Builder().failure(builder.failure).cashUnit(builder.cashUnit));
	}

	@Override
	public CashUnit310 getCashUnit() {
		return getCashUnit();
	}
}
