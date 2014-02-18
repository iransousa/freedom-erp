package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Lfclfiscal generated by hbm2java
 */
public class Lfclfiscal implements java.io.Serializable {

	private LfclfiscalId id;
	private Sgfilial sgfilial;
	private Lfservico lfservico;
	private Lfregrafiscal lfregrafiscal;
	private Lfncmnbm lfncmnbm;
	private Spnatoper spnatoper;
	private String descfisc;
	private String tipofisc;
	private Character tpredicmsfisc;
	private BigDecimal aliqfisc;
	private BigDecimal aliqlfisc;
	private BigDecimal redfisc;
	private BigDecimal aliqipifisc;
	private Character origfisc;
	private Integer codemptt;
	private Short codfilialtt;
	private String codtrattrib;
	private Integer codempme;
	private Short codfilialme;
	private Integer codmens;
	private Character sitpisfisc;
	private Character sitcofinsfisc;
	private String tipost;
	private BigDecimal margemvlagr;
	private String extipi;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set lfitclfiscals = new HashSet(0);
	private Set eqprodutos = new HashSet(0);

	public Lfclfiscal() {
	}

	public Lfclfiscal(LfclfiscalId id, Sgfilial sgfilial,
			Lfregrafiscal lfregrafiscal, String descfisc, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.lfregrafiscal = lfregrafiscal;
		this.descfisc = descfisc;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Lfclfiscal(LfclfiscalId id, Sgfilial sgfilial, Lfservico lfservico,
			Lfregrafiscal lfregrafiscal, Lfncmnbm lfncmnbm,
			Spnatoper spnatoper, String descfisc, String tipofisc,
			Character tpredicmsfisc, BigDecimal aliqfisc, BigDecimal aliqlfisc,
			BigDecimal redfisc, BigDecimal aliqipifisc, Character origfisc,
			Integer codemptt, Short codfilialtt, String codtrattrib,
			Integer codempme, Short codfilialme, Integer codmens,
			Character sitpisfisc, Character sitcofinsfisc, String tipost,
			BigDecimal margemvlagr, String extipi, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set lfitclfiscals, Set eqprodutos) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.lfservico = lfservico;
		this.lfregrafiscal = lfregrafiscal;
		this.lfncmnbm = lfncmnbm;
		this.spnatoper = spnatoper;
		this.descfisc = descfisc;
		this.tipofisc = tipofisc;
		this.tpredicmsfisc = tpredicmsfisc;
		this.aliqfisc = aliqfisc;
		this.aliqlfisc = aliqlfisc;
		this.redfisc = redfisc;
		this.aliqipifisc = aliqipifisc;
		this.origfisc = origfisc;
		this.codemptt = codemptt;
		this.codfilialtt = codfilialtt;
		this.codtrattrib = codtrattrib;
		this.codempme = codempme;
		this.codfilialme = codfilialme;
		this.codmens = codmens;
		this.sitpisfisc = sitpisfisc;
		this.sitcofinsfisc = sitcofinsfisc;
		this.tipost = tipost;
		this.margemvlagr = margemvlagr;
		this.extipi = extipi;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.lfitclfiscals = lfitclfiscals;
		this.eqprodutos = eqprodutos;
	}

	public LfclfiscalId getId() {
		return this.id;
	}

