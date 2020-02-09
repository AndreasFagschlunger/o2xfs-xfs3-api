package at.o2xfs.xfs.v3.cdm;

import java.util.Collections;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.UShort;
import at.o2xfs.xfs.XfsServiceClass;
import at.o2xfs.xfs.cdm.CdmType;
import at.o2xfs.xfs.cdm.ExchangeType;
import at.o2xfs.xfs.cdm.MoveItem;
import at.o2xfs.xfs.cdm.Position;
import at.o2xfs.xfs.cdm.RetractArea;
import at.o2xfs.xfs.cdm.RetractStackerAction;
import at.o2xfs.xfs.cdm.RetractTransportAction;
import at.o2xfs.xfs.databind.annotation.XfsEnum16;
import at.o2xfs.xfs.databind.annotation.XfsEnumSet16;
import at.o2xfs.xfs.databind.annotation.XfsExtra;

@MemoryPropertyOrder({ "serviceClass", "type", "maxDispenseItems", "compound", "shutter", "shutterControl",
		"retractAreas", "retractTransportActions", "retractStackerActions", "safeDoor", "cashBox",
		"intermediateStacker", "itemsTakenSensor", "positions", "moveItems", "exchangeType", "extra" })
public class Capabilities3 {

	public static class Builder {

		private XfsServiceClass serviceClass;
		private CdmType type;
		private int maxDispenseItems;
		private boolean compound;
		private boolean shutter;
		private boolean shutterControl;
		private EnumSet<RetractArea> retractAreas = EnumSet.noneOf(RetractArea.class);
		private EnumSet<RetractTransportAction> retractTransportActions = EnumSet.noneOf(RetractTransportAction.class);
		private EnumSet<RetractStackerAction> retractStackerActions = EnumSet.noneOf(RetractStackerAction.class);
		private boolean safeDoor;
		private boolean cashBox;
		private boolean intermediateStacker;
		private boolean itemsTakenSensor;
		private EnumSet<Position> positions = EnumSet.noneOf(Position.class);
		private EnumSet<MoveItem> moveItems = EnumSet.noneOf(MoveItem.class);
		private EnumSet<ExchangeType> exchangeType = EnumSet.noneOf(ExchangeType.class);
		private final Map<String, String> extra;

		public Builder() {
			extra = new LinkedHashMap<>();
		}

		public Builder serviceClass(XfsServiceClass serviceClass) {
			this.serviceClass = serviceClass;
			return this;
		}

		public Builder type(CdmType type) {
			this.type = type;
			return this;
		}

		public Builder maxDispenseItems(int maxDispenseItems) {
			this.maxDispenseItems = maxDispenseItems;
			return this;
		}

		public Builder compound(boolean compound) {
			this.compound = compound;
			return this;
		}

		public Builder shutter(boolean shutter) {
			this.shutter = shutter;
			return this;
		}

		public Builder shutterControl(boolean shutterControl) {
			this.shutterControl = shutterControl;
			return this;
		}

		public Builder addRetractArea(RetractArea element) {
			this.retractAreas.add(element);
			return this;
		}

		public Builder addRetractArea(RetractArea... elements) {
			for (RetractArea each : elements) {
				this.retractAreas.add(each);
			}
			return this;
		}

		public Builder retractAreas(Iterable<RetractArea> elements) {
			this.retractAreas.clear();
			return addAllRetractAreas(elements);
		}

		public Builder addAllRetractAreas(Iterable<RetractArea> elements) {
			for (RetractArea each : elements) {
				this.retractAreas.add(each);
			}
			return this;
		}

		public Builder addRetractTransportAction(RetractTransportAction element) {
			this.retractTransportActions.add(element);
			return this;
		}

		public Builder addRetractTransportAction(RetractTransportAction... elements) {
			for (RetractTransportAction each : elements) {
				this.retractTransportActions.add(each);
			}
			return this;
		}

		public Builder retractTransportActions(Iterable<RetractTransportAction> elements) {
			this.retractTransportActions.clear();
			return addAllRetractTransportActions(elements);
		}

		public Builder addAllRetractTransportActions(Iterable<RetractTransportAction> elements) {
			for (RetractTransportAction each : elements) {
				this.retractTransportActions.add(each);
			}
			return this;
		}

		public Builder addRetractStackerAction(RetractStackerAction element) {
			this.retractStackerActions.add(element);
			return this;
		}

