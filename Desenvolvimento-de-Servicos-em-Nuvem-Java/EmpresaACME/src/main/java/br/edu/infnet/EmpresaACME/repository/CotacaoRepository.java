package br.edu.infnet.EmpresaACME.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.EmpresaACME.model.Cotacao;

@Repository
public interface CotacaoRepository extends JpaRepository<Cotacao, Integer>{

}
