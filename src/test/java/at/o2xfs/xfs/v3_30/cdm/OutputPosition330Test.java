package at.o2xfs.xfs.v3_30.cdm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import at.o2xfs.xfs.cdm.JammedShutterPosition;
import at.o2xfs.xfs.cdm.Position;
import at.o2xfs.xfs.cdm.PositionStatus;
import at.o2xfs.xfs.cdm.Shutter;
import at.o2xfs.xfs.cdm.Transport;
import at.o2xfs.xfs.cdm.TransportStatus;
import at.o2xfs.xfs.v3.BaseTest;

class OutputPosition330Test extends BaseTest {

	@Override
	public Object getValue() {
		return new OutputPosition330.Builder().position(Position.FRONT).shutter(Shutter.CLOSED)
				.positionStatus(PositionStatus.EMPTY).transport(Transport.OK).transportStatus(TransportStatus.EMPTY)
				.jammedShutterPosition(JammedShutterPosition.PARTIALLY_OPEN).build();
	}

	@Test
	public void empty() throws IOException {
		OutputPosition330 expected = new OutputPosition330.Builder().build();
		OutputPosition330 actual = mapper.read(serialize(expected), OutputPosition330.class);
		assertEquals(expected, actual);
		assertEquals(Position.NULL, actual.getPosition());
		assertEquals(Shutter.CLOSED, actual.getShutter());
		assertEquals(PositionStatus.EMPTY, actual.getPositionStatus());
		assertEquals(Transport.OK, actual.getTransport());
		assertEquals(TransportStatus.EMPTY, actual.getTransportStatus());
		assertEquals(JammedShutterPosition.NOTSUPPORTED, actual.getJammedShutterPosition());
	}
}
