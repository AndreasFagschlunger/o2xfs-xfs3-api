package at.o2xfs.xfs.v3.cdm;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.xfs.cdm.PresentState;
import at.o2xfs.xfs.databind.annotation.XfsEnum16;
import at.o2xfs.xfs.databind.annotation.XfsExtra;

@MemoryPropertyOrder({ "denomination", "presentState", "extra" })
public class PresentStatus3 {

	public static class Builder {

		private Denomination3 denomination;
		private PresentState presentState;
		private final Map<String, String> extra;

		public Builder() {
			extra = new LinkedHashMap<>();
		}

		public Builder denomination(Denomination3 denomination) {
			this.denomination = denomination;
			return this;
		}

		public Builder presentState(PresentState presentState) {
			this.presentState = presentState;
			return this;
		}

		public Builder putExtra(String key, String value) {
			extra.put(key, value);
			return this;
		}

		public Builder extra(Map<String, String> entries) {
			extra.clear();
			putAllExtra(entries);
			return this;
		}

		public Builder putAllExtra(Map<String, String> entries) {
			for (Map.Entry<String, String> e : entries.entrySet()) {
				extra.put(e.getKey(), e.getValue());
			}
			return this;
		}

		public PresentStatus3 build() {
			return new PresentStatus3(this);
		}
	}

	private final Denomination3 denomination;

	@XfsEnum16
	private final PresentState presentState;

	@XfsExtra
	private final Map<String, String> extra;

	protected PresentStatus3(Builder builder) {
		denomination = builder.denomination;
		presentState = builder.presentState;
		extra = Collections.unmodifiableMap(new LinkedHashMap<>(builder.extra));
	}

	public Denomination3 getDenomination() {
		return denomination;
	}

	public PresentState getPresentState() {
		return presentState;
	}

	public Map<String, String> getExtra() {
		return extra;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof PresentStatus3) {
			PresentStatus3 presentStatus = (PresentStatus3) obj;
			return new EqualsBuilder().append(denomination, presentStatus.denomination)
					.append(presentState, presentStatus.presentState).append(extra, presentStatus.extra).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(denomination).append(presentState).append(extra).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("denomination", denomination).append("presentState", presentState)
				.append("extra", extra).toString();
	}
}
