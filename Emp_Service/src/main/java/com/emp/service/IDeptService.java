package com.emp.service;

import java.util.List;

import com.emp.entity.Depts;

public interface IDeptService {

	/**
	 * 根据hql语句查询部门信息
	 * @param hql 要执行的语句
	 * @return 查询信息
	 */
	public List<?> findDeptList();
	
	/**
	 * 根据指定id查找部门信息
	 * @param id 指定部门id
	 * @return 查询信息
	 */
	public Depts findDeptById(int id);
	
	/**
	 * 添加部门
	 * @param dept 部门信息
	 * @return 添加结果
	 */
	public boolean addDept(Depts dept);
	
	/**
	 * 修改部门
	 * @param dept 部门信息
	 * @return 修改结果
	 */
	public boolean updateDept(Depts dept);
	
	/**
	 * 删除部门
	 * @param dept 部门信息
	 * @return 删除结果
	 */
	public boolean deleteDept(Depts dept);
}
