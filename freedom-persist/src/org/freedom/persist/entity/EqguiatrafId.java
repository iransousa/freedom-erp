package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EqguiatrafId generated by hbm2java
 */
@Embeddable
public class EqguiatrafId implements java.io.Serializable {

	private int coditcompra;
	private int codcompra;
	private short codfilial;
	private int codemp;

	public EqguiatrafId() {
	}

	public EqguiatrafId(int coditcompra, int codcompra, short codfilial,
			int codemp) {
		this.coditcompra = coditcompra;
		this.codcompra = codcompra;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODITCOMPRA", nullable = false)
	public int getCoditcompra() {
		return this.coditcompra;
	}

	public void setCoditcompra(int coditcompra) {
		this.coditcompra = coditcompra;
	}

	@Column(name = "CODCOMPRA", nullable = false)
	public int getCodcompra() {
		return this.codcompra;
	}

	public void setCodcompra(int codcompra) {
		this.codcompra = codcompra;
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
		if (!(other instanceof EqguiatrafId))
			return false;
		EqguiatrafId castOther = (EqguiatrafId) other;

		return (this.getCoditcompra() == castOther.getCoditcompra())
				&& (this.getCodcompra() == castOther.getCodcompra())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCoditcompra();
		result = 37 * result + this.getCodcompra();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
