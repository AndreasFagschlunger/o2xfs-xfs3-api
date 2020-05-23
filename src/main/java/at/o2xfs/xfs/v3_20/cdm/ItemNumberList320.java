package at.o2xfs.xfs.v3_20.cdm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;

@JsonDeserialize(builder = ItemNumberList320.Builder.class)
@MemoryPropertyOrder({ "itemNumbers" })
public class ItemNumberList320 {

	@JsonPOJOBuilder(withPrefix = "")
	public static class Builder {

		private final List<ItemNumber320> itemNumbers;

		public Builder() {
			itemNumbers = new ArrayList<>();
		}

		public Builder addItemNumbers(ItemNumber320 element) {
			this.itemNumbers.add(element);
			return this;
		}

		@JsonProperty
		public Builder addItemNumbers(ItemNumber320... elements) {
			for (ItemNumber320 each : elements) {
				this.itemNumbers.add(each);
			}
			return this;
		}

		public Builder itemNumbers(Iterable<ItemNumber320> elements) {
			this.itemNumbers.clear();
			return addAllItemNumbers(elements);
		}

		public Builder addAllItemNumbers(Iterable<ItemNumber320> elements) {
			for (ItemNumber320 each : elements) {
				this.itemNumbers.add(each);
			}
			return this;
		}

		public ItemNumberList320 build() {
			return new ItemNumberList320(this);
		}
	}

	private final List<ItemNumber320> itemNumbers;

	protected ItemNumberList320(Builder builder) {
		itemNumbers = Collections.unmodifiableList(new ArrayList<>(builder.itemNumbers));
	}

	public List<ItemNumber320> getItemNumbers() {
		return itemNumbers;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ItemNumberList320) {
			ItemNumberList320 itemNumberList = (ItemNumberList320) obj;
			return new EqualsBuilder().append(itemNumbers, itemNumberList.itemNumbers).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(itemNumbers).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("itemNumbers", itemNumbers).toString();
	}
}
