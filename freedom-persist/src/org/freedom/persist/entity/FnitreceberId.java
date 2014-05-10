package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * FnitreceberId generated by hbm2java
 */
public class FnitreceberId implements java.io.Serializable {

	private int codrec;
	private int nparcitrec;
	private short codfilial;
	private int codemp;

	public FnitreceberId() {
	}

	public FnitreceberId(int codrec, int nparcitrec, short codfilial, int codemp) {
		this.codrec = codrec;
		this.nparcitrec = nparcitrec;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodrec() {
		return this.codrec;
	}

	public void setCodrec(int codrec) {
		this.codrec = codrec;
	}

	public int getNparcitrec() {
		return this.nparcitrec;
	}

	public void setNparcitrec(int nparcitrec) {
		this.nparcitrec = nparcitrec;
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
		if (!(other instanceof FnitreceberId))
			return false;
		FnitreceberId castOther = (FnitreceberId) other;

		return (this.getCodrec() == castOther.getCodrec())
				&& (this.getNparcitrec() == castOther.getNparcitrec())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodrec();
		result = 37 * result + this.getNparcitrec();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
