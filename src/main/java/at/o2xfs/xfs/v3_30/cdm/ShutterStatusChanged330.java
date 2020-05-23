package at.o2xfs.xfs.v3_30.cdm;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.xfs.cdm.Position;
import at.o2xfs.xfs.cdm.Shutter;
import at.o2xfs.xfs.databind.annotation.XfsEnum16;

@JsonDeserialize(builder = ShutterStatusChanged330.Builder.class)
@MemoryPropertyOrder({ "position", "shutter" })
public class ShutterStatusChanged330 {

	@JsonPOJOBuilder(withPrefix = "")
	public static class Builder {

		private Position position;
		private Shutter shutter;

		public Builder() {
			position = Position.NULL;
			shutter = Shutter.CLOSED;
		}

		public Builder position(Position position) {
			this.position = position;
			return this;
		}

		public Builder shutter(Shutter shutter) {
			this.shutter = shutter;
			return this;
		}

		public ShutterStatusChanged330 build() {
			return new ShutterStatusChanged330(this);
		}
	}

	@XfsEnum16
	private final Position position;

	@XfsEnum16
	private final Shutter shutter;

	protected ShutterStatusChanged330(Builder builder) {
		position = builder.position;
		shutter = builder.shutter;
	}

	public Position getPosition() {
		return position;
	}

	public Shutter getShutter() {
		return shutter;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ShutterStatusChanged330) {
			ShutterStatusChanged330 shutterStatusChanged = (ShutterStatusChanged330) obj;
			return new EqualsBuilder().append(position, shutterStatusChanged.position)
					.append(shutter, shutterStatusChanged.shutter).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(position).append(shutter).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("position", position).append("shutter", shutter).toString();
	}
}
