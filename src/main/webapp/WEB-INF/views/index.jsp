<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<body>
<h2>It's working on Tomcat server(10.1.7)</h2>
<hr>
<h1>${msg}</h1>
<h1>Hi, there (updated by test)</h1>
<h2>Today is <fmt:formatDate value="${today}" pattern="yyyy-MM-dd"/></h2>
<h3>Version: 3.0</h3>
</body>
</html>