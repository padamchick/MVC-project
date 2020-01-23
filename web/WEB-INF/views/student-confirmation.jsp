<%--
  Created by IntelliJ IDEA.
  User: Piotrek
  Date: 21.01.2020
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Student confirmation page</title>
</head>
<body>
Student confirmation: ${student.firstName} ${student.lastName} from ${student.country} coding
in ${student.favouriteLanguage} working on

    <c:forEach var="temp" items="${student.operatingSystems}">${temp}        </c:forEach>



</body>
</html>
