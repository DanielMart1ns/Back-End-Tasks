package br.com.daniel;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.daniel.dao.CarroDAO;
import br.com.daniel.dao.ICarroDAO;
import br.com.daniel.dao.IMarcaDAO;
import br.com.daniel.dao.MarcaDAO;
import br.com.daniel.domain.Carro;
import br.com.daniel.domain.Marca;

public class CarroTeste {
	
	private IMarcaDAO marcaDAO;
	private ICarroDAO carroDAO;
	
	private Marca marca1;
	private Marca marca2;
	
	private int count = 1;
	
	public CarroTeste() {
		marcaDAO = new MarcaDAO();
		carroDAO = new CarroDAO();
		
		marca1 = definirMarca();
		marca2 = definirMarca();
		count = 1;
	}
	
	@Test
	public void cadastrar() {
		Carro carro1 = definirCarro();
		Carro carro2 = definirCarro();
		Carro carro3 = definirCarro();
		
		assertNotNull(carro1);
		assertNotNull(carro1.getId());
		
		assertNotNull(carro2);
		assertNotNull(carro2.getId());
		
		assertNotNull(carro3);
		assertNotNull(carro3.getId());
	}

	private Carro definirCarro() {
		Carro carro = new Carro();

		if(count <= 2) {
			if(count == 1) {
				carro.setModelo("Civic");
				carro.setAnoFabricacao(2021);
				carro.setQtdPortas(4);
				carro.setMarca(marca1);   
				count++;
				return carro = carroDAO.cadastrar(carro);
			} 
			else if(count == 2) {
				carro.setModelo("WR-V");
				carro.setAnoFabricacao(2019);
				carro.setQtdPortas(4);
				carro.setMarca(marca1);   
				count++;
				return carro = carroDAO.cadastrar(carro);
			}
		}
		
		carro.setModelo("Fusca");
		carro.setAnoFabricacao(1938);
		carro.setQtdPortas(2);
		carro.setMarca(marca2);   
		return carro = carroDAO.cadastrar(carro);
	}

	public Marca definirMarca() {
		Marca marca = new Marca();
		if(count == 1) {
			marca.setNome("Honda");
			marca.setPaisDeOrigem("Japão");
			count++;
			return marcaDAO.cadastrar(marca);
		}
		
		marca.setNome("Volkswagen");
		marca.setPaisDeOrigem("Alemanha");
		return marcaDAO.cadastrar(marca);
		
	}
}
