package br.edu.infnet.VenturaHr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.VenturaHr.model.User;
import br.edu.infnet.VenturaHr.model.Vacancy;
import br.edu.infnet.VenturaHr.repository.VacancyRepository;

@Service
public class VacancyService {

	@Autowired
	private VacancyRepository vacancyRepository;

	public List<Vacancy> getList(User user) {
		return vacancyRepository.findAll(user.getId());
	}

	public List<Vacancy> getList() {
		return vacancyRepository.findAll();
	}

	public Vacancy getById(Integer id) {
		return vacancyRepository.findById(id).orElse(null);
	}

	public void add(Vacancy vacancy) {
		vacancyRepository.save(vacancy);
	}

	public Vacancy addAndReturn(Vacancy vacancy) {
		return vacancyRepository.save(vacancy);
	}

	public void delete(Integer id) {
		vacancyRepository.deleteById(id);
	}

}
