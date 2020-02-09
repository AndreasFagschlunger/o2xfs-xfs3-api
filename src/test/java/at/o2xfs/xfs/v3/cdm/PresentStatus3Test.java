package at.o2xfs.xfs.v3.cdm;

import at.o2xfs.xfs.cdm.PresentState;
import at.o2xfs.xfs.util.CurrencyId;
import at.o2xfs.xfs.v3.BaseTest;

class PresentStatus3Test extends BaseTest {

	@Override
	public Object getValue() {
		return new PresentStatus3.Builder()
				.denomination(new Denomination3.Builder().currencyId(CurrencyId.empty()).amount(0L).values(0, 1, 2, 0)
						.build())
				.presentState(PresentState.PRESENTED).putExtra("KEY1", "VALUE1").putExtra("KEY2", "VALUE2").build();
	}

}
