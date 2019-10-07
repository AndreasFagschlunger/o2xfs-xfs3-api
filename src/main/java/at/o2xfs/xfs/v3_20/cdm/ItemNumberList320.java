package at.o2xfs.xfs.v3_20.cdm;

import at.o2xfs.xfs.v3_20.cdm.ItemNumber320;
import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.UShort;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;

@MemoryPropertyOrder({"numOfItemNumbers", "itemNumber" })
public class ItemNumberList320 {

	public static class Builder {

		private int numOfItemNumbers;
		private ItemNumber320 itemNumber;

		public Builder() { }

		public Builder numOfItemNumbers(int numOfItemNumbers) {
			this.numOfItemNumbers = numOfItemNumbers;
			return this;
		}

		public Builder itemNumber(ItemNumber320 itemNumber) {
			this.itemNumber = itemNumber;
			return this;
		}

		public ItemNumberList320 build() {
			return new ItemNumberList320(this);
		}
	}

	@UShort
	private final int numOfItemNumbers;

	private final ItemNumber320 itemNumber;

	protected ItemNumberList320(Builder builder) {
		numOfItemNumbers = builder.numOfItemNumbers;
		itemNumber = builder.itemNumber;
	}

	public int getNumOfItemNumbers() {
		return numOfItemNumbers;
	}

	public ItemNumber320 getItemNumber() {
		return itemNumber;
	}

	public boolean equals(Object obj) {
		if(obj instanceof ItemNumberList320) {
			ItemNumberList320 itemNumberList = (ItemNumberList320) obj;
			return new EqualsBuilder().append(numOfItemNumbers, itemNumberList.numOfItemNumbers).append(itemNumber, itemNumberList.itemNumber).isEquals();
		}
		return false;
	}

	public int hashCode() {
		return new HashCodeBuilder().append(numOfItemNumbers).append(itemNumber).toHashCode();
	}

	public String toString() {
		return new ToStringBuilder(this).append("numOfItemNumbers", numOfItemNumbers).append("itemNumber", itemNumber).toString();
	}
}
