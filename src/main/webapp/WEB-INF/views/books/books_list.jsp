<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<!-- File generated by Telosys Tools Generator ( version 3.0.0 ) - Date 2019-03-11 ( Time 16:43:21 ) -->

<div>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib tagdir="/WEB-INF/tags/util" prefix="util"%>
<%@ taglib tagdir="/WEB-INF/tags/display" prefix="display"%>


	<div class="container">
		<fieldset class="col-sm-12 bordure">
			<legend class="legende">books</legend>
		
			<util:message message="${message}" messages="${messages}" />

			<table class="table table-striped">
				<thead>
					<tr>
						<th>books.bookId</th>
						<th>books.name</th>
						<th>books.author</th>
						<th>books.publishDate</th>
						<th>books.description</th>
						<s:url var="url_create" value="/books/form"  />
						<th><a class="btn btn-info" href='${url_create}'>create</a></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${list}" var="books">
						<tr>
							<td>${books.bookId}</td>
							<td>${books.name}</td>
							<td>${books.author}</td>
							<td><display:date value="${books.publishDate}" /></td>
							<td>${books.description}</td>
							<s:url var="url_update" value="/books/form/${books.bookId}"/>
							<td><a class="btn btn-info" href="${url_update}">edit</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</fieldset>
	</div>
</div>