package at.o2xfs.xfs.v3_20.cdm;

import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.xfs.api.XfsServiceClass;
import at.o2xfs.xfs.cdm.CdmType;
import at.o2xfs.xfs.cdm.ExchangeType;
import at.o2xfs.xfs.cdm.GuidLight;
import at.o2xfs.xfs.cdm.MoveItem;
import at.o2xfs.xfs.cdm.Position;
import at.o2xfs.xfs.cdm.RetractArea;
import at.o2xfs.xfs.cdm.RetractStackerAction;
import at.o2xfs.xfs.cdm.RetractTransportAction;
import at.o2xfs.xfs.v3_10.cdm.Capabilities310;

@MemoryPropertyOrder({ "antiFraudModule" })
public class Capabilities320 extends Capabilities310 {

	public static class Builder extends Capabilities310.Builder {

		private boolean antiFraudModule;

		public Builder() {
		}

		@Override
		public Builder serviceClass(XfsServiceClass serviceClass) {
			super.serviceClass(serviceClass);
			return this;
		}

		@Override
		public Builder type(CdmType type) {
			super.type(type);
			return this;
		}

		@Override
		public Builder maxDispenseItems(int maxDispenseItems) {
			super.maxDispenseItems(maxDispenseItems);
			return this;
		}

		@Override
		public Builder compound(boolean compound) {
			super.compound(compound);
			return this;
		}

		@Override
		public Builder shutter(boolean shutter) {
			super.shutter(shutter);
			return this;
		}

		@Override
		public Builder shutterControl(boolean shutterControl) {
			super.shutterControl(shutterControl);
			return this;
		}

		@Override
		public Builder addRetractArea(RetractArea element) {
			super.addRetractArea(element);
			return this;
		}

		@Override
		public Builder addRetractArea(RetractArea... elements) {
			super.addRetractArea(elements);
			return this;
		}

		@Override
		public Builder retractAreas(Iterable<RetractArea> elements) {
			super.retractAreas(elements);
			return this;
		}

		@Override
		public Builder addAllRetractAreas(Iterable<RetractArea> elements) {
			super.addAllRetractAreas(elements);
			return this;
		}

		@Override
		public Builder addRetractTransportAction(RetractTransportAction element) {
			super.addRetractTransportAction(element);
			return this;
		}

		@Override
		public Builder addRetractTransportAction(RetractTransportAction... elements) {
			super.addRetractTransportAction(elements);
			return this;
		}

		@Override
		public Builder retractTransportActions(Iterable<RetractTransportAction> elements) {
			super.retractTransportActions(elements);
			return this;
		}

		@Override
		public Builder addAllRetractTransportActions(Iterable<RetractTransportAction> elements) {
			super.addAllRetractTransportActions(elements);
			return this;
		}

		@Override
		public Builder addRetractStackerAction(RetractStackerAction element) {
			super.addRetractStackerAction(element);
			return this;
		}

		@Override
		public Builder addRetractStackerAction(RetractStackerAction... elements) {
			super.addRetractStackerAction(elements);
			return this;
		}

		@Override
		public Builder retractStackerActions(Iterable<RetractStackerAction> elements) {
			super.retractStackerActions(elements);
			return this;
		}

		@Override
		public Builder addAllRetractStackerActions(Iterable<RetractStackerAction> elements) {
			super.addAllRetractStackerActions(elements);
			return this;
		}

		@Override
		public Builder safeDoor(boolean safeDoor) {
			super.safeDoor(safeDoor);
			return this;
		}

		@Override
		public Builder cashBox(boolean cashBox) {
			super.cashBox(cashBox);
			return this;
		}

		@Override
		public Builder intermediateStacker(boolean intermediateStacker) {
			super.intermediateStacker(intermediateStacker);
			return this;
		}

		@Override
		public Builder itemsTakenSensor(boolean itemsTakenSensor) {
			super.itemsTakenSensor(itemsTakenSensor);
			return this;
		}

		@Override
		public Builder addPosition(Position element) {
			super.addPosition(element);
			return this;
		}

		@Override
		public Builder addPosition(Position... elements) {
			super.addPosition(elements);
			return this;
		}

		@Override
		public Builder positions(Iterable<Position> elements) {
			super.positions(elements);
			return this;
		}

		@Override
		public Builder addAllPositions(Iterable<Position> elements) {
			super.addAllPositions(elements);
			return this;
		}

		@Override
		public Builder addMoveItem(MoveItem element) {
			super.addMoveItem(element);
			return this;
		}

		@Override
		public Builder addMoveItem(MoveItem... elements) {
			super.addMoveItem(elements);
			return this;
		}

		@Override
		public Builder moveItems(Iterable<MoveItem> elements) {
			super.moveItems(elements);
			return this;
		}

		@Override
		public Builder addAllMoveItems(Iterable<MoveItem> elements) {
			super.addAllMoveItems(elements);
			return this;
		}

		@Override
		public Builder addExchangeType(ExchangeType element) {
			super.addExchangeType(element);
			return this;
		}

		@Override
		public Builder addExchangeType(ExchangeType... elements) {
			super.addExchangeType(elements);
			return this;
		}

		@Override
		public Builder exchangeType(Iterable<ExchangeType> elements) {
			super.exchangeType(elements);
			return this;
		}

		@Override
		public Builder addAllExchangeType(Iterable<ExchangeType> elements) {
			super.addAllExchangeType(elements);
			return this;
		}

		@Override
		public Builder putExtra(String key, String value) {
			super.putExtra(key, value);
			return this;
		}

		@Override
		public Builder extra(Map<String, String> entries) {
			super.extra(entries);
			return this;
		}

		@Override
		public Builder putAllExtra(Map<String, String> entries) {
			super.putAllExtra(entries);
			return this;
		}

		@Override
		public Builder setGuidLights(int index, Set<GuidLight> element) {
			super.setGuidLights(index, element);
			return this;
		}

		@Override
		public Builder guidLights(Iterable<Set<GuidLight>> elements) {
			super.guidLights(elements);
			return this;
		}

		@Override
		public Builder powerSaveControl(boolean powerSaveControl) {
			super.powerSaveControl(powerSaveControl);
			return this;
		}

		@Override
		public Builder prepareDispense(boolean prepareDispense) {
			super.prepareDispense(prepareDispense);
			return this;
		}

		public Builder antiFraudModule(boolean antiFraudModule) {
			this.antiFraudModule = antiFraudModule;
			return this;
		}

		@Override
		public Capabilities320 build() {
			return new Capabilities320(this);
		}
	}

	private final boolean antiFraudModule;

	protected Capabilities320(Builder builder) {
		super(builder);
		antiFraudModule = builder.antiFraudModule;
	}

	public boolean isAntiFraudModule() {
		return antiFraudModule;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Capabilities320) {
			Capabilities320 capabilities = (Capabilities320) obj;
			return new EqualsBuilder().appendSuper(super.equals(obj))
					.append(antiFraudModule, capabilities.antiFraudModule).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().appendSuper(super.hashCode()).append(antiFraudModule).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).appendSuper(super.toString()).append("antiFraudModule", antiFraudModule)
				.toString();
	}
}
