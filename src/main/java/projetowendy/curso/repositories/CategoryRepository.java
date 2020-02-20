package projetowendy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projetowendy.curso.entities.Category;

public interface CategoryRepository extends  JpaRepository<Category, Long>  {

	
}
