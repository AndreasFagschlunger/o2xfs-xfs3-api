package at.o2xfs.xfs.v3_30.cdm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;

@MemoryPropertyOrder({ "itemsList" })
public class AllItemsInfo330 {

	public static class Builder {

		private final List<ItemInfoAll330> itemsList;

		public Builder() {
			itemsList = new ArrayList<>();
		}

		public Builder addItemsList(ItemInfoAll330 element) {
			this.itemsList.add(element);
			return this;
		}

		public Builder addItemsList(ItemInfoAll330... elements) {
			for (ItemInfoAll330 each : elements) {
				this.itemsList.add(each);
			}
			return this;
		}

		public Builder itemsList(Iterable<ItemInfoAll330> elements) {
			this.itemsList.clear();
			return addAllItemsList(elements);
		}

		public Builder addAllItemsList(Iterable<ItemInfoAll330> elements) {
			for (ItemInfoAll330 each : elements) {
				this.itemsList.add(each);
			}
			return this;
		}

		public AllItemsInfo330 build() {
			return new AllItemsInfo330(this);
		}
	}

	private final List<ItemInfoAll330> itemsList;

	protected AllItemsInfo330(Builder builder) {
		itemsList = Collections.unmodifiableList(new ArrayList<>(builder.itemsList));
	}

	public List<ItemInfoAll330> getItemsList() {
		return itemsList;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof AllItemsInfo330) {
			AllItemsInfo330 allItemsInfo = (AllItemsInfo330) obj;
			return new EqualsBuilder().append(itemsList, allItemsInfo.itemsList).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(itemsList).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("itemsList", itemsList).toString();
	}
}
