<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
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
<link rel="stylesheet" type="text/css"
	href="<%=path%>/jquery-easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="<%=path%>/jquery-easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="<%=path%>/css/default.css">
<script type="text/javascript"
	src="<%=path%>/jquery-easyui/jquery.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/jquery-easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"></script>
</head>

<body>
管理员界面
</body>
</html>