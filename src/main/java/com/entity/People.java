package com.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="people")
public class People implements Serializable {

	private int pno;
	private String pname;
	private int page;
	private int psex;
	private String phobbys;
	private Date pintime;
	
	//一个人对应一张身份证
	private PeopleCode code;
	
	public People() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public People(int pno, String pname, int page, int psex, String phobbys,
			Date pintime, PeopleCode code) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.page = page;
		this.psex = psex;
		this.phobbys = phobbys;
		this.pintime = pintime;
		this.code = code;
	}
	@Column(columnDefinition="date")
	public Date getPintime() {
		return pintime;
	}

	public void setPintime(Date pintime) {
		this.pintime = pintime;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPsex() {
		return psex;
	}
	public void setPsex(int psex) {
		this.psex = psex;
	}
	public String getPhobbys() {
		return phobbys;
	}
	public void setPhobbys(String phobbys) {
		this.phobbys = phobbys;
	}
	public void setCode(PeopleCode code) {
		this.code = code;
	}
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER,mappedBy="people")
	public PeopleCode getCode() {
		return code;
	}
	
}
