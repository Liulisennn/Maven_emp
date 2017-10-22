package com.emp.service;

import java.util.List;

import com.emp.entity.Emps;

public interface IEmpService {
	
	/**
	 * 根据hql语句查询员工信息
	 * @param hql 要执行的语句
	 * @return 查询信息
	 */
	public List<?> findEmpList();
	
	/**
	 * 根据指定id查找emp信息
	 * @param id 指定empid
	 * @return 查询信息
	 */
	public Emps findEmpById(int id);
	
	/**
	 * 添加emp
	 * @param emp emp信息
	 * @return 添加结果
	 */
	public boolean addEmp(Emps emp);
	
	/**
	 * 修改emp
	 * @param emp emp信息
	 * @return 修改结果
	 */
	public boolean updateEmp(Emps emp);
	
	/**
	 * 删除emp
	 * @param emp emp信息
	 * @return 删除结果
	 */
	public boolean deleteEmp(Emps emp);
}
