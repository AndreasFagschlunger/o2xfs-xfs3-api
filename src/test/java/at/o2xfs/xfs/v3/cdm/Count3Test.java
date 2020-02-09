package at.o2xfs.xfs.v3.cdm;

import at.o2xfs.xfs.cdm.Status;
import at.o2xfs.xfs.util.UnitId;
import at.o2xfs.xfs.v3.BaseTest;

class Count3Test extends BaseTest {

	private Count3 count = new Count3.Builder().addCountedPhysicalCashUnits(
			new CountedPhysicalCashUnit3.Builder().physicalPositionName("BIN1")
					.unitId(UnitId.of('E', 'U', 'R', ' ', 'A')).dispensed(1000L).counted(1000L).status(Status.EMPTY)
					.build(),
			new CountedPhysicalCashUnit3.Builder().physicalPositionName("BIN2")
					.unitId(UnitId.of('E', 'U', 'R', ' ', 'A')).dispensed(499L).counted(500L).status(Status.EMPTY)
					.build())
			.build();

	@Override
	public Object getValue() {
		return count;
	}
}
