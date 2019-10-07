package at.o2xfs.xfs.v3_10.cdm;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.UShort;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;

@MemoryPropertyOrder({"powerSaveRecoveryTime" })
public class PowerSaveChange310 {

	public static class Builder {

		private int powerSaveRecoveryTime;

		public Builder() { }

		public Builder powerSaveRecoveryTime(int powerSaveRecoveryTime) {
			this.powerSaveRecoveryTime = powerSaveRecoveryTime;
			return this;
		}

		public PowerSaveChange310 build() {
			return new PowerSaveChange310(this);
		}
	}

	@UShort
	private final int powerSaveRecoveryTime;

	protected PowerSaveChange310(Builder builder) {
		powerSaveRecoveryTime = builder.powerSaveRecoveryTime;
	}

	public int getPowerSaveRecoveryTime() {
		return powerSaveRecoveryTime;
	}

	public boolean equals(Object obj) {
		if(obj instanceof PowerSaveChange310) {
			PowerSaveChange310 powerSaveChange = (PowerSaveChange310) obj;
			return new EqualsBuilder().append(powerSaveRecoveryTime, powerSaveChange.powerSaveRecoveryTime).isEquals();
		}
		return false;
	}

	public int hashCode() {
		return new HashCodeBuilder().append(powerSaveRecoveryTime).toHashCode();
	}

	public String toString() {
		return new ToStringBuilder(this).append("powerSaveRecoveryTime", powerSaveRecoveryTime).toString();
	}
}
