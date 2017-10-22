package com.emp.web;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.emp.entity.Depts;
import com.emp.service.IDeptService;
import com.emp.service.IEmpService;
import com.opensymphony.xwork2.ActionContext;

@Controller("deptAction")
@Scope("prototype")
public class DeptAction {

	private Depts dept;
	private int msg;
	
	@Resource(name="deptService")
	private IDeptService deptService;
	@Resource(name="empService")
	private IEmpService empService;
	
	public String addDept() {
		if (deptService.addDept(dept)) {
			msg=1;
		}else {
			msg=2;
		}
		return "addDept";
	}
	
	public String showDeptList() {
		ActionContext.getContext().put("deptList", deptService.findDeptList());
		return "showDeptList";
	}
	
	public String toUpdateDept() {
		dept = deptService.findDeptById(dept.getDno());
		return "toUpdateDept";
	}
	
	public String updateDept() {
		if (deptService.updateDept(dept)) {
			msg=1;
		}else {
			msg=2;
		}
		return "updateDept";
	}
	
	public String deleteDept() {
		if (deptService.deleteDept(dept)) {
			msg=1;
		}else {
			msg=2;
		}
		return "deleteDept";
	}

	public Depts getDept() {
		return dept;
	}

	public void setDept(Depts dept) {
		this.dept = dept;
	}

	public IDeptService getDeptService() {
		return deptService;
	}

	public void setDeptService(IDeptService deptService) {
		this.deptService = deptService;
	}

	public IEmpService getEmpService() {
		return empService;
	}

	public void setEmpService(IEmpService empService) {
		this.empService = empService;
	}

	public int getMsg() {
		return msg;
	}

	public void setMsg(int msg) {
		this.msg = msg;
	}
	
}
