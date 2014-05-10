package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Vditcontratoand generated by hbm2java
 */
public class Vditcontratoand implements java.io.Serializable {

	private VditcontratoandId id;
	private Vditcontrato vditcontrato;
	private String obsand;
	private BigDecimal percand;
	private Date dataand;
	private Date horaand;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Vditcontratoand() {
	}

	public Vditcontratoand(VditcontratoandId id, Vditcontrato vditcontrato,
			BigDecimal percand, Date dataand, Date horaand, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.vditcontrato = vditcontrato;
		this.percand = percand;
		this.dataand = dataand;
		this.horaand = horaand;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vditcontratoand(VditcontratoandId id, Vditcontrato vditcontrato,
			String obsand, BigDecimal percand, Date dataand, Date horaand,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt) {
		this.id = id;
		this.vditcontrato = vditcontrato;
		this.obsand = obsand;
		this.percand = percand;
		this.dataand = dataand;
		this.horaand = horaand;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public VditcontratoandId getId() {
		return this.id;
	}

	public void setId(VditcontratoandId id) {
		this.id = id;
	}

	public Vditcontrato getVditcontrato() {
		return this.vditcontrato;
	}

	public void setVditcontrato(Vditcontrato vditcontrato) {
		this.vditcontrato = vditcontrato;
	}

	public String getObsand() {
		return this.obsand;
	}

	public void setObsand(String obsand) {
		this.obsand = obsand;
	}

	public BigDecimal getPercand() {
		return this.percand;
	}

	public void setPercand(BigDecimal percand) {
		this.percand = percand;
	}

	public Date getDataand() {
		return this.dataand;
	}

	public void setDataand(Date dataand) {
		this.dataand = dataand;
	}

	public Date getHoraand() {
		return this.horaand;
	}

	public void setHoraand(Date horaand) {
		this.horaand = horaand;
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
