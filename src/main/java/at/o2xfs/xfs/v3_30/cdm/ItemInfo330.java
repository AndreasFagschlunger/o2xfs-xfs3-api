package at.o2xfs.xfs.v3_30.cdm;

import java.util.Optional;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.OptionalUnicode;
import at.o2xfs.memory.databind.annotation.win32.ULong;
import at.o2xfs.memory.databind.annotation.win32.UShort;
import at.o2xfs.xfs.util.CurrencyId;

@JsonDeserialize(builder = ItemInfo330.Builder.class)
@MemoryPropertyOrder({ "currencyId", "value", "release", "serialNumber", "signature", "imageFileName" })
public class ItemInfo330 {

	@JsonPOJOBuilder(withPrefix = "")
	public static class Builder {

		private CurrencyId currencyId;
		private long value;
		private int release;
		private Optional<String> serialNumber;
		private Optional<Signature330> signature;
		private Optional<String> imageFileName;

		public Builder() {
			currencyId = CurrencyId.empty();
			serialNumber = Optional.empty();
			signature = Optional.empty();
			imageFileName = Optional.empty();
		}

		public Builder currencyId(CurrencyId currencyId) {
			this.currencyId = currencyId;
			return this;
		}

		public Builder value(long value) {
			this.value = value;
			return this;
		}

		public Builder release(int release) {
			this.release = release;
			return this;
		}

		public Builder serialNumber(Optional<String> serialNumber) {
			this.serialNumber = serialNumber;
			return this;
		}

		public Builder signature(Optional<Signature330> signature) {
			this.signature = signature;
			return this;
		}

		public Builder imageFileName(Optional<String> imageFileName) {
			this.imageFileName = imageFileName;
			return this;
		}

		public ItemInfo330 build() {
			return new ItemInfo330(this);
		}
	}

	private final CurrencyId currencyId;

	@ULong
	private final long value;

	@UShort
	private final int release;

	@OptionalUnicode
	private final Optional<String> serialNumber;

	private final Optional<Signature330> signature;

	private final Optional<String> imageFileName;

	protected ItemInfo330(Builder builder) {
		currencyId = builder.currencyId;
		value = builder.value;
		release = builder.release;
		serialNumber = builder.serialNumber;
		signature = builder.signature;
		imageFileName = builder.imageFileName;
	}

	public CurrencyId getCurrencyId() {
		return currencyId;
	}

	public long getValue() {
		return value;
	}

	public int getRelease() {
		return release;
	}

	public Optional<String> getSerialNumber() {
		return serialNumber;
	}

	public Optional<Signature330> getSignature() {
		return signature;
	}

	public Optional<String> getImageFileName() {
		return imageFileName;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ItemInfo330) {
			ItemInfo330 itemInfo = (ItemInfo330) obj;
			return new EqualsBuilder().append(currencyId, itemInfo.currencyId).append(value, itemInfo.value)
					.append(release, itemInfo.release).append(serialNumber, itemInfo.serialNumber)
					.append(signature, itemInfo.signature).append(imageFileName, itemInfo.imageFileName).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(currencyId).append(value).append(release).append(serialNumber)
				.append(signature).append(imageFileName).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("currencyId", currencyId).append("value", value)
				.append("release", release).append("serialNumber", serialNumber).append("signature", signature)
				.append("imageFileName", imageFileName).toString();
	}
}
