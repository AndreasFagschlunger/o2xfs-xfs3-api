package at.o2xfs.xfs.v3_10.cdm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.UShort;
import at.o2xfs.xfs.cdm.Device;
import at.o2xfs.xfs.cdm.DevicePosition;
import at.o2xfs.xfs.cdm.Dispenser;
import at.o2xfs.xfs.cdm.GuidLight;
import at.o2xfs.xfs.cdm.IntermediateStacker;
import at.o2xfs.xfs.cdm.SafeDoor;
import at.o2xfs.xfs.databind.annotation.XfsEnum16;
import at.o2xfs.xfs.databind.annotation.XfsGuidLights;
import at.o2xfs.xfs.v3.cdm.OutputPosition3;
import at.o2xfs.xfs.v3.cdm.Status3;

@MemoryPropertyOrder({ "guidLights", "devicePosition", "powerSaveRecoveryTime" })
public class Status310 extends Status3 {

	private static final int GUIDLIGHTS_MAX = 32;

	public static class Builder extends Status3.Builder {

		private final List<Set<GuidLight>> guidLights;
		private DevicePosition devicePosition;
		private int powerSaveRecoveryTime;

		public Builder() {
			guidLights = new ArrayList<>(GUIDLIGHTS_MAX);
			for (int i = 0; i < GUIDLIGHTS_MAX; i++) {
				guidLights.add(Collections.emptySet());
			}
			devicePosition = DevicePosition.INPOSITION;
		}

		@Override
		public Builder device(Device device) {
			super.device(device);
			return this;
		}

		@Override
		public Builder safeDoor(SafeDoor safeDoor) {
			super.safeDoor(safeDoor);
			return this;
		}

		@Override
		public Builder dispenser(Dispenser dispenser) {
			super.dispenser(dispenser);
			return this;
		}

		@Override
		public Builder intermediateStacker(IntermediateStacker intermediateStacker) {
			super.intermediateStacker(intermediateStacker);
			return this;
		}

		@Override
		public Builder addPosition(OutputPosition3 element) {
			super.addPosition(element);
			return this;
		}

		@Override
		public Builder addPosition(OutputPosition3... elements) {
			super.addPosition(elements);
			return this;
		}

		@Override
		public Builder positions(Iterable<OutputPosition3> elements) {
			super.positions(elements);
			return this;
		}

		@Override
		public Builder addAllPositions(Iterable<OutputPosition3> elements) {
			super.addAllPositions(elements);
			return this;
		}

		@Override
		public Builder putExtra(String key, String value) {
			super.putExtra(key, value);
			return this;
		}

		@Override
		public Builder extra(Map<String, String> entries) {
			super.extra(entries);
			return this;
		}

		@Override
		public Builder putAllExtra(Map<String, String> entries) {
			super.putAllExtra(entries);
			return this;
		}

		public Builder setGuidLight(int index, Set<GuidLight> element) {
			this.guidLights.set(index, EnumSet.copyOf(element));
			return this;
		}

		public Builder guidLights(Iterable<Set<GuidLight>> elements) {
			int i = 0;
			for (Set<GuidLight> each : elements) {
				this.guidLights.set(i++, each);
			}
			return this;
		}

		public Builder devicePosition(DevicePosition devicePosition) {
			this.devicePosition = devicePosition;
			return this;
		}

		public Builder powerSaveRecoveryTime(int powerSaveRecoveryTime) {
			this.powerSaveRecoveryTime = powerSaveRecoveryTime;
			return this;
		}

		@Override
		public Status310 build() {
			return new Status310(this);
		}
	}

	@XfsGuidLights(length = GUIDLIGHTS_MAX)
	private final List<Set<GuidLight>> guidLights;

	@XfsEnum16
	private final DevicePosition devicePosition;

	@UShort
	private final int powerSaveRecoveryTime;

	protected Status310(Builder builder) {
		super(builder);
		guidLights = Collections.unmodifiableList(new ArrayList<>(builder.guidLights));
		devicePosition = builder.devicePosition;
		powerSaveRecoveryTime = builder.powerSaveRecoveryTime;
	}

	public List<Set<GuidLight>> getGuidLights() {
		return guidLights;
	}

	public DevicePosition getDevicePosition() {
		return devicePosition;
	}

	public int getPowerSaveRecoveryTime() {
		return powerSaveRecoveryTime;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Status310) {
			Status310 status = (Status310) obj;
			return new EqualsBuilder().appendSuper(super.equals(obj)).append(guidLights, status.guidLights)
					.append(devicePosition, status.devicePosition)
					.append(powerSaveRecoveryTime, status.powerSaveRecoveryTime).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().appendSuper(super.hashCode()).append(guidLights).append(devicePosition)
				.append(powerSaveRecoveryTime).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).appendSuper(super.toString()).append("guidLights", guidLights)
				.append("devicePosition", devicePosition).append("powerSaveRecoveryTime", powerSaveRecoveryTime)
				.toString();
	}
}
