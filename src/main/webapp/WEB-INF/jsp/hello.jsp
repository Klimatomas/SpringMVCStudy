<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
    <title>${Title}</title>
</head>

<body>
<form:form method="post" action="${pageContext.request.contextPath}/hello" modelAttribute="beer">
    <form:input path="name" />
    <button type=submit>SUBMIT</button>
</form:form>

<table>
<c:forEach items="${allbeers}" var="beer">
    <tr>
        <td>${beer.id}</td>
        <td>${beer.name}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>