package at.o2xfs.xfs.v3_30.cdm;

import at.o2xfs.memory.databind.annotation.win32.UnicodeString;
import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import java.util.List;
import at.o2xfs.xfs.v3_30.cdm.BlacklistElement330;
import at.o2xfs.memory.databind.annotation.win32.UShort;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.util.Collections;
import org.apache.commons.lang3.builder.EqualsBuilder;
import java.util.ArrayList;

@MemoryPropertyOrder({"version", "count", "blacklistElements" })
public class Blacklist330 {

	public static class Builder {

		private String version;
		private int count;
		private List<BlacklistElement330> blacklistElements = new ArrayList<>();

		public Builder() { }

		public Builder version(String version) {
			this.version = version;
			return this;
		}

		public Builder count(int count) {
			this.count = count;
			return this;
		}

		public Builder addBlacklistElement(BlacklistElement330 element) {
			this.blacklistElements.add(element);
			return this;
		}

		public Builder addBlacklistElement(BlacklistElement330... elements) {
			for(BlacklistElement330 each : elements) {
				this.blacklistElements.add(each);
			}
			return this;
		}

		public Builder blacklistElements(Iterable<BlacklistElement330> elements) {
			this.blacklistElements.clear();
			return addAllBlacklistElements(elements);
		}

		public Builder addAllBlacklistElements(Iterable<BlacklistElement330> elements) {
			for (BlacklistElement330 each : elements) {
				this.blacklistElements.add(each);
			}
			return this;
		}

		public Blacklist330 build() {
			return new Blacklist330(this);
		}
	}

	@UnicodeString
	private final String version;

	@UShort
	private final int count;

	private final List<BlacklistElement330> blacklistElements;

	protected Blacklist330(Builder builder) {
		version = builder.version;
		count = builder.count;
		blacklistElements = Collections.unmodifiableList(new ArrayList<>(builder.blacklistElements));
	}

	public String getVersion() {
		return version;
	}

	public int getCount() {
		return count;
	}

	public List<BlacklistElement330> getBlacklistElements() {
		return blacklistElements;
	}

	public boolean equals(Object obj) {
		if(obj instanceof Blacklist330) {
			Blacklist330 blacklist = (Blacklist330) obj;
			return new EqualsBuilder().append(version, blacklist.version).append(count, blacklist.count).append(blacklistElements, blacklist.blacklistElements).isEquals();
		}
		return false;
	}

	public int hashCode() {
		return new HashCodeBuilder().append(version).append(count).append(blacklistElements).toHashCode();
	}

	public String toString() {
		return new ToStringBuilder(this).append("version", version).append("count", count).append("blacklistElements", blacklistElements).toString();
	}
}
