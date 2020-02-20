package projetowendy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projetowendy.curso.entities.Product;

public interface ProductRepository extends  JpaRepository<Product, Long>  {

	
}
