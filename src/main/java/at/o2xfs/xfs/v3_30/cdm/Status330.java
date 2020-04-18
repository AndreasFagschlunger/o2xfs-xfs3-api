package at.o2xfs.xfs.v3_30.cdm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.builder.ToStringBuilder;

import at.o2xfs.xfs.cdm.AntiFraudModule;
import at.o2xfs.xfs.cdm.Device;
import at.o2xfs.xfs.cdm.DevicePosition;
import at.o2xfs.xfs.cdm.Dispenser;
import at.o2xfs.xfs.cdm.GuidLight;
import at.o2xfs.xfs.cdm.IntermediateStacker;
import at.o2xfs.xfs.cdm.SafeDoor;
import at.o2xfs.xfs.v3_20.cdm.Status320;

public class Status330 extends Status320 {

	public static class Builder {

		private Device device;
		private SafeDoor safeDoor;
		private Dispenser dispenser;
		private IntermediateStacker intermediateStacker;
		private final List<OutputPosition330> positions;
		private final Map<String, String> extra;
		private final List<Set<GuidLight>> guidLights;
		private DevicePosition devicePosition;
		private int powerSaveRecoveryTime;
		private AntiFraudModule antiFraudModule;

		public Builder() {
			device = Device.ONLINE;
			dispenser = Dispenser.OK;
			intermediateStacker = IntermediateStacker.EMPTY;
			positions = new ArrayList<>();
			extra = new LinkedHashMap<>();
			guidLights = new ArrayList<>(GUIDLIGHTS_MAX);
			for (int i = 0; i < GUIDLIGHTS_MAX; i++) {
				guidLights.add(Collections.emptySet());
			}
			devicePosition = DevicePosition.INPOSITION;
			antiFraudModule = AntiFraudModule.NOTSUPP;
		}

		public Builder device(Device device) {
			this.device = device;
			return this;
		}

		public Builder safeDoor(SafeDoor safeDoor) {
			this.safeDoor = safeDoor;
			return this;
		}

		public Builder dispenser(Dispenser dispenser) {
			this.dispenser = dispenser;
			return this;
		}

		public Builder intermediateStacker(IntermediateStacker intermediateStacker) {
			this.intermediateStacker = intermediateStacker;
			return this;
		}

		public Builder addPositions(OutputPosition330 element) {
			this.positions.add(element);
			return this;
		}

		public Builder addPositions(OutputPosition330... elements) {
			for (OutputPosition330 each : elements) {
				this.positions.add(each);
			}
			return this;
		}

		public Builder positions(Iterable<OutputPosition330> elements) {
			this.positions.clear();
			return addAllPositions(elements);
		}

		public Builder addAllPositions(Iterable<OutputPosition330> elements) {
			for (OutputPosition330 each : elements) {
				this.positions.add(each);
			}
			return this;
		}

		public Builder putExtra(String key, String value) {
			extra.put(key, value);
			return this;
		}

		public Builder extra(Map<String, String> entries) {
			extra.clear();
			putAllExtra(entries);
			return this;
		}

		public Builder putAllExtra(Map<String, String> entries) {
			for (Map.Entry<String, String> e : entries.entrySet()) {
				extra.put(e.getKey(), e.getValue());
			}
			return this;
		}

		public Builder setGuidLights(int index, Set<GuidLight> element) {
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

		public Builder antiFraudModule(AntiFraudModule antiFraudModule) {
			this.antiFraudModule = antiFraudModule;
			return this;
		}

		public Status330 build() {
			return new Status330(this);
		}
	}

	protected Status330(Builder builder) {
		super(new Status320.Builder().device(builder.device).safeDoor(builder.safeDoor).dispenser(builder.dispenser)
				.intermediateStacker(builder.intermediateStacker).positions(builder.positions).extra(builder.extra)
				.guidLights(builder.guidLights).devicePosition(builder.devicePosition)
				.powerSaveRecoveryTime(builder.powerSaveRecoveryTime).antiFraudModule(builder.antiFraudModule));
	}

	@Override
	public List<OutputPosition330> getPositions() {
		return (List<OutputPosition330>) super.getPositions();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).appendSuper(super.toString()).toString();
	}
}
