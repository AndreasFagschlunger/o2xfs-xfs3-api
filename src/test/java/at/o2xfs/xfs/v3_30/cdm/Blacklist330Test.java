package at.o2xfs.xfs.v3_30.cdm;

import java.util.Optional;

import at.o2xfs.xfs.util.StandardCurrencyIds;
import at.o2xfs.xfs.v3.BaseTest;

class Blacklist330Test extends BaseTest {

	private Blacklist330 blacklist = new Blacklist330.Builder().version(Optional.of("1.0")).addBlacklistElements(
			new BlacklistElement330.Builder().serialNumber("S8H9??16?4").currencyId(StandardCurrencyIds.EUR).value(1000)
					.build(),
			new BlacklistElement330.Builder().serialNumber("HD90*2").currencyId(StandardCurrencyIds.USD).build())
			.build();

	@Override
	public Object getValue() {
		return blacklist;
	}

}
