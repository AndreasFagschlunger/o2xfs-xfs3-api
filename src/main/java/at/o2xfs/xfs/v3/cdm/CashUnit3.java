package at.o2xfs.xfs.v3.cdm;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.ULong;
import at.o2xfs.memory.databind.annotation.win32.UShort;
import at.o2xfs.xfs.cdm.Status;
import at.o2xfs.xfs.cdm.Type;
import at.o2xfs.xfs.databind.annotation.XfsEnum16;
import at.o2xfs.xfs.util.CurrencyId;
import at.o2xfs.xfs.util.UnitId;

@MemoryPropertyOrder({ "number", "type", "cashUnitName", "unitId", "currencyId", "values", "initialCount", "count",
		"rejectCount", "minimum", "maximum", "appLock", "status", "physicalCashUnits" })
public class CashUnit3 {

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
		private final List<PhysicalCashUnit3> physicalCashUnits;

		public Builder() {
			unitId = UnitId.empty();
			currencyId = CurrencyId.empty();
			physicalCashUnits = new ArrayList<>();
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

		public Builder addPhysicalCashUnits(PhysicalCashUnit3 element) {
			this.physicalCashUnits.add(element);
			return this;
		}

		public Builder addPhysicalCashUnits(PhysicalCashUnit3... elements) {
			for (PhysicalCashUnit3 each : elements) {
				this.physicalCashUnits.add(each);
			}
			return this;
		}

		public Builder physicalCashUnits(Iterable<? extends PhysicalCashUnit3> elements) {
			this.physicalCashUnits.clear();
			return addAllPhysicalCashUnit(elements);
		}

		public Builder addAllPhysicalCashUnit(Iterable<? extends PhysicalCashUnit3> elements) {
			for (PhysicalCashUnit3 each : elements) {
				this.physicalCashUnits.add(each);
			}
			return this;
		}

		public CashUnit3 build() {
			return new CashUnit3(this);
		}
	}

	@UShort
	private final int number;

	@XfsEnum16
	private final Type type;

	private final String cashUnitName;

	private final UnitId unitId;

	private final CurrencyId currencyId;

	@ULong
	private final long values;

	@ULong
	private final long initialCount;

	@ULong
	private final long count;

	@ULong
	private final long rejectCount;

	@ULong
	private final long minimum;

	@ULong
	private final long maximum;

	private final boolean appLock;

	@XfsEnum16
	private final Status status;

	private final List<? extends PhysicalCashUnit3> physicalCashUnits;

	protected CashUnit3(Builder builder) {
		number = builder.number;
		type = builder.type;
		cashUnitName = builder.cashUnitName;
		unitId = builder.unitId;
		currencyId = builder.currencyId;
		values = builder.values;
		initialCount = builder.initialCount;
		count = builder.count;
		rejectCount = builder.rejectCount;
		minimum = builder.minimum;
		maximum = builder.maximum;
		appLock = builder.appLock;
		status = builder.status;
		physicalCashUnits = builder.physicalCashUnits;
	}

	public int getNumber() {
		return number;
	}

	public Type getType() {
		return type;
	}

	public String getCashUnitName() {
		return cashUnitName;
	}

	public UnitId getUnitId() {
		return unitId;
	}

	public CurrencyId getCurrencyId() {
		return currencyId;
	}

	public long getValues() {
		return values;
	}

	public long getInitialCount() {
		return initialCount;
	}

	public long getCount() {
		return count;
	}

	public long getRejectCount() {
		return rejectCount;
	}

	public long getMinimum() {
		return minimum;
	}

	public long getMaximum() {
		return maximum;
	}

	public boolean isAppLock() {
		return appLock;
	}

	public Status getStatus() {
		return status;
	}

	public List<? extends PhysicalCashUnit3> getPhysicalCashUnits() {
		return physicalCashUnits;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof CashUnit3) {
			CashUnit3 cashUnit = (CashUnit3) obj;
			return new EqualsBuilder().append(number, cashUnit.number).append(type, cashUnit.type)
					.append(cashUnitName, cashUnit.cashUnitName).append(unitId, cashUnit.unitId)
					.append(currencyId, cashUnit.currencyId).append(values, cashUnit.values)
					.append(initialCount, cashUnit.initialCount).append(count, cashUnit.count)
					.append(rejectCount, cashUnit.rejectCount).append(minimum, cashUnit.minimum)
					.append(maximum, cashUnit.maximum).append(appLock, cashUnit.appLock).append(status, cashUnit.status)
					.append(physicalCashUnits, cashUnit.physicalCashUnits).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(number).append(type).append(cashUnitName).append(unitId).append(currencyId)
				.append(values).append(initialCount).append(count).append(rejectCount).append(minimum).append(maximum)
				.append(appLock).append(status).append(physicalCashUnits).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("number", number).append("type", type)
				.append("cashUnitName", cashUnitName).append("unitId", unitId).append("currencyId", currencyId)
				.append("values", values).append("initialCount", initialCount).append("count", count)
				.append("rejectCount", rejectCount).append("minimum", minimum).append("maximum", maximum)
				.append("appLock", appLock).append("status", status).append("physicalCashUnits", physicalCashUnits)
				.toString();
	}
}
