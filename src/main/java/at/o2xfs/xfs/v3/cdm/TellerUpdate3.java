package at.o2xfs.xfs.v3.cdm;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.xfs.cdm.Action;
import at.o2xfs.memory.databind.annotation.win32.UShort;
import at.o2xfs.xfs.v3.cdm.TellerDetails3;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;

@MemoryPropertyOrder({"action", "tellerDetails" })
public class TellerUpdate3 {

	public static class Builder {

		private Action action;
		private TellerDetails3 tellerDetails;

		public Builder() { }

		public Builder action(Action action) {
			this.action = action;
			return this;
		}

		public Builder tellerDetails(TellerDetails3 tellerDetails) {
			this.tellerDetails = tellerDetails;
			return this;
		}

		public TellerUpdate3 build() {
			return new TellerUpdate3(this);
		}
	}

	@UShort
	private final Action action;

	private final TellerDetails3 tellerDetails;

	protected TellerUpdate3(Builder builder) {
		action = builder.action;
		tellerDetails = builder.tellerDetails;
	}

	public Action getAction() {
		return action;
	}

	public TellerDetails3 getTellerDetails() {
		return tellerDetails;
	}

	public boolean equals(Object obj) {
		if(obj instanceof TellerUpdate3) {
			TellerUpdate3 tellerUpdate = (TellerUpdate3) obj;
			return new EqualsBuilder().append(action, tellerUpdate.action).append(tellerDetails, tellerUpdate.tellerDetails).isEquals();
		}
		return false;
	}

	public int hashCode() {
		return new HashCodeBuilder().append(action).append(tellerDetails).toHashCode();
	}

	public String toString() {
		return new ToStringBuilder(this).append("action", action).append("tellerDetails", tellerDetails).toString();
	}
}
