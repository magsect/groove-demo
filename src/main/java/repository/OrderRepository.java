package repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.persistence.criteria.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}