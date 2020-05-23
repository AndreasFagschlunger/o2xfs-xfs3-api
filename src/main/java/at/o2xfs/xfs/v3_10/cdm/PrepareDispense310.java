package at.o2xfs.xfs.v3_10.cdm;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.xfs.cdm.Action;
import at.o2xfs.xfs.databind.annotation.XfsEnum16;

@JsonDeserialize(builder = PrepareDispense310.Builder.class)
@MemoryPropertyOrder({"action" })
public class PrepareDispense310 {

	@JsonPOJOBuilder(withPrefix = "")
	public static class Builder {

		private Action action;

		public Builder() { }

		public Builder action(Action action) {
			this.action = action;
			return this;
		}

		public PrepareDispense310 build() {
			return new PrepareDispense310(this);
		}
	}

	@XfsEnum16
	private final Action action;

	protected PrepareDispense310(Builder builder) {
		action = builder.action;
	}

	public Action getAction() {
		return action;
	}

	public boolean equals(Object obj) {
		if(obj instanceof PrepareDispense310) {
			PrepareDispense310 prepareDispense = (PrepareDispense310) obj;
			return new EqualsBuilder().append(action, prepareDispense.action).isEquals();
		}
		return false;
	}

	public int hashCode() {
		return new HashCodeBuilder().append(action).toHashCode();
	}

	public String toString() {
		return new ToStringBuilder(this).append("action", action).toString();
	}
}
