package at.o2xfs.xfs.v3.cdm;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.Pointer;
import at.o2xfs.xfs.cdm.TellerUpdateAction;
import at.o2xfs.xfs.databind.annotation.XfsEnum16;

@JsonDeserialize(builder = TellerUpdate3.Builder.class)
@MemoryPropertyOrder({ "action", "tellerDetails" })
public class TellerUpdate3 {

	@JsonPOJOBuilder(withPrefix = "")
	public static class Builder {

		private TellerUpdateAction action;
		private TellerDetails3 tellerDetails;

		public Builder() {
		}

		public Builder action(TellerUpdateAction action) {
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

	@XfsEnum16
	private final TellerUpdateAction action;

	@Pointer
	private final TellerDetails3 tellerDetails;

	protected TellerUpdate3(Builder builder) {
		action = builder.action;
		tellerDetails = builder.tellerDetails;
	}

	public TellerUpdateAction getAction() {
		return action;
	}

	public TellerDetails3 getTellerDetails() {
		return tellerDetails;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof TellerUpdate3) {
			TellerUpdate3 tellerUpdate = (TellerUpdate3) obj;
			return new EqualsBuilder().append(action, tellerUpdate.action)
					.append(tellerDetails, tellerUpdate.tellerDetails).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(action).append(tellerDetails).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("action", action).append("tellerDetails", tellerDetails).toString();
	}
}
