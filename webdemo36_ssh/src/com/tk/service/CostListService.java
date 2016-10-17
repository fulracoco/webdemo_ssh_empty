package com.tk.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tk.daoInterface.CostDao;
import com.tk.pojo.Cost;



@Service
public class CostListService {
	
	@Resource
	private CostDao costDao; 
	
	public List<Cost> findByPage(final int page, final int pageSize){
		return costDao.findByPage(page, pageSize);
	}
	
	public int findTotalPage(int pageSize){
		return costDao.fintTotalPageSize(pageSize);
	}
}
