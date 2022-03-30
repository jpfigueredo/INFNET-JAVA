package model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Arqueiro;

@Repository
public interface ArqueiroRepository  extends JpaRepository<Arqueiro, Integer> {

}
