package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * EqunidadeId generated by hbm2java
 */
public class EqunidadeId implements java.io.Serializable {

	private String codunid;
	private short codfilial;
	private int codemp;

	public EqunidadeId() {
	}

	public EqunidadeId(String codunid, short codfilial, int codemp) {
		this.codunid = codunid;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public String getCodunid() {
		return this.codunid;
	}

	public void setCodunid(String codunid) {
		this.codunid = codunid;
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
		if (!(other instanceof EqunidadeId))
			return false;
		EqunidadeId castOther = (EqunidadeId) other;

		return ((this.getCodunid() == castOther.getCodunid()) || (this
				.getCodunid() != null && castOther.getCodunid() != null && this
				.getCodunid().equals(castOther.getCodunid())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodunid() == null ? 0 : this.getCodunid().hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
