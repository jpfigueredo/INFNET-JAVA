package br.edu.infnet.VenturaHr.repository;

import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.VenturaHr.model.VacancyApplicant;


@Repository
public interface VacancyApplicantRepository extends CrudRepository<VacancyApplicant, Integer> {

	@Query("from VacancyApplicant v where v.user.id = :idUser")
	Collection<VacancyApplicant> findAll(Integer idUser);
	
	Collection<VacancyApplicant> findAll(Sort by);
}


