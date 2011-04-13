<%@ page import="java.com.confess.mvn3.simpleapp.frontend.FrontendBackingBean" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Simple jsp page</title></head>
<body>
<div>
    value=<%=new FrontendBackingBean().gimmeTheDamnThing() %>
</div>
</body>
</html>