package at.o2xfs.xfs.v3_30.cdm;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.xfs.cdm.Level;
import at.o2xfs.xfs.databind.annotation.XfsEnum16;

@MemoryPropertyOrder({ "level" })
public class GetAllItemsInfo330 {

	public static class Builder {

		private Level level;

		public Builder() {
			level = Level.LEVEL_ALL;
		}

		public Builder level(Level level) {
			this.level = level;
			return this;
		}

		public GetAllItemsInfo330 build() {
			return new GetAllItemsInfo330(this);
		}
	}

	@XfsEnum16
	private final Level level;

	protected GetAllItemsInfo330(Builder builder) {
		level = builder.level;
	}

	public Level getLevel() {
		return level;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof GetAllItemsInfo330) {
			GetAllItemsInfo330 getAllItemsInfo = (GetAllItemsInfo330) obj;
			return new EqualsBuilder().append(level, getAllItemsInfo.level).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(level).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("level", level).toString();
	}
}
