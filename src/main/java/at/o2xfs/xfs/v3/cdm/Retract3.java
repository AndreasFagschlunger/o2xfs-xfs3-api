package at.o2xfs.xfs.v3.cdm;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.UShort;
import at.o2xfs.xfs.cdm.Position;
import at.o2xfs.xfs.cdm.RetractArea;
import at.o2xfs.xfs.databind.annotation.XfsEnum16;

@JsonDeserialize(builder = Retract3.Builder.class)
@MemoryPropertyOrder({ "outputPosition", "retractArea", "index" })
public class Retract3 {

	@JsonPOJOBuilder(withPrefix = "")
	public static class Builder {

		private Position outputPosition;
		private RetractArea retractArea;
		private int index;

		public Builder() {
			outputPosition = Position.NULL;
		}

		public Builder outputPosition(Position outputPosition) {
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

	@XfsEnum16
	private final Position outputPosition;

	@XfsEnum16
	private final RetractArea retractArea;

	@UShort
	private final int index;

	protected Retract3(Builder builder) {
		outputPosition = builder.outputPosition;
		retractArea = builder.retractArea;
		index = builder.index;
	}

	public Position getOutputPosition() {
		return outputPosition;
	}

	public RetractArea getRetractArea() {
		return retractArea;
	}

	public int getIndex() {
		return index;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Retract3) {
			Retract3 retract = (Retract3) obj;
			return new EqualsBuilder().append(outputPosition, retract.outputPosition)
					.append(retractArea, retract.retractArea).append(index, retract.index).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(outputPosition).append(retractArea).append(index).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("outputPosition", outputPosition).append("retractArea", retractArea)
				.append("index", index).toString();
	}
}
