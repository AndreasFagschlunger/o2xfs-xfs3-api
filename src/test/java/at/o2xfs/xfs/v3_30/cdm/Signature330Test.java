package at.o2xfs.xfs.v3_30.cdm;

import at.o2xfs.common.Hex;
import at.o2xfs.xfs.v3.BaseTest;

class Signature330Test extends BaseTest {

	private Signature330 signature = new Signature330.Builder().data(Hex.decode("CAFEBABE")).build();

	@Override
	public Object getValue() {
		return signature;
	}

}
