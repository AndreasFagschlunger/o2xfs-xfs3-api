package at.o2xfs.xfs.v3_10.cdm;

import at.o2xfs.xfs.cdm.DevicePosition;
import at.o2xfs.xfs.v3.BaseTest;

class DevicePosition310Test extends BaseTest {

	private DevicePosition310 devicePosition = new DevicePosition310.Builder().position(DevicePosition.NOTINPOSITION)
			.build();

	@Override
	public Object getValue() {
		return devicePosition;
	}

}