	public void setId(LfclfiscalId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public Lfservico getLfservico() {
		return this.lfservico;
	}

	public void setLfservico(Lfservico lfservico) {
		this.lfservico = lfservico;
	}

	public Lfregrafiscal getLfregrafiscal() {
		return this.lfregrafiscal;
	}

	public void setLfregrafiscal(Lfregrafiscal lfregrafiscal) {
		this.lfregrafiscal = lfregrafiscal;
	}

	public Lfncmnbm getLfncmnbm() {
		return this.lfncmnbm;
	}

	public void setLfncmnbm(Lfncmnbm lfncmnbm) {
		this.lfncmnbm = lfncmnbm;
	}

	public Spnatoper getSpnatoper() {
		return this.spnatoper;
	}

	public void setSpnatoper(Spnatoper spnatoper) {
		this.spnatoper = spnatoper;
	}

	public String getDescfisc() {
		return this.descfisc;
	}

	public void setDescfisc(String descfisc) {
		this.descfisc = descfisc;
	}

	public String getTipofisc() {
		return this.tipofisc;
	}

	public void setTipofisc(String tipofisc) {
		this.tipofisc = tipofisc;
	}

	public Character getTpredicmsfisc() {
		return this.tpredicmsfisc;
	}

	public void setTpredicmsfisc(Character tpredicmsfisc) {
		this.tpredicmsfisc = tpredicmsfisc;
	}

	public BigDecimal getAliqfisc() {
		return this.aliqfisc;
	}

	public void setAliqfisc(BigDecimal aliqfisc) {
		this.aliqfisc = aliqfisc;
	}

	public BigDecimal getAliqlfisc() {
		return this.aliqlfisc;
	}

	public void setAliqlfisc(BigDecimal aliqlfisc) {
		this.aliqlfisc = aliqlfisc;
	}

	public BigDecimal getRedfisc() {
		return this.redfisc;
	}

	public void setRedfisc(BigDecimal redfisc) {
		this.redfisc = redfisc;
	}

	public BigDecimal getAliqipifisc() {
		return this.aliqipifisc;
	}

	public void setAliqipifisc(BigDecimal aliqipifisc) {
		this.aliqipifisc = aliqipifisc;
	}

	public Character getOrigfisc() {
		return this.origfisc;
	}

	public void setOrigfisc(Character origfisc) {
		this.origfisc = origfisc;
	}

	public Integer getCodemptt() {
		return this.codemptt;
	}

	public void setCodemptt(Integer codemptt) {
		this.codemptt = codemptt;
	}

	public Short getCodfilialtt() {
		return this.codfilialtt;
	}

	public void setCodfilialtt(Short codfilialtt) {
		this.codfilialtt = codfilialtt;
	}

	public String getCodtrattrib() {
		return this.codtrattrib;
	}

	public void setCodtrattrib(String codtrattrib) {
		this.codtrattrib = codtrattrib;
	}

	public Integer getCodempme() {
		return this.codempme;
	}

	public void setCodempme(Integer codempme) {
		this.codempme = codempme;
	}

	public Short getCodfilialme() {
		return this.codfilialme;
	}

	public void setCodfilialme(Short codfilialme) {
		this.codfilialme = codfilialme;
	}

	public Integer getCodmens() {
		return this.codmens;
	}

	public void setCodmens(Integer codmens) {
		this.codmens = codmens;
	}

	public Character getSitpisfisc() {
		return this.sitpisfisc;
	}

	public void setSitpisfisc(Character sitpisfisc) {
		this.sitpisfisc = sitpisfisc;
	}

	public Character getSitcofinsfisc() {
		return this.sitcofinsfisc;
	}

	public void setSitcofinsfisc(Character sitcofinsfisc) {
		this.sitcofinsfisc = sitcofinsfisc;
	}

	public String getTipost() {
		return this.tipost;
	}

	public void setTipost(String tipost) {
		this.tipost = tipost;
	}

	public BigDecimal getMargemvlagr() {
		return this.margemvlagr;
	}

	public void setMargemvlagr(BigDecimal margemvlagr) {
		this.margemvlagr = margemvlagr;
	}

	public String getExtipi() {
		return this.extipi;
	}

	public void setExtipi(String extipi) {
		this.extipi = extipi;
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

	public Set getLfitclfiscals() {
		return this.lfitclfiscals;
	}

	public void setLfitclfiscals(Set lfitclfiscals) {
		this.lfitclfiscals = lfitclfiscals;
	}

	public Set getEqprodutos() {
		return this.eqprodutos;
	}

	public void setEqprodutos(Set eqprodutos) {
		this.eqprodutos = eqprodutos;
	}

}
