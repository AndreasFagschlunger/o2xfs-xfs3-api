package at.o2xfs.xfs.v3_10.cdm;

import java.util.EnumSet;

import at.o2xfs.xfs.cdm.Device;
import at.o2xfs.xfs.cdm.DevicePosition;
import at.o2xfs.xfs.cdm.Dispenser;
import at.o2xfs.xfs.cdm.GuidLight;
import at.o2xfs.xfs.cdm.IntermediateStacker;
import at.o2xfs.xfs.cdm.Position;
import at.o2xfs.xfs.cdm.PositionStatus;
import at.o2xfs.xfs.cdm.SafeDoor;
import at.o2xfs.xfs.cdm.Shutter;
import at.o2xfs.xfs.cdm.Transport;
import at.o2xfs.xfs.cdm.TransportStatus;
import at.o2xfs.xfs.v3.BaseTest;
import at.o2xfs.xfs.v3.cdm.OutputPosition3;

class Status310Test extends BaseTest {

	@Override
	public Object getValue() {
		return new Status310.Builder().device(Device.ONLINE).safeDoor(SafeDoor.CLOSED).dispenser(Dispenser.OK)
				.intermediateStacker(IntermediateStacker.EMPTY)
				.addPosition(new OutputPosition3.Builder().position(Position.FRONT).shutter(Shutter.CLOSED)
						.positionStatus(PositionStatus.EMPTY).transport(Transport.OK)
						.transportStatus(TransportStatus.EMPTY).build())
				.putExtra("LASTERROR", "StClass=00000000,StCode=00000000").putExtra("LastErrorText", "OK:none")
				.setGuidLights(0, EnumSet.of(GuidLight.GREEN, GuidLight.MEDIUM_FLASH))
				.devicePosition(DevicePosition.POSUNKNOWN).powerSaveRecoveryTime(3).build();
	}
}
