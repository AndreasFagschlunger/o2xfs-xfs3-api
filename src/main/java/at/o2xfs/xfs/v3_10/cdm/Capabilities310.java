package at.o2xfs.xfs.v3_10.cdm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.xfs.XfsServiceClass;
import at.o2xfs.xfs.cdm.CdmType;
import at.o2xfs.xfs.cdm.ExchangeType;
import at.o2xfs.xfs.cdm.GuidLight;
import at.o2xfs.xfs.cdm.MoveItem;
import at.o2xfs.xfs.cdm.Position;
import at.o2xfs.xfs.cdm.RetractArea;
import at.o2xfs.xfs.cdm.RetractStackerAction;
import at.o2xfs.xfs.cdm.RetractTransportAction;
import at.o2xfs.xfs.databind.annotation.XfsGuidLights;
import at.o2xfs.xfs.v3.cdm.Capabilities3;

@MemoryPropertyOrder({ "guidLights", "powerSaveControl", "prepareDispense" })
public class Capabilities310 extends Capabilities3 {

	private static final int GUIDLIGHTS_MAX = 32;

	public static class Builder extends Capabilities3.Builder {

		private final List<Set<GuidLight>> guidLights;
		private boolean powerSaveControl;
		private boolean prepareDispense;

		public Builder() {
			guidLights = new ArrayList<>();
			for (int i = 0; i < GUIDLIGHTS_MAX; i++) {
				guidLights.add(Collections.emptySet());
			}
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

		public Builder setGuidLights(int index, Set<GuidLight> element) {
			this.guidLights.set(index, EnumSet.copyOf(element));
			return this;
		}

		public Builder guidLights(Iterable<Set<GuidLight>> elements) {
			int i = 0;
			for (Set<GuidLight> each : elements) {
				this.guidLights.set(i++, each);
			}
			return this;
		}

		public Builder powerSaveControl(boolean powerSaveControl) {
			this.powerSaveControl = powerSaveControl;
			return this;
		}

		public Builder prepareDispense(boolean prepareDispense) {
			this.prepareDispense = prepareDispense;
			return this;
		}

		@Override
		public Capabilities310 build() {
			return new Capabilities310(this);
		}
	}

	@XfsGuidLights(length = GUIDLIGHTS_MAX)
	private final List<Set<GuidLight>> guidLights;

	private final boolean powerSaveControl;

	private final boolean prepareDispense;

	protected Capabilities310(Builder builder) {
		super(builder);
		List<Set<GuidLight>> guidLights = new ArrayList<>(GUIDLIGHTS_MAX);
		for (int i = 0; i < GUIDLIGHTS_MAX; i++) {
			Set<GuidLight> s = EnumSet.noneOf(GuidLight.class);
			if (i < builder.guidLights.size() && !builder.guidLights.get(i).isEmpty()) {
				s = EnumSet.copyOf(builder.guidLights.get(i));
			}
			guidLights.add(Collections.unmodifiableSet(s));
		}
		this.guidLights = Collections.unmodifiableList(guidLights);
		powerSaveControl = builder.powerSaveControl;
		prepareDispense = builder.prepareDispense;
	}

	public List<Set<GuidLight>> getGuidLights() {
		return guidLights;
	}

	public boolean isPowerSaveControl() {
		return powerSaveControl;
	}

	public boolean isPrepareDispense() {
		return prepareDispense;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Capabilities310) {
			Capabilities310 capabilities = (Capabilities310) obj;
			return new EqualsBuilder().appendSuper(super.equals(obj)).append(guidLights, capabilities.guidLights)
					.append(powerSaveControl, capabilities.powerSaveControl)
					.append(prepareDispense, capabilities.prepareDispense).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().appendSuper(super.hashCode()).append(guidLights).append(powerSaveControl)
				.append(prepareDispense).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).appendSuper(super.toString()).append("guidLights", guidLights)
				.append("powerSaveControl", powerSaveControl).append("prepareDispense", prepareDispense).toString();
	}
}
