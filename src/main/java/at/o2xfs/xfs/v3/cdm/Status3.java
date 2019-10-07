package at.o2xfs.xfs.v3.cdm;

import at.o2xfs.xfs.databind.annotation.XfsEnum16;
import at.o2xfs.xfs.cdm.SafeDoor;
import at.o2xfs.xfs.cdm.IntermediateStacker;
import at.o2xfs.xfs.v3.cdm.OutputPosition3;
import java.util.ArrayList;
import at.o2xfs.xfs.cdm.Device;
import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import java.util.List;
import at.o2xfs.xfs.cdm.Dispenser;
import org.apache.commons.lang3.builder.ToStringBuilder;
import java.util.Map;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.util.Collections;
import at.o2xfs.xfs.databind.annotation.XfsExtra;
import org.apache.commons.lang3.builder.EqualsBuilder;

@MemoryPropertyOrder({"device", "safeDoor", "dispenser", "intermediateStacker", "positions", "extra" })
public class Status3 {

	public static class Builder {

		private Device device;
		private SafeDoor safeDoor;
		private Dispenser dispenser;
		private IntermediateStacker intermediateStacker;
		private List<OutputPosition3> positions = new ArrayList<>();
		private Map<String, String> extra;

		public Builder() { }

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

		public Builder addPosition(OutputPosition3 element) {
			this.positions.add(element);
			return this;
		}

		public Builder addPosition(OutputPosition3... elements) {
			for(OutputPosition3 each : elements) {
				this.positions.add(each);
			}
			return this;
		}

		public Builder positions(Iterable<OutputPosition3> elements) {
			this.positions.clear();
			return addAllPositions(elements);
		}

		public Builder addAllPositions(Iterable<OutputPosition3> elements) {
			for (OutputPosition3 each : elements) {
				this.positions.add(each);
			}
			return this;
		}

		public Builder extra(Map<String, String> extra) {
			this.extra = extra;
			return this;
		}

		public Status3 build() {
			return new Status3(this);
		}
	}

	@XfsEnum16
	private final Device device;

	@XfsEnum16
	private final SafeDoor safeDoor;

	@XfsEnum16
	private final Dispenser dispenser;

	@XfsEnum16
	private final IntermediateStacker intermediateStacker;

	private final List<OutputPosition3> positions;

	@XfsExtra
	private final Map<String, String> extra;

	protected Status3(Builder builder) {
		device = builder.device;
		safeDoor = builder.safeDoor;
		dispenser = builder.dispenser;
		intermediateStacker = builder.intermediateStacker;
		positions = Collections.unmodifiableList(new ArrayList<>(builder.positions));
		extra = builder.extra;
	}

	public Device getDevice() {
		return device;
	}

	public SafeDoor getSafeDoor() {
		return safeDoor;
	}

	public Dispenser getDispenser() {
		return dispenser;
	}

	public IntermediateStacker getIntermediateStacker() {
		return intermediateStacker;
	}

	public List<OutputPosition3> getPositions() {
		return positions;
	}

	public Map<String, String> getExtra() {
		return extra;
	}

	public boolean equals(Object obj) {
		if(obj instanceof Status3) {
			Status3 status = (Status3) obj;
			return new EqualsBuilder().append(device, status.device).append(safeDoor, status.safeDoor).append(dispenser, status.dispenser).append(intermediateStacker, status.intermediateStacker).append(positions, status.positions).append(extra, status.extra).isEquals();
		}
		return false;
	}

	public int hashCode() {
		return new HashCodeBuilder().append(device).append(safeDoor).append(dispenser).append(intermediateStacker).append(positions).append(extra).toHashCode();
	}

	public String toString() {
		return new ToStringBuilder(this).append("device", device).append("safeDoor", safeDoor).append("dispenser", dispenser).append("intermediateStacker", intermediateStacker).append("positions", positions).append("extra", extra).toString();
	}
}
