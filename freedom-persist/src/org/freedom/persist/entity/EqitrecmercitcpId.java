package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

/**
 * EqitrecmercitcpId generated by hbm2java
 */
public class EqitrecmercitcpId implements java.io.Serializable {

	private int ticket;
	private int coditrecmerc;
	private short codfilial;
	private int codemp;
	private int codempcp;
	private short codfilialcp;
	private int codcompra;
	private short coditcompra;

	public EqitrecmercitcpId() {
	}

	public EqitrecmercitcpId(int ticket, int coditrecmerc, short codfilial,
			int codemp, int codempcp, short codfilialcp, int codcompra,
			short coditcompra) {
		this.ticket = ticket;
		this.coditrecmerc = coditrecmerc;
		this.codfilial = codfilial;
		this.codemp = codemp;
		this.codempcp = codempcp;
		this.codfilialcp = codfilialcp;
		this.codcompra = codcompra;
		this.coditcompra = coditcompra;
	}

	public int getTicket() {
		return this.ticket;
	}

	public void setTicket(int ticket) {
		this.ticket = ticket;
	}

	public int getCoditrecmerc() {
		return this.coditrecmerc;
	}

	public void setCoditrecmerc(int coditrecmerc) {
		this.coditrecmerc = coditrecmerc;
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

	public int getCodempcp() {
		return this.codempcp;
	}

	public void setCodempcp(int codempcp) {
		this.codempcp = codempcp;
	}

	public short getCodfilialcp() {
		return this.codfilialcp;
	}

	public void setCodfilialcp(short codfilialcp) {
		this.codfilialcp = codfilialcp;
	}

	public int getCodcompra() {
		return this.codcompra;
	}

	public void setCodcompra(int codcompra) {
		this.codcompra = codcompra;
	}

	public short getCoditcompra() {
		return this.coditcompra;
	}

	public void setCoditcompra(short coditcompra) {
		this.coditcompra = coditcompra;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EqitrecmercitcpId))
			return false;
		EqitrecmercitcpId castOther = (EqitrecmercitcpId) other;

		return (this.getTicket() == castOther.getTicket())
				&& (this.getCoditrecmerc() == castOther.getCoditrecmerc())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodempcp() == castOther.getCodempcp())
				&& (this.getCodfilialcp() == castOther.getCodfilialcp())
				&& (this.getCodcompra() == castOther.getCodcompra())
				&& (this.getCoditcompra() == castOther.getCoditcompra());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getTicket();
		result = 37 * result + this.getCoditrecmerc();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodempcp();
		result = 37 * result + this.getCodfilialcp();
		result = 37 * result + this.getCodcompra();
		result = 37 * result + this.getCoditcompra();
		return result;
	}

}
