package com.emp.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.emp.dao.BaseDao;
import com.emp.dao.IDeptDao;
import com.emp.entity.Depts;

@Repository("deptDao")
public class DeptDaoImpl extends BaseDao implements IDeptDao {

	@Override
	public List<?> findDeptList(String hql) {
		return getSession().createQuery(hql).list();
	}

	@Override
	public Depts findDeptById(int id) {
		return getSession().find(Depts.class, id);
	}

	@Override
	public boolean addDept(Depts dept) {
		try {
			getSession().save(dept);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateDept(Depts dept) {
		try {
			getSession().update(dept);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteDept(Depts dept) {
		try {
			getSession().delete(dept);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
