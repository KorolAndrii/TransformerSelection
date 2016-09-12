<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Somebody
  Date: 12.09.2016
  Time: 17:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="<c:url value="/resources/css/adminMain.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
    <script src="<c:url value="/resources/js/bootstrap.js" />"></script>
</head>
<body>
<div class="container">
    <h2>Список трансформаторів</h2>
    <table class="table table-bordered">
        <thead>
        <tr>
            <th>Тип трансформатора</th>
            <th>Потужність, МВА</th>
            <th>Межі регулювання, %</th>
            <th>ВН, кВ</th>
            <th>НН, кВ</th>
            <th>Напруга КЗ, %</th>
            <th>Втрати КЗ, кВт</th>
            <th>Втрати НХ, кВт</th>
            <th>Струм НХ, кВт</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="transParam" items="${transParams}">
            <tr>
                <td>${transParam.transType.typeName} ${transParam.transType.voltage}</td>
                <td>${transParam.power}</td>
                <td>${transParam.regularRange}</td>
                <td>${transParam.hightNominalVoltage}</td>
                <td>${transParam.lowNominalVoltage}</td>
                <td>${transParam.shortCircuitVoltage}</td>
                <td>${transParam.shortVoltageLosses}</td>
                <td>${transParam.noLoadLosses}</td>
                <td>${transParam.noLoadCurrent}</td>

            </tr>
        </c:forEach>
       </tbody>
    </table>
</div>


</body>
</html>
