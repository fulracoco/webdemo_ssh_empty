package com.tk.daoInterface;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tk.pojo.Cost;

/**
 * @author: Leo
 * @date:2016-10-16 下午12:20:43
 * @version :
 * 
 */
@Repository
public interface CostDao {
	public List<Cost> findAll();
	public void add(Cost cost);
	public void update(Cost cost);
	public void delete(int id);
	public List<Cost> findByPage(int page,int pageSize);
	public int fintTotalPageSize(int pageSize);
}
