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
<h2>添加人员</h2>
<s:if test="#parameters.mess[0]==1">
	<p style="color:green">添加人员成功</p>
	
</s:if>
<s:if test="#parameters.mess[0]==0">
	<p style="color:red">添加人员失败</p>
</s:if>
<s:form action="peopleAction_addPeople" method="post" theme="simple">
	姓名:<s:textfield name="p.pname"/><br>
	年龄:<s:textfield name="p.page"/><br>
	性别:<s:radio name="p.psex" list="#{1:'男',0:'女' }" value="%{1}"/><br>
	爱好:<s:checkboxlist name="p.phobbys" list="{'学习','体育','音乐' }"/><br>
	时间:<s:textfield name="p.pintime"/><br>
	<s:submit value="添加"/>
</s:form>
<a href="showPeopleList.jsp">查询人员</a>
</body>
</html>