<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<!-- File generated by Telosys Tools Generator ( version 3.0.0 ) - Date 2021-09-27 ( Time 22:17:26 ) -->

<div>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib tagdir="/WEB-INF/tags/util" prefix="util"%>
<%@ taglib tagdir="/WEB-INF/tags/display" prefix="display"%>


	<div class="container">
		<fieldset class="col-sm-12 bordure">
			<legend class="legende">adidInfo</legend>
		
			<util:message message="${message}" messages="${messages}" />

			<table class="table table-striped">
				<thead>
					<tr>
						<th>adidInfo.adidInfoId</th>
						<th>adidInfo.adid</th>
						<th>adidInfo.deviceKind</th>
						<th>adidInfo.validYn</th>
						<th>adidInfo.createdAt</th>
						<th>adidInfo.updatedAt</th>
						<s:url var="url_create" value="/adidInfo/form"  />
						<th><a class="btn btn-info" href='${url_create}'>create</a></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${list}" var="adidInfo">
						<tr>
							<td>${adidInfo.adidInfoId}</td>
							<td>${adidInfo.adid}</td>
							<td>${adidInfo.deviceKind}</td>
							<td>${adidInfo.validYn}</td>
							<td><display:date value="${adidInfo.createdAt}" /></td>
							<td><display:date value="${adidInfo.updatedAt}" /></td>
							<s:url var="url_update" value="/adidInfo/form/${adidInfo.adidInfoId}"/>
							<td><a class="btn btn-info" href="${url_update}">edit</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</fieldset>
	</div>
</div>