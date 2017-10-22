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
	<h2>显示部门</h2>
	<s:if test="#parameters.msg[0]==1">
		<span style="color:green">删除成功</span>
	</s:if>
	<s:elseif test="#parameters.msg[0]==2">
		<span style="color:red">删除失败</span>
	</s:elseif>
	<table border="1" width="500">
		<tr>
			<td>编号</td>
			<td>部门名称</td>
			<td>管理</td>
		</tr>
		<s:iterator var="dept" value="#request.deptList" status="ids">
		<tr>
			<td>${ids.count }</td>
			<td>${dept.dname }</td>
			<td>
				<a href="deptAction_toUpdateDept?dept.dno=${dept.dno }">修改</a> | 
				<a href="deptAction_deleteDept?dept.dno=${dept.dno }">删除</a>
			</td>
		</tr>
		</s:iterator>
	</table>
	
	<a href="${pageContext.request.contextPath }/index.jsp">返回主页</a>
</body>
</html>