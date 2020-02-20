package at.o2xfs.xfs.v3_30.cdm;

import at.o2xfs.xfs.cdm.Level;
import at.o2xfs.xfs.v3.BaseTest;

class ItemInfoSummary330Test extends BaseTest {

	private ItemInfoSummary330 itemInfoSummary = new ItemInfoSummary330.Builder().level(Level.LEVEL_3).numOfItems(10)
			.build();

	@Override
	public Object getValue() {
		return itemInfoSummary;
	}
}
