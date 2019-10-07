package at.o2xfs.xfs.v3.cdm;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.UShort;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import at.o2xfs.xfs.v3.cdm.Itemposition3;
import org.apache.commons.lang3.builder.EqualsBuilder;

@MemoryPropertyOrder({"number", "numOfBills", "position" })
public class Calibrate3 {

	public static class Builder {

		private int number;
		private int numOfBills;
		private Itemposition3 position;

		public Builder() { }

		public Builder number(int number) {
			this.number = number;
			return this;
		}

		public Builder numOfBills(int numOfBills) {
			this.numOfBills = numOfBills;
			return this;
		}

		public Builder position(Itemposition3 position) {
			this.position = position;
			return this;
		}

		public Calibrate3 build() {
			return new Calibrate3(this);
		}
	}

	@UShort
	private final int number;

	@UShort
	private final int numOfBills;

	private final Itemposition3 position;

	protected Calibrate3(Builder builder) {
		number = builder.number;
		numOfBills = builder.numOfBills;
		position = builder.position;
	}

	public int getNumber() {
		return number;
	}

	public int getNumOfBills() {
		return numOfBills;
	}

	public Itemposition3 getPosition() {
		return position;
	}

	public boolean equals(Object obj) {
		if(obj instanceof Calibrate3) {
			Calibrate3 calibrate = (Calibrate3) obj;
			return new EqualsBuilder().append(number, calibrate.number).append(numOfBills, calibrate.numOfBills).append(position, calibrate.position).isEquals();
		}
		return false;
	}

	public int hashCode() {
		return new HashCodeBuilder().append(number).append(numOfBills).append(position).toHashCode();
	}

	public String toString() {
		return new ToStringBuilder(this).append("number", number).append("numOfBills", numOfBills).append("position", position).toString();
	}
}
