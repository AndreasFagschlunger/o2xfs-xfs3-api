package at.o2xfs.xfs.v3_10.cdm;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.ULong;
import at.o2xfs.xfs.cdm.Status;
import at.o2xfs.xfs.util.UnitId;
import at.o2xfs.xfs.v3.cdm.PhysicalCashUnit3;

@MemoryPropertyOrder({ "dispensedCount", "presentedCount", "retractedCount" })
public class PhysicalCashUnit310 extends PhysicalCashUnit3 {

	public static class Builder extends PhysicalCashUnit3.Builder {

		private long dispensedCount;
		private long presentedCount;
		private long retractedCount;

		public Builder() {
		}

		@Override
		public Builder physicalPositionName(String physicalPositionName) {
			super.physicalPositionName(physicalPositionName);
			return this;
		}

		@Override
		public Builder unitId(UnitId unitId) {
			super.unitId(unitId);
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
		public Builder maximum(long maximum) {
			super.maximum(maximum);
			return this;
		}

		@Override
		public Builder status(Status status) {
			super.status(status);
			return this;
		}

		@Override
		public Builder hardwareSensor(boolean hardwareSensor) {
			super.hardwareSensor(hardwareSensor);
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
		public PhysicalCashUnit310 build() {
			return new PhysicalCashUnit310(this);
		}
	}

	@ULong
	private final long dispensedCount;

	@ULong
	private final long presentedCount;

	@ULong
	private final long retractedCount;

	protected PhysicalCashUnit310(Builder builder) {
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
		if (obj instanceof PhysicalCashUnit310) {
			PhysicalCashUnit310 physicalCashUnit = (PhysicalCashUnit310) obj;
			return new EqualsBuilder().appendSuper(super.equals(obj))
					.append(dispensedCount, physicalCashUnit.dispensedCount)
					.append(presentedCount, physicalCashUnit.presentedCount)
					.append(retractedCount, physicalCashUnit.retractedCount).isEquals();
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
