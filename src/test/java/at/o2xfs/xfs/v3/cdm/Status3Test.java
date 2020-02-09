package at.o2xfs.xfs.v3.cdm;

import at.o2xfs.xfs.cdm.Device;
import at.o2xfs.xfs.cdm.Dispenser;
import at.o2xfs.xfs.cdm.IntermediateStacker;
import at.o2xfs.xfs.cdm.Position;
import at.o2xfs.xfs.cdm.PositionStatus;
import at.o2xfs.xfs.cdm.SafeDoor;
import at.o2xfs.xfs.cdm.Shutter;
import at.o2xfs.xfs.cdm.Transport;
import at.o2xfs.xfs.cdm.TransportStatus;
import at.o2xfs.xfs.v3.BaseTest;

class Status3Test extends BaseTest {

	@Override
	public Object getValue() {
		return new Status3.Builder().device(Device.ONLINE).safeDoor(SafeDoor.CLOSED).dispenser(Dispenser.OK)
				.intermediateStacker(IntermediateStacker.EMPTY)
				.addPosition(new OutputPosition3.Builder().position(Position.FRONT).shutter(Shutter.CLOSED)
						.positionStatus(PositionStatus.EMPTY).transport(Transport.OK)
						.transportStatus(TransportStatus.EMPTY).build())
				.putExtra("LASTERROR", "StClass=00000000,StCode=00000000").putExtra("LastErrorText", "OK:none").build();
	}
}
