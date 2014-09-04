<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Here are the vegetables!</h1>
	<ul>
		<c:forEach var="item" items="${VegetableList}">
			<li>${item}</li>
		</c:forEach>
	</ul>
<a href="1">A-Z</a>  <a href="2">Z-A</a>
</body>
</html>