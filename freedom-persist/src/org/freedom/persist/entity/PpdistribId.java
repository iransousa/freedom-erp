package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * PpdistribId generated by hbm2java
 */
public class PpdistribId implements java.io.Serializable {

	private int codprod;
	private short codfilial;
	private int codemp;
	private short seqest;
	private short seqef;
	private int codprodde;
	private short codfilialde;
	private int codempde;
	private short seqde;
	private short seqestde;
	private int codfase;
	private short codfilialfs;
	private int codempfs;

	public PpdistribId() {
	}

	public PpdistribId(int codprod, short codfilial, int codemp, short seqest,
			short seqef, int codprodde, short codfilialde, int codempde,
			short seqde, short seqestde, int codfase, short codfilialfs,
			int codempfs) {
		this.codprod = codprod;
		this.codfilial = codfilial;
		this.codemp = codemp;
		this.seqest = seqest;
		this.seqef = seqef;
		this.codprodde = codprodde;
		this.codfilialde = codfilialde;
		this.codempde = codempde;
		this.seqde = seqde;
		this.seqestde = seqestde;
		this.codfase = codfase;
		this.codfilialfs = codfilialfs;
		this.codempfs = codempfs;
	}

	public int getCodprod() {
		return this.codprod;
	}

	public void setCodprod(int codprod) {
		this.codprod = codprod;
	}

	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	public short getSeqest() {
		return this.seqest;
	}

	public void setSeqest(short seqest) {
		this.seqest = seqest;
	}

	public short getSeqef() {
		return this.seqef;
	}

	public void setSeqef(short seqef) {
		this.seqef = seqef;
	}

	public int getCodprodde() {
		return this.codprodde;
	}

	public void setCodprodde(int codprodde) {
		this.codprodde = codprodde;
	}

	public short getCodfilialde() {
		return this.codfilialde;
	}

	public void setCodfilialde(short codfilialde) {
		this.codfilialde = codfilialde;
	}

	public int getCodempde() {
		return this.codempde;
	}

	public void setCodempde(int codempde) {
		this.codempde = codempde;
	}

	public short getSeqde() {
		return this.seqde;
	}

	public void setSeqde(short seqde) {
		this.seqde = seqde;
	}

	public short getSeqestde() {
		return this.seqestde;
	}

	public void setSeqestde(short seqestde) {
		this.seqestde = seqestde;
	}

	public int getCodfase() {
		return this.codfase;
	}

	public void setCodfase(int codfase) {
		this.codfase = codfase;
	}

	public short getCodfilialfs() {
		return this.codfilialfs;
	}

	public void setCodfilialfs(short codfilialfs) {
		this.codfilialfs = codfilialfs;
	}

	public int getCodempfs() {
		return this.codempfs;
	}

	public void setCodempfs(int codempfs) {
		this.codempfs = codempfs;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PpdistribId))
			return false;
		PpdistribId castOther = (PpdistribId) other;

		return (this.getCodprod() == castOther.getCodprod())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp())
				&& (this.getSeqest() == castOther.getSeqest())
				&& (this.getSeqef() == castOther.getSeqef())
				&& (this.getCodprodde() == castOther.getCodprodde())
				&& (this.getCodfilialde() == castOther.getCodfilialde())
				&& (this.getCodempde() == castOther.getCodempde())
				&& (this.getSeqde() == castOther.getSeqde())
				&& (this.getSeqestde() == castOther.getSeqestde())
				&& (this.getCodfase() == castOther.getCodfase())
				&& (this.getCodfilialfs() == castOther.getCodfilialfs())
				&& (this.getCodempfs() == castOther.getCodempfs());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodprod();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getSeqest();
		result = 37 * result + this.getSeqef();
		result = 37 * result + this.getCodprodde();
		result = 37 * result + this.getCodfilialde();
		result = 37 * result + this.getCodempde();
		result = 37 * result + this.getSeqde();
		result = 37 * result + this.getSeqestde();
		result = 37 * result + this.getCodfase();
		result = 37 * result + this.getCodfilialfs();
		result = 37 * result + this.getCodempfs();
		return result;
	}

}
