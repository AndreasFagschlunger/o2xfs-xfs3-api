package at.o2xfs.xfs.v3_20.cdm;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.ULong;
import at.o2xfs.memory.databind.annotation.win32.UShort;
import at.o2xfs.xfs.util.CurrencyId;

@JsonDeserialize(builder = ItemNumber320.Builder.class)
@MemoryPropertyOrder({"currencyId", "values", "release", "count", "number" })
public class ItemNumber320 {

	@JsonPOJOBuilder(withPrefix = "")
	public static class Builder {

		private CurrencyId currencyId;
		private long values;
		private int release;
		private long count;
		private int number;

		public Builder() { }

		public Builder currencyId(CurrencyId currencyId) {
			this.currencyId = currencyId;
			return this;
		}

		public Builder values(long values) {
			this.values = values;
			return this;
		}

		public Builder release(int release) {
			this.release = release;
			return this;
		}

		public Builder count(long count) {
			this.count = count;
			return this;
		}

		public Builder number(int number) {
			this.number = number;
			return this;
		}

		public ItemNumber320 build() {
			return new ItemNumber320(this);
		}
	}

	private final CurrencyId currencyId;

	@ULong
	private final long values;

	@UShort
	private final int release;

	@ULong
	private final long count;

	@UShort
	private final int number;

	protected ItemNumber320(Builder builder) {
		currencyId = builder.currencyId;
		values = builder.values;
		release = builder.release;
		count = builder.count;
		number = builder.number;
	}

	public CurrencyId getCurrencyId() {
		return currencyId;
	}

	public long getValues() {
		return values;
	}

	public int getRelease() {
		return release;
	}

	public long getCount() {
		return count;
	}

	public int getNumber() {
		return number;
	}

	public boolean equals(Object obj) {
		if(obj instanceof ItemNumber320) {
			ItemNumber320 itemNumber = (ItemNumber320) obj;
			return new EqualsBuilder().append(currencyId, itemNumber.currencyId).append(values, itemNumber.values).append(release, itemNumber.release).append(count, itemNumber.count).append(number, itemNumber.number).isEquals();
		}
		return false;
	}

	public int hashCode() {
		return new HashCodeBuilder().append(currencyId).append(values).append(release).append(count).append(number).toHashCode();
	}

	public String toString() {
		return new ToStringBuilder(this).append("currencyId", currencyId).append("values", values).append("release", release).append("count", count).append("number", number).toString();
	}
}
