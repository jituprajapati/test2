package com.jit.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="AddrsTab")
public class Address {
	
	private Integer aid;
	private String loc;
	private String Pin_code;
	
	
	

}
