package com.egen.orderservicebatch.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.egen.orderservicebatch.dto.OrderRequest;
import com.egen.orderservicebatch.service.OrderService;

@Service
public class KafkaConsumerService {
	
   @Autowired
   OrderService OrderService;


  @KafkaListener(topics = "OrderTopic", groupId = "OrderGroupID")	
  public void listen(OrderRequest message) {
	  OrderService.createOrder(message);
  }
	
	
}
