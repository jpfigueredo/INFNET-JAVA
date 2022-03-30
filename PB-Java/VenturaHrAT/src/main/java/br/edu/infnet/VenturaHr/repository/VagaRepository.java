package br.edu.infnet.VenturaHr.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.VenturaHr.model.Vaga;

@Repository
public interface VagaRepository extends CrudRepository<Vaga, Integer> {
	
	List<Vaga> findByIdUsuario (int idUsuario);

	List<Vaga> findByCargoContainingIgnoreCase (String pesquisa);

	List<Vaga> findByCidadeContainingIgnoreCase (String pesquisa);
}