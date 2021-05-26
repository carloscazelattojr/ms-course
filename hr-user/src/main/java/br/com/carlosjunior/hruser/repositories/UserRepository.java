package br.com.carlosjunior.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.carlosjunior.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
}