		public Builder addRetractStackerAction(RetractStackerAction... elements) {
			for (RetractStackerAction each : elements) {
				this.retractStackerActions.add(each);
			}
			return this;
		}

		public Builder retractStackerActions(Iterable<RetractStackerAction> elements) {
			this.retractStackerActions.clear();
			return addAllRetractStackerActions(elements);
		}

		public Builder addAllRetractStackerActions(Iterable<RetractStackerAction> elements) {
			for (RetractStackerAction each : elements) {
				this.retractStackerActions.add(each);
			}
			return this;
		}

		public Builder safeDoor(boolean safeDoor) {
			this.safeDoor = safeDoor;
			return this;
		}

		public Builder cashBox(boolean cashBox) {
			this.cashBox = cashBox;
			return this;
		}

		public Builder intermediateStacker(boolean intermediateStacker) {
			this.intermediateStacker = intermediateStacker;
			return this;
		}

		public Builder itemsTakenSensor(boolean itemsTakenSensor) {
			this.itemsTakenSensor = itemsTakenSensor;
			return this;
		}

		public Builder addPosition(Position element) {
			this.positions.add(element);
			return this;
		}

		public Builder addPosition(Position... elements) {
			for (Position each : elements) {
				this.positions.add(each);
			}
			return this;
		}

		public Builder positions(Iterable<Position> elements) {
			this.positions.clear();
			return addAllPositions(elements);
		}

		public Builder addAllPositions(Iterable<Position> elements) {
			for (Position each : elements) {
				this.positions.add(each);
			}
			return this;
		}

		public Builder addMoveItem(MoveItem element) {
			this.moveItems.add(element);
			return this;
		}

		public Builder addMoveItem(MoveItem... elements) {
			for (MoveItem each : elements) {
				this.moveItems.add(each);
			}
			return this;
		}

		public Builder moveItems(Iterable<MoveItem> elements) {
			this.moveItems.clear();
			return addAllMoveItems(elements);
		}

		public Builder addAllMoveItems(Iterable<MoveItem> elements) {
			for (MoveItem each : elements) {
				this.moveItems.add(each);
			}
			return this;
		}

		public Builder addExchangeType(ExchangeType element) {
			this.exchangeType.add(element);
			return this;
		}

		public Builder addExchangeType(ExchangeType... elements) {
			for (ExchangeType each : elements) {
				this.exchangeType.add(each);
			}
			return this;
		}

		public Builder exchangeType(Iterable<ExchangeType> elements) {
			this.exchangeType.clear();
			return addAllExchangeType(elements);
		}

		public Builder addAllExchangeType(Iterable<ExchangeType> elements) {
			for (ExchangeType each : elements) {
				this.exchangeType.add(each);
			}
			return this;
		}

		public Builder putExtra(String key, String value) {
			extra.put(key, value);
			return this;
		}

		public Builder extra(Map<String, String> entries) {
			extra.clear();
			putAllExtra(entries);
			return this;
		}

		public Builder putAllExtra(Map<String, String> entries) {
			for (Map.Entry<String, String> e : entries.entrySet()) {
				extra.put(e.getKey(), e.getValue());
			}
			return this;
		}

		public Capabilities3 build() {
			return new Capabilities3(this);
		}
	}

	@XfsEnum16
	private final XfsServiceClass serviceClass;

	@XfsEnum16
	private final CdmType type;

	@UShort
	private final int maxDispenseItems;

	private final boolean compound;

	private final boolean shutter;

	private final boolean shutterControl;

	@XfsEnumSet16
	private final Set<RetractArea> retractAreas;

	@XfsEnumSet16
	private final Set<RetractTransportAction> retractTransportActions;

	@XfsEnumSet16
	private final Set<RetractStackerAction> retractStackerActions;

	private final boolean safeDoor;

	private final boolean cashBox;

	private final boolean intermediateStacker;

	private final boolean itemsTakenSensor;

	@XfsEnumSet16
	private final Set<Position> positions;

	@XfsEnumSet16
	private final Set<MoveItem> moveItems;

	@XfsEnumSet16
	private final Set<ExchangeType> exchangeType;

	@XfsExtra
	private final Map<String, String> extra;

