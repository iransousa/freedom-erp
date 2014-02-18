package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Crmotivoaval generated by hbm2java
 */
public class Crmotivoaval implements java.io.Serializable {

	private CrmotivoavalId id;
	private String descmotaval;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set crfichaavals = new HashSet(0);

	public Crmotivoaval() {
	}

	public Crmotivoaval(CrmotivoavalId id, String descmotaval, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt) {
		this.id = id;
		this.descmotaval = descmotaval;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
	}

	public Crmotivoaval(CrmotivoavalId id, String descmotaval, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set crfichaavals) {
		this.id = id;
		this.descmotaval = descmotaval;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.crfichaavals = crfichaavals;
	}

	public CrmotivoavalId getId() {
		return this.id;
	}

	public void setId(CrmotivoavalId id) {
		this.id = id;
	}

	public String getDescmotaval() {
		return this.descmotaval;
	}

	public void setDescmotaval(String descmotaval) {
		this.descmotaval = descmotaval;
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

	public Set getCrfichaavals() {
		return this.crfichaavals;
	}

	public void setCrfichaavals(Set crfichaavals) {
		this.crfichaavals = crfichaavals;
	}

}
