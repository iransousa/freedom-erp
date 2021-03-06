package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

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
 * Sgprefere8 generated by hbm2java
 */
@Entity
@Table(name = "SGPREFERE8")
public class Sgprefere8 implements java.io.Serializable {

	private Sgprefere8Id id;
	private Eqtiporecmerc eqtiporecmercBySgpref8fkeqtiporecmercos;
	private Eqtiporecmerc eqtiporecmercBySgpref8fkeqtiporecmerc;
	private Eqtiporecmerc eqtiporecmercBySgpref8fkeqtiporecmerccm;
	private Eqtipoexpedicao eqtipoexpedicao;
	private Eqtipomov eqtipomovBySgpref8fkeqtipomovtc;
	private Fnplanopag fnplanopag;
	private Eqtipomov eqtipomovBySgprefere8fkeqtipomovds;
	private Vdtransp vdtransp;
	private char gerachamadoos;
	private Character usaprecopecaserv;
	private Integer codempse;
	private Short codfilialse;
	private Integer codprodse;
	private Character sincticket;
	private char solcphomologfor;
	private char utilrendacot;
	private char permitdoccoldupl;
	private String obspadoc;
	private char permititemrepcp;
	private BigDecimal percprecocoletacp;
	private char detitempainelserv;
	private char contingenciapesagem;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Sgprefere8() {
	}

