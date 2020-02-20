package at.o2xfs.xfs.v3_30.cdm;

import at.o2xfs.xfs.cdm.IncompleteRetractReason;
import at.o2xfs.xfs.util.StandardCurrencyIds;
import at.o2xfs.xfs.v3.BaseTest;
import at.o2xfs.xfs.v3_20.cdm.ItemNumber320;
import at.o2xfs.xfs.v3_20.cdm.ItemNumberList320;

class IncompleteRetract330Test extends BaseTest {

	private IncompleteRetract330 incompleteRetract = new IncompleteRetract330.Builder()
			.itemNumberList(new ItemNumberList320.Builder().addItemNumbers(
					new ItemNumber320.Builder().currencyId(StandardCurrencyIds.EUR).values(1000L).release(1).count(3)
							.number(2).build(),
					new ItemNumber320.Builder().currencyId(StandardCurrencyIds.USD).values(2000L).release(2).count(1)
							.number(3).build())
					.build())
			.reason(IncompleteRetractReason.RETRACTFAILURE).build();

	@Override
	public Object getValue() {
		return incompleteRetract;
	}
}
