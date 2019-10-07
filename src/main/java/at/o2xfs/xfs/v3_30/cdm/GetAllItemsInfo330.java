package at.o2xfs.xfs.v3_30.cdm;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.UShort;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import at.o2xfs.xfs.cdm.Level;
import org.apache.commons.lang3.builder.EqualsBuilder;

@MemoryPropertyOrder({"level" })
public class GetAllItemsInfo330 {

	public static class Builder {

		private Level level;

		public Builder() { }

		public Builder level(Level level) {
			this.level = level;
			return this;
		}

		public GetAllItemsInfo330 build() {
			return new GetAllItemsInfo330(this);
		}
	}

	@UShort
	private final Level level;

	protected GetAllItemsInfo330(Builder builder) {
		level = builder.level;
	}

	public Level getLevel() {
		return level;
	}

	public boolean equals(Object obj) {
		if(obj instanceof GetAllItemsInfo330) {
			GetAllItemsInfo330 getAllItemsInfo = (GetAllItemsInfo330) obj;
			return new EqualsBuilder().append(level, getAllItemsInfo.level).isEquals();
		}
		return false;
	}

	public int hashCode() {
		return new HashCodeBuilder().append(level).toHashCode();
	}

	public String toString() {
		return new ToStringBuilder(this).append("level", level).toString();
	}
}
