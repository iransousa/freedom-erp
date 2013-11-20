package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

/**
 * LfclfiscalId generated by hbm2java
 */
public class LfclfiscalId implements java.io.Serializable {

	private String codfisc;
	private short codfilial;
	private int codemp;

	public LfclfiscalId() {
	}

	public LfclfiscalId(String codfisc, short codfilial, int codemp) {
		this.codfisc = codfisc;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public String getCodfisc() {
		return this.codfisc;
	}

	public void setCodfisc(String codfisc) {
		this.codfisc = codfisc;
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
		if (!(other instanceof LfclfiscalId))
			return false;
		LfclfiscalId castOther = (LfclfiscalId) other;

		return ((this.getCodfisc() == castOther.getCodfisc()) || (this
				.getCodfisc() != null && castOther.getCodfisc() != null && this
				.getCodfisc().equals(castOther.getCodfisc())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodfisc() == null ? 0 : this.getCodfisc().hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
