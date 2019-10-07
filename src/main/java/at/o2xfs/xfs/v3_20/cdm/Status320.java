package at.o2xfs.xfs.v3_20.cdm;

import at.o2xfs.xfs.v3_10.cdm.Status310;
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
import at.o2xfs.xfs.cdm.AntiFraudModule;
import org.apache.commons.lang3.builder.EqualsBuilder;

@MemoryPropertyOrder({"antiFraudModule" })
public class Status320 extends Status310 {

	public static class Builder extends Status310.Builder {

		private AntiFraudModule antiFraudModule;

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
			super.guidLights(guidLights);
			return this;
		}

		public Builder devicePosition(int devicePosition) {
			super.devicePosition(devicePosition);
			return this;
		}

		public Builder powerSaveRecoveryTime(int powerSaveRecoveryTime) {
			super.powerSaveRecoveryTime(powerSaveRecoveryTime);
			return this;
		}

		public Builder antiFraudModule(AntiFraudModule antiFraudModule) {
			this.antiFraudModule = antiFraudModule;
			return this;
		}

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

	public boolean equals(Object obj) {
		if(obj instanceof Status320) {
			Status320 status = (Status320) obj;
			return new EqualsBuilder().appendSuper(super.equals(obj)).append(antiFraudModule, status.antiFraudModule).isEquals();
		}
		return false;
	}

	public int hashCode() {
		return new HashCodeBuilder().appendSuper(super.hashCode()).append(antiFraudModule).toHashCode();
	}

	public String toString() {
		return new ToStringBuilder(this).appendSuper(super.toString()).append("antiFraudModule", antiFraudModule).toString();
	}
}
