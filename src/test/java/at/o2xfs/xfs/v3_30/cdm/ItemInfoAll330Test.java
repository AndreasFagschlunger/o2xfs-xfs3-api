package at.o2xfs.xfs.v3_30.cdm;

import java.util.Optional;

import at.o2xfs.xfs.cdm.ItemLocation;
import at.o2xfs.xfs.cdm.Level;
import at.o2xfs.xfs.cdm.OnBlacklist;
import at.o2xfs.xfs.util.StandardCurrencyIds;
import at.o2xfs.xfs.v3.BaseTest;

class ItemInfoAll330Test extends BaseTest {

	private ItemInfoAll330 itemInfoAll = new ItemInfoAll330.Builder().level(Level.LEVEL_2)
			.currencyId(StandardCurrencyIds.EUR).value(100L).release(1).serialNumber(Optional.of("1234*6"))
			.imageFileName(Optional.of("C:\\Temp\\cash123456.jpg")).onBlacklist(OnBlacklist.ONBLACKLIST)
			.itemLocation(ItemLocation.CASHUNIT).number(1).build();

	@Override
	public Object getValue() {
		return itemInfoAll;
	}
}
