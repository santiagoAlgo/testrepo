package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class BanxicoCode {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long banxicoCodeId;
	
	@OneToMany(mappedBy = "banxicoCode")
	private List<GoodMessage> goodMesssages= new ArrayList<GoodMessage>(); 
	
	
	private String banxicoDescription;

	public long getBanxicoCodeId() {
		return banxicoCodeId;
	}

	public void setBanxicoCodeId(long banxicoCodeId) {
		this.banxicoCodeId = banxicoCodeId;
	}

	public String getBanxicoDescription() {
		return banxicoDescription;
	}

	public void setBanxicoDescription(String banxicoDescription) {
		this.banxicoDescription = banxicoDescription;
	}

	public List<GoodMessage> getGoodMesssages() {
		return goodMesssages;
	}

	public void setGoodMesssages(List<GoodMessage> goodMesssages) {
		this.goodMesssages = goodMesssages;
	}
	
	
	
}
