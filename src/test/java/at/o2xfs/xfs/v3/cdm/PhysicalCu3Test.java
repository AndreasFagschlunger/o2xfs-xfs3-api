package at.o2xfs.xfs.v3.cdm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import at.o2xfs.xfs.cdm.Position;
import at.o2xfs.xfs.v3.BaseTest;

class PhysicalCu3Test extends BaseTest {

	@Override
	public Object getValue() {
		return new PhysicalCu3.Builder().emptyAll(true).position(Position.TOP).physicalPositionName("BIN3").build();
	}

	@Test
	public void emptyValues() throws IOException {
		PhysicalCu3 expected = new PhysicalCu3.Builder().build();
		PhysicalCu3 actual = mapper.read(serialize(expected), PhysicalCu3.class);
		assertEquals(expected, actual);
		assertFalse(actual.isEmptyAll());
		assertEquals(Position.NULL, actual.getPosition());
		assertNull(actual.getPhysicalPositionName());
	}
}
