package com.emp.web;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.emp.entity.Emps;
import com.emp.service.IDeptService;
import com.emp.service.IEmpService;
import com.opensymphony.xwork2.ActionContext;

@Controller("empAction")
@Scope("prototype")
public class EmpAction {
	
	private Emps emp;
	private int msg;
	
	@Resource(name="deptService")
	private IDeptService deptService;
	@Resource(name="empService")
	private IEmpService empService;
	
	public String toAddEmp() {
		ActionContext.getContext().put("deptList", deptService.findDeptList());
		return "toAddEmp";
	}
	
	public String addEmp() {
		if(empService.addEmp(emp)) {
			msg=1;
		}else {
			msg=2;
		}
		return "addEmp";
	}
	
	public String showEmpList() {
		ActionContext.getContext().put("empList", empService.findEmpList());
		return "showEmpList";
	}
	
	public String toUpdateEmp() {
		emp = empService.findEmpById(emp.getEno());
		ActionContext.getContext().put("deptList", deptService.findDeptList());
		return "toUpdateEmp";
	}
	
	public String updateEmp() {
		if(empService.updateEmp(emp)) {
			msg=1;
		}else {
			msg=2;
		}
		return "updateEmp";
	}
	
	public String deleteEmp() {
		if(empService.deleteEmp(emp)) {
			msg=1;
		}else {
			msg=2;
		}
		return "deleteEmp";
	}
	
	public Emps getEmp() {
		return emp;
	}
	public void setEmp(Emps emp) {
		this.emp = emp;
	}
	public int getMsg() {
		return msg;
	}
	public void setMsg(int msg) {
		this.msg = msg;
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
}
