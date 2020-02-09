package at.o2xfs.xfs.v3.cdm;

import at.o2xfs.xfs.cdm.MixType;
import at.o2xfs.xfs.v3.BaseTest;

class MixType3Test extends BaseTest {

	@Override
	public Object getValue() {
		return new MixType3.Builder().mixNumber(1).mixType(MixType.ALGORITHM).subType(0x9000).name("TEST").build();
	}

}
