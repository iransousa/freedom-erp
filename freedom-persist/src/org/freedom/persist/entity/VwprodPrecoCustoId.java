package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.math.BigDecimal;

/**
 * VwprodPrecoCustoId generated by hbm2java
 */
public class VwprodPrecoCustoId implements java.io.Serializable {

	private String refprod;
	private String codsecao;
	private String descprod;
	private BigDecimal precobaseprod;
	private BigDecimal custo;

	public VwprodPrecoCustoId() {
	}

	public VwprodPrecoCustoId(String refprod, String codsecao, String descprod,
			BigDecimal precobaseprod, BigDecimal custo) {
		this.refprod = refprod;
		this.codsecao = codsecao;
		this.descprod = descprod;
		this.precobaseprod = precobaseprod;
		this.custo = custo;
	}

	public String getRefprod() {
		return this.refprod;
	}

	public void setRefprod(String refprod) {
		this.refprod = refprod;
	}

	public String getCodsecao() {
		return this.codsecao;
	}

	public void setCodsecao(String codsecao) {
		this.codsecao = codsecao;
	}

	public String getDescprod() {
		return this.descprod;
	}

	public void setDescprod(String descprod) {
		this.descprod = descprod;
	}

	public BigDecimal getPrecobaseprod() {
		return this.precobaseprod;
	}

	public void setPrecobaseprod(BigDecimal precobaseprod) {
		this.precobaseprod = precobaseprod;
	}

	public BigDecimal getCusto() {
		return this.custo;
	}

	public void setCusto(BigDecimal custo) {
		this.custo = custo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VwprodPrecoCustoId))
			return false;
		VwprodPrecoCustoId castOther = (VwprodPrecoCustoId) other;

		return ((this.getRefprod() == castOther.getRefprod()) || (this
				.getRefprod() != null && castOther.getRefprod() != null && this
				.getRefprod().equals(castOther.getRefprod())))
				&& ((this.getCodsecao() == castOther.getCodsecao()) || (this
						.getCodsecao() != null
						&& castOther.getCodsecao() != null && this
						.getCodsecao().equals(castOther.getCodsecao())))
				&& ((this.getDescprod() == castOther.getDescprod()) || (this
						.getDescprod() != null
						&& castOther.getDescprod() != null && this
						.getDescprod().equals(castOther.getDescprod())))
				&& ((this.getPrecobaseprod() == castOther.getPrecobaseprod()) || (this
						.getPrecobaseprod() != null
						&& castOther.getPrecobaseprod() != null && this
						.getPrecobaseprod()
						.equals(castOther.getPrecobaseprod())))
				&& ((this.getCusto() == castOther.getCusto()) || (this
						.getCusto() != null && castOther.getCusto() != null && this
						.getCusto().equals(castOther.getCusto())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRefprod() == null ? 0 : this.getRefprod().hashCode());
		result = 37 * result
				+ (getCodsecao() == null ? 0 : this.getCodsecao().hashCode());
		result = 37 * result
				+ (getDescprod() == null ? 0 : this.getDescprod().hashCode());
		result = 37
				* result
				+ (getPrecobaseprod() == null ? 0 : this.getPrecobaseprod()
						.hashCode());
		result = 37 * result
				+ (getCusto() == null ? 0 : this.getCusto().hashCode());
		return result;
	}

}
