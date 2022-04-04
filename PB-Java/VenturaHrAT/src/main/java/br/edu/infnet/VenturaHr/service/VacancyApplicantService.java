package br.edu.infnet.VenturaHr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.VenturaHr.model.User;
import br.edu.infnet.VenturaHr.model.VacancyApplicant;
import br.edu.infnet.VenturaHr.repository.VacancyApplicantRepository;

@Service
public class VacancyApplicantService {
	@Autowired
	private VacancyApplicantRepository vacancyApplicantRepository;
	
	public List<VacancyApplicant> getList(User user){
		return (List<VacancyApplicant>) vacancyApplicantRepository.findAll(user.getId());

	}

	public List<VacancyApplicant> getList(){
		return (List<VacancyApplicant>) vacancyApplicantRepository.findAll();
	}
	
	public VacancyApplicant getById(Integer id) {
		return vacancyApplicantRepository.findById(id).orElse(null);
	}

	public VacancyApplicant include(VacancyApplicant vacancyApplicant){
		return vacancyApplicantRepository.save(vacancyApplicant);
	}

	public void delete(Integer id) {
		vacancyApplicantRepository.deleteById(id);
	}
}

