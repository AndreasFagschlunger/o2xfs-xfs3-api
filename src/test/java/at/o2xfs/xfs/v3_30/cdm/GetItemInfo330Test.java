package at.o2xfs.xfs.v3_30.cdm;

import at.o2xfs.xfs.cdm.ItemInfoType;
import at.o2xfs.xfs.cdm.Level;
import at.o2xfs.xfs.v3.BaseTest;

class GetItemInfo330Test extends BaseTest {

	private GetItemInfo330 getItemInfo = new GetItemInfo330.Builder().level(Level.LEVEL_2).index(1)
			.addItemInfoType(ItemInfoType.IMAGEFILE, ItemInfoType.SERIALNUMBER).build();

	@Override
	public Object getValue() {
		return getItemInfo;
	}
}
