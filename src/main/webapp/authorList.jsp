<%-- 
    Document   : authorList
    Created on : Sep 18, 2017, 7:50:20 PM
    Author     : alexsmith
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Author List</h2>
        <table>
            <th>Id</th>
            <th>Name</th>
            <th>Date added</th>
            <c:forEach items="${authors}" var="author">
            <tr>
                <td><c:out value="${author[0]}"></c:out></td>
                <td><c:out value="${author[1]}"></c:out><</td>
                <td><c:out value="${author[2]}"></c:out><</td>
            </tr>
            
            </c:forEach>
        </table>
        
    </body>
</html>
