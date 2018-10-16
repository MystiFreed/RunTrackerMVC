<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Run Tracker</title>
</head>
<body>
<h2>New Run Entry Form</h2>
<mvc:form modelAttribute="run" action="result.mvc">
	<table>
	    <tr>
	        <td><mvc:label path="runDate">Date of Run:</mvc:label></td>
	        <td><mvc:input path="runDate" /></td>
	    </tr>
	    <tr>
	        <td><mvc:label path="runLength">Length of Run (in minutes):</mvc:label></td>
	        <td><mvc:input path="runLength" />       	
	        	</td>
	    </tr>
	    <tr>
	        <td><mvc:label path="timeOfDay">Time of Day:</mvc:label></td>
	        <td><mvc:radiobuttons path="timeOfDay" /></td>
	    </tr>
	    <tr>
            <td><mvc:label path="goodRun">This was a good run!</mvc:label></td>
            <td><mvc:checkbox path="goodRun" />
            	</td>
        </tr>
        <tr>
	        <td colspan="2">
                <input type="submit" value="Submit" />
        	</td>
	    </tr>
	</table>  
</mvc:form>
<a href = "viewAll.mvc">View all Runs in the Database</a>
</body>
</html>