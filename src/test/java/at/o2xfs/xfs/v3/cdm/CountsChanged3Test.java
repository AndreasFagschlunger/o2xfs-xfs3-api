package at.o2xfs.xfs.v3.cdm;

import at.o2xfs.xfs.v3.BaseTest;

class CountsChanged3Test extends BaseTest {

	private CountsChanged3 countsChanged = new CountsChanged3.Builder().cashUnitNumbers(1, 2, 3, 4).build();

	@Override
	public Object getValue() {
		return countsChanged;
	}
}
