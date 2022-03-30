package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Mago;
import model.repository.MagoRepository;

@Service
public class MagoService {

	@Autowired
	MagoRepository magoRepository;
	
	public Object obterLista() {
		return magoRepository.findAll();
	}

	public Mago obterPorId(Integer id) {
		return magoRepository.findById(id).orElse(null);
	}

	public void excluir(Integer id) {
		magoRepository.deleteById(id);;
	}

}
