package br.edu.infnet.EmpresaACME.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.EmpresaACME.model.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Integer>{

}
