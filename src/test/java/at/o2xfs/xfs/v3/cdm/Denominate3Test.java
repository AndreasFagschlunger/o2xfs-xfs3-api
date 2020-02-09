package at.o2xfs.xfs.v3.cdm;

import at.o2xfs.xfs.util.StandardCurrencyIds;
import at.o2xfs.xfs.v3.BaseTest;

class Denominate3Test extends BaseTest {

	private Denominate3 denominate = new Denominate3.Builder().mixNumber(1).denomination(
			new Denomination3.Builder().currencyId(StandardCurrencyIds.EUR).amount(100L).values(1, 2, 1, 0).build())
			.build();

	@Override
	public Object getValue() {
		return denominate;
	}

}
