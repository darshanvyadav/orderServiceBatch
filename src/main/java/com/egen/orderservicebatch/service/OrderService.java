package com.egen.orderservicebatch.service;

import java.util.List;
import java.util.UUID;

import com.egen.orderservicebatch.domain.OrderDetails;
import com.egen.orderservicebatch.dto.OrderRequest;

public interface OrderService {
	
	public OrderDetails createOrder(OrderRequest createorder);
	
	public OrderDetails getOrderByID(UUID orderID);
	
	public List<OrderDetails> getOrdersByCustomerID(String customerId);

}
