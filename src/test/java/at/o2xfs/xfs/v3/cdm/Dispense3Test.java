package at.o2xfs.xfs.v3.cdm;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import at.o2xfs.xfs.cdm.Position;
import at.o2xfs.xfs.v3.BaseTest;

class Dispense3Test extends BaseTest {

	@Override
	public Object getValue() {
		return new Dispense3.Builder().position(Position.TOP).present(true)
				.denomination(new Denomination3.Builder().values(0, 0, 0, 2).build()).build();
	}

	@Test
	public void nullPosition() throws IOException {
		testDeSerializable(new Dispense3.Builder().position(Position.NULL)
				.denomination(new Denomination3.Builder().build()).build());
	}
}
