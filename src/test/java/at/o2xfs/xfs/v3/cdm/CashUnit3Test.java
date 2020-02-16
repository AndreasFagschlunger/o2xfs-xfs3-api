package at.o2xfs.xfs.v3.cdm;

import java.util.Collections;

import at.o2xfs.xfs.cdm.Status;
import at.o2xfs.xfs.cdm.Type;
import at.o2xfs.xfs.util.StandardCurrencyIds;
import at.o2xfs.xfs.util.UnitId;
import at.o2xfs.xfs.v3.BaseTest;

class CashUnit3Test extends BaseTest {

	private CashUnit3 cashUnit = new CashUnit3.Builder().number(3).type(Type.RECYCLING)
			.unitId(UnitId.of('1', '2', '3', '4', '5')).currencyId(StandardCurrencyIds.EUR).values(1000)
			.initialCount(100).count(1234).rejectCount(2).maximum(2400L).status(Status.OK)
			.physicalCashUnits(Collections.singletonList(new PhysicalCashUnit3.Builder().physicalPositionName("SLOT1")
					.unitId(UnitId.of('1', '2', '3', '4', '5')).initialCount(100).count(1234).rejectCount(2)
					.maximum(2400).status(Status.OK).build()))
			.build();

	@Override
	public Object getValue() {
		return cashUnit;
	}
}
