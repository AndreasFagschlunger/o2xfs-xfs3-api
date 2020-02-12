package at.o2xfs.xfs.v3.cdm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.UShort;

@MemoryPropertyOrder({ "tellerId", "count", "cashUnits" })
public class CashUnitInfo3 {

	public static class Builder {

		private int tellerId;
		private final List<CashUnit3> cashUnits;

		public Builder() {
			cashUnits = new ArrayList<>();
		}

		public Builder tellerId(int tellerId) {
			this.tellerId = tellerId;
			return this;
		}

		public Builder addCashUnits(CashUnit3 element) {
			this.cashUnits.add(element);
			return this;
		}

		public Builder addCashUnits(CashUnit3... elements) {
			for (CashUnit3 each : elements) {
				this.cashUnits.add(each);
			}
			return this;
		}

		public Builder cashUnits(Iterable<CashUnit3> elements) {
			this.cashUnits.clear();
			return addAllCashUnits(elements);
		}

		public Builder addAllCashUnits(Iterable<CashUnit3> elements) {
			for (CashUnit3 each : elements) {
				this.cashUnits.add(each);
			}
			return this;
		}

		public CashUnitInfo3 build() {
			return new CashUnitInfo3(this);
		}
	}

	@UShort
	private final int tellerId;

	private final List<CashUnit3> cashUnits;

	protected CashUnitInfo3(Builder builder) {
		tellerId = builder.tellerId;
		cashUnits = Collections.unmodifiableList(new ArrayList<>(builder.cashUnits));
	}

	public int getTellerId() {
		return tellerId;
	}

	public List<CashUnit3> getCashUnits() {
		return cashUnits;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof CashUnitInfo3) {
			CashUnitInfo3 cashUnitInfo = (CashUnitInfo3) obj;
			return new EqualsBuilder().append(tellerId, cashUnitInfo.tellerId).append(cashUnits, cashUnitInfo.cashUnits)
					.isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(tellerId).append(cashUnits).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("tellerId", tellerId).append("cashUnits", cashUnits).toString();
	}
}
