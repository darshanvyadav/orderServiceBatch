package com.egen.orderservicebatch.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.egen.orderservicebatch.domain.OrderDetails;

@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, UUID>, PagingAndSortingRepository<OrderDetails, UUID>{

	public List<OrderDetails> findAllByOrderCustomerId (String customerID); //, Pageable pageable
	
}
