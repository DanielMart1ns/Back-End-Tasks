package br.com.daniel.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.daniel.domain.Carro;

@Repository
public interface ICarrosRepository extends CrudRepository<Carro, Long>{

}
