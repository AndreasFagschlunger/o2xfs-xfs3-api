package at.o2xfs.xfs.v3.cdm;

import at.o2xfs.xfs.cdm.Failure;
import at.o2xfs.xfs.cdm.Status;
import at.o2xfs.xfs.cdm.Type;
import at.o2xfs.xfs.util.StandardCurrencyIds;
import at.o2xfs.xfs.util.UnitId;
import at.o2xfs.xfs.v3.BaseTest;

class CashUnitError3Test extends BaseTest {

	private final CashUnitError3 cashUnitError = new CashUnitError3.Builder().failure(Failure.ERROR)
			.cashUnit(new CashUnit3.Builder().number(3).type(Type.BILLCASSETTE).cashUnitName("SLOT3")
					.currencyId(StandardCurrencyIds.EUR).values(1000).initialCount(300L).count(50).rejectCount(1)
					.maximum(2000).status(Status.INOP)
					.addPhysicalCashUnits(
							new PhysicalCashUnit3.Builder().physicalPositionName("SLOT3A")
									.unitId(UnitId.of('U', 'S', 'D', ' ', '1')).initialCount(150).count(50)
									.status(Status.INOP).build(),
							new PhysicalCashUnit3.Builder().physicalPositionName("SLOT3B")
									.unitId(UnitId.of('U', 'S', 'D', ' ', '1')).initialCount(150).count(0)
									.status(Status.INOP).build())
					.build())
			.build();

	@Override
	public Object getValue() {
		return cashUnitError;
	}
}
