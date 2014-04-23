<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</P>
	Here are the red fruits:
	<ul>
		<c:forEach var="listName" items="${FruitList}">
			<li>${listName}</li>
		</c:forEach>
	</ul>

	<a href="Details">Yellow fruits </a>
</body>
</html>
