package at.o2xfs.xfs.v3_20.cdm;

import at.o2xfs.xfs.util.StandardCurrencyIds;
import at.o2xfs.xfs.v3.BaseTest;

class ItemNumberList320Test extends BaseTest {

	private ItemNumberList320 itemNumberList = new ItemNumberList320.Builder().addItemNumbers(
			new ItemNumber320.Builder().currencyId(StandardCurrencyIds.USD).values(1L).release(2).count(3L).number(4)
					.build(),
			new ItemNumber320.Builder().currencyId(StandardCurrencyIds.EUR).values(4).release(3).count(2L).number(1)
					.build())
			.build();

	@Override
	public Object getValue() {
		return itemNumberList;
	}

}
