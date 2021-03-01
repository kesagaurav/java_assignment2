package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name="Transaction")

public class Transaction {
	@Id
	@Column(name="transaction_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int transactionId;
	
	
	@Column(name="description")
	private String description;
	
	@Column(name="Transaction_date_time")
	private java.sql.Timestamp  TransactionDateTime;
	
	@Column(name="debit_amount")
	private int debitAmount;
	
	@Column(name="credit_amount")
	private int creditAmount;
	
//	@ManyToOne
//	@JoinColumn(name="transaction_FK")
//	private Account accHolder;

}
