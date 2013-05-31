package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VdregracomisId generated by hbm2java
 */
@Embeddable
public class VdregracomisId implements java.io.Serializable {

	private int codregrcomis;
	private short codfilial;
	private int codemp;

	public VdregracomisId() {
	}

	public VdregracomisId(int codregrcomis, short codfilial, int codemp) {
		this.codregrcomis = codregrcomis;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODREGRCOMIS", nullable = false)
	public int getCodregrcomis() {
		return this.codregrcomis;
	}

	public void setCodregrcomis(int codregrcomis) {
		this.codregrcomis = codregrcomis;
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
		if (!(other instanceof VdregracomisId))
			return false;
		VdregracomisId castOther = (VdregracomisId) other;

		return (this.getCodregrcomis() == castOther.getCodregrcomis())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodregrcomis();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
