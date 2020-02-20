package at.o2xfs.xfs.v3_30.cdm;

import java.util.Optional;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.OptionalUnicode;
import at.o2xfs.memory.databind.annotation.win32.ULong;
import at.o2xfs.memory.databind.annotation.win32.UShort;
import at.o2xfs.xfs.cdm.ItemLocation;
import at.o2xfs.xfs.cdm.Level;
import at.o2xfs.xfs.cdm.OnBlacklist;
import at.o2xfs.xfs.databind.annotation.XfsEnum16;
import at.o2xfs.xfs.util.CurrencyId;

@MemoryPropertyOrder({ "level", "currencyId", "value", "release", "serialNumber", "imageFileName", "onBlacklist",
		"itemLocation", "number" })
public class ItemInfoAll330 {

	public static class Builder {

		private Level level;
		private CurrencyId currencyId;
		private long value;
		private int release;
		private Optional<String> serialNumber;
		private Optional<String> imageFileName;
		private OnBlacklist onBlacklist;
		private ItemLocation itemLocation;
		private int number;

		public Builder() {
			currencyId = CurrencyId.empty();
			serialNumber = Optional.empty();
			imageFileName = Optional.empty();
		}

		public Builder level(Level level) {
			this.level = level;
			return this;
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

		public Builder imageFileName(Optional<String> imageFileName) {
			this.imageFileName = imageFileName;
			return this;
		}

		public Builder onBlacklist(OnBlacklist onBlacklist) {
			this.onBlacklist = onBlacklist;
			return this;
		}

		public Builder itemLocation(ItemLocation itemLocation) {
			this.itemLocation = itemLocation;
			return this;
		}

		public Builder number(int number) {
			this.number = number;
			return this;
		}

		public ItemInfoAll330 build() {
			return new ItemInfoAll330(this);
		}
	}

	@XfsEnum16
	private final Level level;

	private final CurrencyId currencyId;

	@ULong
	private final long value;

	@UShort
	private final int release;

	@OptionalUnicode
	private final Optional<String> serialNumber;

	private final Optional<String> imageFileName;

	@XfsEnum16
	private final OnBlacklist onBlacklist;

	@XfsEnum16
	private final ItemLocation itemLocation;

	@UShort
	private final int number;

	protected ItemInfoAll330(Builder builder) {
		level = builder.level;
		currencyId = builder.currencyId;
		value = builder.value;
		release = builder.release;
		serialNumber = builder.serialNumber;
		imageFileName = builder.imageFileName;
		onBlacklist = builder.onBlacklist;
		itemLocation = builder.itemLocation;
		number = builder.number;
	}

	public Level getLevel() {
		return level;
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

	public Optional<String> getImageFileName() {
		return imageFileName;
	}

	public OnBlacklist getOnBlacklist() {
		return onBlacklist;
	}

	public ItemLocation getItemLocation() {
		return itemLocation;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ItemInfoAll330) {
			ItemInfoAll330 itemInfoAll = (ItemInfoAll330) obj;
			return new EqualsBuilder().append(level, itemInfoAll.level).append(currencyId, itemInfoAll.currencyId)
					.append(value, itemInfoAll.value).append(release, itemInfoAll.release)
					.append(serialNumber, itemInfoAll.serialNumber).append(imageFileName, itemInfoAll.imageFileName)
					.append(onBlacklist, itemInfoAll.onBlacklist).append(itemLocation, itemInfoAll.itemLocation)
					.append(number, itemInfoAll.number).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(level).append(currencyId).append(value).append(release).append(serialNumber)
				.append(imageFileName).append(onBlacklist).append(itemLocation).append(number).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("level", level).append("currencyId", currencyId).append("value", value)
				.append("release", release).append("serialNumber", serialNumber).append("imageFileName", imageFileName)
				.append("onBlacklist", onBlacklist).append("itemLocation", itemLocation).append("number", number)
				.toString();
	}
}
