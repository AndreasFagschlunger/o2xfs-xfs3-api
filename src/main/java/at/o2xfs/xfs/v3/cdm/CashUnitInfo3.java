package at.o2xfs.xfs.v3.cdm;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import java.util.List;
import at.o2xfs.memory.databind.annotation.win32.UShort;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import at.o2xfs.xfs.v3.cdm.CashUnit3;
import java.util.Collections;
import org.apache.commons.lang3.builder.EqualsBuilder;
import java.util.ArrayList;

@MemoryPropertyOrder({"tellerId", "count", "list" })
public class CashUnitInfo3 {

	public static class Builder {

		private int tellerId;
		private int count;
		private List<CashUnit3> list = new ArrayList<>();

		public Builder() { }

		public Builder tellerId(int tellerId) {
			this.tellerId = tellerId;
			return this;
		}

		public Builder count(int count) {
			this.count = count;
			return this;
		}

		public Builder addList(CashUnit3 element) {
			this.list.add(element);
			return this;
		}

		public Builder addList(CashUnit3... elements) {
			for(CashUnit3 each : elements) {
				this.list.add(each);
			}
			return this;
		}

		public Builder list(Iterable<CashUnit3> elements) {
			this.list.clear();
			return addAllList(elements);
		}

		public Builder addAllList(Iterable<CashUnit3> elements) {
			for (CashUnit3 each : elements) {
				this.list.add(each);
			}
			return this;
		}

		public CashUnitInfo3 build() {
			return new CashUnitInfo3(this);
		}
	}

	@UShort
	private final int tellerId;

	@UShort
	private final int count;

	private final List<CashUnit3> list;

	protected CashUnitInfo3(Builder builder) {
		tellerId = builder.tellerId;
		count = builder.count;
		list = Collections.unmodifiableList(new ArrayList<>(builder.list));
	}

	public int getTellerId() {
		return tellerId;
	}

	public int getCount() {
		return count;
	}

	public List<CashUnit3> getList() {
		return list;
	}

	public boolean equals(Object obj) {
		if(obj instanceof CashUnitInfo3) {
			CashUnitInfo3 cashUnitInfo = (CashUnitInfo3) obj;
			return new EqualsBuilder().append(tellerId, cashUnitInfo.tellerId).append(count, cashUnitInfo.count).append(list, cashUnitInfo.list).isEquals();
		}
		return false;
	}

	public int hashCode() {
		return new HashCodeBuilder().append(tellerId).append(count).append(list).toHashCode();
	}

	public String toString() {
		return new ToStringBuilder(this).append("tellerId", tellerId).append("count", count).append("list", list).toString();
	}
}
