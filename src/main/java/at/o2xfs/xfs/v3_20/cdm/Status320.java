package at.o2xfs.xfs.v3_20.cdm;

import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.xfs.cdm.AntiFraudModule;
import at.o2xfs.xfs.cdm.Device;
import at.o2xfs.xfs.cdm.DevicePosition;
import at.o2xfs.xfs.cdm.Dispenser;
import at.o2xfs.xfs.cdm.GuidLight;
import at.o2xfs.xfs.cdm.IntermediateStacker;
import at.o2xfs.xfs.cdm.SafeDoor;
import at.o2xfs.xfs.databind.annotation.XfsEnum16;
import at.o2xfs.xfs.v3.cdm.OutputPosition3;
import at.o2xfs.xfs.v3_10.cdm.Status310;

@MemoryPropertyOrder({ "antiFraudModule" })
public class Status320 extends Status310 {

	public static class Builder extends Status310.Builder {

		private AntiFraudModule antiFraudModule;

		public Builder() {
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
		public Builder extra(Map<String, String> extra) {
			super.extra(extra);
			return this;
		}

		@Override
		public Builder putExtra(String key, String value) {
			super.putExtra(key, value);
			return this;
		}

		@Override
		public Builder putAllExtra(Map<String, String> entries) {
			super.putAllExtra(entries);
			return this;
		}

		@Override
		public Builder setGuidLights(int index, Set<GuidLight> element) {
			super.setGuidLights(index, element);
			return this;
		}

		@Override
		public Builder guidLights(Iterable<Set<GuidLight>> elements) {
			super.guidLights(elements);
			return this;
		}

		@Override
		public Builder devicePosition(DevicePosition devicePosition) {
			super.devicePosition(devicePosition);
			return this;
		}

		@Override
		public Builder powerSaveRecoveryTime(int powerSaveRecoveryTime) {
			super.powerSaveRecoveryTime(powerSaveRecoveryTime);
			return this;
		}

		public Builder antiFraudModule(AntiFraudModule antiFraudModule) {
			this.antiFraudModule = antiFraudModule;
			return this;
		}

		@Override
		public Status320 build() {
			return new Status320(this);
		}
	}

	@XfsEnum16
	private final AntiFraudModule antiFraudModule;

	protected Status320(Builder builder) {
		super(builder);
		antiFraudModule = builder.antiFraudModule;
	}

	public AntiFraudModule getAntiFraudModule() {
		return antiFraudModule;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Status320) {
			Status320 status = (Status320) obj;
			return new EqualsBuilder().appendSuper(super.equals(obj)).append(antiFraudModule, status.antiFraudModule)
					.isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().appendSuper(super.hashCode()).append(antiFraudModule).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).appendSuper(super.toString()).append("antiFraudModule", antiFraudModule)
				.toString();
	}
}
