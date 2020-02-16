package at.o2xfs.xfs.v3_10.cdm;

import at.o2xfs.xfs.cdm.Status;
import at.o2xfs.xfs.util.UnitId;
import at.o2xfs.xfs.v3.BaseTest;

class PhysicalCashUnit310Test extends BaseTest {

	private PhysicalCashUnit310 physicalCashUnit = new PhysicalCashUnit310.Builder().physicalPositionName("SLOT1")
			.unitId(UnitId.of('1', '2', '3', '4', '5')).initialCount(100).count(1824).rejectCount(2).maximum(2400)
			.status(Status.OK).dispensedCount(58L).presentedCount(56L).build();

	@Override
	public Object getValue() {
		return physicalCashUnit;
	}
}