	protected Capabilities3(Builder builder) {
		serviceClass = builder.serviceClass;
		type = builder.type;
		maxDispenseItems = builder.maxDispenseItems;
		compound = builder.compound;
		shutter = builder.shutter;
		shutterControl = builder.shutterControl;
		retractAreas = Collections.unmodifiableSet(EnumSet.copyOf(builder.retractAreas));
		retractTransportActions = Collections.unmodifiableSet(EnumSet.copyOf(builder.retractTransportActions));
		retractStackerActions = Collections.unmodifiableSet(EnumSet.copyOf(builder.retractStackerActions));
		safeDoor = builder.safeDoor;
		cashBox = builder.cashBox;
		intermediateStacker = builder.intermediateStacker;
		itemsTakenSensor = builder.itemsTakenSensor;
		positions = Collections.unmodifiableSet(EnumSet.copyOf(builder.positions));
		moveItems = Collections.unmodifiableSet(EnumSet.copyOf(builder.moveItems));
		exchangeType = Collections.unmodifiableSet(EnumSet.copyOf(builder.exchangeType));
		extra = Collections.unmodifiableMap(new LinkedHashMap<>(builder.extra));
	}

	public XfsServiceClass getServiceClass() {
		return serviceClass;
	}

	public CdmType getType() {
		return type;
	}

	public int getMaxDispenseItems() {
		return maxDispenseItems;
	}

	public boolean isCompound() {
		return compound;
	}

	public boolean isShutter() {
		return shutter;
	}

	public boolean isShutterControl() {
		return shutterControl;
	}

	public Set<RetractArea> getRetractAreas() {
		return retractAreas;
	}

	public Set<RetractTransportAction> getRetractTransportActions() {
		return retractTransportActions;
	}

	public Set<RetractStackerAction> getRetractStackerActions() {
		return retractStackerActions;
	}

	public boolean isSafeDoor() {
		return safeDoor;
	}

	public boolean isCashBox() {
		return cashBox;
	}

	public boolean isIntermediateStacker() {
		return intermediateStacker;
	}

	public boolean isItemsTakenSensor() {
		return itemsTakenSensor;
	}

	public Set<Position> getPositions() {
		return positions;
	}

	public Set<MoveItem> getMoveItems() {
		return moveItems;
	}

	public Set<ExchangeType> getExchangeType() {
		return exchangeType;
	}

	public Map<String, String> getExtra() {
		return extra;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Capabilities3) {
			Capabilities3 capabilities = (Capabilities3) obj;
			return new EqualsBuilder().append(serviceClass, capabilities.serviceClass).append(type, capabilities.type)
					.append(maxDispenseItems, capabilities.maxDispenseItems).append(compound, capabilities.compound)
					.append(shutter, capabilities.shutter).append(shutterControl, capabilities.shutterControl)
					.append(retractAreas, capabilities.retractAreas)
					.append(retractTransportActions, capabilities.retractTransportActions)
					.append(retractStackerActions, capabilities.retractStackerActions)
					.append(safeDoor, capabilities.safeDoor).append(cashBox, capabilities.cashBox)
					.append(intermediateStacker, capabilities.intermediateStacker)
					.append(itemsTakenSensor, capabilities.itemsTakenSensor).append(positions, capabilities.positions)
					.append(moveItems, capabilities.moveItems).append(exchangeType, capabilities.exchangeType)
					.append(extra, capabilities.extra).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(serviceClass).append(type).append(maxDispenseItems).append(compound)
				.append(shutter).append(shutterControl).append(retractAreas).append(retractTransportActions)
				.append(retractStackerActions).append(safeDoor).append(cashBox).append(intermediateStacker)
				.append(itemsTakenSensor).append(positions).append(moveItems).append(exchangeType).append(extra)
				.toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("serviceClass", serviceClass).append("type", type)
				.append("maxDispenseItems", maxDispenseItems).append("compound", compound).append("shutter", shutter)
				.append("shutterControl", shutterControl).append("retractAreas", retractAreas)
				.append("retractTransportActions", retractTransportActions)
				.append("retractStackerActions", retractStackerActions).append("safeDoor", safeDoor)
				.append("cashBox", cashBox).append("intermediateStacker", intermediateStacker)
				.append("itemsTakenSensor", itemsTakenSensor).append("positions", positions)
				.append("moveItems", moveItems).append("exchangeType", exchangeType).append("extra", extra).toString();
	}
}
