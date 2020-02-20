package at.o2xfs.xfs.v3_30.cdm;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.util.Optional;

import org.junit.jupiter.api.Test;

import at.o2xfs.common.Hex;
import at.o2xfs.xfs.util.StandardCurrencyIds;
import at.o2xfs.xfs.v3.BaseTest;

class ItemInfo330Test extends BaseTest {

	private ItemInfo330 itemInfo = new ItemInfo330.Builder().currencyId(StandardCurrencyIds.EUR).value(20L).release(1)
			.serialNumber(Optional.of("ABC123"))
			.signature(Optional.of(new Signature330.Builder().data(Hex.decode("CAFEBABE")).build()))
			.imageFileName(Optional.of("C:\\Temp\\cash123456.jpg")).build();

	@Override
	public Object getValue() {
		return itemInfo;
	}

	@Test
	public void testEmpty() throws IOException {
		ItemInfo330 expected = new ItemInfo330.Builder().build();
		testDeSerializable(expected);
		assertNotNull(expected.getSerialNumber());
		assertNotNull(expected.getSignature());
		assertNotNull(expected.getImageFileName());
	}
}
