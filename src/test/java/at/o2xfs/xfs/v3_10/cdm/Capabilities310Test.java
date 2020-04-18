package at.o2xfs.xfs.v3_10.cdm;

import java.util.EnumSet;

import at.o2xfs.xfs.api.XfsServiceClass;
import at.o2xfs.xfs.cdm.CdmType;
import at.o2xfs.xfs.cdm.ExchangeType;
import at.o2xfs.xfs.cdm.GuidLight;
import at.o2xfs.xfs.cdm.Position;
import at.o2xfs.xfs.cdm.RetractArea;
import at.o2xfs.xfs.cdm.RetractStackerAction;
import at.o2xfs.xfs.cdm.RetractTransportAction;
import at.o2xfs.xfs.v3.BaseTest;
import at.o2xfs.xfs.v3.util.MapUtil;

class Capabilities310Test extends BaseTest {

	@Override
	public Object getValue() {
		return new Capabilities310.Builder().serviceClass(XfsServiceClass.CDM).type(CdmType.SELFSERVICEBILL)
				.maxDispenseItems(200).compound(true).shutter(true).shutterControl(false)
				.retractAreas(EnumSet.of(RetractArea.RETRACT, RetractArea.TRANSPORT, RetractArea.STACKER))
				.retractTransportActions(EnumSet.of(RetractTransportAction.PRESENT, RetractTransportAction.RETRACT))
				.retractStackerActions(EnumSet.of(RetractStackerAction.PRESENT, RetractStackerAction.RETRACT))
				.safeDoor(false).cashBox(false).intermediateStacker(true).itemsTakenSensor(true)
				.positions(EnumSet.of(Position.FRONT)).exchangeType(EnumSet.of(ExchangeType.BYHAND))
				.extra(MapUtil.of("Key1", "Value1")).setGuidLights(0, EnumSet.of(GuidLight.QUICK_FLASH,
						GuidLight.MEDIUM_FLASH, GuidLight.SLOW_FLASH, GuidLight.RED, GuidLight.GREEN))
				.build();
	}

}
