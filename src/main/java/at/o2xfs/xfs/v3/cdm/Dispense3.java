package at.o2xfs.xfs.v3.cdm;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.Pointer;
import at.o2xfs.memory.databind.annotation.win32.UShort;
import at.o2xfs.xfs.cdm.Position;
import at.o2xfs.xfs.databind.annotation.XfsEnum16;

@JsonDeserialize(builder = Dispense3.Builder.class)
@MemoryPropertyOrder({ "tellerId", "mixNumber", "position", "present", "denomination" })
public class Dispense3 {

	@JsonPOJOBuilder(withPrefix = "")
	public static class Builder {

		private int tellerId;
		private int mixNumber;
		private Position position;
		private boolean present;
		private Denomination3 denomination;

		public Builder() {
			position = Position.NULL;
		}

		public Builder tellerId(int tellerId) {
			this.tellerId = tellerId;
			return this;
		}

		public Builder mixNumber(int mixNumber) {
			this.mixNumber = mixNumber;
			return this;
		}

		public Builder position(Position position) {
			this.position = position;
			return this;
		}

		public Builder present(boolean present) {
			this.present = present;
			return this;
		}

		public Builder denomination(Denomination3 denomination) {
			this.denomination = denomination;
			return this;
		}

		public Dispense3 build() {
			return new Dispense3(this);
		}
	}

	@UShort
	private final int tellerId;

	@UShort
	private final int mixNumber;

	@XfsEnum16
	private final Position position;

	private final boolean present;

	@Pointer
	private final Denomination3 denomination;

	protected Dispense3(Builder builder) {
		tellerId = builder.tellerId;
		mixNumber = builder.mixNumber;
		position = builder.position;
		present = builder.present;
		denomination = builder.denomination;
	}

	public int getTellerId() {
		return tellerId;
	}

	public int getMixNumber() {
		return mixNumber;
	}

	public Position getPosition() {
		return position;
	}

	public boolean isPresent() {
		return present;
	}

	public Denomination3 getDenomination() {
		return denomination;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Dispense3) {
			Dispense3 dispense = (Dispense3) obj;
			return new EqualsBuilder().append(tellerId, dispense.tellerId).append(mixNumber, dispense.mixNumber)
					.append(position, dispense.position).append(present, dispense.present)
					.append(denomination, dispense.denomination).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(tellerId).append(mixNumber).append(position).append(present)
				.append(denomination).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("tellerId", tellerId).append("mixNumber", mixNumber)
				.append("position", position).append("present", present).append("denomination", denomination)
				.toString();
	}
}
