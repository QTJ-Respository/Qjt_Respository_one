package com.service;

import java.util.List;

import com.entity.People;

public interface IPeopleService {
	
	//添加人员的接口
	public boolean addpeople(People p);
	//查询所有人员信息
	public List showPeopleList();
}
