package com.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="person_code")
public class PeopleCode implements Serializable {
	
	private int pcno;
	private String pcode;
	
	//每张身份证对应一个人
	private People people;
	
	public PeopleCode() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PeopleCode(int pcno, String pcode) {
		super();
		this.pcno = pcno;
		this.pcode = pcode;
	}
	@Id
	@GeneratedValue(generator="fk")
	@GenericGenerator(name="fk",strategy="foreign",parameters={
			@Parameter(name="property",value="people")
	})
	public int getPcno() {
		return pcno;
	}
	public void setPcno(int pcno) {
		this.pcno = pcno;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public void setPeople(People people) {
		this.people = people;
	}
	@OneToOne(cascade=CascadeType.REFRESH,fetch=FetchType.EAGER)
	@JoinColumn(name="pcno")
	public People getPeople() {
		return people;
	}
	
}
