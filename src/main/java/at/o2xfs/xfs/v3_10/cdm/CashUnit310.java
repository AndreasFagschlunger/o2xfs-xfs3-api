package at.o2xfs.xfs.v3_10.cdm;

import java.util.List;

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

@MemoryPropertyOrder({ "dispensedCount", "presentedCount", "retractedCount" })
public class CashUnit310 extends CashUnit3 {

	public static class Builder {
		private int number;
		private Type type;
		private String cashUnitName;
		private UnitId unitId;
		private CurrencyId currencyId;
		private long values;
		private long initialCount;
		private long count;
		private long rejectCount;
		private long minimum;
		private long maximum;
		private boolean appLock;
		private Status status;
		private List<? extends PhysicalCashUnit310> physicalCashUnits;
		private long dispensedCount;
		private long presentedCount;
		private long retractedCount;

		public Builder() {
			unitId = UnitId.empty();
			currencyId = CurrencyId.empty();
		}

		public Builder number(int number) {
			this.number = number;
			return this;
		}

		public Builder type(Type type) {
			this.type = type;
			return this;
		}

		public Builder cashUnitName(String cashUnitName) {
			this.cashUnitName = cashUnitName;
			return this;
		}

		public Builder unitId(UnitId unitId) {
			this.unitId = unitId;
			return this;
		}

		public Builder currencyId(CurrencyId currencyId) {
			this.currencyId = currencyId;
			return this;
		}

		public Builder values(long values) {
			this.values = values;
			return this;
		}

		public Builder initialCount(long initialCount) {
			this.initialCount = initialCount;
			return this;
		}

		public Builder count(long count) {
			this.count = count;
			return this;
		}

		public Builder rejectCount(long rejectCount) {
			this.rejectCount = rejectCount;
			return this;
		}

		public Builder minimum(long minimum) {
			this.minimum = minimum;
			return this;
		}

		public Builder maximum(long maximum) {
			this.maximum = maximum;
			return this;
		}

		public Builder appLock(boolean appLock) {
			this.appLock = appLock;
			return this;
		}

		public Builder status(Status status) {
			this.status = status;
			return this;
		}

		public Builder physicalCashUnits(List<? extends PhysicalCashUnit310> physicalCashUnits) {
			this.physicalCashUnits = physicalCashUnits;
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
		super(new CashUnit3.Builder().number(builder.number).type(builder.type).cashUnitName(builder.cashUnitName)
				.currencyId(builder.currencyId).unitId(builder.unitId).values(builder.values)
				.initialCount(builder.initialCount).count(builder.count).rejectCount(builder.rejectCount)
				.minimum(builder.minimum).maximum(builder.maximum).appLock(builder.appLock).status(builder.status)
				.physicalCashUnits(builder.physicalCashUnits));
		dispensedCount = builder.dispensedCount;
		presentedCount = builder.presentedCount;
		retractedCount = builder.retractedCount;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<? extends PhysicalCashUnit310> getPhysicalCashUnits() {
		return (List<? extends PhysicalCashUnit310>) super.getPhysicalCashUnits();
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
