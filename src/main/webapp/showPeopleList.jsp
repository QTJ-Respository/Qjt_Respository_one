<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.2.1.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<h2>showPeopleList</h2>
<table id="mytab" border="1">
	<tr>
		<td>编号</td><td>姓名</td><td>性别</td><td>年龄</td><td>爱好</td><td>时间</td><td>号码</td>
	</tr>
</table>
</body>
</html>
<script>
	$(function(){
		//每次刷新清除数据
		$("table tr:not(:first) ").remove();
		//异步查询是所有人员
		$.get("peopleAction_showPropleList",null,function(data){
			$.each(data.peoplelist,function(i,v){
				var str = "<tr>";
					str+= "<td>"+(i+1)+"</td>";
					str+= "<td>"+v[0].pname+"</td>";
					str+= "<td>"+v[0].psex+"</td>";
					str+= "<td>"+v[0].page+"</td>";
					str+= "<td>"+v[0].phobbys+"</td>";
					str+= "<td>"+v[0].pintime+"</td>";
					str+= "<td>"+v[1].pcode+"</td>";
					str+= "</tr>";
				$("#mytab").append(str);
			});
		},"json");
	})
	
</script>