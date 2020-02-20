package at.o2xfs.xfs.v3_20.cdm;

import at.o2xfs.xfs.util.StandardCurrencyIds;
import at.o2xfs.xfs.v3.BaseTest;

class ItemNumber320Test extends BaseTest {

	@Override
	public Object getValue() {
		return new ItemNumber320.Builder().currencyId(StandardCurrencyIds.USD).values(1L).release(2).count(3L).number(4)
				.build();
	}

}
