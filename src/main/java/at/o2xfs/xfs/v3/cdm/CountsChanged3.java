package at.o2xfs.xfs.v3.cdm;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.UShort;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;

@MemoryPropertyOrder({"count", "cUNumList" })
public class CountsChanged3 {

	public static class Builder {

		private int count;
		private int cUNumList;

		public Builder() { }

		public Builder count(int count) {
			this.count = count;
			return this;
		}

		public Builder cUNumList(int cUNumList) {
			this.cUNumList = cUNumList;
			return this;
		}

		public CountsChanged3 build() {
			return new CountsChanged3(this);
		}
	}

	@UShort
	private final int count;

	@UShort
	private final int cUNumList;

	protected CountsChanged3(Builder builder) {
		count = builder.count;
		cUNumList = builder.cUNumList;
	}

	public int getCount() {
		return count;
	}

	public int getCUNumList() {
		return cUNumList;
	}

	public boolean equals(Object obj) {
		if(obj instanceof CountsChanged3) {
			CountsChanged3 countsChanged = (CountsChanged3) obj;
			return new EqualsBuilder().append(count, countsChanged.count).append(cUNumList, countsChanged.cUNumList).isEquals();
		}
		return false;
	}

	public int hashCode() {
		return new HashCodeBuilder().append(count).append(cUNumList).toHashCode();
	}

	public String toString() {
		return new ToStringBuilder(this).append("count", count).append("cUNumList", cUNumList).toString();
	}
}
