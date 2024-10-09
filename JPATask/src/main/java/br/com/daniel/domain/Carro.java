package br.com.daniel.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_CARROS")
public class Carro {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carro_seq")
	@SequenceGenerator(name = "carro_seq", sequenceName = "sq_carro_id", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "NOME_MODELO", nullable = false)
	private String modelo;
	
	@Column(name = "ANO_DE_FABRICACAO", nullable = false)
	private Integer anoFabricacao;
	
	@Column(name = "QTD_PORTAS")
	private Integer qtdPortas;
	
	@ManyToOne
	@JoinColumn(name = "id_marca_fk",
		foreignKey = @ForeignKey(name = "fk_id_marca"),
		referencedColumnName = "id", nullable = false)
	private Marca marca;
	
	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	//	Getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public Integer getQtdPortas() {
		return qtdPortas;
	}

	public void setQtdPortas(Integer qtdPortas) {
		this.qtdPortas = qtdPortas;
	}
	
	
}
