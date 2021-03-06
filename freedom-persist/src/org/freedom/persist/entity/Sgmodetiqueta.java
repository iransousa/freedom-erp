package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Sgmodetiqueta generated by hbm2java
 */
@Entity
@Table(name = "SGMODETIQUETA")
public class Sgmodetiqueta implements java.io.Serializable {

	private SgmodetiquetaId id;
	private Sgpapel sgpapel;
	private String descmodetiq;
	private Short ncolmodetiq;
	private Short eecmodetiq;
	private String txamodetiq;
	private char comprimido;
	private Character posscript;
	private String modetiq;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Sgmodetiqueta() {
	}

	public Sgmodetiqueta(SgmodetiquetaId id, String descmodetiq,
			char comprimido, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.descmodetiq = descmodetiq;
		this.comprimido = comprimido;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgmodetiqueta(SgmodetiquetaId id, Sgpapel sgpapel,
			String descmodetiq, Short ncolmodetiq, Short eecmodetiq,
			String txamodetiq, char comprimido, Character posscript,
			String modetiq, Date dtins, Date hins, String idusuins, Date dtalt,
			Date halt, String idusualt) {
		this.id = id;
		this.sgpapel = sgpapel;
		this.descmodetiq = descmodetiq;
		this.ncolmodetiq = ncolmodetiq;
		this.eecmodetiq = eecmodetiq;
		this.txamodetiq = txamodetiq;
		this.comprimido = comprimido;
		this.posscript = posscript;
		this.modetiq = modetiq;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codmodetiq", column = @Column(name = "CODMODETIQ", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public SgmodetiquetaId getId() {
		return this.id;
	}

	public void setId(SgmodetiquetaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPAPEL", referencedColumnName = "CODPAPEL"),
			@JoinColumn(name = "CODFILIALPL", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPPL", referencedColumnName = "CODEMP") })
	public Sgpapel getSgpapel() {
		return this.sgpapel;
	}

	public void setSgpapel(Sgpapel sgpapel) {
		this.sgpapel = sgpapel;
	}

	@Column(name = "DESCMODETIQ", nullable = false, length = 30)
	public String getDescmodetiq() {
		return this.descmodetiq;
	}

	public void setDescmodetiq(String descmodetiq) {
		this.descmodetiq = descmodetiq;
	}

	@Column(name = "NCOLMODETIQ")
	public Short getNcolmodetiq() {
		return this.ncolmodetiq;
	}

	public void setNcolmodetiq(Short ncolmodetiq) {
		this.ncolmodetiq = ncolmodetiq;
	}

	@Column(name = "EECMODETIQ")
	public Short getEecmodetiq() {
		return this.eecmodetiq;
	}

	public void setEecmodetiq(Short eecmodetiq) {
		this.eecmodetiq = eecmodetiq;
	}

	@Column(name = "TXAMODETIQ", length = 1000)
	public String getTxamodetiq() {
		return this.txamodetiq;
	}

	public void setTxamodetiq(String txamodetiq) {
		this.txamodetiq = txamodetiq;
	}

	@Column(name = "COMPRIMIDO", nullable = false, length = 1)
	public char getComprimido() {
		return this.comprimido;
	}

	public void setComprimido(char comprimido) {
		this.comprimido = comprimido;
	}

	@Column(name = "POSSCRIPT", length = 1)
	public Character getPosscript() {
		return this.posscript;
	}

	public void setPosscript(Character posscript) {
		this.posscript = posscript;
	}

	@Column(name = "MODETIQ", length = 30)
	public String getModetiq() {
		return this.modetiq;
	}

	public void setModetiq(String modetiq) {
		this.modetiq = modetiq;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTINS", nullable = false, length = 10)
	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HINS", nullable = false, length = 8)
	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	@Column(name = "IDUSUINS", nullable = false, length = 8)
	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTALT", length = 10)
	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HALT", length = 8)
	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	@Column(name = "IDUSUALT", length = 8)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

}
