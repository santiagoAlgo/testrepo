package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ErrorMessage")
public class ErrorMessage {

    public ErrorMessage() {
		
	}
    
    public ErrorMessage(int banxicoCode, String banxicoDescription) {
    	this.banxicoCode = banxicoCode;
    	this.banxicoDescription = banxicoDescription;
    }
	 
    
	public ErrorMessage(long errorCode, int banxicoCode, String banxicoDescription) {
		super();
		this.errorCode = errorCode;
		this.banxicoCode = banxicoCode;
		this.banxicoDescription = banxicoDescription;
	}




	@Id
	@Column(name="ErrorCode")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long errorCode;
	
    private int banxicoCode;
    private String banxicoDescription;
    
	public long getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(long errorCode) {
		this.errorCode = errorCode;
	}
	public int getBanxicoCode() {
		return banxicoCode;
	}
	public void setBanxicoCode(int banxicoCode) {
		this.banxicoCode = banxicoCode;
	}
	public String getBanxicoDescription() {
		return banxicoDescription;
	}
	public void setBanxicoDescription(String banxicoDescription) {
		this.banxicoDescription = banxicoDescription;
	}
    
    
	
}
