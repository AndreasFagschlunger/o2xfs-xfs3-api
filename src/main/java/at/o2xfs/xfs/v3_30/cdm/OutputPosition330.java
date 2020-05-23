package at.o2xfs.xfs.v3_30.cdm;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.xfs.cdm.JammedShutterPosition;
import at.o2xfs.xfs.cdm.Position;
import at.o2xfs.xfs.cdm.PositionStatus;
import at.o2xfs.xfs.cdm.Shutter;
import at.o2xfs.xfs.cdm.Transport;
import at.o2xfs.xfs.cdm.TransportStatus;
import at.o2xfs.xfs.databind.annotation.XfsEnum16;
import at.o2xfs.xfs.v3.cdm.OutputPosition3;

@JsonDeserialize(builder = OutputPosition330.Builder.class)
@MemoryPropertyOrder({ "jammedShutterPosition" })
public class OutputPosition330 extends OutputPosition3 {

	@JsonPOJOBuilder(withPrefix = "")
	public static class Builder extends OutputPosition3.Builder {

		private JammedShutterPosition jammedShutterPosition;

		public Builder() {
			jammedShutterPosition = JammedShutterPosition.NOTSUPPORTED;
		}

		@Override
		public Builder position(Position position) {
			super.position(position);
			return this;
		}

		@Override
		public Builder shutter(Shutter shutter) {
			super.shutter(shutter);
			return this;
		}

		@Override
		public Builder positionStatus(PositionStatus positionStatus) {
			super.positionStatus(positionStatus);
			return this;
		}

		@Override
		public Builder transport(Transport transport) {
			super.transport(transport);
			return this;
		}

		@Override
		public Builder transportStatus(TransportStatus transportStatus) {
			super.transportStatus(transportStatus);
			return this;
		}

		public Builder jammedShutterPosition(JammedShutterPosition jammedShutterPosition) {
			this.jammedShutterPosition = jammedShutterPosition;
			return this;
		}

		@Override
		public OutputPosition330 build() {
			return new OutputPosition330(this);
		}
	}

	@XfsEnum16
	private final JammedShutterPosition jammedShutterPosition;

	protected OutputPosition330(Builder builder) {
		super(builder);
		jammedShutterPosition = builder.jammedShutterPosition;
	}

	public JammedShutterPosition getJammedShutterPosition() {
		return jammedShutterPosition;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof OutputPosition330) {
			OutputPosition330 outputPosition = (OutputPosition330) obj;
			return new EqualsBuilder().appendSuper(super.equals(obj))
					.append(jammedShutterPosition, outputPosition.jammedShutterPosition).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().appendSuper(super.hashCode()).append(jammedShutterPosition).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).appendSuper(super.toString())
				.append("jammedShutterPosition", jammedShutterPosition).toString();
	}
}
