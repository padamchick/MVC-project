<%--
  Created by IntelliJ IDEA.
  User: Piotrek
  Date: 21.01.2020
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student registration form</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">
        First name: <form:input path="firstName"/>
        <br/><br/>
        Last name: <form:input path="lastName"/>

        <br/><br/>
        Country:
        <form:select path="country">
            <form:options items="${countryOptions}"/>

        </form:select>
        <br/><br/>
        Favourite language:
        <br/>
        <form:radiobuttons path="favouriteLanguage" items="${languages}"/>
        <br/><br/>
        <form:checkboxes path="operatingSystems" items="${systems}"/>
        <br/><br/>
        <input type="submit"/>
    </form:form>



</body>
</html>
