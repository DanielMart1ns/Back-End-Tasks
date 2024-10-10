package br.com.daniel.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "TB_ACESSORIOS")
public class Acessorio {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acessorio_seq")
	@SequenceGenerator(name = "acessorio_seq", sequenceName = "sq_acessorio_id", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "NOME", nullable = false)
	private String nome;
	
	@ManyToMany(mappedBy = "acessorio")
	private List<Carro> carro;
	
//	Constructor
	public Acessorio() {
		this.carro = new ArrayList<Carro>();
	}

	public Long getId() {
		return id;
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

	public List<Carro> getCarro() {
		return carro;
	}

	public void setCarro(List<Carro> carro) {
		this.carro = carro;
	}
}
