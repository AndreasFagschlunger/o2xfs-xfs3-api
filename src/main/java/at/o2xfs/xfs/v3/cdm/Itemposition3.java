package at.o2xfs.xfs.v3.cdm;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.xfs.v3.cdm.Retract3;
import at.o2xfs.memory.databind.annotation.win32.UShort;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;

@MemoryPropertyOrder({"number", "retractArea", "outputPosition" })
public class Itemposition3 {

	public static class Builder {

		private int number;
		private Retract3 retractArea;
		private int outputPosition;

		public Builder() { }

		public Builder number(int number) {
			this.number = number;
			return this;
		}

		public Builder retractArea(Retract3 retractArea) {
			this.retractArea = retractArea;
			return this;
		}

		public Builder outputPosition(int outputPosition) {
			this.outputPosition = outputPosition;
			return this;
		}

		public Itemposition3 build() {
			return new Itemposition3(this);
		}
	}

	@UShort
	private final int number;

	private final Retract3 retractArea;

	@UShort
	private final int outputPosition;

	protected Itemposition3(Builder builder) {
		number = builder.number;
		retractArea = builder.retractArea;
		outputPosition = builder.outputPosition;
	}

	public int getNumber() {
		return number;
	}

	public Retract3 getRetractArea() {
		return retractArea;
	}

	public int getOutputPosition() {
		return outputPosition;
	}

	public boolean equals(Object obj) {
		if(obj instanceof Itemposition3) {
			Itemposition3 itemposition = (Itemposition3) obj;
			return new EqualsBuilder().append(number, itemposition.number).append(retractArea, itemposition.retractArea).append(outputPosition, itemposition.outputPosition).isEquals();
		}
		return false;
	}

	public int hashCode() {
		return new HashCodeBuilder().append(number).append(retractArea).append(outputPosition).toHashCode();
	}

	public String toString() {
		return new ToStringBuilder(this).append("number", number).append("retractArea", retractArea).append("outputPosition", outputPosition).toString();
	}
}
