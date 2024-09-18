package com.example.demo.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;

@Document(collection = "transactions")
public class Transaction {
    @Id
    private String id;
    private String type; // credit or debit
    private Double amount;
    private String currency;
    private String description;
    private LocalDate date;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Transaction(String id, String type, Double amount, String currency, String description, LocalDate date) {
		super();
		this.id = id;
		this.type = type;
		this.amount = amount;
		this.currency = currency;
		this.description = description;
		this.date = date;
	}
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	
    // Getters and Setters
    // Constructors
    
}
