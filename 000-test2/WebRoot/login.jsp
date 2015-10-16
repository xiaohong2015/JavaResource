<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
	
<style>	
body {
	padding: 20px;
	
}
</style>	
<script type="text/javascript" src="javascript/jquery.min.js"></script>
<script type="text/javascript">
 //在javascript中获取request的值
$(function(){
		    var a = '<%=request.getAttribute("msg")%>' ; 
			if(a=="password error")
				alert("密码错误");
			else if(a=="identification error") {
			    alert("身份错误");
			}
			else if(a=="no user") {
			    alert("不存在此用户！");
			}
	});

</script>
</head>


<body>
     <h1>${request.msg }</h1>  <!-- 在页面中获取request的值 -->
	<form action='<%=path%>/user.action' method="post">
		<input type="text" name="username" /> 
		<input type="password" name="password" />
			 <select id="identification" style="width:135px;" name=identification>
			<option value="-1">请选择</option>
			<option value="0">普通用户</option>
			<option value="1">系统管理员</option>
			<option value="2">超级管理员</option>
		</select> 
		<input type="submit" value="登录" /><br>
	</form>
</body>
</html>
