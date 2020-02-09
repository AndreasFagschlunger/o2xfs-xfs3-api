package at.o2xfs.xfs.v3.cdm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import at.o2xfs.xfs.cdm.Position;
import at.o2xfs.xfs.cdm.PositionStatus;
import at.o2xfs.xfs.cdm.Shutter;
import at.o2xfs.xfs.cdm.Transport;
import at.o2xfs.xfs.cdm.TransportStatus;
import at.o2xfs.xfs.v3.BaseTest;

class OutputPosition3Test extends BaseTest {

	@Override
	public Object getValue() {
		return new OutputPosition3.Builder().position(Position.FRONT).shutter(Shutter.CLOSED)
				.positionStatus(PositionStatus.EMPTY).transport(Transport.OK).transportStatus(TransportStatus.EMPTY)
				.build();
	}

	@Test
	public void empty() throws IOException {
		OutputPosition3 expected = new OutputPosition3.Builder().build();
		OutputPosition3 actual = mapper.read(serialize(expected), OutputPosition3.class);
		assertEquals(expected, actual);
		assertEquals(Position.NULL, actual.getPosition());
		assertEquals(Shutter.CLOSED, actual.getShutter());
		assertEquals(PositionStatus.EMPTY, actual.getPositionStatus());
		assertEquals(Transport.OK, actual.getTransport());
		assertEquals(TransportStatus.EMPTY, actual.getTransportStatus());
	}
}
