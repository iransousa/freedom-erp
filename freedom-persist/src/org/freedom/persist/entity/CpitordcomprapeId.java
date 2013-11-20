package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

/**
 * CpitordcomprapeId generated by hbm2java
 */
public class CpitordcomprapeId implements java.io.Serializable {

	private int codemp;
	private short codfilial;
	private int codordcp;
	private short coditordcp;
	private short seqitordcppe;

	public CpitordcomprapeId() {
	}

	public CpitordcomprapeId(int codemp, short codfilial, int codordcp,
			short coditordcp, short seqitordcppe) {
		this.codemp = codemp;
		this.codfilial = codfilial;
		this.codordcp = codordcp;
		this.coditordcp = coditordcp;
		this.seqitordcppe = seqitordcppe;
	}

	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	public int getCodordcp() {
		return this.codordcp;
	}

	public void setCodordcp(int codordcp) {
		this.codordcp = codordcp;
	}

	public short getCoditordcp() {
		return this.coditordcp;
	}

	public void setCoditordcp(short coditordcp) {
		this.coditordcp = coditordcp;
	}

	public short getSeqitordcppe() {
		return this.seqitordcppe;
	}

	public void setSeqitordcppe(short seqitordcppe) {
		this.seqitordcppe = seqitordcppe;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CpitordcomprapeId))
			return false;
		CpitordcomprapeId castOther = (CpitordcomprapeId) other;

		return (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodordcp() == castOther.getCodordcp())
				&& (this.getCoditordcp() == castOther.getCoditordcp())
				&& (this.getSeqitordcppe() == castOther.getSeqitordcppe());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodordcp();
		result = 37 * result + this.getCoditordcp();
		result = 37 * result + this.getSeqitordcppe();
		return result;
	}

}
