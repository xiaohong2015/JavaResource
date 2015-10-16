<%@ page language="java" contentType="text/html; charset=UTF-8"%>
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
<title>文件上传</title>
<script type="text/javascript" src="js/handlers.js"></script>
<script type="text/javascript" src="js/swfupload.js"></script>
<script type="text/javascript" src="js/swfupload.queue.js"></script>
<script type="text/javascript" src="js/fileprogress.js"></script>
<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="js/jquery.cookie.js"></script>
<link href="css/default.css" rel="stylesheet" type="text/css" />


<script type="text/javascript">
var upload;
var flashUrl = "${pageContext.request.contextPath}/js/swfupload.swf";
var ImageUrl = "${pageContext.request.contextPath}/images/select-files-CN.png";
var url = "${pageContext.request.contextPath}/servlet/FileUploadServlet.htm";
var sizeLimit = "10 GB";
var types = "*";
var typesdesc = "web file";
var uploadLimit = 20;

	
</script>
</head>
<body>
	<div class="flash" id="fsUploadProgress"></div>
	<div style="padding-left: 5px;">
		<span id="spanButtonPlaceholder"></span> 
		<input id="btnCancel" type="button" value="取消" onclick="cancelQueue(upload);"
			disabled="disabled" style="margin-left: 2px; height: 22px; font-size: 8pt;" /> 
			<a href="javascript:goDown();" class="goDown">文件下载</a>
	</div>
	<script type="text/javascript">

	function goDown() {
		var data= {aa: "1"};
		
		$.getJSON("servlet/FilesServlet.htm",
			data,
			function(data) {
				alert(data.jsonArray[0].file);
				$.cookie("coo", data.jsonArray);
				
				window.location.href= "download.jsp";
			/*
				window.location.href= "";
				window.history.back(-1);
				window.navigate("");
				self.location= "";
				top.location= "";
				location.href= ""
				window.open("");
				//*/
			});
	};
	</script>
</body>
</html>