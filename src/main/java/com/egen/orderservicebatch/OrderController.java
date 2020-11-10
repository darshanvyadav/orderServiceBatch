package com.egen.orderservicebatch;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.egen.orderservicebatch.domain.OrderDetails;
import com.egen.orderservicebatch.dto.OrderRequest;
import com.egen.orderservicebatch.producer.KafkaProducerService;
import com.fasterxml.jackson.databind.JsonDeserializer;

@CrossOrigin()
@RestController()
public class OrderController {

    @Autowired
	KafkaProducerService KafkaProducerService;

	@PostMapping("/create")
	public void createOrder(@RequestBody OrderRequest orderRequest) {
		KafkaProducerService.sendMessage("OrderTopic", orderRequest);
		
	}


	
	

}
