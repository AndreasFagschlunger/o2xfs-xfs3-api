package at.o2xfs.xfs.v3_30.cdm;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;

@MemoryPropertyOrder({ "data" })
public class Signature330 {

	public static class Builder {

		private byte[] data;

		public Builder() {
		}

		public Builder data(byte... data) {
			this.data = data.clone();
			return this;
		}

		public Signature330 build() {
			return new Signature330(this);
		}
	}

	private final byte[] data;

	protected Signature330(Builder builder) {
		data = builder.data;
	}

	public byte[] getData() {
		return data.clone();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Signature330) {
			Signature330 signature = (Signature330) obj;
			return new EqualsBuilder().append(data, signature.data).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(data).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("data", data).toString();
	}
}
