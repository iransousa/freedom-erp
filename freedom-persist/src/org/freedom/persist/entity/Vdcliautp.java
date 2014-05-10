package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Vdcliautp generated by hbm2java
 */
public class Vdcliautp implements java.io.Serializable {

	private VdcliautpId id;
	private Vdcliente vdcliente;
	private String nomeautp;
	private String endautp;
	private Integer numautp;
	private String complautp;
	private String bairautp;
	private String cidautp;
	private String ufautp;
	private String cepautp;
	private String dddautp;
	private String foneautp;
	private String rgautp;
	private String sspautp;
	private String cpfautp;
	private String funcautp;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Vdcliautp() {
	}

	public Vdcliautp(VdcliautpId id, Vdcliente vdcliente, String nomeautp,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.vdcliente = vdcliente;
		this.nomeautp = nomeautp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdcliautp(VdcliautpId id, Vdcliente vdcliente, String nomeautp,
			String endautp, Integer numautp, String complautp, String bairautp,
			String cidautp, String ufautp, String cepautp, String dddautp,
			String foneautp, String rgautp, String sspautp, String cpfautp,
			String funcautp, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.vdcliente = vdcliente;
		this.nomeautp = nomeautp;
		this.endautp = endautp;
		this.numautp = numautp;
		this.complautp = complautp;
		this.bairautp = bairautp;
		this.cidautp = cidautp;
		this.ufautp = ufautp;
		this.cepautp = cepautp;
		this.dddautp = dddautp;
		this.foneautp = foneautp;
		this.rgautp = rgautp;
		this.sspautp = sspautp;
		this.cpfautp = cpfautp;
		this.funcautp = funcautp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public VdcliautpId getId() {
		return this.id;
	}

	public void setId(VdcliautpId id) {
		this.id = id;
	}

	public Vdcliente getVdcliente() {
		return this.vdcliente;
	}

	public void setVdcliente(Vdcliente vdcliente) {
		this.vdcliente = vdcliente;
	}

	public String getNomeautp() {
		return this.nomeautp;
	}

	public void setNomeautp(String nomeautp) {
		this.nomeautp = nomeautp;
	}

	public String getEndautp() {
		return this.endautp;
	}

	public void setEndautp(String endautp) {
		this.endautp = endautp;
	}

	public Integer getNumautp() {
		return this.numautp;
	}

	public void setNumautp(Integer numautp) {
		this.numautp = numautp;
	}

	public String getComplautp() {
		return this.complautp;
	}

	public void setComplautp(String complautp) {
		this.complautp = complautp;
	}

	public String getBairautp() {
		return this.bairautp;
	}

	public void setBairautp(String bairautp) {
		this.bairautp = bairautp;
	}

	public String getCidautp() {
		return this.cidautp;
	}

	public void setCidautp(String cidautp) {
		this.cidautp = cidautp;
	}

	public String getUfautp() {
		return this.ufautp;
	}

	public void setUfautp(String ufautp) {
		this.ufautp = ufautp;
	}

	public String getCepautp() {
		return this.cepautp;
	}

	public void setCepautp(String cepautp) {
		this.cepautp = cepautp;
	}

	public String getDddautp() {
		return this.dddautp;
	}

	public void setDddautp(String dddautp) {
		this.dddautp = dddautp;
	}

	public String getFoneautp() {
		return this.foneautp;
	}

	public void setFoneautp(String foneautp) {
		this.foneautp = foneautp;
	}

	public String getRgautp() {
		return this.rgautp;
	}

	public void setRgautp(String rgautp) {
		this.rgautp = rgautp;
	}

	public String getSspautp() {
		return this.sspautp;
	}

	public void setSspautp(String sspautp) {
		this.sspautp = sspautp;
	}

	public String getCpfautp() {
		return this.cpfautp;
	}

	public void setCpfautp(String cpfautp) {
		this.cpfautp = cpfautp;
	}

	public String getFuncautp() {
		return this.funcautp;
	}

	public void setFuncautp(String funcautp) {
		this.funcautp = funcautp;
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
