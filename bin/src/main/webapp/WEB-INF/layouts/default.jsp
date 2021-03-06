<html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge" />
	<meta http-equiv="cache-control" content="no-cache" />
	
	<title><c:out value="Nice Order" /></title>

	<!-- style -->
	<spring:url value="/css/bootstrap.min.css" var="css_url_bootstrap" />
	<spring:url value="/css/bootstrap-theme.min.css" var="css_url_bootstrap_theme" />
	<spring:url value="/css/datepicker3.css" var="css_url_datepicker" />
	<spring:url value="/css/styles.css" var="css_url_styles" />
	<link href="${css_url_bootstrap}" rel="stylesheet"  type="text/css" />
	<link href="${css_url_bootstrap_theme}" rel="stylesheet"  type="text/css" />
	<link href="${css_url_datepicker}" rel="stylesheet"  type="text/css" />
	<link href="${css_url_styles}" rel="stylesheet"  type="text/css" />
	
	<!-- javascript -->
	<spring:url value="/js/validation.js" var="js_url_validation" />
	<spring:url value="/js/jquery-1.10.2.min.js" var="js_url_jquery" />
	<spring:url value="/js/bootstrap.js" var="js_url_bootstrap" />
	<spring:url value="/js/bootstrap-datepicker.js" var="js_url_bootstrap_datepicker" />
	<spring:url value="/js/locales/bootstrap-datepicker.${fn:substring(plocale, 0, 2)}.js" var="js_url_bootstrap_datepicker_locale" />
	<script type="text/javascript" src="${js_url_validation}"><jsp:text/></script>
	<script type="text/javascript" src="${js_url_jquery}"><jsp:text/></script>
	<script type="text/javascript" src="${js_url_bootstrap}"><jsp:text/></script>
	<script type="text/javascript" src="${js_url_bootstrap_datepicker}"><jsp:text/></script>
	<script type="text/javascript" src="${js_url_bootstrap_datepicker_locale}" charset="UTF-8"><jsp:text/></script>

</head>
<body>

    <nav class="navbar navbar-inverse navbar-static-top">
      <div class="container">
        <div class="navbar-inner">
          	<a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            	<span class="icon-bar"></span>
            	<span class="icon-bar"></span>
        		<span class="icon-bar"></span>
        	</a>
			<spring:url value="/" var="url_home"/>
			<a class="navbar-brand logo" href="${url_home}">back.welcome</a>
        </div>
      </div>
    </nav>

	<tiles:insertAttribute name="body" />

</body>
</html>