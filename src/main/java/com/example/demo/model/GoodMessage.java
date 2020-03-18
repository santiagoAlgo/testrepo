package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class GoodMessage {

	@Id
	@Column(name="good_message_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long goodMessageId;
	
	private String content;
		
	
	private long systemCodeId;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="banxico_code_id")
	private BanxicoCode banxicoCode;

	public long getGoodMessageId() {
		return goodMessageId;
	}

	public void setGoodMessageId(long goodMessageId) {
		this.goodMessageId = goodMessageId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public long getSystemCodeId() {
		return systemCodeId;
	}

	public void setSystemCodeId(long systemCodeId) {
		this.systemCodeId = systemCodeId;
	}

	public BanxicoCode getBanxicoCode() {
		return banxicoCode;
	}

	public void setBanxicoCode(BanxicoCode banxicoCode) {
		this.banxicoCode = banxicoCode;
	} 
	
	
	
	
	
	
	
	
	
}
