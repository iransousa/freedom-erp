package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Sgtipoagenda generated by hbm2java
 */
public class Sgtipoagenda implements java.io.Serializable {

	private SgtipoagendaId id;
	private String desctipoagd;
	private Date dtini;
	private String idusuini;
	private Date hini;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Sgtipoagenda() {
	}

	public Sgtipoagenda(SgtipoagendaId id, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgtipoagenda(SgtipoagendaId id, String desctipoagd, Date dtini,
			String idusuini, Date hini, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.desctipoagd = desctipoagd;
		this.dtini = dtini;
		this.idusuini = idusuini;
		this.hini = hini;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public SgtipoagendaId getId() {
		return this.id;
	}

	public void setId(SgtipoagendaId id) {
		this.id = id;
	}

	public String getDesctipoagd() {
		return this.desctipoagd;
	}

	public void setDesctipoagd(String desctipoagd) {
		this.desctipoagd = desctipoagd;
	}

	public Date getDtini() {
		return this.dtini;
	}

	public void setDtini(Date dtini) {
		this.dtini = dtini;
	}

	public String getIdusuini() {
		return this.idusuini;
	}

	public void setIdusuini(String idusuini) {
		this.idusuini = idusuini;
	}

	public Date getHini() {
		return this.hini;
	}

	public void setHini(Date hini) {
		this.hini = hini;
	}

	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

}
