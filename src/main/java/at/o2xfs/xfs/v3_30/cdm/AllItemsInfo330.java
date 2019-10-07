package at.o2xfs.xfs.v3_30.cdm;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import java.util.List;
import at.o2xfs.memory.databind.annotation.win32.UShort;
import at.o2xfs.xfs.v3_30.cdm.ItemInfoAll330;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.util.Collections;
import org.apache.commons.lang3.builder.EqualsBuilder;
import java.util.ArrayList;

@MemoryPropertyOrder({"count", "itemsList" })
public class AllItemsInfo330 {

	public static class Builder {

		private int count;
		private List<ItemInfoAll330> itemsList = new ArrayList<>();

		public Builder() { }

		public Builder count(int count) {
			this.count = count;
			return this;
		}

		public Builder addItemsList(ItemInfoAll330 element) {
			this.itemsList.add(element);
			return this;
		}

		public Builder addItemsList(ItemInfoAll330... elements) {
			for(ItemInfoAll330 each : elements) {
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

	@UShort
	private final int count;

	private final List<ItemInfoAll330> itemsList;

	protected AllItemsInfo330(Builder builder) {
		count = builder.count;
		itemsList = Collections.unmodifiableList(new ArrayList<>(builder.itemsList));
	}

	public int getCount() {
		return count;
	}

	public List<ItemInfoAll330> getItemsList() {
		return itemsList;
	}

	public boolean equals(Object obj) {
		if(obj instanceof AllItemsInfo330) {
			AllItemsInfo330 allItemsInfo = (AllItemsInfo330) obj;
			return new EqualsBuilder().append(count, allItemsInfo.count).append(itemsList, allItemsInfo.itemsList).isEquals();
		}
		return false;
	}

	public int hashCode() {
		return new HashCodeBuilder().append(count).append(itemsList).toHashCode();
	}

	public String toString() {
		return new ToStringBuilder(this).append("count", count).append("itemsList", itemsList).toString();
	}
}
