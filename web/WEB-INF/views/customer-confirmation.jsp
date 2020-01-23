<%--
  Created by IntelliJ IDEA.
  User: Piotrek
  Date: 22.01.2020
  Time: 19:34
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customer confirmation page</title>
</head>
<body>
The customer is confirmed: ${customer.firstName} ${customer.lastName}.
<br/>
Free passes: ${customer.freePasses}
<br/>
Postal code: ${customer.postalCode}
<br/>
Course name: ${customer.courseName}
<br/>
Even number: ${customer.evenNumber}
</body>
</html>
