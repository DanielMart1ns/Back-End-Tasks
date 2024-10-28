package br.com.daniel.ModelosHonda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.daniel.domain.Carro;
import br.com.daniel.repository.ICarrosRepository;

@SpringBootApplication
@Configuration
@EnableJpaRepositories(basePackages = "br.com.daniel.repository")
@EntityScan("br.com.daniel.*")
@ComponentScan(basePackages = "br.com.daniel")
public class ModelosHondaApplication implements CommandLineRunner{
	
	@Autowired
	private ICarrosRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ModelosHondaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Carro carro = createCarro();
		repository.save(carro);
	}
	
	private Carro createCarro() {
		return Carro.builder()
				.modelo("Fit")
				.motor("1.5")
				.cor("Vermelho")
				.anoFabricacao(2012)
				.build();
	}

}
