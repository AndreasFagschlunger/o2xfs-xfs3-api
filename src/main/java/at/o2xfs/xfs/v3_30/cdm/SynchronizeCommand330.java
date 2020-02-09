package at.o2xfs.xfs.v3_30.cdm;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import at.o2xfs.memory.databind.annotation.MemoryPropertyOrder;
import at.o2xfs.xfs.cdm.CdmExecuteCommand;
import at.o2xfs.xfs.databind.annotation.XfsEnum32;

@MemoryPropertyOrder({ "command", "cmdData" })
public class SynchronizeCommand330 {

	public static class Builder {

		private CdmExecuteCommand command;
		private Object cmdData;

		public Builder() {
		}

		public Builder command(CdmExecuteCommand command) {
			this.command = command;
			return this;
		}

		public Builder cmdData(Object cmdData) {
			this.cmdData = cmdData;
			return this;
		}

		public SynchronizeCommand330 build() {
			return new SynchronizeCommand330(this);
		}
	}

	@XfsEnum32
	private final CdmExecuteCommand command;

	private final Object cmdData;

	protected SynchronizeCommand330(Builder builder) {
		command = builder.command;
		cmdData = builder.cmdData;
	}

	public CdmExecuteCommand getCommand() {
		return command;
	}

	public Object getCmdData() {
		return cmdData;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof SynchronizeCommand330) {
			SynchronizeCommand330 synchronizeCommand = (SynchronizeCommand330) obj;
			return new EqualsBuilder().append(command, synchronizeCommand.command)
					.append(cmdData, synchronizeCommand.cmdData).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(command).append(cmdData).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("command", command).append("cmdData", cmdData).toString();
	}
}
