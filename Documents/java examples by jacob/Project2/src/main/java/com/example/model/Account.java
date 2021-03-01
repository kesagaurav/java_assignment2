package com.example.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
//@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="Account")
public class Account {
	
	@Id
    @Column(name = "account_number")
    private String accountNumber;
	
	@Column(name="balance")
	private Double balance;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="client_fk")
	private ClientUser cHolder;

	public Account(String accountNumber, Double balance, ClientUser cHolder) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.cHolder = cHolder;
	}

//	@ManyToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name="type_fk")
//	private AccountType tHolder;
//	
//	@ManyToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name="branch_fk")
//	private Branch bHolder;
//	
//	@OneToMany(mappedBy="accHolder", fetch=FetchType.LAZY)
//	private List<Transaction> transList = new ArrayList<>();

	
	

}
