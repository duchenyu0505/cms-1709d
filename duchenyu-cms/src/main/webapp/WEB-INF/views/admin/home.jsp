<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cms后台登录</title>
<link href="/public/css/bootstrap.min.css" rel="stylesheet">
<link href="/public/css/cms.css" rel="stylesheet">
</head>
<body>

	<!-- 头信息 -->
	<jsp:include page="../common/admin/head.jsp"></jsp:include>
	<div class="container-fluid">
		<div class="row" style="margin-top: 15px;">
			  <div class="col-3">
			  	<!-- 左侧导航 -->
			    <jsp:include page="../common/admin/left.jsp"></jsp:include>
			  </div>
			  <div class="col-9">
			    <div class="tab-content" id="v-pills-tabContent">
				  
			  </div>
			</div>
		</div>
	</div>
	<script type="text/javascript" src="/public/js/jquery.min.1.12.4.js"></script>
	<script type="text/javascript" src="/public/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="/public/js/cms.js"></script>
</body>
</html>