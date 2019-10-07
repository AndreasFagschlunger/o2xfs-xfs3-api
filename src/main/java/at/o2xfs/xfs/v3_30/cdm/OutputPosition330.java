package at.o2xfs.xfs.v3_30.cdm;

import at.o2xfs.xfs.databind.annotation.XfsEnum16;
import at.o2xfs.xfs.cdm.Transport;
import at.o2xfs.xfs.cdm.JammedShutterPosition;
import at.o2xfs.xfs.databind.annotation.XfsEnumSet16;
import at.o2xfs.xfs.cdm.TransportStatus;
import java.util.Set;
import at.o2xfs.xfs.v3.cdm.OutputPosition3;
import at.o2xfs.xfs.cdm.Position;
import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import at.o2xfs.xfs.cdm.Shutter;
import java.util.Collections;
import at.o2xfs.xfs.cdm.PositionStatus;
import java.util.EnumSet;
import org.apache.commons.lang3.builder.EqualsBuilder;

@MemoryPropertyOrder({"jammedShutterPosition" })
public class OutputPosition330 extends OutputPosition3 {

	public static class Builder extends OutputPosition3.Builder {

		private EnumSet<JammedShutterPosition> jammedShutterPosition = EnumSet.noneOf(JammedShutterPosition.class);

		public Builder() { }

		public Builder position(Position position) {
			super.position(position);
			return this;
		}

		public Builder shutter(Shutter shutter) {
			super.shutter(shutter);
			return this;
		}

		public Builder positionStatus(PositionStatus positionStatus) {
			super.positionStatus(positionStatus);
			return this;
		}

		public Builder transport(Transport transport) {
			super.transport(transport);
			return this;
		}

		public Builder transportStatus(TransportStatus transportStatus) {
			super.transportStatus(transportStatus);
			return this;
		}

		public Builder addJammedShutterPosition(JammedShutterPosition element) {
			this.jammedShutterPosition.add(element);
			return this;
		}

		public Builder addJammedShutterPosition(JammedShutterPosition... elements) {
			for(JammedShutterPosition each : elements) {
				this.jammedShutterPosition.add(each);
			}
			return this;
		}

		public Builder jammedShutterPosition(Iterable<JammedShutterPosition> elements) {
			this.jammedShutterPosition.clear();
			return addAllJammedShutterPosition(elements);
		}

		public Builder addAllJammedShutterPosition(Iterable<JammedShutterPosition> elements) {
			for (JammedShutterPosition each : elements) {
				this.jammedShutterPosition.add(each);
			}
			return this;
		}

		public OutputPosition330 build() {
			return new OutputPosition330(this);
		}
	}

	@XfsEnumSet16
	private final Set<JammedShutterPosition> jammedShutterPosition;

	protected OutputPosition330(Builder builder) {
		super(builder);
		jammedShutterPosition = Collections.unmodifiableSet(EnumSet.copyOf(builder.jammedShutterPosition));
	}

	public Set<JammedShutterPosition> getJammedShutterPosition() {
		return jammedShutterPosition;
	}

	public boolean equals(Object obj) {
		if(obj instanceof OutputPosition330) {
			OutputPosition330 outputPosition = (OutputPosition330) obj;
			return new EqualsBuilder().appendSuper(super.equals(obj)).append(jammedShutterPosition, outputPosition.jammedShutterPosition).isEquals();
		}
		return false;
	}

	public int hashCode() {
		return new HashCodeBuilder().appendSuper(super.hashCode()).append(jammedShutterPosition).toHashCode();
	}

	public String toString() {
		return new ToStringBuilder(this).appendSuper(super.toString()).append("jammedShutterPosition", jammedShutterPosition).toString();
	}
}
