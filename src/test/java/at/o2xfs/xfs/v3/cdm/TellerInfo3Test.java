package at.o2xfs.xfs.v3.cdm;

import at.o2xfs.xfs.util.StandardCurrencyIds;
import at.o2xfs.xfs.v3.BaseTest;

class TellerInfo3Test extends BaseTest {

	@Override
	public Object getValue() {
		return new TellerInfo3.Builder().tellerId(1).currencyId(StandardCurrencyIds.EUR).build();
	}

}
