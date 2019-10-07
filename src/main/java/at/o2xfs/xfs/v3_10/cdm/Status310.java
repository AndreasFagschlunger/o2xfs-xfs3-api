package at.o2xfs.xfs.v3_10.cdm;

import at.o2xfs.xfs.cdm.GuidLights;
import at.o2xfs.xfs.databind.annotation.XfsEnum16;
import at.o2xfs.memory.databind.annotation.win32.UShort;
import at.o2xfs.xfs.cdm.SafeDoor;
import at.o2xfs.xfs.cdm.IntermediateStacker;
import at.o2xfs.xfs.v3.cdm.Status3;
import at.o2xfs.xfs.v3.cdm.OutputPosition3;
import java.util.ArrayList;
import at.o2xfs.xfs.cdm.Device;
import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import java.util.List;
import at.o2xfs.xfs.cdm.Dispenser;
import org.apache.commons.lang3.builder.ToStringBuilder;
import java.util.Map;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import at.o2xfs.xfs.databind.annotation.XfsEnum32;
import java.util.Collections;
import at.o2xfs.xfs.databind.annotation.XfsExtra;
import org.apache.commons.lang3.builder.EqualsBuilder;

@MemoryPropertyOrder({"guidLights", "devicePosition", "powerSaveRecoveryTime" })
public class Status310 extends Status3 {

	public static class Builder extends Status3.Builder {

		private GuidLights guidLights;
		private int devicePosition;
		private int powerSaveRecoveryTime;

		public Builder() { }

		public Builder device(Device device) {
			super.device(device);
			return this;
		}

		public Builder safeDoor(SafeDoor safeDoor) {
			super.safeDoor(safeDoor);
			return this;
		}

		public Builder dispenser(Dispenser dispenser) {
			super.dispenser(dispenser);
			return this;
		}

		public Builder intermediateStacker(IntermediateStacker intermediateStacker) {
			super.intermediateStacker(intermediateStacker);
			return this;
		}

		public Builder addPosition(OutputPosition3 element) {
			super.addPosition(element);
			return this;
		}

		public Builder addPosition(OutputPosition3... elements) {
			super.addPosition(elements);
			return this;
		}

		public Builder positions(Iterable<OutputPosition3> elements) {
			super.positions(elements);
			return this;
		}

		public Builder addAllPositions(Iterable<OutputPosition3> elements) {
			super.addAllPositions(elements);
			return this;
		}

		public Builder extra(Map<String, String> extra) {
			super.extra(extra);
			return this;
		}

		public Builder guidLights(GuidLights guidLights) {
			this.guidLights = guidLights;
			return this;
		}

		public Builder devicePosition(int devicePosition) {
			this.devicePosition = devicePosition;
			return this;
		}

		public Builder powerSaveRecoveryTime(int powerSaveRecoveryTime) {
			this.powerSaveRecoveryTime = powerSaveRecoveryTime;
			return this;
		}

		public Status310 build() {
			return new Status310(this);
		}
	}

	@XfsEnum32
	private final GuidLights guidLights;

	@UShort
	private final int devicePosition;

	@UShort
	private final int powerSaveRecoveryTime;

	protected Status310(Builder builder) {
		super(builder);
		guidLights = builder.guidLights;
		devicePosition = builder.devicePosition;
		powerSaveRecoveryTime = builder.powerSaveRecoveryTime;
	}

	public GuidLights getGuidLights() {
		return guidLights;
	}

	public int getDevicePosition() {
		return devicePosition;
	}

	public int getPowerSaveRecoveryTime() {
		return powerSaveRecoveryTime;
	}

	public boolean equals(Object obj) {
		if(obj instanceof Status310) {
			Status310 status = (Status310) obj;
			return new EqualsBuilder().appendSuper(super.equals(obj)).append(guidLights, status.guidLights).append(devicePosition, status.devicePosition).append(powerSaveRecoveryTime, status.powerSaveRecoveryTime).isEquals();
		}
		return false;
	}

	public int hashCode() {
		return new HashCodeBuilder().appendSuper(super.hashCode()).append(guidLights).append(devicePosition).append(powerSaveRecoveryTime).toHashCode();
	}

	public String toString() {
		return new ToStringBuilder(this).appendSuper(super.toString()).append("guidLights", guidLights).append("devicePosition", devicePosition).append("powerSaveRecoveryTime", powerSaveRecoveryTime).toString();
	}
}
