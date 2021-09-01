package br.ufrj.repository;

import br.ufrj.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query(value = "select u from User u "
				 + "where (u.username = :username or u.email = :email) and "
				 +        "u.password = :password")
	public User loginUser(String username, String email, String password);
}
