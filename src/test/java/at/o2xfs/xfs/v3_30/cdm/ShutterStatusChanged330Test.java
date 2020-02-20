package at.o2xfs.xfs.v3_30.cdm;

import at.o2xfs.xfs.cdm.Position;
import at.o2xfs.xfs.cdm.Shutter;
import at.o2xfs.xfs.v3.BaseTest;

class ShutterStatusChanged330Test extends BaseTest {

	private ShutterStatusChanged330 shutterStatusChanged = new ShutterStatusChanged330.Builder()
			.position(Position.FRONT).shutter(Shutter.OPEN).build();

	@Override
	public Object getValue() {
		return shutterStatusChanged;
	}
}
