package at.o2xfs.xfs.v3_10.cdm;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.xfs.databind.annotation.XfsEnum16;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import at.o2xfs.xfs.cdm.Position;
import org.apache.commons.lang3.builder.EqualsBuilder;

@MemoryPropertyOrder({"position" })
public class DevicePosition310 {

	public static class Builder {

		private Position position;

		public Builder() { }

		public Builder position(Position position) {
			this.position = position;
			return this;
		}

		public DevicePosition310 build() {
			return new DevicePosition310(this);
		}
	}

	@XfsEnum16
	private final Position position;

	protected DevicePosition310(Builder builder) {
		position = builder.position;
	}

	public Position getPosition() {
		return position;
	}

	public boolean equals(Object obj) {
		if(obj instanceof DevicePosition310) {
			DevicePosition310 devicePosition = (DevicePosition310) obj;
			return new EqualsBuilder().append(position, devicePosition.position).isEquals();
		}
		return false;
	}

	public int hashCode() {
		return new HashCodeBuilder().append(position).toHashCode();
	}

	public String toString() {
		return new ToStringBuilder(this).append("position", position).toString();
	}
}
