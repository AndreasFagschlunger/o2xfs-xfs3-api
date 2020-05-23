package at.o2xfs.xfs.v3_10.cdm;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.UShort;

@JsonDeserialize(builder = PowerSaveControl310.Builder.class)
@MemoryPropertyOrder({"maxPowerSaveRecoveryTime" })
public class PowerSaveControl310 {

	@JsonPOJOBuilder(withPrefix = "")
	public static class Builder {

		private int maxPowerSaveRecoveryTime;

		public Builder() { }

		public Builder maxPowerSaveRecoveryTime(int maxPowerSaveRecoveryTime) {
			this.maxPowerSaveRecoveryTime = maxPowerSaveRecoveryTime;
			return this;
		}

		public PowerSaveControl310 build() {
			return new PowerSaveControl310(this);
		}
	}

	@UShort
	private final int maxPowerSaveRecoveryTime;

	protected PowerSaveControl310(Builder builder) {
		maxPowerSaveRecoveryTime = builder.maxPowerSaveRecoveryTime;
	}

	public int getMaxPowerSaveRecoveryTime() {
		return maxPowerSaveRecoveryTime;
	}

	public boolean equals(Object obj) {
		if(obj instanceof PowerSaveControl310) {
			PowerSaveControl310 powerSaveControl = (PowerSaveControl310) obj;
			return new EqualsBuilder().append(maxPowerSaveRecoveryTime, powerSaveControl.maxPowerSaveRecoveryTime).isEquals();
		}
		return false;
	}

	public int hashCode() {
		return new HashCodeBuilder().append(maxPowerSaveRecoveryTime).toHashCode();
	}

	public String toString() {
		return new ToStringBuilder(this).append("maxPowerSaveRecoveryTime", maxPowerSaveRecoveryTime).toString();
	}
}