	public Sgprefere8(Sgprefere8Id id, char gerachamadoos,
			char solcphomologfor, char utilrendacot, char permitdoccoldupl,
			char permititemrepcp, BigDecimal percprecocoletacp,
			char detitempainelserv, char contingenciapesagem, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.gerachamadoos = gerachamadoos;
		this.solcphomologfor = solcphomologfor;
		this.utilrendacot = utilrendacot;
		this.permitdoccoldupl = permitdoccoldupl;
		this.permititemrepcp = permititemrepcp;
		this.percprecocoletacp = percprecocoletacp;
		this.detitempainelserv = detitempainelserv;
		this.contingenciapesagem = contingenciapesagem;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public Sgprefere8(Sgprefere8Id id,
			Eqtiporecmerc eqtiporecmercBySgpref8fkeqtiporecmercos,
			Eqtiporecmerc eqtiporecmercBySgpref8fkeqtiporecmerc,
			Eqtiporecmerc eqtiporecmercBySgpref8fkeqtiporecmerccm,
			Eqtipoexpedicao eqtipoexpedicao,
			Eqtipomov eqtipomovBySgpref8fkeqtipomovtc, Fnplanopag fnplanopag,
			Eqtipomov eqtipomovBySgprefere8fkeqtipomovds, Vdtransp vdtransp,
			char gerachamadoos, Character usaprecopecaserv, Integer codempse,
			Short codfilialse, Integer codprodse, Character sincticket,
			char solcphomologfor, char utilrendacot, char permitdoccoldupl,
			String obspadoc, char permititemrepcp,
			BigDecimal percprecocoletacp, char detitempainelserv,
			char contingenciapesagem, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.eqtiporecmercBySgpref8fkeqtiporecmercos = eqtiporecmercBySgpref8fkeqtiporecmercos;
		this.eqtiporecmercBySgpref8fkeqtiporecmerc = eqtiporecmercBySgpref8fkeqtiporecmerc;
		this.eqtiporecmercBySgpref8fkeqtiporecmerccm = eqtiporecmercBySgpref8fkeqtiporecmerccm;
		this.eqtipoexpedicao = eqtipoexpedicao;
		this.eqtipomovBySgpref8fkeqtipomovtc = eqtipomovBySgpref8fkeqtipomovtc;
		this.fnplanopag = fnplanopag;
		this.eqtipomovBySgprefere8fkeqtipomovds = eqtipomovBySgprefere8fkeqtipomovds;
		this.vdtransp = vdtransp;
		this.gerachamadoos = gerachamadoos;
		this.usaprecopecaserv = usaprecopecaserv;
		this.codempse = codempse;
		this.codfilialse = codfilialse;
		this.codprodse = codprodse;
		this.sincticket = sincticket;
		this.solcphomologfor = solcphomologfor;
		this.utilrendacot = utilrendacot;
		this.permitdoccoldupl = permitdoccoldupl;
		this.obspadoc = obspadoc;
		this.permititemrepcp = permititemrepcp;
		this.percprecocoletacp = percprecocoletacp;
		this.detitempainelserv = detitempainelserv;
		this.contingenciapesagem = contingenciapesagem;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public Sgprefere8Id getId() {
		return this.id;
	}

	public void setId(Sgprefere8Id id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPORECMERCOS", referencedColumnName = "CODTIPORECMERC"),
			@JoinColumn(name = "CODFILIALTO", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPTO", referencedColumnName = "CODEMP") })
	public Eqtiporecmerc getEqtiporecmercBySgpref8fkeqtiporecmercos() {
		return this.eqtiporecmercBySgpref8fkeqtiporecmercos;
	}

	public void setEqtiporecmercBySgpref8fkeqtiporecmercos(
			Eqtiporecmerc eqtiporecmercBySgpref8fkeqtiporecmercos) {
		this.eqtiporecmercBySgpref8fkeqtiporecmercos = eqtiporecmercBySgpref8fkeqtiporecmercos;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPORECMERC", referencedColumnName = "CODTIPORECMERC"),
			@JoinColumn(name = "CODFILIALTR", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPTR", referencedColumnName = "CODEMP") })
	public Eqtiporecmerc getEqtiporecmercBySgpref8fkeqtiporecmerc() {
		return this.eqtiporecmercBySgpref8fkeqtiporecmerc;
	}

	public void setEqtiporecmercBySgpref8fkeqtiporecmerc(
			Eqtiporecmerc eqtiporecmercBySgpref8fkeqtiporecmerc) {
		this.eqtiporecmercBySgpref8fkeqtiporecmerc = eqtiporecmercBySgpref8fkeqtiporecmerc;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPORECMERCCM", referencedColumnName = "CODTIPORECMERC"),
			@JoinColumn(name = "CODFILIALCM", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCM", referencedColumnName = "CODEMP") })
	public Eqtiporecmerc getEqtiporecmercBySgpref8fkeqtiporecmerccm() {
		return this.eqtiporecmercBySgpref8fkeqtiporecmerccm;
	}

	public void setEqtiporecmercBySgpref8fkeqtiporecmerccm(
			Eqtiporecmerc eqtiporecmercBySgpref8fkeqtiporecmerccm) {
		this.eqtiporecmercBySgpref8fkeqtiporecmerccm = eqtiporecmercBySgpref8fkeqtiporecmerccm;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPOEXPED", referencedColumnName = "CODTIPOEXPED"),
			@JoinColumn(name = "CODFILIALTE", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPTE", referencedColumnName = "CODEMP") })
	public Eqtipoexpedicao getEqtipoexpedicao() {
		return this.eqtipoexpedicao;
	}

	public void setEqtipoexpedicao(Eqtipoexpedicao eqtipoexpedicao) {
		this.eqtipoexpedicao = eqtipoexpedicao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPOMOVTC", referencedColumnName = "CODTIPOMOV"),
			@JoinColumn(name = "CODFILIALTC", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPTC", referencedColumnName = "CODEMP") })
	public Eqtipomov getEqtipomovBySgpref8fkeqtipomovtc() {
		return this.eqtipomovBySgpref8fkeqtipomovtc;
	}

	public void setEqtipomovBySgpref8fkeqtipomovtc(
			Eqtipomov eqtipomovBySgpref8fkeqtipomovtc) {
		this.eqtipomovBySgpref8fkeqtipomovtc = eqtipomovBySgpref8fkeqtipomovtc;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPLANOPAG", referencedColumnName = "CODPLANOPAG"),
			@JoinColumn(name = "CODFILIALPP", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPPP", referencedColumnName = "CODEMP") })
	public Fnplanopag getFnplanopag() {
		return this.fnplanopag;
	}

	public void setFnplanopag(Fnplanopag fnplanopag) {
		this.fnplanopag = fnplanopag;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPOMOVDS", referencedColumnName = "CODTIPOMOV"),
			@JoinColumn(name = "CODFILIALDS", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPDS", referencedColumnName = "CODEMP") })
	public Eqtipomov getEqtipomovBySgprefere8fkeqtipomovds() {
		return this.eqtipomovBySgprefere8fkeqtipomovds;
	}

	public void setEqtipomovBySgprefere8fkeqtipomovds(
			Eqtipomov eqtipomovBySgprefere8fkeqtipomovds) {
		this.eqtipomovBySgprefere8fkeqtipomovds = eqtipomovBySgprefere8fkeqtipomovds;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTRAN", referencedColumnName = "CODTRAN"),
			@JoinColumn(name = "CODFILIALTN", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPTN", referencedColumnName = "CODEMP") })
	public Vdtransp getVdtransp() {
		return this.vdtransp;
	}

	public void setVdtransp(Vdtransp vdtransp) {
		this.vdtransp = vdtransp;
	}

	@Column(name = "GERACHAMADOOS", nullable = false, length = 1)
	public char getGerachamadoos() {
		return this.gerachamadoos;
	}

	public void setGerachamadoos(char gerachamadoos) {
		this.gerachamadoos = gerachamadoos;
	}

	@Column(name = "USAPRECOPECASERV", length = 1)
	public Character getUsaprecopecaserv() {
		return this.usaprecopecaserv;
	}

	public void setUsaprecopecaserv(Character usaprecopecaserv) {
		this.usaprecopecaserv = usaprecopecaserv;
	}

	@Column(name = "CODEMPSE")
	public Integer getCodempse() {
		return this.codempse;
	}

	public void setCodempse(Integer codempse) {
		this.codempse = codempse;
	}

	@Column(name = "CODFILIALSE")
	public Short getCodfilialse() {
		return this.codfilialse;
	}

	public void setCodfilialse(Short codfilialse) {
		this.codfilialse = codfilialse;
	}

	@Column(name = "CODPRODSE")
	public Integer getCodprodse() {
		return this.codprodse;
	}

	public void setCodprodse(Integer codprodse) {
		this.codprodse = codprodse;
	}

	@Column(name = "SINCTICKET", length = 1)
	public Character getSincticket() {
		return this.sincticket;
	}

	public void setSincticket(Character sincticket) {
		this.sincticket = sincticket;
	}

	@Column(name = "SOLCPHOMOLOGFOR", nullable = false, length = 1)
	public char getSolcphomologfor() {
		return this.solcphomologfor;
	}

	public void setSolcphomologfor(char solcphomologfor) {
		this.solcphomologfor = solcphomologfor;
	}

	@Column(name = "UTILRENDACOT", nullable = false, length = 1)
	public char getUtilrendacot() {
		return this.utilrendacot;
	}

	public void setUtilrendacot(char utilrendacot) {
		this.utilrendacot = utilrendacot;
	}

	@Column(name = "PERMITDOCCOLDUPL", nullable = false, length = 1)
	public char getPermitdoccoldupl() {
		return this.permitdoccoldupl;
	}

	public void setPermitdoccoldupl(char permitdoccoldupl) {
		this.permitdoccoldupl = permitdoccoldupl;
	}

	@Column(name = "OBSPADOC", length = 500)
	public String getObspadoc() {
		return this.obspadoc;
	}

	public void setObspadoc(String obspadoc) {
		this.obspadoc = obspadoc;
	}

	@Column(name = "PERMITITEMREPCP", nullable = false, length = 1)
	public char getPermititemrepcp() {
		return this.permititemrepcp;
	}

	public void setPermititemrepcp(char permititemrepcp) {
		this.permititemrepcp = permititemrepcp;
	}

	@Column(name = "PERCPRECOCOLETACP", nullable = false, precision = 15, scale = 5)
	public BigDecimal getPercprecocoletacp() {
		return this.percprecocoletacp;
	}

	public void setPercprecocoletacp(BigDecimal percprecocoletacp) {
		this.percprecocoletacp = percprecocoletacp;
	}

	@Column(name = "DETITEMPAINELSERV", nullable = false, length = 1)
	public char getDetitempainelserv() {
		return this.detitempainelserv;
	}

	public void setDetitempainelserv(char detitempainelserv) {
		this.detitempainelserv = detitempainelserv;
	}

	@Column(name = "CONTINGENCIAPESAGEM", nullable = false, length = 1)
	public char getContingenciapesagem() {
		return this.contingenciapesagem;
	}

	public void setContingenciapesagem(char contingenciapesagem) {
		this.contingenciapesagem = contingenciapesagem;
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
	@Column(name = "DTALT", nullable = false, length = 10)
	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HALT", nullable = false, length = 8)
	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	@Column(name = "IDUSUALT", nullable = false, length = 8)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

}
