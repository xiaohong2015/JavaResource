<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>文件下载</title>
</head>
<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="js/jquery.cookie.js"></script>

<body>
<!-- 
<c:forEach var="list" items="${fileName }" varStatus="status">
	<a href="servlet/FileDownloadServlet.htm?fileName=${list }">${list }</a>&nbsp;&nbsp;
</c:forEach>
 -->
<br>
<a href="upload.jsp">back</a>

<script type="text/javascript">
var i= JSON.parse($.cookie("coo"));
alert(i[0].file);

// 就算传值过来了，前台页面工程分布还是有其他问题
// http://www.cnblogs.com/saptechnique/archive/2012/08/28/2660403.html
</script>

</body>
</html>
