package at.o2xfs.xfs.v3.cdm;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.ULong;
import at.o2xfs.xfs.cdm.Status;
import at.o2xfs.xfs.databind.annotation.XfsEnum16;
import at.o2xfs.xfs.util.UnitId;

@MemoryPropertyOrder({ "physicalPositionName", "unitId", "initialCount", "count", "rejectCount", "maximum", "status",
		"hardwareSensor" })
public class PhysicalCashUnit3 {

	public static class Builder {

		private String physicalPositionName;
		private UnitId unitId;
		private long initialCount;
		private long count;
		private long rejectCount;
		private long maximum;
		private Status status;
		private boolean hardwareSensor;

		public Builder() {
		}

		public Builder physicalPositionName(String physicalPositionName) {
			this.physicalPositionName = physicalPositionName;
			return this;
		}

		public Builder unitId(UnitId unitId) {
			this.unitId = unitId;
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

		public Builder maximum(long maximum) {
			this.maximum = maximum;
			return this;
		}

		public Builder status(Status status) {
			this.status = status;
			return this;
		}

		public Builder hardwareSensor(boolean hardwareSensor) {
			this.hardwareSensor = hardwareSensor;
			return this;
		}

		public PhysicalCashUnit3 build() {
			return new PhysicalCashUnit3(this);
		}
	}

	private final String physicalPositionName;

	private final UnitId unitId;

	@ULong
	private final long initialCount;

	@ULong
	private final long count;

	@ULong
	private final long rejectCount;

	@ULong
	private final long maximum;

	@XfsEnum16
	private final Status status;

	private final boolean hardwareSensor;

	protected PhysicalCashUnit3(Builder builder) {
		physicalPositionName = builder.physicalPositionName;
		unitId = builder.unitId;
		initialCount = builder.initialCount;
		count = builder.count;
		rejectCount = builder.rejectCount;
		maximum = builder.maximum;
		status = builder.status;
		hardwareSensor = builder.hardwareSensor;
	}

	public String getPhysicalPositionName() {
		return physicalPositionName;
	}

	public UnitId getUnitId() {
		return unitId;
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

	public long getMaximum() {
		return maximum;
	}

	public Status getStatus() {
		return status;
	}

	public boolean isHardwareSensor() {
		return hardwareSensor;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof PhysicalCashUnit3) {
			PhysicalCashUnit3 physicalCashUnit = (PhysicalCashUnit3) obj;
			return new EqualsBuilder().append(physicalPositionName, physicalCashUnit.physicalPositionName)
					.append(unitId, physicalCashUnit.unitId).append(initialCount, physicalCashUnit.initialCount)
					.append(count, physicalCashUnit.count).append(rejectCount, physicalCashUnit.rejectCount)
					.append(maximum, physicalCashUnit.maximum).append(status, physicalCashUnit.status)
					.append(hardwareSensor, physicalCashUnit.hardwareSensor).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(physicalPositionName).append(unitId).append(initialCount).append(count)
				.append(rejectCount).append(maximum).append(status).append(hardwareSensor).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("physicalPositionName", physicalPositionName).append("unitId", unitId)
				.append("initialCount", initialCount).append("count", count).append("rejectCount", rejectCount)
				.append("maximum", maximum).append("status", status).append("hardwareSensor", hardwareSensor)
				.toString();
	}
}
