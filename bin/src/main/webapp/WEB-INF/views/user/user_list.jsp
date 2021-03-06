<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<!-- File generated by Telosys Tools Generator ( version 3.0.0 ) - Date 2021-09-27 ( Time 22:18:43 ) -->

<div>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib tagdir="/WEB-INF/tags/util" prefix="util"%>
<%@ taglib tagdir="/WEB-INF/tags/display" prefix="display"%>


	<div class="container">
		<fieldset class="col-sm-12 bordure">
			<legend class="legende">user</legend>
		
			<util:message message="${message}" messages="${messages}" />

			<table class="table table-striped">
				<thead>
					<tr>
						<th>user.userId</th>
						<th>user.loginName</th>
						<th>user.password</th>
						<th>user.name</th>
						<th>user.sex</th>
						<th>user.birth</th>
						<th>user.email</th>
						<th>user.snsType</th>
						<th>user.kakaotalkToken</th>
						<th>user.referrer</th>
						<th>user.telNumber</th>
						<th>user.phoneBackward</th>
						<th>user.phoneSha</th>
						<th>user.dgplusToken</th>
						<th>user.reasonWithdrawn</th>
						<th>user.deleteYn</th>
						<th>user.sleepYn</th>
						<th>user.marketingAgreeYn</th>
						<th>user.updatedAt</th>
						<th>user.createdAt</th>
						<th>user.marketingAt</th>
						<th>user.paymentPin</th>
						<th>user.updater</th>
						<th>user.dropNumber</th>
						<th>user.dropdatedAt</th>
						<th>user.accessChannelId</th>
						<th>user.adultIdentityDate</th>
						<th>user.realName</th>
						<th>user.realBirth</th>
						<s:url var="url_create" value="/user/form"  />
						<th><a class="btn btn-info" href='${url_create}'>create</a></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${list}" var="user">
						<tr>
							<td>${user.userId}</td>
							<td>${user.loginName}</td>
							<td>${user.password}</td>
							<td>${user.name}</td>
							<td>${user.sex}</td>
							<td>${user.birth}</td>
							<td>${user.email}</td>
							<td>${user.snsType}</td>
							<td>${user.kakaotalkToken}</td>
							<td>${user.referrer}</td>
							<td>${user.telNumber}</td>
							<td>${user.phoneBackward}</td>
							<td>${user.phoneSha}</td>
							<td>${user.dgplusToken}</td>
							<td>${user.reasonWithdrawn}</td>
							<td>${user.deleteYn}</td>
							<td>${user.sleepYn}</td>
							<td>${user.marketingAgreeYn}</td>
							<td><display:date value="${user.updatedAt}" /></td>
							<td><display:date value="${user.createdAt}" /></td>
							<td><display:date value="${user.marketingAt}" /></td>
							<td>${user.paymentPin}</td>
							<td>${user.updater}</td>
							<td>${user.dropNumber}</td>
							<td><display:date value="${user.dropdatedAt}" /></td>
							<td>${user.accessChannelId}</td>
							<td>${user.adultIdentityDate}</td>
							<td>${user.realName}</td>
							<td>${user.realBirth}</td>
							<s:url var="url_update" value="/user/form/${user.userId}"/>
							<td><a class="btn btn-info" href="${url_update}">edit</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</fieldset>
	</div>
</div>