package at.o2xfs.xfs.v3_30.cdm;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.UShort;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;

@MemoryPropertyOrder({"position", "shutter" })
public class ShutterStatusChanged330 {

	public static class Builder {

		private int position;
		private int shutter;

		public Builder() { }

		public Builder position(int position) {
			this.position = position;
			return this;
		}

		public Builder shutter(int shutter) {
			this.shutter = shutter;
			return this;
		}

		public ShutterStatusChanged330 build() {
			return new ShutterStatusChanged330(this);
		}
	}

	@UShort
	private final int position;

	@UShort
	private final int shutter;

	protected ShutterStatusChanged330(Builder builder) {
		position = builder.position;
		shutter = builder.shutter;
	}

	public int getPosition() {
		return position;
	}

	public int getShutter() {
		return shutter;
	}

	public boolean equals(Object obj) {
		if(obj instanceof ShutterStatusChanged330) {
			ShutterStatusChanged330 shutterStatusChanged = (ShutterStatusChanged330) obj;
			return new EqualsBuilder().append(position, shutterStatusChanged.position).append(shutter, shutterStatusChanged.shutter).isEquals();
		}
		return false;
	}

	public int hashCode() {
		return new HashCodeBuilder().append(position).append(shutter).toHashCode();
	}

	public String toString() {
		return new ToStringBuilder(this).append("position", position).append("shutter", shutter).toString();
	}
}
