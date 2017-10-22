package com.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dao.IPeopleDao;
import com.entity.People;
import com.entity.PeopleCode;
@Repository("peopleDao")
public class PeopleDaoImpl extends BaseDao implements IPeopleDao {

	//实现添加人员的接口
	@Override
	public boolean addpeople(People p) {
		// TODO Auto-generated method stub
		try {
			getsession().save(p);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	
	//实现查询所有人员的信息
	@Override
	public List showPeopleList(String hql) {
		// TODO Auto-generated method stub
		return getsession().createQuery(hql).list();
	}
	

}
