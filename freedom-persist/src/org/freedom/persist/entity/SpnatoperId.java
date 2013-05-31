package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SpnatoperId generated by hbm2java
 */
@Embeddable
public class SpnatoperId implements java.io.Serializable {

	private String codigo;
	private String cst;

	public SpnatoperId() {
	}

	public SpnatoperId(String codigo, String cst) {
		this.codigo = codigo;
		this.cst = cst;
	}

	@Column(name = "CODIGO", nullable = false, length = 10)
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Column(name = "CST", nullable = false, length = 2)
	public String getCst() {
		return this.cst;
	}

	public void setCst(String cst) {
		this.cst = cst;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SpnatoperId))
			return false;
		SpnatoperId castOther = (SpnatoperId) other;

		return ((this.getCodigo() == castOther.getCodigo()) || (this
				.getCodigo() != null && castOther.getCodigo() != null && this
				.getCodigo().equals(castOther.getCodigo())))
				&& ((this.getCst() == castOther.getCst()) || (this.getCst() != null
						&& castOther.getCst() != null && this.getCst().equals(
						castOther.getCst())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodigo() == null ? 0 : this.getCodigo().hashCode());
		result = 37 * result
				+ (getCst() == null ? 0 : this.getCst().hashCode());
		return result;
	}

}
