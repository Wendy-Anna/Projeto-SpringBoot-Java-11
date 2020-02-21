package projetowendy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projetowendy.curso.entities.OrderItem;

public interface OrderItemRepository extends  JpaRepository<OrderItem, Long>  {

	
}
