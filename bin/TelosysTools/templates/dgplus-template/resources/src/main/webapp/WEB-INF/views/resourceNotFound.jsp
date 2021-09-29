<div>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"    uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring"    uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fn"   uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib tagdir="/WEB-INF/tags/util" prefix="util"%>

  <spring:message var="title" code="error_resourcenotfound_title" htmlEscape="false" />
  <div>
    <h2>${fn:escapeXml(title)}</h2>
    <p>
      <spring:message code="error_resourcenotfound_problemdescription" />
    </p>
    <c:if test="${not empty exception}">
      <p>
        <h4>
          <spring:message code="exception_details" />
        </h4>
        <spring:message var="message" code="exception_message" htmlEscape="false" />
        <div>
          <c:out value="${exception.localizedMessage}" />
        </div>
        <spring:message var="stacktrace" code="exception_stacktrace" htmlEscape="false" />
        <div>
          <c:forEach items="${exception.stackTrace}" var="trace">
            <c:out value="${trace}" />
            <br />
          </c:forEach>
        </div>
      </p>
    </c:if>
  </div>
</div>