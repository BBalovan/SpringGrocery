$(function() {

	$("body>h1").hover(function() {

		$(this).animate({
			backgroundColor : "##ffff00",
			color : "#45cffc",
			width : 500
		}, 1000);

	}, function() {

		$(this).animate({
			backgroundColor : "#fff",
			color : "#000",
			width : 800
		}, 1000);
	});
});
