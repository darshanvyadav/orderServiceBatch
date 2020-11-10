package com.egen.orderservicebatch.domain;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "OrderShippingAddress")
public class OrderShippingAddress {

	@Id
	@GeneratedValue
	@JsonIgnore
	private UUID ShippingAddressId;
	
	private String ShippingAddressName;
	
	private String shippingAddressLine1;
	
	private String shippingAddressLine2;
	
	private String shippingCity;
	
	private String shippingState;
	
	private Integer shippingZip;
	
	@CreationTimestamp
	@JsonIgnore
	private LocalDateTime createTime;
	
	@UpdateTimestamp
	@JsonIgnore
	private LocalDateTime updatedTime;
	
	@JsonIgnore
	private String createdBy = "java application";
	
	@JsonIgnore
	private String modifiedBy = "java application";
	
	/*
	 * @OneToMany(mappedBy = "orderShippingAddress") private List<OrderDetails>
	 * orderDetails ;
	 */
	

}
