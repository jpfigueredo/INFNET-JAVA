package model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Jogador;

@Repository
public interface JogadorRepository extends JpaRepository<Jogador, Integer> {

}
