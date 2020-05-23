package at.o2xfs.xfs.v3.cdm;

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

@JsonDeserialize(builder = Count3.Builder.class)
@MemoryPropertyOrder({ "countedPhysicalCashUnits" })
public class Count3 {

	@JsonPOJOBuilder(withPrefix = "")
	public static class Builder {

		private final List<CountedPhysicalCashUnit3> countedPhysicalCashUnits = new ArrayList<>();

		public Builder() {
		}

		public Builder addCountedPhysicalCashUnits(CountedPhysicalCashUnit3 element) {
			this.countedPhysicalCashUnits.add(element);
			return this;
		}

		@JsonProperty
		public Builder addCountedPhysicalCashUnits(CountedPhysicalCashUnit3... elements) {
			for (CountedPhysicalCashUnit3 each : elements) {
				this.countedPhysicalCashUnits.add(each);
			}
			return this;
		}

		public Builder countedPhysicalCashUnits(Iterable<CountedPhysicalCashUnit3> elements) {
			this.countedPhysicalCashUnits.clear();
			return addAllCountedPhysicalCashUnits(elements);
		}

		public Builder addAllCountedPhysicalCashUnits(Iterable<CountedPhysicalCashUnit3> elements) {
			for (CountedPhysicalCashUnit3 each : elements) {
				this.countedPhysicalCashUnits.add(each);
			}
			return this;
		}

		public Count3 build() {
			return new Count3(this);
		}
	}

	private final List<CountedPhysicalCashUnit3> countedPhysicalCashUnits;

	protected Count3(Builder builder) {
		countedPhysicalCashUnits = Collections.unmodifiableList(new ArrayList<>(builder.countedPhysicalCashUnits));
	}

	public List<CountedPhysicalCashUnit3> getCountedPhysicalCashUnits() {
		return countedPhysicalCashUnits;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Count3) {
			Count3 count = (Count3) obj;
			return new EqualsBuilder().append(countedPhysicalCashUnits, count.countedPhysicalCashUnits).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(countedPhysicalCashUnits).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("countedPhysicalCashUnits", countedPhysicalCashUnits).toString();
	}
}
