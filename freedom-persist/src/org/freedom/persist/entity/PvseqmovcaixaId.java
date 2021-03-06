package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PvseqmovcaixaId generated by hbm2java
 */
@Embeddable
public class PvseqmovcaixaId implements java.io.Serializable {

	private Date dtamov;
	private int codcaixa;
	private short codfilial;
	private int codemp;

	public PvseqmovcaixaId() {
	}

	public PvseqmovcaixaId(Date dtamov, int codcaixa, short codfilial,
			int codemp) {
		this.dtamov = dtamov;
		this.codcaixa = codcaixa;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "DTAMOV", nullable = false, length = 10)
	public Date getDtamov() {
		return this.dtamov;
	}

	public void setDtamov(Date dtamov) {
		this.dtamov = dtamov;
	}

	@Column(name = "CODCAIXA", nullable = false)
	public int getCodcaixa() {
		return this.codcaixa;
	}

	public void setCodcaixa(int codcaixa) {
		this.codcaixa = codcaixa;
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
		if (!(other instanceof PvseqmovcaixaId))
			return false;
		PvseqmovcaixaId castOther = (PvseqmovcaixaId) other;

		return ((this.getDtamov() == castOther.getDtamov()) || (this
				.getDtamov() != null && castOther.getDtamov() != null && this
				.getDtamov().equals(castOther.getDtamov())))
				&& (this.getCodcaixa() == castOther.getCodcaixa())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDtamov() == null ? 0 : this.getDtamov().hashCode());
		result = 37 * result + this.getCodcaixa();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
