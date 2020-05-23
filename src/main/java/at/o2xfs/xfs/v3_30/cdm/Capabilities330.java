package at.o2xfs.xfs.v3_30.cdm;

import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.Pointer;
import at.o2xfs.xfs.api.XfsServiceClass;
import at.o2xfs.xfs.cdm.CdmExecuteCommand;
import at.o2xfs.xfs.cdm.CdmType;
import at.o2xfs.xfs.cdm.ExchangeType;
import at.o2xfs.xfs.cdm.GuidLight;
import at.o2xfs.xfs.cdm.ItemInfoType;
import at.o2xfs.xfs.cdm.MoveItem;
import at.o2xfs.xfs.cdm.Position;
import at.o2xfs.xfs.cdm.RetractArea;
import at.o2xfs.xfs.cdm.RetractStackerAction;
import at.o2xfs.xfs.cdm.RetractTransportAction;
import at.o2xfs.xfs.databind.annotation.XfsEnumSet32;
import at.o2xfs.xfs.v3_20.cdm.Capabilities320;

@JsonDeserialize(builder = Capabilities330.Builder.class)
@MemoryPropertyOrder({ "itemInfoTypes", "blacklist", "synchronizableCommands" })
public class Capabilities330 extends Capabilities320 {

	public static class Builder extends Capabilities320.Builder {

		private EnumSet<ItemInfoType> itemInfoTypes = EnumSet.noneOf(ItemInfoType.class);
		private boolean blacklist;
		private Set<CdmExecuteCommand> synchronizableCommands;

		public Builder() {
			this.synchronizableCommands = new HashSet<>();
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

		@Override
		public Builder antiFraudModule(boolean antiFraudModule) {
			super.antiFraudModule(antiFraudModule);
			return this;
		}

		public Builder addItemInfoTypes(ItemInfoType element) {
			this.itemInfoTypes.add(element);
			return this;
		}

		@JsonProperty
		public Builder addItemInfoTypes(ItemInfoType... elements) {
			for (ItemInfoType each : elements) {
				this.itemInfoTypes.add(each);
			}
			return this;
		}

		public Builder itemInfoTypes(Iterable<ItemInfoType> elements) {
			this.itemInfoTypes.clear();
			return addAllItemInfoTypes(elements);
		}

		public Builder addAllItemInfoTypes(Iterable<ItemInfoType> elements) {
			for (ItemInfoType each : elements) {
				this.itemInfoTypes.add(each);
			}
			return this;
		}

		public Builder blacklist(boolean blacklist) {
			this.blacklist = blacklist;
			return this;
		}

		public Builder addSynchronizableCommands(CdmExecuteCommand synchronizableCommands) {
			this.synchronizableCommands.add(synchronizableCommands);
			return this;
		}

		@JsonProperty
		public Builder addSynchronizableCommands(CdmExecuteCommand... synchronizableCommands) {
			for (CdmExecuteCommand each : synchronizableCommands) {
				this.synchronizableCommands.add(each);
			}
			return this;
		}

		public Builder synchronizableCommands(Iterable<CdmExecuteCommand> synchronizableCommands) {
			this.synchronizableCommands.clear();
			return addAllSynchronizableCommands(synchronizableCommands);
		}

		public Builder addAllSynchronizableCommands(Iterable<CdmExecuteCommand> synchronizableCommands) {
			for (CdmExecuteCommand each : synchronizableCommands) {
				this.synchronizableCommands.add(each);
			}
			return this;
		}

		@Override
		public Capabilities330 build() {
			return new Capabilities330(this);
		}
	}

	@XfsEnumSet32
	private final Set<ItemInfoType> itemInfoTypes;

	private final boolean blacklist;

	@Pointer
	@XfsEnumSet32(zeroTerminated = true)
	private final Set<CdmExecuteCommand> synchronizableCommands;

	protected Capabilities330(Builder builder) {
		super(builder);
		itemInfoTypes = Collections.unmodifiableSet(EnumSet.copyOf(builder.itemInfoTypes));
		blacklist = builder.blacklist;
		synchronizableCommands = builder.synchronizableCommands;
	}

	public Set<ItemInfoType> getItemInfoTypes() {
		return itemInfoTypes;
	}

	public boolean isBlacklist() {
		return blacklist;
	}

	public Set<CdmExecuteCommand> getSynchronizableCommands() {
		return synchronizableCommands;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Capabilities330) {
			Capabilities330 capabilities = (Capabilities330) obj;
			return new EqualsBuilder().appendSuper(super.equals(obj)).append(itemInfoTypes, capabilities.itemInfoTypes)
					.append(blacklist, capabilities.blacklist)
					.append(synchronizableCommands, capabilities.synchronizableCommands).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().appendSuper(super.hashCode()).append(itemInfoTypes).append(blacklist)
				.append(synchronizableCommands).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).appendSuper(super.toString()).append("itemInfoTypes", itemInfoTypes)
				.append("blacklist", blacklist).append("synchronizableCommands", synchronizableCommands).toString();
	}
}
