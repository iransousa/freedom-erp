package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Atatendimentovw01 generated by hbm2java
 */
@Entity
@Table(name = "ATATENDIMENTOVW01")
public class Atatendimentovw01 implements java.io.Serializable {

	private Atatendimentovw01Id id;

	public Atatendimentovw01() {
	}

	public Atatendimentovw01(Atatendimentovw01Id id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP")),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL")),
			@AttributeOverride(name = "codatendo", column = @Column(name = "CODATENDO")),
			@AttributeOverride(name = "codempae", column = @Column(name = "CODEMPAE")),
			@AttributeOverride(name = "codfilialae", column = @Column(name = "CODFILIALAE")),
			@AttributeOverride(name = "codatend", column = @Column(name = "CODATEND")),
			@AttributeOverride(name = "nomeatend", column = @Column(name = "NOMEATEND", length = 50)),
			@AttributeOverride(name = "partpremiatend", column = @Column(name = "PARTPREMIATEND", length = 1)),
			@AttributeOverride(name = "codempep", column = @Column(name = "CODEMPEP")),
			@AttributeOverride(name = "codfilialep", column = @Column(name = "CODFILIALEP")),
			@AttributeOverride(name = "matempr", column = @Column(name = "MATEMPR")),
			@AttributeOverride(name = "coempea", column = @Column(name = "COEMPEA")),
			@AttributeOverride(name = "codfilialea", column = @Column(name = "CODFILIALEA")),
			@AttributeOverride(name = "codespec", column = @Column(name = "CODESPEC")),
			@AttributeOverride(name = "descespec", column = @Column(name = "DESCESPEC", length = 100)),
			@AttributeOverride(name = "codempct", column = @Column(name = "CODEMPCT")),
			@AttributeOverride(name = "codfilialct", column = @Column(name = "CODFILIALCT")),
			@AttributeOverride(name = "codcontr", column = @Column(name = "CODCONTR")),
			@AttributeOverride(name = "desccontr", column = @Column(name = "DESCCONTR", length = 80)),
			@AttributeOverride(name = "coditcontr", column = @Column(name = "CODITCONTR")),
			@AttributeOverride(name = "codempta", column = @Column(name = "CODEMPTA")),
			@AttributeOverride(name = "codfilialta", column = @Column(name = "CODFILIALTA")),
			@AttributeOverride(name = "codtarefa", column = @Column(name = "CODTAREFA")),
			@AttributeOverride(name = "tpcobcontr", column = @Column(name = "TPCOBCONTR", length = 2)),
			@AttributeOverride(name = "anoatendo", column = @Column(name = "ANOATENDO")),
			@AttributeOverride(name = "mesatendo", column = @Column(name = "MESATENDO")),
			@AttributeOverride(name = "qtdcontr", column = @Column(name = "QTDCONTR", precision = 0, scale = 5)),
			@AttributeOverride(name = "qtditcontr", column = @Column(name = "QTDITCONTR", precision = 15, scale = 5)),
			@AttributeOverride(name = "vlritcontr", column = @Column(name = "VLRITCONTR", precision = 15, scale = 5)),
			@AttributeOverride(name = "vlritcontrexced", column = @Column(name = "VLRITCONTREXCED", precision = 15, scale = 5)),
			@AttributeOverride(name = "dtinicio", column = @Column(name = "DTINICIO", length = 10)),
			@AttributeOverride(name = "statusatendo", column = @Column(name = "STATUSATENDO", length = 2)),
			@AttributeOverride(name = "razcli", column = @Column(name = "RAZCLI", length = 60)),
			@AttributeOverride(name = "nomecli", column = @Column(name = "NOMECLI", length = 50)),
			@AttributeOverride(name = "codcli", column = @Column(name = "CODCLI")),
			@AttributeOverride(name = "codempcl", column = @Column(name = "CODEMPCL")),
			@AttributeOverride(name = "codfilialcl", column = @Column(name = "CODFILIALCL")),
			@AttributeOverride(name = "codempch", column = @Column(name = "CODEMPCH")),
			@AttributeOverride(name = "codfilialch", column = @Column(name = "CODFILIALCH")),
			@AttributeOverride(name = "codchamado", column = @Column(name = "CODCHAMADO")),
			@AttributeOverride(name = "descchamado", column = @Column(name = "DESCCHAMADO", length = 100)),
			@AttributeOverride(name = "codempto", column = @Column(name = "CODEMPTO")),
			@AttributeOverride(name = "codfilialto", column = @Column(name = "CODFILIALTO")),
			@AttributeOverride(name = "codtpatendo", column = @Column(name = "CODTPATENDO")),
			@AttributeOverride(name = "desctpatendo", column = @Column(name = "DESCTPATENDO", length = 50)),
			@AttributeOverride(name = "obsatendo", column = @Column(name = "OBSATENDO", length = 10000)),
			@AttributeOverride(name = "dataatendo", column = @Column(name = "DATAATENDO", length = 10)),
			@AttributeOverride(name = "dataatendofin", column = @Column(name = "DATAATENDOFIN", length = 10)),
			@AttributeOverride(name = "horaatendo", column = @Column(name = "HORAATENDO", length = 8)),
			@AttributeOverride(name = "horaatendofin", column = @Column(name = "HORAATENDOFIN", length = 8)),
			@AttributeOverride(name = "pgcomiespec", column = @Column(name = "PGCOMIESPEC", length = 1)),
			@AttributeOverride(name = "cobcliespec", column = @Column(name = "COBCLIESPEC", length = 1)),
			@AttributeOverride(name = "contmetaespec", column = @Column(name = "CONTMETAESPEC", length = 1)),
			@AttributeOverride(name = "mrelcobespec", column = @Column(name = "MRELCOBESPEC", length = 1)),
			@AttributeOverride(name = "bhespec", column = @Column(name = "BHESPEC", length = 1)),
			@AttributeOverride(name = "tempomincobespec", column = @Column(name = "TEMPOMINCOBESPEC")),
			@AttributeOverride(name = "tempomaxcobespec", column = @Column(name = "TEMPOMAXCOBESPEC")),
			@AttributeOverride(name = "perccomiespec", column = @Column(name = "PERCCOMIESPEC", precision = 15, scale = 5)),
			@AttributeOverride(name = "totalmin", column = @Column(name = "TOTALMIN", precision = 0, scale = 4)),
			@AttributeOverride(name = "sitrevatendo", column = @Column(name = "SITREVATENDO", length = 2)),
			@AttributeOverride(name = "sitcontr", column = @Column(name = "SITCONTR", length = 2)),
			@AttributeOverride(name = "descsitcontr", column = @Column(name = "DESCSITCONTR", length = 2000)),
			@AttributeOverride(name = "dtprevfin", column = @Column(name = "DTPREVFIN", length = 10)),
			@AttributeOverride(name = "tipoatendo", column = @Column(name = "TIPOATENDO", length = 1)),
			@AttributeOverride(name = "docatendo", column = @Column(name = "DOCATENDO")),
			@AttributeOverride(name = "codempoc", column = @Column(name = "CODEMPOC")),
			@AttributeOverride(name = "codfilialoc", column = @Column(name = "CODFILIALOC")),
			@AttributeOverride(name = "tipoorc", column = @Column(name = "TIPOORC", length = 1)),
			@AttributeOverride(name = "codorc", column = @Column(name = "CODORC")),
			@AttributeOverride(name = "idusuins", column = @Column(name = "IDUSUINS", length = 8)),
			@AttributeOverride(name = "dtins", column = @Column(name = "DTINS", length = 10)),
			@AttributeOverride(name = "hins", column = @Column(name = "HINS", length = 8)),
			@AttributeOverride(name = "idusualt", column = @Column(name = "IDUSUALT", length = 8)),
			@AttributeOverride(name = "dtalt", column = @Column(name = "DTALT", length = 10)),
			@AttributeOverride(name = "halt", column = @Column(name = "HALT", length = 8)) })
	public Atatendimentovw01Id getId() {
		return this.id;
	}

	public void setId(Atatendimentovw01Id id) {
		this.id = id;
	}

}
