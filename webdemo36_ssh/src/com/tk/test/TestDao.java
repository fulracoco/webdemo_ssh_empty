package com.tk.test;


import java.util.List;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tk.dao.CostDaoImpl;
import com.tk.daoInterface.CostDao;
import com.tk.pojo.Cost;

/**
 * @author: Leo
 * @date:2016-10-16 下午1:18:10
 * @version :
 * 
 */
public class TestDao {
	
	@Test
	public void test1(){
		 ApplicationContext ctx = new ClassPathXmlApplicationContext(
					"applicationContext.xml");
		 CostDao dao = (CostDao) ctx.getBean("costDaoImpl");
		 List<Cost> list   = dao.findAll();
		 for(Cost c : list){
			 System.out.println(c.getName());
		 }
	}

	
	@Test
	public void test2(){
		 ApplicationContext ctx = new ClassPathXmlApplicationContext(
					"applicationContext.xml");
		 Cost cost = (Cost) ctx.getBean("cost");
		 
	
			 System.out.println(cost.getClass().getName());

	}
	public static void main(String[] args){
		new TestDao().test2();
	}
	
	@Test
	public void test3(){
		 ApplicationContext ctx = new ClassPathXmlApplicationContext(
					"applicationContext.xml");
		 CostDao dao = (CostDao) ctx.getBean("costDaoImpl");
		 List<Cost> list   = dao.findByPage(2, 3);
		 for(Cost c : list){
			 System.out.println(c.getName());
		 }
	}
}
