package at.o2xfs.xfs.v3.cdm;

import java.util.Optional;

import at.o2xfs.xfs.cdm.RetractArea;
import at.o2xfs.xfs.v3.BaseTest;

class Itemposition3Test extends BaseTest {

	@Override
	public Object getValue() {
		return new Itemposition3.Builder().number(1)
				.retractArea(Optional.of(new Retract3.Builder().retractArea(RetractArea.STACKER).build())).build();
	}
}
