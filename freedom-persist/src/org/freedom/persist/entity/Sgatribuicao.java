package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Sgatribuicao generated by hbm2java
 */
public class Sgatribuicao implements java.io.Serializable {

	private SgatribuicaoId id;
	private Sgfilial sgfilial;
	private String descatrib;
	private String rmaatrib;
	private String obsatrib;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set sgatribusus = new HashSet(0);

	public Sgatribuicao() {
	}

	public Sgatribuicao(SgatribuicaoId id, Sgfilial sgfilial, String descatrib,
			String rmaatrib, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descatrib = descatrib;
		this.rmaatrib = rmaatrib;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgatribuicao(SgatribuicaoId id, Sgfilial sgfilial, String descatrib,
			String rmaatrib, String obsatrib, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set sgatribusus) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descatrib = descatrib;
		this.rmaatrib = rmaatrib;
		this.obsatrib = obsatrib;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.sgatribusus = sgatribusus;
	}

	public SgatribuicaoId getId() {
		return this.id;
	}

	public void setId(SgatribuicaoId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public String getDescatrib() {
		return this.descatrib;
	}

	public void setDescatrib(String descatrib) {
		this.descatrib = descatrib;
	}

	public String getRmaatrib() {
		return this.rmaatrib;
	}

	public void setRmaatrib(String rmaatrib) {
		this.rmaatrib = rmaatrib;
	}

	public String getObsatrib() {
		return this.obsatrib;
	}

	public void setObsatrib(String obsatrib) {
		this.obsatrib = obsatrib;
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

	public Set getSgatribusus() {
		return this.sgatribusus;
	}

	public void setSgatribusus(Set sgatribusus) {
		this.sgatribusus = sgatribusus;
	}

}
