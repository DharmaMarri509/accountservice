package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Account {

	@Id
	private Integer id;
	private String accName;
	private String accDesc;
	
	public Account() {
		
	}
	
	public Account(Integer id, String accName, String accDesc) {
		super();
		this.id = id;
		this.accName = accName;
		this.accDesc = accDesc;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getAccDesc() {
		return accDesc;
	}
	public void setAccDesc(String accDesc) {
		this.accDesc = accDesc;
	}
	
	
}
