package br.edu.infnet.VenturaHr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.VenturaHr.model.Applicant;
import br.edu.infnet.VenturaHr.model.User;
import br.edu.infnet.VenturaHr.repository.ApplicantRepository;

@Service
public class ApplicantService {
	
	@Autowired
	private ApplicantRepository applicantRepository;

	public List<Applicant> getList(User user){
		return applicantRepository.getList(user.getId(),  Sort.by(Sort.Direction.ASC, "name"));
	}

	public List<Applicant> getList(){
		return (List<Applicant>) applicantRepository.findAll();
	}

	public Applicant getById(Integer id) {
		return applicantRepository.findById(id).orElse(null);
	}

	public Applicant add(Applicant applicant){
		return applicantRepository.save(applicant);
	}

	public void delete(Integer id) {
		applicantRepository.deleteById(id);
	}
}