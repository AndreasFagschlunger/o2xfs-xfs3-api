package at.o2xfs.xfs.v3_30.cdm;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.UShort;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import at.o2xfs.xfs.cdm.Level;
import java.util.Set;
import at.o2xfs.xfs.cdm.ItemInfoType;
import java.util.Collections;
import at.o2xfs.xfs.databind.annotation.XfsEnumSet32;
import java.util.EnumSet;
import org.apache.commons.lang3.builder.EqualsBuilder;

@MemoryPropertyOrder({"level", "index", "itemInfoType" })
public class GetItemInfo330 {

	public static class Builder {

		private Level level;
		private int index;
		private EnumSet<ItemInfoType> itemInfoType = EnumSet.noneOf(ItemInfoType.class);

		public Builder() { }

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
			for(ItemInfoType each : elements) {
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

	@UShort
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

	public boolean equals(Object obj) {
		if(obj instanceof GetItemInfo330) {
			GetItemInfo330 getItemInfo = (GetItemInfo330) obj;
			return new EqualsBuilder().append(level, getItemInfo.level).append(index, getItemInfo.index).append(itemInfoType, getItemInfo.itemInfoType).isEquals();
		}
		return false;
	}

	public int hashCode() {
		return new HashCodeBuilder().append(level).append(index).append(itemInfoType).toHashCode();
	}

	public String toString() {
		return new ToStringBuilder(this).append("level", level).append("index", index).append("itemInfoType", itemInfoType).toString();
	}
}
