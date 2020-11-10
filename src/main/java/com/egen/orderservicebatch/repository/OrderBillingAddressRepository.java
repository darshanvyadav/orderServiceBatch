package com.egen.orderservicebatch.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.egen.orderservicebatch.domain.OrderBillingAddress;

@Repository
@Transactional
public interface OrderBillingAddressRepository extends JpaRepository<OrderBillingAddress, Long>{

}
