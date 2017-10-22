package com.emp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.emp.dao.IEmpDao;
import com.emp.entity.Emps;
import com.emp.service.IEmpService;

@Service("empService")
@Transactional(propagation=Propagation.REQUIRED)
public class EmpServiceImpl implements IEmpService {

	@Resource(name="empDao")
	private IEmpDao empDao;
	
	@Override
	public List<?> findEmpList() {
		return empDao.findEmpList("from Emps e inner join e.dept");
	}

	@Override
	public Emps findEmpById(int id) {
		return empDao.findEmpById(id);
	}

	@Override
	public boolean addEmp(Emps emp) {
		return empDao.addEmp(emp);
	}

	@Override
	public boolean updateEmp(Emps emp) {
		return empDao.updateEmp(emp);
	}

	@Override
	public boolean deleteEmp(Emps emp) {
		return empDao.deleteEmp(emp);
	}

	public void setEmpDao(IEmpDao empDao) {
		this.empDao = empDao;
	}

}
