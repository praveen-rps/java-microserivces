package com.example.orderservice.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="ordersmicroservice")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long oid;
	
	String details;
	
	Long cid;
	
	

}
