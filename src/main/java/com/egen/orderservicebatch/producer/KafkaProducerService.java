package com.egen.orderservicebatch.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import com.egen.orderservicebatch.dto.OrderRequest;

@Service
public class KafkaProducerService {

	@Autowired
	private KafkaTemplate<String,OrderRequest> kafkaTemplate;
	
	public void sendMessage(String topic, OrderRequest message) {
		/*
		 * The send API returns a ListenableFuture object. If we want to block the
		 * sending thread and get the result about the sent message, we can call the get
		 * API of the ListenableFuture object. The thread will wait for the result, but
		 * it will slow down the producer.
		 */	
		ListenableFuture<SendResult<String, OrderRequest>> sendResult = kafkaTemplate.send(topic, message);
		/*
		 * Kafka is a fast stream processing platform. So it’s a better idea to handle
		 * the results asynchronously so that the subsequent messages do not wait for
		 * the result of the previous message. We can do this through a callback:
		 */
		sendResult.addCallback(new ListenableFutureCallback<SendResult<String, OrderRequest>>() {

			@Override
			public void onSuccess(SendResult<String, OrderRequest> result) {
				System.out.println("SentMessage: " + message + "Offset: " + result.getRecordMetadata().offset());
				
			}

			@Override
			public void onFailure(Throwable ex) {
				System.out.println("Message sending failed: " + message + " Dure to : " + ex.getMessage());
			}
					
		});
		
		
	}
	
}
