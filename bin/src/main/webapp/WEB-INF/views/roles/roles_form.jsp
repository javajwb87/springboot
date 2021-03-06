<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<!-- File generated by Telosys Tools Generator ( version 3.0.0 ) - Date 2019-03-14 ( Time 16:44:08 ) -->

<div>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"    uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s"    uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn"   uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib tagdir="/WEB-INF/tags/util" prefix="util"%>
<%@ taglib tagdir="/WEB-INF/tags/input" prefix="input"%>

	<div class="container">
		<fieldset class="col-sm-12 bordure">
			<legend class="legende">roles</legend>
		
	    	<s:url value="${saveAction}" var="url_form_submit" />
			<form:form class="form-horizontal" modelAttribute="roles" cssClass="well form-horizontal" method="POST" action="${url_form_submit}">
				<form:errors path="*" cssClass="alert alert-danger" element="div" />

<c:if test="${mode != 'create'}">
				<!-- Store data in hidden fields in order to be POST even if the field is disabled -->
				<form:hidden path="roleId" />
</c:if>


 
				<!-- PRIMARY KEY FIELD : roleId -->
				<div class="form-group">
					<!-- The field label is defined in the messages file (for i18n) -->
					<label for="roles_roleId" class="col-sm-2 control-label">roles.roleId</label>
					<div class="col-sm-10">
						<form:input id="roles_roleId" path="roleId" class="form-control" disabled="${mode != 'create'}" />
						<form:errors id="roles_roleId_errors" path="roleId" cssClass="label label-danger" />

					</div>
				</div>



 
				<!-- DATA FIELD : userId -->
				<div class="form-group">
					<!-- The field label is defined in the messages file (for i18n) -->
					<label for="roles_userId" class="col-sm-2 control-label">roles.userId</label>
					<div class="col-sm-10">
  						<form:input id="roles_userId" path="userId" class="form-control" />
						<form:errors id="roles_userId_errors" path="userId" cssClass="label label-danger" />

					</div>
				</div>



 
				<!-- DATA FIELD : roleName -->
				<div class="form-group">
					<!-- The field label is defined in the messages file (for i18n) -->
					<label for="roles_roleName" class="col-sm-2 control-label">roles.roleName</label>
					<div class="col-sm-10">
  						<form:input id="roles_roleName" path="roleName" class="form-control" />
						<form:errors id="roles_roleName_errors" path="roleName" cssClass="label label-danger" />

					</div>
				</div>

 

				<!-- ACTION BUTTONS -->
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-2">
						<c:if test="${mode != 'create'}">
							<!-- "DELETE" button ( HREF link ) -->
							<s:url var="deleteButtonURL" value="/roles/delete/${roles.roleId}" />
							<a role="button" class="btn btn-danger btn-block" href="${deleteButtonURL}">delete</a>
						</c:if>
					</div>
    				<div class="col-sm-offset-4 col-sm-2">
						<!-- "CANCEL" button ( HREF link ) -->
		 				<s:url var="cancelButtonURL" value="/roles" />
						<a role="button" class="btn btn-default btn-block" href="${cancelButtonURL}">cancel</a>
					</div>
    				<div class="col-sm-2">
						<!-- "SAVE" button ( SUBMIT button ) -->
						<button type="submit" class="btn btn-primary btn-lg btn-block">save</button>
					</div>
				</div>
			</form:form>
	    </fieldset>
	</div>	
</div>
