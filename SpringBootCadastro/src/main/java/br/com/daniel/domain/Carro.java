package br.com.daniel.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TB_CARROS")
@Getter
@Setter
@Builder
public class Carro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carro_id")
	@SequenceGenerator(name = "carro_id", sequenceName = "seq_carro_id", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "MODELO", nullable = false)
	private String modelo;
	
	@Column(name = "MOTOR", nullable = false)
	private String motor;
	
	@Column(name = "COR", nullable = false)
	private String cor;
	
	@Column(name = "ANO_FABR", nullable = false)
	private Integer anoFabricacao;
}
