<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <link href="<c:url value="/resources/css/university.css" />" rel="stylesheet" type="text/css" media="screen" />
    <title>Listing Univerisities</title>
</head>
<body>
<div class="container">
<h1>Universities</h1>
<c:if test="${not empty universities}">
  
    <table class="normal-table">
        <thead>
            <tr>
            	<th>Key</th>
                <th>Name</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach var="university" items="${universities}">
            <tr>
            	<td>${university.key}</td>
                <td>${university.value}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</c:if>
  
</div>
</body>
</html>