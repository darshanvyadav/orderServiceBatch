package com.egen.orderservicebatch.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.egen.orderservicebatch.domain.OrderPaymnetTransaction;

@Repository
public interface OrderPaymnetTransactionRepository extends JpaRepository<OrderPaymnetTransaction, UUID>{

}
