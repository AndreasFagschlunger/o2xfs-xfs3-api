package at.o2xfs.xfs.v3_30.cdm;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.UShort;
import at.o2xfs.xfs.cdm.ItemInfoType;
import at.o2xfs.xfs.cdm.Level;
import at.o2xfs.xfs.databind.annotation.XfsEnum16;
import at.o2xfs.xfs.databind.annotation.XfsEnumSet32;

@MemoryPropertyOrder({ "level", "index", "itemInfoType" })
public class GetItemInfo330 {

	public static class Builder {

		private Level level;
		private int index;
		private EnumSet<ItemInfoType> itemInfoType = EnumSet.noneOf(ItemInfoType.class);

		public Builder() {
		}

		public Builder level(Level level) {
			this.level = level;
			return this;
		}

		public Builder index(int index) {
			this.index = index;
			return this;
		}

		public Builder addItemInfoType(ItemInfoType element) {
			this.itemInfoType.add(element);
			return this;
		}

		public Builder addItemInfoType(ItemInfoType... elements) {
			for (ItemInfoType each : elements) {
				this.itemInfoType.add(each);
			}
			return this;
		}

		public Builder itemInfoType(Iterable<ItemInfoType> elements) {
			this.itemInfoType.clear();
			return addAllItemInfoType(elements);
		}

		public Builder addAllItemInfoType(Iterable<ItemInfoType> elements) {
			for (ItemInfoType each : elements) {
				this.itemInfoType.add(each);
			}
			return this;
		}

		public GetItemInfo330 build() {
			return new GetItemInfo330(this);
		}
	}

	@XfsEnum16
	private final Level level;

	@UShort
	private final int index;

	@XfsEnumSet32
	private final Set<ItemInfoType> itemInfoType;

	protected GetItemInfo330(Builder builder) {
		level = builder.level;
		index = builder.index;
		itemInfoType = Collections.unmodifiableSet(EnumSet.copyOf(builder.itemInfoType));
	}

	public Level getLevel() {
		return level;
	}

	public int getIndex() {
		return index;
	}

	public Set<ItemInfoType> getItemInfoType() {
		return itemInfoType;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof GetItemInfo330) {
			GetItemInfo330 getItemInfo = (GetItemInfo330) obj;
			return new EqualsBuilder().append(level, getItemInfo.level).append(index, getItemInfo.index)
					.append(itemInfoType, getItemInfo.itemInfoType).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(level).append(index).append(itemInfoType).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("level", level).append("index", index)
				.append("itemInfoType", itemInfoType).toString();
	}
}
