package at.o2xfs.xfs.v3_30.cdm;

import at.o2xfs.xfs.util.StandardCurrencyIds;
import at.o2xfs.xfs.v3.BaseTest;

class BlacklistElement330Test extends BaseTest {

	private BlacklistElement330 blacklistElement = new BlacklistElement330.Builder().serialNumber("HD90*2")
			.currencyId(StandardCurrencyIds.EUR).value(10L).build();

	@Override
	public Object getValue() {
		return blacklistElement;
	}

}
