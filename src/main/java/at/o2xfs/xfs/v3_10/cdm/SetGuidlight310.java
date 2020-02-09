package at.o2xfs.xfs.v3_10.cdm;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.memory.databind.annotation.win32.UShort;
import at.o2xfs.xfs.cdm.CdmGuidLights;
import at.o2xfs.xfs.databind.annotation.XfsEnumSet32;

@MemoryPropertyOrder({ "guidLight", "command" })
public class SetGuidlight310 {

	public static class Builder {

		private int guidLight;
		private EnumSet<CdmGuidLights> command = EnumSet.noneOf(CdmGuidLights.class);

		public Builder() {
		}

		public Builder guidLight(int guidLight) {
			this.guidLight = guidLight;
			return this;
		}

		public Builder addCommand(CdmGuidLights element) {
			this.command.add(element);
			return this;
		}

		public Builder addCommand(CdmGuidLights... elements) {
			for (CdmGuidLights each : elements) {
				this.command.add(each);
			}
			return this;
		}

		public Builder command(Iterable<CdmGuidLights> elements) {
			this.command.clear();
			return addAllCommand(elements);
		}

		public Builder addAllCommand(Iterable<CdmGuidLights> elements) {
			for (CdmGuidLights each : elements) {
				this.command.add(each);
			}
			return this;
		}

		public SetGuidlight310 build() {
			return new SetGuidlight310(this);
		}
	}

	@UShort
	private final int guidLight;

	@XfsEnumSet32
	private final Set<CdmGuidLights> command;

	protected SetGuidlight310(Builder builder) {
		guidLight = builder.guidLight;
		command = Collections.unmodifiableSet(EnumSet.copyOf(builder.command));
	}

	public int getGuidLight() {
		return guidLight;
	}

	public Set<CdmGuidLights> getCommand() {
		return command;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof SetGuidlight310) {
			SetGuidlight310 setGuidlight = (SetGuidlight310) obj;
			return new EqualsBuilder().append(guidLight, setGuidlight.guidLight).append(command, setGuidlight.command)
					.isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(guidLight).append(command).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("guidLight", guidLight).append("command", command).toString();
	}
}
