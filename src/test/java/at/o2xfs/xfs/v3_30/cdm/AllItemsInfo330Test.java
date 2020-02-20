package at.o2xfs.xfs.v3_30.cdm;

import java.util.Optional;

import at.o2xfs.xfs.cdm.ItemLocation;
import at.o2xfs.xfs.cdm.Level;
import at.o2xfs.xfs.cdm.OnBlacklist;
import at.o2xfs.xfs.util.StandardCurrencyIds;
import at.o2xfs.xfs.v3.BaseTest;

class AllItemsInfo330Test extends BaseTest {

	private AllItemsInfo330 allItemsInfo = new AllItemsInfo330.Builder()
			.addItemsList(
					new ItemInfoAll330.Builder().level(Level.LEVEL_2).currencyId(StandardCurrencyIds.EUR).value(1000L)
							.release(1).serialNumber(Optional.of("SERIALN?MBER")).onBlacklist(OnBlacklist.ONBLACKLIST)
							.itemLocation(ItemLocation.CASHUNIT).number(1).build(),
					new ItemInfoAll330.Builder().level(Level.LEVEL_3).currencyId(StandardCurrencyIds.USD).value(10000L)
							.release(1).imageFileName(Optional.of("C:\\TEMP\\TEST.BMP"))
							.onBlacklist(OnBlacklist.ONBLACKLIST).itemLocation(ItemLocation.DEVICE).number(2).build())
			.build();

	@Override
	public Object getValue() {
		return allItemsInfo;
	}

}
