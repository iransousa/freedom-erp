package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * VdvendacomisId generated by hbm2java
 */
public class VdvendacomisId implements java.io.Serializable {

	private int codvenda;
	private char tipovenda;
	private short seqvc;
	private short codfilial;
	private int codemp;

	public VdvendacomisId() {
	}

	public VdvendacomisId(int codvenda, char tipovenda, short seqvc,
			short codfilial, int codemp) {
		this.codvenda = codvenda;
		this.tipovenda = tipovenda;
		this.seqvc = seqvc;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodvenda() {
		return this.codvenda;
	}

	public void setCodvenda(int codvenda) {
		this.codvenda = codvenda;
	}

	public char getTipovenda() {
		return this.tipovenda;
	}

	public void setTipovenda(char tipovenda) {
		this.tipovenda = tipovenda;
	}

	public short getSeqvc() {
		return this.seqvc;
	}

	public void setSeqvc(short seqvc) {
		this.seqvc = seqvc;
	}

	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VdvendacomisId))
			return false;
		VdvendacomisId castOther = (VdvendacomisId) other;

		return (this.getCodvenda() == castOther.getCodvenda())
				&& (this.getTipovenda() == castOther.getTipovenda())
				&& (this.getSeqvc() == castOther.getSeqvc())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodvenda();
		result = 37 * result + this.getTipovenda();
		result = 37 * result + this.getSeqvc();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
