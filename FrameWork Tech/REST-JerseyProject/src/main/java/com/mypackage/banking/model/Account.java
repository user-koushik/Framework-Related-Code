package com.mypackage.banking.model;

import java.util.Map;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="account")
public class Account {
	
	/*@XmlAttribute	*/  	// Not required right now when we need to bind this with object
	
	private int id;
	private String name;
	private String type;
	private boolean avtive;
	
	private Map<Integer , Transaction> transaction;
	
	public Account(){
		
	}
	
	public Account(int id, String name, String type, boolean avtive) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.avtive = avtive;
	}
	
	
	public Map<Integer, Transaction> getTransaction() {
		return transaction;
	}

	public void setTransaction(Map<Integer, Transaction> transaction) {
		this.transaction = transaction;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isAvtive() {
		return avtive;
	}
	public void setAvtive(boolean avtive) {
		this.avtive = avtive;
	}
	
	

}
