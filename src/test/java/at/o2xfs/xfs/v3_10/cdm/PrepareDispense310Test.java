package at.o2xfs.xfs.v3_10.cdm;

import at.o2xfs.xfs.cdm.Action;
import at.o2xfs.xfs.v3.BaseTest;

class PrepareDispense310Test extends BaseTest {

	private PrepareDispense310 prepareDispense = new PrepareDispense310.Builder().action(Action.START).build();

	@Override
	public Object getValue() {
		return prepareDispense;
	}

}
