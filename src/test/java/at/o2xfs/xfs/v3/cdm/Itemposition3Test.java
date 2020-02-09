package at.o2xfs.xfs.v3.cdm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.util.Optional;

import org.junit.jupiter.api.Test;

import at.o2xfs.xfs.cdm.Position;
import at.o2xfs.xfs.cdm.RetractArea;
import at.o2xfs.xfs.v3.BaseTest;

class Itemposition3Test extends BaseTest {

	@Override
	public Object getValue() {
		return new Itemposition3.Builder().number(1)
				.retractArea(Optional.of(new Retract3.Builder().retractArea(RetractArea.STACKER).build())).build();
	}

	@Test
	public void optionalRetractArea() throws IOException {
		Itemposition3 expected = new Itemposition3.Builder().build();
		Itemposition3 actual = mapper.read(serialize(expected), Itemposition3.class);
		assertEquals(expected, actual);
		assertNotNull(actual.getRetractArea());
		assertFalse(actual.getRetractArea().isPresent());
	}

	@Test
	public void outputPosition() throws IOException {
		Itemposition3 expected = new Itemposition3.Builder().outputPosition(Position.TOP).build();
		Itemposition3 actual = mapper.read(serialize(expected), Itemposition3.class);
		assertEquals(expected, actual);
	}
}
