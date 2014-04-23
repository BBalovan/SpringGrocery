<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Here are the yellow ones!</h1>
	<ul>
		<c:forEach var="listName" items="${FruitList}">
			<li>${listName}</li>
		</c:forEach>
	</ul>

	<script
		src="<c:url value="https://code.jquery.com/jquery-2.1.0.min.js" />"></script>
	<script
		src="<c:url value="http://code.jquery.com/ui/1.10.4/jquery-ui.min.js" />"></script>
	<script src="<c:url value="resources/js/details.js" />"></script>
</body>
</html>
