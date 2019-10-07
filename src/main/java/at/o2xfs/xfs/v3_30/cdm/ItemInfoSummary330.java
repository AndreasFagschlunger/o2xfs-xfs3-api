package at.o2xfs.xfs.v3_30.cdm;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.UShort;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import at.o2xfs.xfs.cdm.Level;
import org.apache.commons.lang3.builder.EqualsBuilder;

@MemoryPropertyOrder({"level", "numOfItems" })
public class ItemInfoSummary330 {

	public static class Builder {

		private Level level;
		private int numOfItems;

		public Builder() { }

		public Builder level(Level level) {
			this.level = level;
			return this;
		}

		public Builder numOfItems(int numOfItems) {
			this.numOfItems = numOfItems;
			return this;
		}

		public ItemInfoSummary330 build() {
			return new ItemInfoSummary330(this);
		}
	}

	@UShort
	private final Level level;

	@UShort
	private final int numOfItems;

	protected ItemInfoSummary330(Builder builder) {
		level = builder.level;
		numOfItems = builder.numOfItems;
	}

	public Level getLevel() {
		return level;
	}

	public int getNumOfItems() {
		return numOfItems;
	}

	public boolean equals(Object obj) {
		if(obj instanceof ItemInfoSummary330) {
			ItemInfoSummary330 itemInfoSummary = (ItemInfoSummary330) obj;
			return new EqualsBuilder().append(level, itemInfoSummary.level).append(numOfItems, itemInfoSummary.numOfItems).isEquals();
		}
		return false;
	}

	public int hashCode() {
		return new HashCodeBuilder().append(level).append(numOfItems).toHashCode();
	}

	public String toString() {
		return new ToStringBuilder(this).append("level", level).append("numOfItems", numOfItems).toString();
	}
}
