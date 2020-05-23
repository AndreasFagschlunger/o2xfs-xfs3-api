package at.o2xfs.xfs.v3.cdm;

import java.util.Optional;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.UShort;
import at.o2xfs.xfs.cdm.Position;
import at.o2xfs.xfs.databind.annotation.XfsEnum16;

@JsonDeserialize(builder = ItemPosition3.Builder.class)
@MemoryPropertyOrder({ "number", "retractArea", "outputPosition" })
public class ItemPosition3 {

	@JsonPOJOBuilder(withPrefix = "")
	public static class Builder {

		private int number;
		private Optional<Retract3> retractArea;
		private Position outputPosition;

		public Builder() {
			retractArea = Optional.empty();
			outputPosition = Position.NULL;
		}

		public Builder number(int number) {
			this.number = number;
			return this;
		}

		public Builder retractArea(Optional<Retract3> retractArea) {
			this.retractArea = retractArea;
			return this;
		}

		public Builder outputPosition(Position outputPosition) {
			this.outputPosition = outputPosition;
			return this;
		}

		public ItemPosition3 build() {
			return new ItemPosition3(this);
		}
	}

	@UShort
	private final int number;

	private final Optional<Retract3> retractArea;

	@XfsEnum16
	private final Position outputPosition;

	protected ItemPosition3(Builder builder) {
		number = builder.number;
		retractArea = builder.retractArea;
		outputPosition = builder.outputPosition;
	}

	public int getNumber() {
		return number;
	}

	public Optional<Retract3> getRetractArea() {
		return retractArea;
	}

	public Position getOutputPosition() {
		return outputPosition;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ItemPosition3) {
			ItemPosition3 itemposition = (ItemPosition3) obj;
			return new EqualsBuilder().append(number, itemposition.number).append(retractArea, itemposition.retractArea)
					.append(outputPosition, itemposition.outputPosition).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(number).append(retractArea).append(outputPosition).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("number", number).append("retractArea", retractArea)
				.append("outputPosition", outputPosition).toString();
	}
}
