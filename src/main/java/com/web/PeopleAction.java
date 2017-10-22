package com.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.entity.People;
import com.service.IPeopleService;

@Controller("peopleAction")
public class PeopleAction {

	private People p;
	private int mess=0;
	private List peoplelist;
	//注入服务接口
	@Resource(name="peopleService")
	private IPeopleService peopleService;
	
	//添加人员
	public String addPeople(){
		System.out.println(p.getPage()+p.getPhobbys()+p.getPsex()+p.getPintime()+p.getPname()+p.getCode().getPcode());
		if(peopleService.addpeople(p)){
			mess=1;
			System.out.println(p.getPno());
		}else{
			mess=0;
		}
		return null;
	}
	//查询用户获取ID
	
	//查询所有人员
	public String showPropleList(){
		peoplelist = peopleService.showPeopleList();
		return "showpeoplelist";
	}
	public People getP() {
		return p;
	}

	
	public void setP(People p) {
		this.p = p;
	}

	public void setPeopleService(IPeopleService peopleService) {
		this.peopleService = peopleService;
	}

	public int getMess() {
		return mess;
	}

	public void setMess(int mess) {
		this.mess = mess;
	}

	public List getPeoplelist() {
		return peoplelist;
	}

	public void setPeoplelist(List peoplelist) {
		this.peoplelist = peoplelist;
	}

}
