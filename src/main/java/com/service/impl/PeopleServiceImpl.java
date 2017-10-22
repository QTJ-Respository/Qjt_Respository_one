package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.IPeopleDao;
import com.entity.People;
import com.service.IPeopleService;

@Service("peopleService")
@Transactional(propagation=Propagation.REQUIRED)
public class PeopleServiceImpl implements IPeopleService {

	//注入Dao层接口
	@Resource(name="peopleDao")
	private IPeopleDao peopleDao;
	
	//添加人员服务
	@Override
	public boolean addpeople(People p) {
		// TODO Auto-generated method stub
		return peopleDao.addpeople(p);
	}
	//查询人员服务
	@Override
	public List showPeopleList() {
		// TODO Auto-generated method stub
		String hql = "select p,c from People p left join p.code c on p.pno = c.pcno";
		return peopleDao.showPeopleList(hql);
	}


	
	
	public void setPeopleDao(IPeopleDao peopleDao) {
		this.peopleDao = peopleDao;
	}



	
}
