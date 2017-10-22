package com.emp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.emp.dao.IDeptDao;
import com.emp.entity.Depts;
import com.emp.service.IDeptService;

@Service("deptService")
@Transactional(propagation=Propagation.REQUIRED)
public class DeptServiceImpl implements IDeptService {

	@Resource(name="deptDao")
	private IDeptDao deptDao;
	
	@Override
	public List<?> findDeptList() {
		return deptDao.findDeptList("from Depts");
	}

	@Override
	public Depts findDeptById(int id) {
		return deptDao.findDeptById(id);
	}

	@Override
	public boolean addDept(Depts dept) {
		return deptDao.addDept(dept);
	}

	@Override
	public boolean updateDept(Depts dept) {
		return deptDao.updateDept(dept);
	}

	@Override
	public boolean deleteDept(Depts dept) {
		return deptDao.deleteDept(dept);
	}

	public void setDeptDao(IDeptDao deptDao) {
		this.deptDao = deptDao;
	}

}
