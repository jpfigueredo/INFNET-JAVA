package br.edu.infnet.VenturaHr.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.VenturaHr.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	@Query("from User u where u.email = :email and u.password = :password")
	public User authentication(String email, String password);

}