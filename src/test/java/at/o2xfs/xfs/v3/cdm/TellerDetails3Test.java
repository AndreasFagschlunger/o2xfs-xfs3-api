package at.o2xfs.xfs.v3.cdm;

import at.o2xfs.xfs.cdm.InputPosition;
import at.o2xfs.xfs.cdm.OutputPosition;
import at.o2xfs.xfs.util.StandardCurrencyIds;
import at.o2xfs.xfs.v3.BaseTest;

class TellerDetails3Test extends BaseTest {

	@Override
	public Object getValue() {
		return new TellerDetails3.Builder().tellerId(1).inputPosition(InputPosition.FRONT)
				.outputPosition(OutputPosition.FRONT)
				.addTellerTotal(new TellerTotals3.Builder().currencyId(StandardCurrencyIds.EUR).itemsReceived(120L)
						.itemsDispensed(100L).coinsReceived(10000).coinsDispensed(180).cashBoxReceived(500)
						.cashBoxDispensed(25).build())
				.addTellerTotal(new TellerTotals3.Builder().currencyId(StandardCurrencyIds.USD).itemsReceived(100L)
						.itemsDispensed(90L).coinsReceived(453).coinsDispensed(230).cashBoxReceived(3)
						.cashBoxDispensed(5).build())
				.build();
	}

}
