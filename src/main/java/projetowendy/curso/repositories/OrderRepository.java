package projetowendy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projetowendy.curso.entities.Order;

public interface OrderRepository extends  JpaRepository<Order, Long>  {

	
}
