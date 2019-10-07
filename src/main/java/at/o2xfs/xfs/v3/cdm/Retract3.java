package at.o2xfs.xfs.v3.cdm;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.UShort;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import at.o2xfs.xfs.cdm.RetractArea;
import org.apache.commons.lang3.builder.EqualsBuilder;

@MemoryPropertyOrder({"outputPosition", "retractArea", "index" })
public class Retract3 {

	public static class Builder {

		private int outputPosition;
		private RetractArea retractArea;
		private int index;

		public Builder() { }

		public Builder outputPosition(int outputPosition) {
			this.outputPosition = outputPosition;
			return this;
		}

		public Builder retractArea(RetractArea retractArea) {
			this.retractArea = retractArea;
			return this;
		}

		public Builder index(int index) {
			this.index = index;
			return this;
		}

		public Retract3 build() {
			return new Retract3(this);
		}
	}

	@UShort
	private final int outputPosition;

	@UShort
	private final RetractArea retractArea;

	@UShort
	private final int index;

	protected Retract3(Builder builder) {
		outputPosition = builder.outputPosition;
		retractArea = builder.retractArea;
		index = builder.index;
	}

	public int getOutputPosition() {
		return outputPosition;
	}

	public RetractArea getRetractArea() {
		return retractArea;
	}

	public int getIndex() {
		return index;
	}

	public boolean equals(Object obj) {
		if(obj instanceof Retract3) {
			Retract3 retract = (Retract3) obj;
			return new EqualsBuilder().append(outputPosition, retract.outputPosition).append(retractArea, retract.retractArea).append(index, retract.index).isEquals();
		}
		return false;
	}

	public int hashCode() {
		return new HashCodeBuilder().append(outputPosition).append(retractArea).append(index).toHashCode();
	}

	public String toString() {
		return new ToStringBuilder(this).append("outputPosition", outputPosition).append("retractArea", retractArea).append("index", index).toString();
	}
}
