package at.o2xfs.xfs.v3_10.cdm;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.xfs.cdm.DevicePosition;
import at.o2xfs.xfs.databind.annotation.XfsEnum16;

@MemoryPropertyOrder({ "position" })
public class DevicePosition310 {

	public static class Builder {

		private DevicePosition position;

		public Builder() {
		}

		public Builder position(DevicePosition position) {
			this.position = position;
			return this;
		}

		public DevicePosition310 build() {
			return new DevicePosition310(this);
		}
	}

	@XfsEnum16
	private final DevicePosition position;

	protected DevicePosition310(Builder builder) {
		position = builder.position;
	}

	public DevicePosition getPosition() {
		return position;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof DevicePosition310) {
			DevicePosition310 deviceDevicePosition = (DevicePosition310) obj;
			return new EqualsBuilder().append(position, deviceDevicePosition.position).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(position).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("position", position).toString();
	}
}
