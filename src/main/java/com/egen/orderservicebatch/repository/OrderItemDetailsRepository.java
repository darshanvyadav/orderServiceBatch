package com.egen.orderservicebatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.egen.orderservicebatch.domain.OrderItemDetails;

@Repository
public interface OrderItemDetailsRepository extends JpaRepository<OrderItemDetails, Long>{

}
