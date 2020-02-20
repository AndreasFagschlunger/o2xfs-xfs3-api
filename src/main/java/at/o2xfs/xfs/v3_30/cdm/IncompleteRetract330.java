package at.o2xfs.xfs.v3_30.cdm;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.Pointer;
import at.o2xfs.xfs.cdm.IncompleteRetractReason;
import at.o2xfs.xfs.databind.annotation.XfsEnum16;
import at.o2xfs.xfs.v3_20.cdm.ItemNumberList320;

@MemoryPropertyOrder({ "itemNumberList", "reason" })
public class IncompleteRetract330 {

	public static class Builder {

		private ItemNumberList320 itemNumberList;
		private IncompleteRetractReason reason;

		public Builder() {
		}

		public Builder itemNumberList(ItemNumberList320 itemNumberList) {
			this.itemNumberList = itemNumberList;
			return this;
		}

		public Builder reason(IncompleteRetractReason reason) {
			this.reason = reason;
			return this;
		}

		public IncompleteRetract330 build() {
			return new IncompleteRetract330(this);
		}
	}

	@Pointer
	private final ItemNumberList320 itemNumberList;

	@XfsEnum16
	private final IncompleteRetractReason reason;

	protected IncompleteRetract330(Builder builder) {
		itemNumberList = builder.itemNumberList;
		reason = builder.reason;
	}

	public ItemNumberList320 getItemNumberList() {
		return itemNumberList;
	}

	public IncompleteRetractReason getReason() {
		return reason;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof IncompleteRetract330) {
			IncompleteRetract330 incompleteRetract = (IncompleteRetract330) obj;
			return new EqualsBuilder().append(itemNumberList, incompleteRetract.itemNumberList)
					.append(reason, incompleteRetract.reason).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(itemNumberList).append(reason).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("itemNumberList", itemNumberList).append("reason", reason).toString();
	}
}
