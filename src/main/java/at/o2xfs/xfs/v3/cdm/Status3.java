package at.o2xfs.xfs.v3.cdm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.NullTerminated;
import at.o2xfs.xfs.cdm.Device;
import at.o2xfs.xfs.cdm.Dispenser;
import at.o2xfs.xfs.cdm.IntermediateStacker;
import at.o2xfs.xfs.cdm.SafeDoor;
import at.o2xfs.xfs.databind.annotation.XfsEnum16;
import at.o2xfs.xfs.databind.annotation.XfsExtra;

@JsonDeserialize(builder = Status3.Builder.class)
@MemoryPropertyOrder({ "device", "safeDoor", "dispenser", "intermediateStacker", "positions", "extra" })
public class Status3 {

	@JsonPOJOBuilder(withPrefix = "")
	public static class Builder {

		private Device device;
		private SafeDoor safeDoor;
		private Dispenser dispenser;
		private IntermediateStacker intermediateStacker;
		private final List<OutputPosition3> positions;
		private final Map<String, String> extra;

		public Builder() {
			device = Device.ONLINE;
			dispenser = Dispenser.OK;
			intermediateStacker = IntermediateStacker.EMPTY;
			positions = new ArrayList<>();
			extra = new LinkedHashMap<>();
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

		public <E extends OutputPosition3> Builder addPositions(E element) {
			this.positions.add(element);
			return this;
		}

		@JsonProperty
		public <E extends OutputPosition3> Builder addPositions(E... elements) {
			for (E each : elements) {
				this.positions.add(each);
			}
			return this;
		}

		public Builder positions(Iterable<? extends OutputPosition3> elements) {
			this.positions.clear();
			return addAllPositions(elements);
		}

		public Builder addAllPositions(Iterable<? extends OutputPosition3> elements) {
			for (OutputPosition3 each : elements) {
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

	@NullTerminated
	private final List<OutputPosition3> positions;

	@XfsExtra
	private final Map<String, String> extra;

	protected Status3(Builder builder) {
		device = builder.device;
		safeDoor = builder.safeDoor;
		dispenser = builder.dispenser;
		intermediateStacker = builder.intermediateStacker;
		positions = Collections.unmodifiableList(new ArrayList<>(builder.positions));
		extra = Collections.unmodifiableMap(new LinkedHashMap<>(builder.extra));
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

	public List<? extends OutputPosition3> getPositions() {
		return positions;
	}

	public Map<String, String> getExtra() {
		return extra;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Status3) {
			Status3 status = (Status3) obj;
			return new EqualsBuilder().append(device, status.device).append(safeDoor, status.safeDoor)
					.append(dispenser, status.dispenser).append(intermediateStacker, status.intermediateStacker)
					.append(positions, status.positions).append(extra, status.extra).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(device).append(safeDoor).append(dispenser).append(intermediateStacker)
				.append(positions).append(extra).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("device", device).append("safeDoor", safeDoor)
				.append("dispenser", dispenser).append("intermediateStacker", intermediateStacker)
				.append("positions", positions).append("extra", extra).toString();
	}
}
