package at.o2xfs.xfs.v3_10.cdm;

import at.o2xfs.xfs.v3.BaseTest;

class PowerSaveChange310Test extends BaseTest {

	private PowerSaveChange310 powerSaveChange = new PowerSaveChange310.Builder().powerSaveRecoveryTime(3).build();

	@Override
	public Object getValue() {
		return powerSaveChange;
	}

}
