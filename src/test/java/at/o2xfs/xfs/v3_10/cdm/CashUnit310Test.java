package at.o2xfs.xfs.v3_10.cdm;

import java.util.Collections;

import at.o2xfs.xfs.cdm.Status;
import at.o2xfs.xfs.cdm.Type;
import at.o2xfs.xfs.util.StandardCurrencyIds;
import at.o2xfs.xfs.util.UnitId;
import at.o2xfs.xfs.v3.BaseTest;

class CashUnit310Test extends BaseTest {

	private CashUnit310 cashUnit = new CashUnit310.Builder().number(3).type(Type.RECYCLING)
			.unitId(UnitId.of('1', '2', '3', '4', '5')).currencyId(StandardCurrencyIds.EUR).values(1000)
			.initialCount(100).count(1824).rejectCount(2).status(Status.OK)
			.physicalCashUnits(Collections.singletonList(new PhysicalCashUnit310.Builder().physicalPositionName("SLOT1")
					.unitId(UnitId.of('1', '2', '3', '4', '5')).initialCount(100).count(1824).rejectCount(2)
					.maximum(2400).status(Status.OK).dispensedCount(58L).presentedCount(56L).build()))
			.dispensedCount(58L).presentedCount(56L).build();

	@Override
	public Object getValue() {
		return cashUnit;
	}
}
