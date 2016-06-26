<%@taglib prefix="decorator"
	uri="http://www.opensymphony.com/sitemesh/decorator"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="user-scalable=no, initial-scale=1.0, maximum-scale=1.0" />
<meta name="apple-mobile-web-app-capable" content="yes" />
<meta name="apple-mobile-web-app-status-bar-style" content="black">

<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="/static/images/splash/splash-icon.png">
<link rel="apple-touch-startup-image"
	href="/static/images/splash/splash-screen.png"
	media="screen and (max-device-width: 320px)" />
<link rel="apple-touch-startup-image"
	href="/static/images/splash/splash-screen%402x.png"
	media="(max-device-width: 480px) and (-webkit-min-device-pixel-ratio: 2)" />
<link rel="apple-touch-startup-image" sizes="640x1096"
	href="/static/images/splash/splash-screen%403x.png" />
<link rel="apple-touch-startup-image" sizes="1024x748"
	href="/static/images/splash/splash-screen-ipad-landscape.html"
	media="screen and (min-device-width : 481px) and (max-device-width : 1024px) and (orientation : landscape)" />
<link rel="apple-touch-startup-image" sizes="768x1004"
	href="/static/images/splash/splash-screen-ipad-portrait.png"
	media="screen and (min-device-width : 481px) and (max-device-width : 1024px) and (orientation : portrait)" />
<link rel="apple-touch-startup-image" sizes="1536x2008"
	href="/static/images/splash/splash-screen-ipad-portrait-retina.png"
	media="(device-width: 768px)	and (orientation: portrait)	and (-webkit-device-pixel-ratio: 2)" />
<link rel="apple-touch-startup-image" sizes="1496x2048"
	href="/static/images/splash/splash-screen-ipad-landscape-retina.png"
	media="(device-width: 768px)	and (orientation: landscape)	and (-webkit-device-pixel-ratio: 2)" />

<title><decorator:title default="R2S.biz - Coukers" /></title>

<link href="/static/styles/style.css" rel="stylesheet" type="text/css">
<link href="/static/styles/framework.css" rel="stylesheet" type="text/css">
<link href="/static/styles/owl.carousel.css" rel="stylesheet" type="text/css">
<link href="/static/styles/owl.theme.css" rel="stylesheet" type="text/css">
<link href="/static/styles/swipebox.css" rel="stylesheet" type="text/css">
<link href="/static/styles/colorbox.css" rel="stylesheet" type="text/css">

<script type="text/javascript" src="/static/scripts/jquery.js"></script>
<script type="text/javascript" src="/static/scripts/jqueryui.js"></script>
<script type="text/javascript" src="/static/scripts/owl.carousel.min.js"></script>
<script type="text/javascript" src="/static/scripts/jquery.swipebox.js"></script>
<script type="text/javascript" src="/static/scripts/colorbox.js"></script>
<script type="text/javascript" src="/static/scripts/snap.js"></script>
<script type="text/javascript" src="/static/scripts/contact.js"></script>
<script type="text/javascript" src="/static/scripts/custom.js"></script>
<script type="text/javascript" src="/static/scripts/framework.js"></script>
<script type="text/javascript" src="/static/scripts/framework.launcher.js"></script>
<decorator:head />

</head>
<body>

	<div id="preloader">
		<div id="status">
			<p class="center-text">
				Loading the content... <em>Loading depends on your connection
					speed!</em>
			</p>
		</div>
	</div>

	<div class="homepage-wrapper">
		<img class="homepage-logo" src="/static/images/misc/logo.png" alt="img">
		<em class="homepage-logo-sub">Creative Simplicity</em>

		<decorator:body />

		<div class="footer">
			<a class="facebook-icon" href="#"></a> <a class="google-icon"
				href="#"></a> <a class="twitter-icon" href="#"></a>
			<div class="clear"></div>
			<p class="homepage-copyright">
				Copyright 2014. <br>All Rights Reserved.
			</p>
		</div>

		<div class="webapp-wrapper">
			<div class="webapp">
				<img src="/static/images/splash/splash-icon.png" alt="img">
				<h3>SLASHER</h3>
				<p>You’re running iOS. Add this page to your homescreen for an
					enhanced experience!</p>
				<em class="corner-deco"></em> <a href="#" class="close-webapp">x</a>
			</div>
		</div>

	</div>

	<div class="homepage-background">
		<div class="bg-pattern"></div>
		<div class="bg-overlay"></div>
		<img id="bg" src="/static/images/bg.png" alt="img">
	</div>


</body>
</html>