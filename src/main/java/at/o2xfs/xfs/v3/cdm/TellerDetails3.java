package at.o2xfs.xfs.v3.cdm;

import at.o2xfs.xfs.cdm.OutputPosition;
import at.o2xfs.memory.databind.annotation.win32.UShort;
import at.o2xfs.xfs.databind.annotation.XfsEnum16;
import at.o2xfs.memory.databind.annotation.win32.ULong;
import java.util.ArrayList;
import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import java.util.List;
import at.o2xfs.xfs.v3.cdm.TellerTotals3;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import at.o2xfs.xfs.cdm.InputPosition;
import java.util.Collections;
import org.apache.commons.lang3.builder.EqualsBuilder;

@MemoryPropertyOrder({"tellerId", "inputPosition", "outputPosition", "tellerTotals" })
public class TellerDetails3 {

	public static class Builder {

		private int tellerId;
		private InputPosition inputPosition;
		private OutputPosition outputPosition;
		private List<TellerTotals3> tellerTotals = new ArrayList<>();

		public Builder() { }

		public Builder tellerId(int tellerId) {
			this.tellerId = tellerId;
			return this;
		}

		public Builder inputPosition(InputPosition inputPosition) {
			this.inputPosition = inputPosition;
			return this;
		}

		public Builder outputPosition(OutputPosition outputPosition) {
			this.outputPosition = outputPosition;
			return this;
		}

		public Builder addTellerTotal(TellerTotals3 element) {
			this.tellerTotals.add(element);
			return this;
		}

		public Builder addTellerTotal(TellerTotals3... elements) {
			for(TellerTotals3 each : elements) {
				this.tellerTotals.add(each);
			}
			return this;
		}

		public Builder tellerTotals(Iterable<TellerTotals3> elements) {
			this.tellerTotals.clear();
			return addAllTellerTotals(elements);
		}

		public Builder addAllTellerTotals(Iterable<TellerTotals3> elements) {
			for (TellerTotals3 each : elements) {
				this.tellerTotals.add(each);
			}
			return this;
		}

		public TellerDetails3 build() {
			return new TellerDetails3(this);
		}
	}

	@UShort
	private final int tellerId;

	@ULong
	private final InputPosition inputPosition;

	@XfsEnum16
	private final OutputPosition outputPosition;

	private final List<TellerTotals3> tellerTotals;

	protected TellerDetails3(Builder builder) {
		tellerId = builder.tellerId;
		inputPosition = builder.inputPosition;
		outputPosition = builder.outputPosition;
		tellerTotals = Collections.unmodifiableList(new ArrayList<>(builder.tellerTotals));
	}

	public int getTellerId() {
		return tellerId;
	}

	public InputPosition getInputPosition() {
		return inputPosition;
	}

	public OutputPosition getOutputPosition() {
		return outputPosition;
	}

	public List<TellerTotals3> getTellerTotals() {
		return tellerTotals;
	}

	public boolean equals(Object obj) {
		if(obj instanceof TellerDetails3) {
			TellerDetails3 tellerDetails = (TellerDetails3) obj;
			return new EqualsBuilder().append(tellerId, tellerDetails.tellerId).append(inputPosition, tellerDetails.inputPosition).append(outputPosition, tellerDetails.outputPosition).append(tellerTotals, tellerDetails.tellerTotals).isEquals();
		}
		return false;
	}

	public int hashCode() {
		return new HashCodeBuilder().append(tellerId).append(inputPosition).append(outputPosition).append(tellerTotals).toHashCode();
	}

	public String toString() {
		return new ToStringBuilder(this).append("tellerId", tellerId).append("inputPosition", inputPosition).append("outputPosition", outputPosition).append("tellerTotals", tellerTotals).toString();
	}
}