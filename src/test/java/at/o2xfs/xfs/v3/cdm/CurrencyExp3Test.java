package at.o2xfs.xfs.v3.cdm;

import at.o2xfs.xfs.util.StandardCurrencyIds;
import at.o2xfs.xfs.v3.BaseTest;

class CurrencyExp3Test extends BaseTest {

	private CurrencyExp3 currencyExp = new CurrencyExp3.Builder().currencyId(StandardCurrencyIds.EUR).exponent(-2)
			.build();

	@Override
	public Object getValue() {
		return currencyExp;
	}

}
