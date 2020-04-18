package at.o2xfs.xfs.v3.cdm;

import java.util.Optional;

import at.o2xfs.xfs.cdm.RetractArea;
import at.o2xfs.xfs.v3.BaseTest;

class Calibrate3Test extends BaseTest {

	private Calibrate3 calibrate = new Calibrate3.Builder().number(1).numOfBills(3)
			.position(new ItemPosition3.Builder().number(1)
					.retractArea(
							Optional.of(new Retract3.Builder().retractArea(RetractArea.ITEMCASSETTE).index(1).build()))
					.build())
			.build();

	@Override
	public Object getValue() {
		return calibrate;
	}
}
