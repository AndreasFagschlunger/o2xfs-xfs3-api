package at.o2xfs.xfs.v3.cdm;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.xfs.cdm.Position;
import at.o2xfs.xfs.cdm.PositionStatus;
import at.o2xfs.xfs.cdm.Shutter;
import at.o2xfs.xfs.cdm.Transport;
import at.o2xfs.xfs.cdm.TransportStatus;
import at.o2xfs.xfs.databind.annotation.XfsEnum16;

@JsonDeserialize(builder = OutputPosition3.Builder.class)
@MemoryPropertyOrder({ "position", "shutter", "positionStatus", "transport", "transportStatus" })
public class OutputPosition3 {

	@JsonPOJOBuilder(withPrefix = "")
	public static class Builder {

		private Position position;
		private Shutter shutter;
		private PositionStatus positionStatus;
		private Transport transport;
		private TransportStatus transportStatus;

		public Builder() {
			position = Position.NULL;
			shutter = Shutter.CLOSED;
			positionStatus = PositionStatus.EMPTY;
			transport = Transport.OK;
			transportStatus = TransportStatus.EMPTY;
		}

		public Builder position(Position position) {
			this.position = position;
			return this;
		}

		public Builder shutter(Shutter shutter) {
			this.shutter = shutter;
			return this;
		}

		public Builder positionStatus(PositionStatus positionStatus) {
			this.positionStatus = positionStatus;
			return this;
		}

		public Builder transport(Transport transport) {
			this.transport = transport;
			return this;
		}

		public Builder transportStatus(TransportStatus transportStatus) {
			this.transportStatus = transportStatus;
			return this;
		}

		public OutputPosition3 build() {
			return new OutputPosition3(this);
		}
	}

	@XfsEnum16
	private final Position position;

	@XfsEnum16
	private final Shutter shutter;

	@XfsEnum16
	private final PositionStatus positionStatus;

	@XfsEnum16
	private final Transport transport;

	@XfsEnum16
	private final TransportStatus transportStatus;

	protected OutputPosition3(Builder builder) {
		position = builder.position;
		shutter = builder.shutter;
		positionStatus = builder.positionStatus;
		transport = builder.transport;
		transportStatus = builder.transportStatus;
	}

	public Position getPosition() {
		return position;
	}

	public Shutter getShutter() {
		return shutter;
	}

	public PositionStatus getPositionStatus() {
		return positionStatus;
	}

	public Transport getTransport() {
		return transport;
	}

	public TransportStatus getTransportStatus() {
		return transportStatus;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof OutputPosition3) {
			OutputPosition3 outputPosition = (OutputPosition3) obj;
			return new EqualsBuilder().append(position, outputPosition.position).append(shutter, outputPosition.shutter)
					.append(positionStatus, outputPosition.positionStatus).append(transport, outputPosition.transport)
					.append(transportStatus, outputPosition.transportStatus).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(position).append(shutter).append(positionStatus).append(transport)
				.append(transportStatus).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("position", position).append("shutter", shutter)
				.append("positionStatus", positionStatus).append("transport", transport)
				.append("transportStatus", transportStatus).toString();
	}
}
