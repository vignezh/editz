<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@include file="header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Foot Bazzar Register Form</title>
<link href="style.css" rel="stylesheet" type="text/css" />
</head>

<body>
	<div class="content">
		<fieldset>
			<legend>You can login here!!! To become out valuable customer...</legend>
			<!-- for triggering webflow events using links,
					 the eventId to be triggered is given in "href" attribute as:
				 -->
			
			<sf:form modelAttribute="userBean">
				<br />
				<sf:label path="userId">UserName:</sf:label>
				<sf:input path="userId" />
				<br />
				<!-- to display validation messages -->
				<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('userId')}"
					var="err">
					<div>
						<span>${err.text}</span>
					</div>
				</c:forEach>
				<br />
				<sf:label path="email">Email Id: </sf:label>
				<sf:input path="email" />
				<br />
				<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('email')}"
					var="err">
					<div>
						<span>${err.text}</span>
					</div>
				</c:forEach>
				<br />
				<sf:label path="age">Age: </sf:label>
				<sf:input path="age" />
				<br />
				<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('age')}"
					var="err">
					<div>
						<span>${err.text}</span>
					</div>
				</c:forEach>
				<br />
				<sf:label path="pass">Password: </sf:label>
				<sf:input path="pass" />
				<br />
				<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('pass')}"
					var="err">
					<div>
						<span>${err.text}</span>
					</div>
				</c:forEach>
				<br />
				<!-- for triggering webflow events using form submission,
					 the eventId to be triggered is given in "name" attribute as:
					-->
				<input name="_eventId_submit" type="submit" value="Submit" />
				<br>
				
				<br />
			</sf:form>
		</fieldset>
	</div>
</body>
</html>