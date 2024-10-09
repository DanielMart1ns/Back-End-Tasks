package br.com.daniel.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "TB_MARCA")
public class Marca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "marca_seq")
	@SequenceGenerator(name = "marca_seq", sequenceName = "sq_marca_id", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "NOME_MARCA", nullable = false)
	private String nome;
	
	@Column(name = "PAIS_DE_ORIGEM", nullable = false)
	private String paisDeOrigem;
	
	@OneToMany(mappedBy = "marca", cascade = CascadeType.ALL)
	private List<Carro> carros;
	
	public Long getId() {
		return id;
	}

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPaisDeOrigem() {
		return paisDeOrigem;
	}

	public void setPaisDeOrigem(String paisDeOrigem) {
		this.paisDeOrigem = paisDeOrigem;
	}
	
	
}
