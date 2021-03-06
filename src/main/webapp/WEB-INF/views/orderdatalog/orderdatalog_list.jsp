<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<!-- File generated by Telosys Tools Generator ( version 3.0.0 ) - Date 2021-09-27 ( Time 22:53:19 ) -->

<div>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib tagdir="/WEB-INF/tags/util" prefix="util"%>
<%@ taglib tagdir="/WEB-INF/tags/display" prefix="display"%>


	<div class="container">
		<fieldset class="col-sm-12 bordure">
			<legend class="legende">orderDataLog</legend>
		
			<util:message message="${message}" messages="${messages}" />

			<table class="table table-striped">
				<thead>
					<tr>
						<th>orderDataLogId</th>
						<th>userId</th>
						<th>orderId</th>
						<th>tkind</th>
						<th>dataType</th>
						<th>dataTid</th>
						<th>reqData</th>
						<th>resData</th>
						<th>resResultCode</th>
						<th>resResultMsg</th>
						<th>reqAt</th>
						<th>resAt</th>
						<s:url var="url_create" value="/orderDataLog/form"  />
						<th><a class="btn btn-info" href='${url_create}'>create</a></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${list}" var="orderDataLog">
						<tr>
							<td>${orderDataLog.orderDataLogId}</td>
							<td>${orderDataLog.userId}</td>
							<td>${orderDataLog.orderId}</td>
							<td>${orderDataLog.tkind}</td>
							<td>${orderDataLog.dataType}</td>
							<td>${orderDataLog.dataTid}</td>
							<td>${orderDataLog.reqData}</td>
							<td>${orderDataLog.resData}</td>
							<td>${orderDataLog.resResultCode}</td>
							<td>${orderDataLog.resResultMsg}</td>
							<td><display:date value="${orderDataLog.reqAt}" /></td>
							<td><display:date value="${orderDataLog.resAt}" /></td>
							<s:url var="url_update" value="/orderDataLog/form/${orderDataLog.orderDataLogId}"/>
							<td><a class="btn btn-info" href="${url_update}">edit</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</fieldset>
	</div>
</div>