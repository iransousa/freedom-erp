package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Vwcustoproj01Id generated by hbm2java
 */
public class Vwcustoproj01Id implements java.io.Serializable {

	private Integer codemp;
	private Short codfilial;
	private Integer codcli;
	private Date data;
	private String desccusto;
	private Integer codcontr;
	private Short coditcontr;
	private Character tpcontr;
	private BigDecimal vlrprevrec;
	private BigDecimal qtdcusto;
	private BigDecimal vlrcusto;
	private Character tipocusto;

	public Vwcustoproj01Id() {
	}

	public Vwcustoproj01Id(Integer codemp, Short codfilial, Integer codcli,
			Date data, String desccusto, Integer codcontr, Short coditcontr,
			Character tpcontr, BigDecimal vlrprevrec, BigDecimal qtdcusto,
			BigDecimal vlrcusto, Character tipocusto) {
		this.codemp = codemp;
		this.codfilial = codfilial;
		this.codcli = codcli;
		this.data = data;
		this.desccusto = desccusto;
		this.codcontr = codcontr;
		this.coditcontr = coditcontr;
		this.tpcontr = tpcontr;
		this.vlrprevrec = vlrprevrec;
		this.qtdcusto = qtdcusto;
		this.vlrcusto = vlrcusto;
		this.tipocusto = tipocusto;
	}

	public Integer getCodemp() {
		return this.codemp;
	}

	public void setCodemp(Integer codemp) {
		this.codemp = codemp;
	}

	public Short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(Short codfilial) {
		this.codfilial = codfilial;
	}

	public Integer getCodcli() {
		return this.codcli;
	}

	public void setCodcli(Integer codcli) {
		this.codcli = codcli;
	}

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDesccusto() {
		return this.desccusto;
	}

	public void setDesccusto(String desccusto) {
		this.desccusto = desccusto;
	}

	public Integer getCodcontr() {
		return this.codcontr;
	}

	public void setCodcontr(Integer codcontr) {
		this.codcontr = codcontr;
	}

	public Short getCoditcontr() {
		return this.coditcontr;
	}

	public void setCoditcontr(Short coditcontr) {
		this.coditcontr = coditcontr;
	}

	public Character getTpcontr() {
		return this.tpcontr;
	}

	public void setTpcontr(Character tpcontr) {
		this.tpcontr = tpcontr;
	}

	public BigDecimal getVlrprevrec() {
		return this.vlrprevrec;
	}

	public void setVlrprevrec(BigDecimal vlrprevrec) {
		this.vlrprevrec = vlrprevrec;
	}

	public BigDecimal getQtdcusto() {
		return this.qtdcusto;
	}

	public void setQtdcusto(BigDecimal qtdcusto) {
		this.qtdcusto = qtdcusto;
	}

	public BigDecimal getVlrcusto() {
		return this.vlrcusto;
	}

	public void setVlrcusto(BigDecimal vlrcusto) {
		this.vlrcusto = vlrcusto;
	}

	public Character getTipocusto() {
		return this.tipocusto;
	}

	public void setTipocusto(Character tipocusto) {
		this.tipocusto = tipocusto;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Vwcustoproj01Id))
			return false;
		Vwcustoproj01Id castOther = (Vwcustoproj01Id) other;

		return ((this.getCodemp() == castOther.getCodemp()) || (this
				.getCodemp() != null && castOther.getCodemp() != null && this
				.getCodemp().equals(castOther.getCodemp())))
				&& ((this.getCodfilial() == castOther.getCodfilial()) || (this
						.getCodfilial() != null
						&& castOther.getCodfilial() != null && this
						.getCodfilial().equals(castOther.getCodfilial())))
				&& ((this.getCodcli() == castOther.getCodcli()) || (this
						.getCodcli() != null && castOther.getCodcli() != null && this
						.getCodcli().equals(castOther.getCodcli())))
				&& ((this.getData() == castOther.getData()) || (this.getData() != null
						&& castOther.getData() != null && this.getData()
						.equals(castOther.getData())))
				&& ((this.getDesccusto() == castOther.getDesccusto()) || (this
						.getDesccusto() != null
						&& castOther.getDesccusto() != null && this
						.getDesccusto().equals(castOther.getDesccusto())))
				&& ((this.getCodcontr() == castOther.getCodcontr()) || (this
						.getCodcontr() != null
						&& castOther.getCodcontr() != null && this
						.getCodcontr().equals(castOther.getCodcontr())))
				&& ((this.getCoditcontr() == castOther.getCoditcontr()) || (this
						.getCoditcontr() != null
						&& castOther.getCoditcontr() != null && this
						.getCoditcontr().equals(castOther.getCoditcontr())))
				&& ((this.getTpcontr() == castOther.getTpcontr()) || (this
						.getTpcontr() != null && castOther.getTpcontr() != null && this
						.getTpcontr().equals(castOther.getTpcontr())))
				&& ((this.getVlrprevrec() == castOther.getVlrprevrec()) || (this
						.getVlrprevrec() != null
						&& castOther.getVlrprevrec() != null && this
						.getVlrprevrec().equals(castOther.getVlrprevrec())))
				&& ((this.getQtdcusto() == castOther.getQtdcusto()) || (this
						.getQtdcusto() != null
						&& castOther.getQtdcusto() != null && this
						.getQtdcusto().equals(castOther.getQtdcusto())))
				&& ((this.getVlrcusto() == castOther.getVlrcusto()) || (this
						.getVlrcusto() != null
						&& castOther.getVlrcusto() != null && this
						.getVlrcusto().equals(castOther.getVlrcusto())))
				&& ((this.getTipocusto() == castOther.getTipocusto()) || (this
						.getTipocusto() != null
						&& castOther.getTipocusto() != null && this
						.getTipocusto().equals(castOther.getTipocusto())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodemp() == null ? 0 : this.getCodemp().hashCode());
		result = 37 * result
				+ (getCodfilial() == null ? 0 : this.getCodfilial().hashCode());
		result = 37 * result
				+ (getCodcli() == null ? 0 : this.getCodcli().hashCode());
		result = 37 * result
				+ (getData() == null ? 0 : this.getData().hashCode());
		result = 37 * result
				+ (getDesccusto() == null ? 0 : this.getDesccusto().hashCode());
		result = 37 * result
				+ (getCodcontr() == null ? 0 : this.getCodcontr().hashCode());
		result = 37
				* result
				+ (getCoditcontr() == null ? 0 : this.getCoditcontr()
						.hashCode());
		result = 37 * result
				+ (getTpcontr() == null ? 0 : this.getTpcontr().hashCode());
		result = 37
				* result
				+ (getVlrprevrec() == null ? 0 : this.getVlrprevrec()
						.hashCode());
		result = 37 * result
				+ (getQtdcusto() == null ? 0 : this.getQtdcusto().hashCode());
		result = 37 * result
				+ (getVlrcusto() == null ? 0 : this.getVlrcusto().hashCode());
		result = 37 * result
				+ (getTipocusto() == null ? 0 : this.getTipocusto().hashCode());
		return result;
	}

}
