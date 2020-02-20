package projetowendy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projetowendy.curso.entities.User;

public interface UserRepository extends  JpaRepository<User, Long>  {

	
}
