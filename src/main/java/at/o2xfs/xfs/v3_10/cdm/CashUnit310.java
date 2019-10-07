package at.o2xfs.xfs.v3_10.cdm;

import at.o2xfs.memory.databind.annotation.win32.UShort;
import at.o2xfs.memory.databind.annotation.win32.ULong;
import at.o2xfs.xfs.util.CurrencyId;
import at.o2xfs.xfs.util.UnitId;
import java.util.ArrayList;
import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import at.o2xfs.xfs.v3.cdm.CashUnit3;
import at.o2xfs.xfs.cdm.Type;
import java.util.Collections;
import org.apache.commons.lang3.builder.EqualsBuilder;
import at.o2xfs.xfs.cdm.Status;
import at.o2xfs.xfs.v3.cdm.PhysicalCashUnit3;

@MemoryPropertyOrder({"dispensedCount", "presentedCount", "retractedCount" })
public class CashUnit310 extends CashUnit3 {

	public static class Builder extends CashUnit3.Builder {

		private long dispensedCount;
		private long presentedCount;
		private long retractedCount;

		public Builder() { }

		public Builder number(int number) {
			super.number(number);
			return this;
		}

		public Builder type(Type type) {
			super.type(type);
			return this;
		}

		public Builder cashUnitName(String cashUnitName) {
			super.cashUnitName(cashUnitName);
			return this;
		}

		public Builder unitId(UnitId unitId) {
			super.unitId(unitId);
			return this;
		}

		public Builder currencyId(CurrencyId currencyId) {
			super.currencyId(currencyId);
			return this;
		}

		public Builder values(long values) {
			super.values(values);
			return this;
		}

		public Builder initialCount(long initialCount) {
			super.initialCount(initialCount);
			return this;
		}

		public Builder count(long count) {
			super.count(count);
			return this;
		}

		public Builder rejectCount(long rejectCount) {
			super.rejectCount(rejectCount);
			return this;
		}

		public Builder minimum(long minimum) {
			super.minimum(minimum);
			return this;
		}

		public Builder maximum(long maximum) {
			super.maximum(maximum);
			return this;
		}

		public Builder appLock(boolean appLock) {
			super.appLock(appLock);
			return this;
		}

		public Builder status(Status status) {
			super.status(status);
			return this;
		}

		public Builder numPhysicalCUs(int numPhysicalCUs) {
			super.numPhysicalCUs(numPhysicalCUs);
			return this;
		}

		public Builder addPhysical(PhysicalCashUnit3 element) {
			super.addPhysical(element);
			return this;
		}

		public Builder addPhysical(PhysicalCashUnit3... elements) {
			super.addPhysical(elements);
			return this;
		}

		public Builder physical(Iterable<PhysicalCashUnit3> elements) {
			super.physical(elements);
			return this;
		}

		public Builder addAllPhysical(Iterable<PhysicalCashUnit3> elements) {
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

	public boolean equals(Object obj) {
		if(obj instanceof CashUnit310) {
			CashUnit310 cashUnit = (CashUnit310) obj;
			return new EqualsBuilder().appendSuper(super.equals(obj)).append(dispensedCount, cashUnit.dispensedCount).append(presentedCount, cashUnit.presentedCount).append(retractedCount, cashUnit.retractedCount).isEquals();
		}
		return false;
	}

	public int hashCode() {
		return new HashCodeBuilder().appendSuper(super.hashCode()).append(dispensedCount).append(presentedCount).append(retractedCount).toHashCode();
	}

	public String toString() {
		return new ToStringBuilder(this).appendSuper(super.toString()).append("dispensedCount", dispensedCount).append("presentedCount", presentedCount).append("retractedCount", retractedCount).toString();
	}
}
