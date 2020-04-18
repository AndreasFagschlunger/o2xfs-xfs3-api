package at.o2xfs.xfs.v3_10.cdm;

import java.util.ArrayList;
import java.util.List;

import at.o2xfs.xfs.v3.cdm.CashUnitInfo3;

public class CashUnitInfo310 extends CashUnitInfo3 {

	public static class Builder {

		private int tellerId;
		private final List<CashUnit310> cashUnits;

		public Builder() {
			cashUnits = new ArrayList<>();
		}

		public Builder tellerId(int tellerId) {
			this.tellerId = tellerId;
			return this;
		}

		public Builder addCashUnits(CashUnit310 element) {
			this.cashUnits.add(element);
			return this;
		}

		public Builder addCashUnits(CashUnit310... elements) {
			for (CashUnit310 each : elements) {
				this.cashUnits.add(each);
			}
			return this;
		}

		public Builder cashUnits(Iterable<CashUnit310> elements) {
			this.cashUnits.clear();
			return addAllCashUnits(elements);
		}

		public Builder addAllCashUnits(Iterable<CashUnit310> elements) {
			for (CashUnit310 each : elements) {
				this.cashUnits.add(each);
			}
			return this;
		}

		public CashUnitInfo310 build() {
			return new CashUnitInfo310(this);
		}
	}

	protected CashUnitInfo310(Builder builder) {
		super(new CashUnitInfo3.Builder().tellerId(builder.tellerId).cashUnits(builder.cashUnits));
	}

	@Override
	public List<? extends CashUnit310> getCashUnits() {
		return (List<? extends CashUnit310>) super.getCashUnits();
	}
}
