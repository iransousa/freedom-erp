package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

/**
 * CprateioId generated by hbm2java
 */
public class CprateioId implements java.io.Serializable {

	private int codcompra;
	private short seqrateio;
	private short codfilial;
	private int codemp;

	public CprateioId() {
	}

	public CprateioId(int codcompra, short seqrateio, short codfilial,
			int codemp) {
		this.codcompra = codcompra;
		this.seqrateio = seqrateio;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodcompra() {
		return this.codcompra;
	}

	public void setCodcompra(int codcompra) {
		this.codcompra = codcompra;
	}

	public short getSeqrateio() {
		return this.seqrateio;
	}

	public void setSeqrateio(short seqrateio) {
		this.seqrateio = seqrateio;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CprateioId))
			return false;
		CprateioId castOther = (CprateioId) other;

		return (this.getCodcompra() == castOther.getCodcompra())
				&& (this.getSeqrateio() == castOther.getSeqrateio())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodcompra();
		result = 37 * result + this.getSeqrateio();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
