package at.o2xfs.xfs.v3.cdm;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.ULong;
import at.o2xfs.xfs.cdm.Status;
import at.o2xfs.xfs.databind.annotation.XfsEnum16;
import at.o2xfs.xfs.util.UnitId;

@JsonDeserialize(builder = CountedPhysicalCashUnit3.Builder.class)
@MemoryPropertyOrder({ "physicalPositionName", "unitId", "dispensed", "counted", "status" })
public class CountedPhysicalCashUnit3 {

	@JsonPOJOBuilder(withPrefix = "")
	public static class Builder {

		private String physicalPositionName;
		private UnitId unitId;
		private long dispensed;
		private long counted;
		private Status status;

		public Builder() {
			unitId = UnitId.empty();
		}

		public Builder physicalPositionName(String physicalPositionName) {
			this.physicalPositionName = physicalPositionName;
			return this;
		}

		public Builder unitId(UnitId unitId) {
			this.unitId = unitId;
			return this;
		}

		public Builder dispensed(long dispensed) {
			this.dispensed = dispensed;
			return this;
		}

		public Builder counted(long counted) {
			this.counted = counted;
			return this;
		}

		public Builder status(Status status) {
			this.status = status;
			return this;
		}

		public CountedPhysicalCashUnit3 build() {
			return new CountedPhysicalCashUnit3(this);
		}
	}

	private final String physicalPositionName;

	private final UnitId unitId;

	@ULong
	private final long dispensed;

	@ULong
	private final long counted;

	@XfsEnum16
	private final Status status;

	protected CountedPhysicalCashUnit3(Builder builder) {
		physicalPositionName = builder.physicalPositionName;
		unitId = builder.unitId;
		dispensed = builder.dispensed;
		counted = builder.counted;
		status = builder.status;
	}

	public String getPhysicalPositionName() {
		return physicalPositionName;
	}

	public UnitId getUnitId() {
		return unitId;
	}

	public long getDispensed() {
		return dispensed;
	}

	public long getCounted() {
		return counted;
	}

	public Status getStatus() {
		return status;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof CountedPhysicalCashUnit3) {
			CountedPhysicalCashUnit3 countedPhysicalCashUnit = (CountedPhysicalCashUnit3) obj;
			return new EqualsBuilder().append(physicalPositionName, countedPhysicalCashUnit.physicalPositionName)
					.append(unitId, countedPhysicalCashUnit.unitId).append(dispensed, countedPhysicalCashUnit.dispensed)
					.append(counted, countedPhysicalCashUnit.counted).append(status, countedPhysicalCashUnit.status)
					.isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(physicalPositionName).append(unitId).append(dispensed).append(counted)
				.append(status).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("physicalPositionName", physicalPositionName).append("unitId", unitId)
				.append("dispensed", dispensed).append("counted", counted).append("status", status).toString();
	}
}
