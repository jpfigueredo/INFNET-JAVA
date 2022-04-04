package br.edu.infnet.VenturaHr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.VenturaHr.model.Vacancy;

@Repository
public interface VacancyRepository extends CrudRepository<Vacancy, Integer> {

	@Query("from Vacancy v where v.user.id = :idUser")
	List<Vacancy> findAll(Integer idUser);

	List<Vacancy> findAll();

	List<Vacancy> findByRoleContainingIgnoreCase(String search);

	List<Vacancy> findByCityContainingIgnoreCase(String search);
}