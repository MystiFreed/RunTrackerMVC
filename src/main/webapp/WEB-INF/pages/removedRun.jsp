<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
 <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Run Tracker</title>
</head>
<body> <h2>Run Removed</h2>
    <table>
    	<tr>
            <td>Run ID:</td>
            <td>${removed.ID}</td>
        </tr>
        <tr>
            <td>Run Date:</td>
            <td>${removed.runDate}</td>
        </tr>
        <tr>
            <td>Run Length:</td>
            <td>${removed.runLength}</td>
        </tr>
        <tr>
            <td>Time of Day:</td>
            <td>${removed.timeOfDay}</td>
        </tr>

        <tr>
            <td>Good Run?</td>
            <td>${removed.goodRun}</td>
        </tr>

        </table>
<a href = "viewAll.mvc">View all Runs</a>
</body>
</html>