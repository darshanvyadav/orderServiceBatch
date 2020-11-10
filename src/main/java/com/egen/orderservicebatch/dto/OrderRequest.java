package com.egen.orderservicebatch.dto;

import java.util.List;
import java.util.Set;
import java.util.UUID;

import com.egen.orderservicebatch.domain.OrderBillingAddress;
import com.egen.orderservicebatch.domain.OrderItemDetails;
import com.egen.orderservicebatch.domain.OrderPaymentDetails;
import com.egen.orderservicebatch.domain.OrderPaymnetTransaction;
import com.egen.orderservicebatch.domain.OrderShippingAddress;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequest {
	
	private UUID orderId;
	
	private String orderStatus;
	
	private String orderCustomerId;
	
	private List<OrderItemDetails> items;
	
	private String shippingMethod;	 
	
	private OrderPaymentDetails orderPaymentDetails;
	
	private OrderShippingAddress orderShippingAddress;
	
	private OrderBillingAddress orderBillingAddress;
	
	private Set<OrderPaymnetTransaction> orderPaymnetTransaction ;
	
	@Override
	public String toString() {
	      ObjectMapper mapper = new ObjectMapper();
	      try {
			return mapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			return "error converting object in to string";
		}
	}

}