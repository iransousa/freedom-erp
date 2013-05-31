package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Rharea generated by hbm2java
 */
@Entity
@Table(name = "RHAREA")
public class Rharea implements java.io.Serializable {

	private RhareaId id;
	private Sgfilial sgfilial;
	private String descarea;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Rhcurso> rhcursos = new HashSet<Rhcurso>(0);

	public Rharea() {
	}

	public Rharea(RhareaId id, Sgfilial sgfilial, String descarea, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descarea = descarea;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Rharea(RhareaId id, Sgfilial sgfilial, String descarea, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set<Rhcurso> rhcursos) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descarea = descarea;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.rhcursos = rhcursos;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codarea", column = @Column(name = "CODAREA", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public RhareaId getId() {
		return this.id;
	}

	public void setId(RhareaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	@Column(name = "DESCAREA", nullable = false, length = 60)
	public String getDescarea() {
		return this.descarea;
	}

	public void setDescarea(String descarea) {
		this.descarea = descarea;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rharea")
	public Set<Rhcurso> getRhcursos() {
		return this.rhcursos;
	}

	public void setRhcursos(Set<Rhcurso> rhcursos) {
		this.rhcursos = rhcursos;
	}

}
