package at.o2xfs.xfs.v3.cdm;

import at.o2xfs.xfs.cdm.ExchangeType;
import at.o2xfs.xfs.v3.BaseTest;

class StartExchange3Test extends BaseTest {

	@Override
	public Object getValue() {
		return new StartExchange3.Builder().exchangeType(ExchangeType.BYHAND).cashUnitNumbers(1, 2, 3, 4).build();
	}

}
