package com.tk.dao;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.tk.daoInterface.CostDao;
import com.tk.pojo.Cost;

/**
 * @author: Leo
 * @date:2016-10-16 下午12:23:49
 * @version :
 * 
 */
@Repository
public class CostDaoImpl extends HibernateDaoSupport
	implements CostDao{
	
	//注入sessionFactory
	@Resource
	public void buildSessionFactory(SessionFactory sessionFactory){
		super.setSessionFactory(sessionFactory);
	}
	
	@Override
	public List<Cost> findAll() {
		String hql = "from Cost";
		return getHibernateTemplate().find(hql);
	}

	@Override
	public void add(Cost cost) {
		getHibernateTemplate().save(cost);
		
	}

	@Override
	public void update(Cost cost) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		Cost cost = new Cost();
		cost.setCost_id(id);
		getHibernateTemplate().delete(cost);
	}

	@Override
	public List<Cost> findByPage(final int page, final int pageSize) {
		
		return getHibernateTemplate().
			executeFind(new HibernateCallback() {

				@Override
				public Object doInHibernate(Session session)
						throws HibernateException, SQLException {
					String hql = "from Cost";
					Query query = session.createQuery(hql);
					query.setFirstResult((page-1)*pageSize);
					query.setMaxResults(pageSize);
					return query.list();
				}
			
		});
	}

	@Override
	public int fintTotalPageSize(int pageSize) {
		String hql = "select count(*) from Cost";
		List list = getHibernateTemplate().find(hql);
		int rows = Integer.valueOf(list.get(0).toString());
		if(rows%pageSize == 0){
			return rows/pageSize ;
		}else {
			
			return rows/pageSize + 1;
		}
	}
	
	
	
	
	
}
