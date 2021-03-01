package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter @Setter
@Entity
@Table(name="Person")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="location")
	private String location;
	@Column(name="birth_year")
	private String birth_year;
	public Person(String name, String location, String birth_year) {
		super();
		this.name = name;
		this.location = location;
		this.birth_year = birth_year;
	}
	
	
	
	
	
}
