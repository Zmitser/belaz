<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ attribute name="name" required="true" description="Name of corresponding property in bean object" %>
<%@ attribute name="label" required="true" description="Field label" %>
<%@ attribute name="inputType" required="false" description="Input type" %>
<%@ attribute name="xs" required="false" description="xs size" %>
<%@ attribute name="sm" required="false" description="sm size" %>
<spring:bind path="${name}">
    <c:set var="cssGroup" value="form-group ${status.error ? 'error' : '' }"/>
    <div class="col-xs-${xs} col-sm-${sm} ${cssGroup}">
        <label>${label}</label>
            <c:choose>
                <c:when test="${inputType == 'password'}"><form:password path="${name}" cssClass="le-input"/></c:when>
                <c:when test="${inputType == 'number'}"><form:input path="${name}" cssClass="le-input" type="number"/></c:when>
                <c:when test="${inputType == 'email'}"><form:input path="${name}" cssClass="le-input" type="email"/></c:when>
                <c:otherwise><form:input path="${name}" cssClass="le-input"/></c:otherwise>
            </c:choose>
            <form:errors path="${name}" cssClass="${cssGroup}"/>
    </div>
</spring:bind>

