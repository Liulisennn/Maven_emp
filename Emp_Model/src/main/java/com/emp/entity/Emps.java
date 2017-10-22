package com.emp.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_emp")
public class Emps implements Serializable{

	private int eno;
	private String ename;
	private String esex;
	
	private Depts dept;
	
	public Emps() {
		super();
	}
	public Emps(int eno, String ename, String esex) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.esex = esex;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEsex() {
		return esex;
	}
	public void setEsex(String esex) {
		this.esex = esex;
	}
	
	@ManyToOne
	@JoinColumn(name="edno")
	public Depts getDept() {
		return dept;
	}
	public void setDept(Depts dept) {
		this.dept = dept;
	}
}
