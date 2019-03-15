<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<!-- File generated by Telosys Tools Generator ( version 3.0.0 ) - Date 2019-03-14 ( Time 13:13:08 ) -->

<div>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib tagdir="/WEB-INF/tags/util" prefix="util"%>
<%@ taglib tagdir="/WEB-INF/tags/display" prefix="display"%>


	<div class="container">
		<fieldset class="col-sm-12 bordure">
			<legend class="legende">users</legend>
		
			<util:message message="${message}" messages="${messages}" />

			<table class="table table-striped">
				<thead>
					<tr>
						<th>users.userId</th>
						<th>users.loginName</th>
						<th>users.password</th>
						<th>users.createdAt</th>
						<th>users.deleteFlag</th>
						<s:url var="url_create" value="/users/form"  />
						<th><a class="btn btn-info" href='${url_create}'>create</a></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${list}" var="users">
						<tr>
							<td>${users.userId}</td>
							<td>${users.loginName}</td>
							<td>${users.password}</td>
							<td><display:date value="${users.createdAt}" /></td>
							<td>${users.deleteFlag}</td>
							<s:url var="url_update" value="/users/form/${users.userId}"/>
							<td><a class="btn btn-info" href="${url_update}">edit</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</fieldset>
	</div>
</div>