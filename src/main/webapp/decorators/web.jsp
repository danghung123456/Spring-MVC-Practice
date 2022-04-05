<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Small Business - Start Bootstrap Template</title>

<!-- Bootstrap core CSS -->
<link
	href="<c:url value ='/template/web/vendor/bootstrap/css/bootstrap.min.css'/>"
	rel="stylesheet" type="text/css">
<!-- Custom styles for this template -->
<link href="<c:url value = '/template/web/css/small-business.css'/>"
	rel="stylesheet">
</head>
<body>
<!-- body -->
	<%@include file="/common/web/header.jsp"%>
	<%@include file="/WEB-INF/views/web/home.jsp"%>
	<%@include file="/common/web/footer.jsp"%>



	<!-- Bootstrap core JavaScript -->
	<script
		src="<c:url value ='/template/web/vendor/jquery/jquery.min.js' />"></script>
	<script
		src="<c:url value ='/template/web/vendor/bootstrap/js/bootstrap.bundle.min.js'/>"></script>

</body>
</html>