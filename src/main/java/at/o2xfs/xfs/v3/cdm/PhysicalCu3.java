package at.o2xfs.xfs.v3.cdm;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.xfs.cdm.Position;
import at.o2xfs.xfs.databind.annotation.XfsEnum16;

@MemoryPropertyOrder({ "emptyAll", "position", "physicalPositionName" })
public class PhysicalCu3 {

	public static class Builder {

		private boolean emptyAll;
		private Position position;
		private String physicalPositionName;

		public Builder() {
			position = Position.NULL;
		}

		public Builder emptyAll(boolean emptyAll) {
			this.emptyAll = emptyAll;
			return this;
		}

		public Builder position(Position position) {
			this.position = position;
			return this;
		}

		public Builder physicalPositionName(String physicalPositionName) {
			this.physicalPositionName = physicalPositionName;
			return this;
		}

		public PhysicalCu3 build() {
			return new PhysicalCu3(this);
		}
	}

	private final boolean emptyAll;

	@XfsEnum16
	private final Position position;

	private final String physicalPositionName;

	protected PhysicalCu3(Builder builder) {
		emptyAll = builder.emptyAll;
		position = builder.position;
		physicalPositionName = builder.physicalPositionName;
	}

	public boolean isEmptyAll() {
		return emptyAll;
	}

	public Position getPosition() {
		return position;
	}

	public String getPhysicalPositionName() {
		return physicalPositionName;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof PhysicalCu3) {
			PhysicalCu3 physicalCu = (PhysicalCu3) obj;
			return new EqualsBuilder().append(emptyAll, physicalCu.emptyAll).append(position, physicalCu.position)
					.append(physicalPositionName, physicalCu.physicalPositionName).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(emptyAll).append(position).append(physicalPositionName).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("emptyAll", emptyAll).append("position", position)
				.append("physicalPositionName", physicalPositionName).toString();
	}
}
