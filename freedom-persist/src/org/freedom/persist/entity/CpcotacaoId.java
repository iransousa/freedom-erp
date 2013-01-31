package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CpcotacaoId generated by hbm2java
 */
@Embeddable
public class CpcotacaoId implements java.io.Serializable {

	private int codsol;
	private short coditsol;
	private short codcot;
	private short codfilial;
	private int codemp;

	public CpcotacaoId() {
	}

	public CpcotacaoId(int codsol, short coditsol, short codcot,
			short codfilial, int codemp) {
		this.codsol = codsol;
		this.coditsol = coditsol;
		this.codcot = codcot;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODSOL", nullable = false)
	public int getCodsol() {
		return this.codsol;
	}

	public void setCodsol(int codsol) {
		this.codsol = codsol;
	}

	@Column(name = "CODITSOL", nullable = false)
	public short getCoditsol() {
		return this.coditsol;
	}

	public void setCoditsol(short coditsol) {
		this.coditsol = coditsol;
	}

	@Column(name = "CODCOT", nullable = false)
	public short getCodcot() {
		return this.codcot;
	}

	public void setCodcot(short codcot) {
		this.codcot = codcot;
	}

	@Column(name = "CODFILIAL", nullable = false)
	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	@Column(name = "CODEMP", nullable = false)
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
		if (!(other instanceof CpcotacaoId))
			return false;
		CpcotacaoId castOther = (CpcotacaoId) other;

		return (this.getCodsol() == castOther.getCodsol())
				&& (this.getCoditsol() == castOther.getCoditsol())
				&& (this.getCodcot() == castOther.getCodcot())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodsol();
		result = 37 * result + this.getCoditsol();
		result = 37 * result + this.getCodcot();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}