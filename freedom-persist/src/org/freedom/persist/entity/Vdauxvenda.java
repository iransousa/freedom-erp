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
 * Vdauxvenda generated by hbm2java
 */
@Entity
@Table(name = "VDAUXVENDA")
public class Vdauxvenda implements java.io.Serializable {

	private VdauxvendaId id;
	private Vdvenda vdvenda;
	private String cpfcliauxv;
	private String nomecliauxv;
	private String endcliauxv;
	private Integer numcliauxv;
	private String cidcliauxv;
	private String ufcliauxv;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Vdauxvenda() {
	}

	public Vdauxvenda(VdauxvendaId id, Vdvenda vdvenda, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.vdvenda = vdvenda;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdauxvenda(VdauxvendaId id, Vdvenda vdvenda, String cpfcliauxv,
			String nomecliauxv, String endcliauxv, Integer numcliauxv,
			String cidcliauxv, String ufcliauxv, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.vdvenda = vdvenda;
		this.cpfcliauxv = cpfcliauxv;
		this.nomecliauxv = nomecliauxv;
		this.endcliauxv = endcliauxv;
		this.numcliauxv = numcliauxv;
		this.cidcliauxv = cidcliauxv;
		this.ufcliauxv = ufcliauxv;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codvenda", column = @Column(name = "CODVENDA", nullable = false)),
			@AttributeOverride(name = "codauxv", column = @Column(name = "CODAUXV", nullable = false)),
			@AttributeOverride(name = "tipovenda", column = @Column(name = "TIPOVENDA", nullable = false, length = 1)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public VdauxvendaId getId() {
		return this.id;
	}

	public void setId(VdauxvendaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODVENDA", referencedColumnName = "CODVENDA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "TIPOVENDA", referencedColumnName = "TIPOVENDA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Vdvenda getVdvenda() {
		return this.vdvenda;
	}

	public void setVdvenda(Vdvenda vdvenda) {
		this.vdvenda = vdvenda;
	}

	@Column(name = "CPFCLIAUXV", length = 11)
	public String getCpfcliauxv() {
		return this.cpfcliauxv;
	}

	public void setCpfcliauxv(String cpfcliauxv) {
		this.cpfcliauxv = cpfcliauxv;
	}

	@Column(name = "NOMECLIAUXV", length = 50)
	public String getNomecliauxv() {
		return this.nomecliauxv;
	}

	public void setNomecliauxv(String nomecliauxv) {
		this.nomecliauxv = nomecliauxv;
	}

	@Column(name = "ENDCLIAUXV", length = 50)
	public String getEndcliauxv() {
		return this.endcliauxv;
	}

	public void setEndcliauxv(String endcliauxv) {
		this.endcliauxv = endcliauxv;
	}

	@Column(name = "NUMCLIAUXV")
	public Integer getNumcliauxv() {
		return this.numcliauxv;
	}

	public void setNumcliauxv(Integer numcliauxv) {
		this.numcliauxv = numcliauxv;
	}

	@Column(name = "CIDCLIAUXV", length = 30)
	public String getCidcliauxv() {
		return this.cidcliauxv;
	}

	public void setCidcliauxv(String cidcliauxv) {
		this.cidcliauxv = cidcliauxv;
	}

	@Column(name = "UFCLIAUXV", length = 2)
	public String getUfcliauxv() {
		return this.ufcliauxv;
	}

	public void setUfcliauxv(String ufcliauxv) {
		this.ufcliauxv = ufcliauxv;
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
