package at.o2xfs.xfs.v3_10.cdm;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.ULong;
import at.o2xfs.xfs.cdm.Status;
import at.o2xfs.xfs.cdm.Type;
import at.o2xfs.xfs.util.CurrencyId;
import at.o2xfs.xfs.util.UnitId;
import at.o2xfs.xfs.v3.cdm.CashUnit3;
import at.o2xfs.xfs.v3.cdm.PhysicalCashUnit3;

@MemoryPropertyOrder({ "dispensedCount", "presentedCount", "retractedCount" })
public class CashUnit310 extends CashUnit3 {

	public static class Builder extends CashUnit3.Builder {

		private long dispensedCount;
		private long presentedCount;
		private long retractedCount;

		public Builder() {
		}

		@Override
		public Builder number(int number) {
			super.number(number);
			return this;
		}

		@Override
		public Builder type(Type type) {
			super.type(type);
			return this;
		}

		@Override
		public Builder cashUnitName(String cashUnitName) {
			super.cashUnitName(cashUnitName);
			return this;
		}

		@Override
		public Builder unitId(UnitId unitId) {
			super.unitId(unitId);
			return this;
		}

		@Override
		public Builder currencyId(CurrencyId currencyId) {
			super.currencyId(currencyId);
			return this;
		}

		@Override
		public Builder values(long values) {
			super.values(values);
			return this;
		}

		@Override
		public Builder initialCount(long initialCount) {
			super.initialCount(initialCount);
			return this;
		}

		@Override
		public Builder count(long count) {
			super.count(count);
			return this;
		}

		@Override
		public Builder rejectCount(long rejectCount) {
			super.rejectCount(rejectCount);
			return this;
		}

		@Override
		public Builder minimum(long minimum) {
			super.minimum(minimum);
			return this;
		}

		@Override
		public Builder maximum(long maximum) {
			super.maximum(maximum);
			return this;
		}

		@Override
		public Builder appLock(boolean appLock) {
			super.appLock(appLock);
			return this;
		}

		@Override
		public Builder status(Status status) {
			super.status(status);
			return this;
		}

		@Override
		public Builder addPhysical(PhysicalCashUnit3 element) {
			super.addPhysical(element);
			return this;
		}

		@Override
		public Builder addPhysical(PhysicalCashUnit3... elements) {
			super.addPhysical(elements);
			return this;
		}

		@Override
		public Builder physical(Iterable<? extends PhysicalCashUnit3> elements) {
			super.physical(elements);
			return this;
		}

		@Override
		public Builder addAllPhysical(Iterable<? extends PhysicalCashUnit3> elements) {
			super.addAllPhysical(elements);
			return this;
		}

		public Builder dispensedCount(long dispensedCount) {
			this.dispensedCount = dispensedCount;
			return this;
		}

		public Builder presentedCount(long presentedCount) {
			this.presentedCount = presentedCount;
			return this;
		}

		public Builder retractedCount(long retractedCount) {
			this.retractedCount = retractedCount;
			return this;
		}

		@Override
		public CashUnit310 build() {
			return new CashUnit310(this);
		}
	}

	@ULong
	private final long dispensedCount;

	@ULong
	private final long presentedCount;

	@ULong
	private final long retractedCount;

	protected CashUnit310(Builder builder) {
		super(builder);
		dispensedCount = builder.dispensedCount;
		presentedCount = builder.presentedCount;
		retractedCount = builder.retractedCount;
	}

	public long getDispensedCount() {
		return dispensedCount;
	}

	public long getPresentedCount() {
		return presentedCount;
	}

	public long getRetractedCount() {
		return retractedCount;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof CashUnit310) {
			CashUnit310 cashUnit = (CashUnit310) obj;
			return new EqualsBuilder().appendSuper(super.equals(obj)).append(dispensedCount, cashUnit.dispensedCount)
					.append(presentedCount, cashUnit.presentedCount).append(retractedCount, cashUnit.retractedCount)
					.isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().appendSuper(super.hashCode()).append(dispensedCount).append(presentedCount)
				.append(retractedCount).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).appendSuper(super.toString()).append("dispensedCount", dispensedCount)
				.append("presentedCount", presentedCount).append("retractedCount", retractedCount).toString();
	}
}
