package at.o2xfs.xfs.v3.cdm;

import at.o2xfs.xfs.cdm.Status;
import at.o2xfs.xfs.cdm.Type;
import at.o2xfs.xfs.util.StandardCurrencyIds;
import at.o2xfs.xfs.util.UnitId;
import at.o2xfs.xfs.v3.BaseTest;

class CashUnitInfo3Test extends BaseTest {

	private CashUnitInfo3 cashUnitInfo = new CashUnitInfo3.Builder()
			.addCashUnits(
					new CashUnit3.Builder().number(1).type(Type.REJECTCASSETTE)
							.unitId(UnitId.of('R', 'E', 'J', 'C', 'T')).count(10L).status(Status.OK)
							.addPhysical(new PhysicalCashUnit3.Builder()
									.physicalPositionName("BIN0").unitId(UnitId.of('R', 'E', 'J', 'C', 'T')).count(10)
									.status(Status.OK).build())
							.build(),
					new CashUnit3.Builder().number(2).type(Type.RETRACTCASSETTE)
							.unitId(UnitId.of('R', 'E', 'T', ' ', ' ')).status(
									Status.OK)
							.addPhysical(
									new PhysicalCashUnit3.Builder()
											.physicalPositionName("BIN0").unitId(
													UnitId.of('R', 'E', 'T', ' ', ' '))
											.status(Status.OK).build())
							.build(),
					new CashUnit3.Builder().number(3).type(Type.BILLCASSETTE).unitId(UnitId.of('E', 'U', 'R', ' ', 'B'))
							.currencyId(StandardCurrencyIds.EUR).values(10L).initialCount(1000L).count(376L)
							.rejectCount(6).status(Status.OK)
							.addPhysical(
									new PhysicalCashUnit3.Builder().physicalPositionName("BIN1")
											.unitId(UnitId.of('E', 'U', 'R', ' ', 'B')).initialCount(500).count(0)
											.rejectCount(1).status(Status.LOW).hardwareSensor(true).build(),
									new PhysicalCashUnit3.Builder().physicalPositionName("BIN2")
											.unitId(UnitId.of('E', 'U', 'R', ' ', 'B')).initialCount(500).count(376)
											.rejectCount(5).status(Status.OK).hardwareSensor(true).build())
							.build(),
					new CashUnit3.Builder().number(4).type(Type.BILLCASSETTE).unitId(UnitId.of('E', 'U', 'R', ' ', 'D'))
							.currencyId(StandardCurrencyIds.EUR).values(50L).initialCount(400L).count(139L)
							.rejectCount(1).status(Status.OK)
							.addPhysical(new PhysicalCashUnit3.Builder().physicalPositionName("BIN3")
									.unitId(UnitId.of('E', 'U', 'R', ' ', 'D')).initialCount(400).count(139)
									.rejectCount(1).status(Status.OK).hardwareSensor(true).build())
							.build(),

					new CashUnit3.Builder().number(5).type(Type.BILLCASSETTE).unitId(UnitId.of('E', 'U', 'R', ' ', 'E'))
							.currencyId(StandardCurrencyIds.EUR).values(100L).initialCount(1300L).count(264L)
							.rejectCount(3).status(Status.OK)
							.addPhysical(new PhysicalCashUnit3.Builder().physicalPositionName("BIN4")
									.unitId(UnitId.of('E', 'U', 'R', ' ', 'E')).initialCount(1300L).count(264L)
									.rejectCount(3).status(Status.OK).hardwareSensor(true).build())
							.build())
			.build();

	@Override
	public Object getValue() {
		return cashUnitInfo;
	}

}
