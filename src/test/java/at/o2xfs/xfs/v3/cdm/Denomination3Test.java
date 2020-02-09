package at.o2xfs.xfs.v3.cdm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import at.o2xfs.xfs.util.StandardCurrencyIds;
import at.o2xfs.xfs.v3.BaseTest;

class Denomination3Test extends BaseTest {

	private Denomination3 denomination = new Denomination3.Builder().currencyId(StandardCurrencyIds.EUR)
			.values(0, 0, 0, 0, 2).build();

	@Override
	public Object getValue() {
		return denomination;
	}

	@Test
	public void emptyValues() throws IOException {
		Denomination3 denomination = new Denomination3.Builder().build();
		testDeSerializable(denomination);
		;
		assertNotNull(denomination.getValues());
		assertEquals(0, denomination.getValues().length);
	}
}
