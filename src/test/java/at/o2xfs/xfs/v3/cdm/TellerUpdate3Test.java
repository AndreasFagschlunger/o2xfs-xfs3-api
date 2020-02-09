package at.o2xfs.xfs.v3.cdm;

import at.o2xfs.xfs.cdm.InputPosition;
import at.o2xfs.xfs.cdm.OutputPosition;
import at.o2xfs.xfs.cdm.TellerUpdateAction;
import at.o2xfs.xfs.v3.BaseTest;

class TellerUpdate3Test extends BaseTest {

	@Override
	public Object getValue() {
		return new TellerUpdate3.Builder().action(TellerUpdateAction.CREATE).tellerDetails(new TellerDetails3.Builder()
				.tellerId(1).inputPosition(InputPosition.TOP).outputPosition(OutputPosition.BOTTOM)
				.addTellerTotal(new TellerTotals3.Builder().coinsReceived(12345).coinsDispensed(344).build()).build())
				.build();
	}

}
