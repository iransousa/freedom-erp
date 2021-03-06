package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CpitordcompraId generated by hbm2java
 */
@Embeddable
public class CpitordcompraId implements java.io.Serializable {

	private int codemp;
	private short codfilial;
	private int codordcp;
	private short coditordcp;

	public CpitordcompraId() {
	}

	public CpitordcompraId(int codemp, short codfilial, int codordcp,
			short coditordcp) {
		this.codemp = codemp;
		this.codfilial = codfilial;
		this.codordcp = codordcp;
		this.coditordcp = coditordcp;
	}

	@Column(name = "CODEMP", nullable = false)
	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	@Column(name = "CODFILIAL", nullable = false)
	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	@Column(name = "CODORDCP", nullable = false)
	public int getCodordcp() {
		return this.codordcp;
	}

	public void setCodordcp(int codordcp) {
		this.codordcp = codordcp;
	}

	@Column(name = "CODITORDCP", nullable = false)
	public short getCoditordcp() {
		return this.coditordcp;
	}

	public void setCoditordcp(short coditordcp) {
		this.coditordcp = coditordcp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CpitordcompraId))
			return false;
		CpitordcompraId castOther = (CpitordcompraId) other;

		return (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodordcp() == castOther.getCodordcp())
				&& (this.getCoditordcp() == castOther.getCoditordcp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodordcp();
		result = 37 * result + this.getCoditordcp();
		return result;
	}

}
