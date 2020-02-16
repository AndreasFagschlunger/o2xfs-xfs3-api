package at.o2xfs.xfs.v3_10.cdm;

import at.o2xfs.xfs.v3.BaseTest;

class PowerSaveControl310Test extends BaseTest {

	private PowerSaveControl310 powerSaveControl = new PowerSaveControl310.Builder().maxPowerSaveRecoveryTime(10)
			.build();

	@Override
	public Object getValue() {
		return powerSaveControl;
	}
}
