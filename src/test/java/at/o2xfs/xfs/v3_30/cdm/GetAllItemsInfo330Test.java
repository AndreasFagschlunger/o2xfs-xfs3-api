package at.o2xfs.xfs.v3_30.cdm;

import at.o2xfs.xfs.cdm.Level;
import at.o2xfs.xfs.v3.BaseTest;

class GetAllItemsInfo330Test extends BaseTest {

	private GetAllItemsInfo330 getAllItemsInfo = new GetAllItemsInfo330.Builder().level(Level.LEVEL_2).build();

	@Override
	public Object getValue() {
		return getAllItemsInfo;
	}
}
