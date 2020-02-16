package at.o2xfs.xfs.v3_10.cdm;

import java.util.EnumSet;

import at.o2xfs.xfs.cdm.CdmGuidLights;
import at.o2xfs.xfs.v3.BaseTest;

class SetGuidlight310Test extends BaseTest {

	private SetGuidlight310 setGuidlight = new SetGuidlight310.Builder().guidLight(1)
			.command(EnumSet.of(CdmGuidLights.MEDIUM_FLASH, CdmGuidLights.GREEN)).build();

	@Override
	public Object getValue() {
		return setGuidlight;
	}
}
