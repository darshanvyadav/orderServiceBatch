package com.egen.orderservicebatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.egen.orderservicebatch.domain.OrderShippingAddress;

@Repository
public interface OrderShippingAddressRepository extends JpaRepository<OrderShippingAddress, Long>{

}
