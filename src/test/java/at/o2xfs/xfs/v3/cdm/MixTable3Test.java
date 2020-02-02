package at.o2xfs.xfs.v3.cdm;

import at.o2xfs.xfs.v3.BaseTest;

class MixTable3Test extends BaseTest {

	private MixTable3 mixTable = new MixTable3.Builder().mixNumber(1).name("MIXNAME").mixHeader(10L, 20L, 50L)
			.addMixRows(new MixRow3.Builder().amount(100L).mixture(1, 0, 0).build(),
					new MixRow3.Builder().amount(90).mixture(0, 2, 1).build())
			.build();

	@Override
	public Object getValue() {
		return mixTable;
	}
}
