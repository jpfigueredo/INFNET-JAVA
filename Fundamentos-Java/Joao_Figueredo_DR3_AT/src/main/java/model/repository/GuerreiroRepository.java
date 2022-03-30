package model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Guerreiro;

@Repository
public interface GuerreiroRepository extends JpaRepository<Guerreiro, Integer> {

}