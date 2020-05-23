package at.o2xfs.xfs.v3.cdm;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

@JsonDeserialize(builder = MixRow3.Builder.class)
public class MixRow3 {

	@JsonPOJOBuilder(withPrefix = "")
	public static class Builder {

		private long amount;

		private int[] mixture;

		public Builder() {
			mixture = new int[0];
		}

		public Builder amount(long amount) {
			this.amount = amount;
			return this;
		}

		public Builder mixture(int... mixture) {
			this.mixture = mixture.clone();
			return this;
		}

		public MixRow3 build() {
			return new MixRow3(this);
		}
	}

	private final long amount;

	private final int[] mixture;

	protected MixRow3(Builder builder) {
		amount = builder.amount;
		mixture = builder.mixture;
	}

	public long getAmount() {
		return amount;
	}

	public int[] getMixture() {
		return mixture.clone();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MixRow3) {
			MixRow3 mixRow = (MixRow3) obj;
			return new EqualsBuilder().append(amount, mixRow.amount).append(mixture, mixRow.mixture).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(amount).append(mixture).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("amount", amount).append("mixture", mixture).toString();
	}
}
