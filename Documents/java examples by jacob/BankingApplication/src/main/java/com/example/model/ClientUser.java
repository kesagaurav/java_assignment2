package com.example.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity 
@Table(name="Client_User")
public class ClientUser {
	

	@Id
	@Column(name="client_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int clientId;

	@Column(name="username", nullable=false, unique=true)
	private String username;
	
	@Column(name="first_name", nullable=false)
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="address")
	private String address;
	
	@Column(name="age")
	private int age;
	
	@Column(name="email_address")
	private String emailAddress;
	
	@Column(name="contact_Number")
	private String contactNumber;

	
    @Lob
    @Column(name = "photo", columnDefinition="BLOB")
    private byte[] photo;

	
	
	@OneToMany(mappedBy="cHolder", fetch=FetchType.EAGER)
	private List<Account> account=new ArrayList();



	public ClientUser(String username, String firstName, String lastName, String address, int age, String emailAddress,
			String contactNumber, byte[] photo, List<Account> account) {
		super();
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.age = age;
		this.emailAddress = emailAddress;
		this.contactNumber = contactNumber;
		this.photo = photo;
		this.account = account;
	}
	
	

}
