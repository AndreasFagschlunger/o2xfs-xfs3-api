package at.o2xfs.xfs.v3_30.cdm;

import at.o2xfs.xfs.cdm.ItemLocation;
import at.o2xfs.memory.databind.annotation.win32.UShort;
import at.o2xfs.xfs.databind.annotation.XfsEnum16;
import at.o2xfs.memory.databind.annotation.win32.ULong;
import at.o2xfs.xfs.cdm.OnBlacklist;
import at.o2xfs.xfs.util.CurrencyId;
import at.o2xfs.memory.databind.annotation.win32.UnicodeString;
import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import at.o2xfs.xfs.cdm.Level;
import org.apache.commons.lang3.builder.EqualsBuilder;

@MemoryPropertyOrder({"level", "currencyId", "value", "release", "serialNumber", "imageFileName", "onBlacklist", "itemLocation", "number" })
public class ItemInfoAll330 {

	public static class Builder {

		private Level level;
		private CurrencyId currencyId;
		private long value;
		private int release;
		private String serialNumber;
		private String imageFileName;
		private OnBlacklist onBlacklist;
		private ItemLocation itemLocation;
		private int number;

		public Builder() { }

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

		public Builder serialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
			return this;
		}

		public Builder imageFileName(String imageFileName) {
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

	@UShort
	private final Level level;

	private final CurrencyId currencyId;

	@ULong
	private final long value;

	@UShort
	private final int release;

	@UnicodeString
	private final String serialNumber;

	private final String imageFileName;

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

	public String getSerialNumber() {
		return serialNumber;
	}

	public String getImageFileName() {
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

	public boolean equals(Object obj) {
		if(obj instanceof ItemInfoAll330) {
			ItemInfoAll330 itemInfoAll = (ItemInfoAll330) obj;
			return new EqualsBuilder().append(level, itemInfoAll.level).append(currencyId, itemInfoAll.currencyId).append(value, itemInfoAll.value).append(release, itemInfoAll.release).append(serialNumber, itemInfoAll.serialNumber).append(imageFileName, itemInfoAll.imageFileName).append(onBlacklist, itemInfoAll.onBlacklist).append(itemLocation, itemInfoAll.itemLocation).append(number, itemInfoAll.number).isEquals();
		}
		return false;
	}

	public int hashCode() {
		return new HashCodeBuilder().append(level).append(currencyId).append(value).append(release).append(serialNumber).append(imageFileName).append(onBlacklist).append(itemLocation).append(number).toHashCode();
	}

	public String toString() {
		return new ToStringBuilder(this).append("level", level).append("currencyId", currencyId).append("value", value).append("release", release).append("serialNumber", serialNumber).append("imageFileName", imageFileName).append("onBlacklist", onBlacklist).append("itemLocation", itemLocation).append("number", number).toString();
	}
}
