package at.o2xfs.xfs.v3.cdm;

import at.o2xfs.xfs.util.StandardCurrencyIds;
import at.o2xfs.xfs.v3.BaseTest;

class TellerTotals3Test extends BaseTest {

	@Override
	public Object getValue() {
		return new TellerTotals3.Builder().currencyId(StandardCurrencyIds.EUR).itemsReceived(100).itemsDispensed(50)
				.coinsReceived(123).coinsDispensed(321).cashBoxReceived(209).cashBoxDispensed(902).build();
	}

}
