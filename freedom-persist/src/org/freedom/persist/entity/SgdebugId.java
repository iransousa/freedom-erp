package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SgdebugId generated by hbm2java
 */
@Embeddable
public class SgdebugId implements java.io.Serializable {

	private int seq;
	private Date data;
	private Date hora;
	private String rotina;
	private String texto;

	public SgdebugId() {
	}

	public SgdebugId(int seq) {
		this.seq = seq;
	}

	public SgdebugId(int seq, Date data, Date hora, String rotina, String texto) {
		this.seq = seq;
		this.data = data;
		this.hora = hora;
		this.rotina = rotina;
		this.texto = texto;
	}

	@Column(name = "SEQ", unique = true, nullable = false)
	public int getSeq() {
		return this.seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	@Column(name = "DATA", length = 10)
	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Column(name = "HORA", length = 8)
	public Date getHora() {
		return this.hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	@Column(name = "ROTINA", length = 60)
	public String getRotina() {
		return this.rotina;
	}

	public void setRotina(String rotina) {
		this.rotina = rotina;
	}

	@Column(name = "TEXTO", length = 100)
	public String getTexto() {
		return this.texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SgdebugId))
			return false;
		SgdebugId castOther = (SgdebugId) other;

		return (this.getSeq() == castOther.getSeq())
				&& ((this.getData() == castOther.getData()) || (this.getData() != null
						&& castOther.getData() != null && this.getData()
						.equals(castOther.getData())))
				&& ((this.getHora() == castOther.getHora()) || (this.getHora() != null
						&& castOther.getHora() != null && this.getHora()
						.equals(castOther.getHora())))
				&& ((this.getRotina() == castOther.getRotina()) || (this
						.getRotina() != null && castOther.getRotina() != null && this
						.getRotina().equals(castOther.getRotina())))
				&& ((this.getTexto() == castOther.getTexto()) || (this
						.getTexto() != null && castOther.getTexto() != null && this
						.getTexto().equals(castOther.getTexto())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getSeq();
		result = 37 * result
				+ (getData() == null ? 0 : this.getData().hashCode());
		result = 37 * result
				+ (getHora() == null ? 0 : this.getHora().hashCode());
		result = 37 * result
				+ (getRotina() == null ? 0 : this.getRotina().hashCode());
		result = 37 * result
				+ (getTexto() == null ? 0 : this.getTexto().hashCode());
		return result;
	}

}
