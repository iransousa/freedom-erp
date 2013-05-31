package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
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
 * Vdcliveic generated by hbm2java
 */
@Entity
@Table(name = "VDCLIVEIC")
public class Vdcliveic implements java.io.Serializable {

	private VdcliveicId id;
	private Vdcliente vdcliente;
	private String modeloveic;
	private String alienadoveic;
	private Short anoveic;
	private BigDecimal valorveic;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Vdcliveic() {
	}

	public Vdcliveic(VdcliveicId id, Vdcliente vdcliente, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.vdcliente = vdcliente;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdcliveic(VdcliveicId id, Vdcliente vdcliente, String modeloveic,
			String alienadoveic, Short anoveic, BigDecimal valorveic,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt) {
		this.id = id;
		this.vdcliente = vdcliente;
		this.modeloveic = modeloveic;
		this.alienadoveic = alienadoveic;
		this.anoveic = anoveic;
		this.valorveic = valorveic;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "placaveic", column = @Column(name = "PLACAVEIC", nullable = false, length = 10)),
			@AttributeOverride(name = "codcli", column = @Column(name = "CODCLI", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public VdcliveicId getId() {
		return this.id;
	}

	public void setId(VdcliveicId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCLI", referencedColumnName = "CODCLI", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Vdcliente getVdcliente() {
		return this.vdcliente;
	}

	public void setVdcliente(Vdcliente vdcliente) {
		this.vdcliente = vdcliente;
	}

	@Column(name = "MODELOVEIC", length = 50)
	public String getModeloveic() {
		return this.modeloveic;
	}

	public void setModeloveic(String modeloveic) {
		this.modeloveic = modeloveic;
	}

	@Column(name = "ALIENADOVEIC", length = 30)
	public String getAlienadoveic() {
		return this.alienadoveic;
	}

	public void setAlienadoveic(String alienadoveic) {
		this.alienadoveic = alienadoveic;
	}

	@Column(name = "ANOVEIC")
	public Short getAnoveic() {
		return this.anoveic;
	}

	public void setAnoveic(Short anoveic) {
		this.anoveic = anoveic;
	}

	@Column(name = "VALORVEIC", precision = 15, scale = 5)
	public BigDecimal getValorveic() {
		return this.valorveic;
	}

	public void setValorveic(BigDecimal valorveic) {
		this.valorveic = valorveic;
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
