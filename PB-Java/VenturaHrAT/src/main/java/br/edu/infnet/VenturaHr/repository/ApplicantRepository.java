package br.edu.infnet.VenturaHr.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.VenturaHr.model.Applicant;


@Repository
public interface ApplicantRepository extends CrudRepository<Applicant, Integer> {

	@Query("from Applicant a where a.user.id = :idUser")
	public List<Applicant> getList(Integer idUser, Sort sort);
}