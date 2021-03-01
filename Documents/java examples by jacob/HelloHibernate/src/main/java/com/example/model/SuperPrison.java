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

@Entity
@Table(name="Super_Prison")
public class SuperPrison {

	
		@Id
		@Column(name="spid")
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int spid;
		
		@Column(name="sp_name")
		private String name;
		
		@Column(name="sp_location")
		private String splocation;
		
		@OneToMany(mappedBy="spHolder",fetch=FetchType.LAZY)
		private List<SuperVillian> villList=new ArrayList<>();

		public SuperPrison() {
			super();
		}

		public SuperPrison(String name, String splocation) {
			super();
			this.name = name;
			this.splocation = splocation;
			
		}

		public SuperPrison(int spid, String name, String splocation, List<SuperVillian> villList) {
			super();
			this.spid = spid;
			this.name = name;
			this.splocation = splocation;
			this.villList = villList;
		}

		public int getSpid() {
			return spid;
		}

		public void setSpid(int spid) {
			this.spid = spid;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSplocation() {
			return splocation;
		}

		public void setSplocation(String splocation) {
			this.splocation = splocation;
		}

		public List<SuperVillian> getVillList() {
			return villList;
		}

		public void setVillList(List<SuperVillian> villList) {
			this.villList = villList;
		}

		@Override
		public String toString() {
			return "SuperPrison [spid=" + spid + ", name=" + name + ", splocation=" + splocation + ", villList="
					+ villList + "]";
		}
		
		
		
		
		
		
	
}
