package at.o2xfs.xfs.v3.cdm;

import at.o2xfs.xfs.cdm.Position;
import at.o2xfs.xfs.cdm.RetractArea;
import at.o2xfs.xfs.v3.BaseTest;

class Retract3Test extends BaseTest {

	@Override
	public Object getValue() {
		return new Retract3.Builder().outputPosition(Position.TOP).retractArea(RetractArea.RETRACT).index(3).build();
	}

}
