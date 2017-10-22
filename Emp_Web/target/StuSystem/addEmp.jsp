<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>添加员工</h2>
	<s:if test="#parameters.msg[0]==1">
		<span style="color:green">添加成功</span>
	</s:if>
	<s:elseif test="#parameters.msg[0]==2">
		<span style="color:red">添加失败</span>
	</s:elseif>
	<s:form action="empAction_addEmp" method="post">
		员工姓名:<s:textfield name="emp.ename"/><br/>
		员工性别:<s:textfield name="emp.esex"/><br/>
		所属部门:<s:select list="#request.deptList==null?'':#request.deptList" headerKey="" headerValue="请选择部门" listKey="dno" listValue="dname" name="emp.dept.dno"/>
		       <s:submit value="添加"/>
	</s:form>
	
	<a href="index.jsp">返回首页</a>
</body>
</html>