package com.emp.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.emp.dao.BaseDao;
import com.emp.dao.IEmpDao;
import com.emp.entity.Emps;

@Repository("empDao")
public class EmpDaoImpl extends BaseDao implements IEmpDao {

	@Override
	public List<?> findEmpList(String hql) {
		return getSession().createQuery(hql).list();
	}

	@Override
	public Emps findEmpById(int id) {
		return getSession().find(Emps.class, id);
	}

	@Override
	public boolean addEmp(Emps emp) {
		try {
			getSession().save(emp);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateEmp(Emps emp) {
		try {
			getSession().update(emp);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteEmp(Emps emp) {
		try {
			getSession().delete(emp);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
