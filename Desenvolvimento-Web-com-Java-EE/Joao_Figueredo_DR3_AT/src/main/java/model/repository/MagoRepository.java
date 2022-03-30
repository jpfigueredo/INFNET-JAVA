package model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Mago;

@Repository
public interface MagoRepository extends JpaRepository<Mago, Integer> {

}
