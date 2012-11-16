package com.model;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.*;


/**
 * The persistent class for the friend database table.
 * 
 */
@Entity
@Named
@RequestScoped
public class Friend implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String name;

	private String password;

    public Friend() {
    }

    public Friend(String name,String password){
    	this.name=name;
    	this.password=password;
    }
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}