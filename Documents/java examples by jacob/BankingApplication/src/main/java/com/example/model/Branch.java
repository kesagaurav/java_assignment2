package com.example.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name="Branch")
public class Branch {

	@Id
    @Column(name = "branch_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int BranchId;
	
	@Column(name="branch_name")
	private String branchName;
	
	@OneToMany(mappedBy="bHolder", fetch=FetchType.LAZY)
	private List<Account> account = new ArrayList<>();

	public Branch(String branchName) {
		super();
		this.branchName = branchName;
	}

	
	
}
