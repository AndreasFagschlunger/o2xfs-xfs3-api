package at.o2xfs.xfs.v3_30.cdm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.OptionalUnicode;

@MemoryPropertyOrder({ "version", "count", "blacklistElements" })
public class Blacklist330 {

	public static class Builder {

		private Optional<String> version;
		private final List<BlacklistElement330> blacklistElements;

		public Builder() {
			version = Optional.empty();
			blacklistElements = new ArrayList<>();
		}

		public Builder version(Optional<String> version) {
			this.version = version;
			return this;
		}

		public Builder addBlacklistElements(BlacklistElement330 element) {
			this.blacklistElements.add(element);
			return this;
		}

		public Builder addBlacklistElements(BlacklistElement330... elements) {
			for (BlacklistElement330 each : elements) {
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

	@OptionalUnicode
	private final Optional<String> version;

	private final List<BlacklistElement330> blacklistElements;

	protected Blacklist330(Builder builder) {
		version = builder.version;
		blacklistElements = Collections.unmodifiableList(new ArrayList<>(builder.blacklistElements));
	}

	public Optional<String> getVersion() {
		return version;
	}

	public List<BlacklistElement330> getBlacklistElements() {
		return blacklistElements;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Blacklist330) {
			Blacklist330 blacklist = (Blacklist330) obj;
			return new EqualsBuilder().append(version, blacklist.version)
					.append(blacklistElements, blacklist.blacklistElements).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(version).append(blacklistElements).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("version", version).append("blacklistElements", blacklistElements)
				.toString();
	}
}
