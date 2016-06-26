<%@taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


		
		<page:applyDecorator name="menu" encoding="utf-8"/>
		
				
		<page:applyDecorator name="menudireito" encoding="utf-8"/>
		
		<!DOCTYPE HTML>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="user-scalable=no, initial-scale=1.0, maximum-scale=1.0"/>
<meta name="apple-mobile-web-app-capable" content="yes"/>
<meta name="apple-mobile-web-app-status-bar-style" content="black">

<link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/splash/splash-icon.png">
<link rel="apple-touch-startup-image" href="images/splash/splash-screen.png" 			media="screen and (max-device-width: 320px)" />  
<link rel="apple-touch-startup-image" href="images/splash/splash-screen%402x.png" 		media="(max-device-width: 480px) and (-webkit-min-device-pixel-ratio: 2)" /> 
<link rel="apple-touch-startup-image" sizes="640x1096" href="images/splash/splash-screen%403x.png" />
<link rel="apple-touch-startup-image" sizes="1024x748" href="images/splash/splash-screen-ipad-landscape.html" media="screen and (min-device-width : 481px) and (max-device-width : 1024px) and (orientation : landscape)" />
<link rel="apple-touch-startup-image" sizes="768x1004" href="images/splash/splash-screen-ipad-portrait.png" media="screen and (min-device-width : 481px) and (max-device-width : 1024px) and (orientation : portrait)" />
<link rel="apple-touch-startup-image" sizes="1536x2008" href="images/splash/splash-screen-ipad-portrait-retina.png"   media="(device-width: 768px)	and (orientation: portrait)	and (-webkit-device-pixel-ratio: 2)"/>
<link rel="apple-touch-startup-image" sizes="1496x2048" href="images/splash/splash-screen-ipad-landscape-retina.png"   media="(device-width: 768px)	and (orientation: landscape)	and (-webkit-device-pixel-ratio: 2)"/>

<title><decorator:title default="R2S.biz - Coukers" /></title>

<link href="styles/style.css"     		rel="stylesheet" type="text/css">
<link href="styles/framework.css" 		rel="stylesheet" type="text/css">
<link href="styles/owl.carousel.css" 	 rel="stylesheet" type="text/css">
<link href="styles/owl.theme.css" 		rel="stylesheet" type="text/css">
<link href="styles/swipebox.css"		 rel="stylesheet" type="text/css">
<link href="styles/colorbox.css"		 rel="stylesheet" type="text/css">

<script type="text/javascript" src="scripts/jquery.js"></script>
<script type="text/javascript" src="scripts/jqueryui.js"></script>
<script type="text/javascript" src="scripts/owl.carousel.min.js"></script>
<script type="text/javascript" src="scripts/jquery.swipebox.js"></script>
<script type="text/javascript" src="scripts/colorbox.js"></script>
<script type="text/javascript" src="scripts/snap.js"></script>
<script type="text/javascript" src="scripts/contact.js"></script>
<script type="text/javascript" src="scripts/custom.js"></script>
<script type="text/javascript" src="scripts/framework.js"></script>
<script type="text/javascript" src="scripts/framework.launcher.js"></script>
<decorator:head />

</head>
<body>

<div id="preloader">
	<div id="status">
    	<p class="center-text">
			Loading the content...
            <em>Loading depends on your connection speed!</em>
        </p>
    </div>
</div>

<page:applyDecorator name="header" encoding="utf-8"/>

<page:applyDecorator name="menu" encoding="utf-8"/>
<div class="page-header-clear"></div>

<div class="content-section">
    <h1 class="left-text">RESPONSIVE VIDEOS</h1>
    <em class="left-text">Portfolio Variations!</em>
    <div class="overlay"></div>
    <img class="responsive-image" src="images/general-nature/3w.jpg" alt="img">
</div>

<div class="content">
    <div class="decoration"></div>
    <div class="container no-bottom">
        <div class="portfolio-item-full-width">
            <iframe class="responsive-video" src="http://player.vimeo.com/video/7449107"></iframe>
            <h4>YouTube Video</h4>
            <p>We like portfolios a lot! We've optimized them to the extreme to make them work like a charm on mobiles!</p>
        </div>
        <div class="decoration"></div>
        <div class="portfolio-item-full-width">
            <iframe class="responsive-video" src="http://www.youtube.com/embed/9S-RHXlsjyY"></iframe>
            <h4>Vimeo Video</h4>
            <p>We like portfolios a lot! We've optimized them to the extreme to make them work like a charm on mobiles!</p>
        </div>
        <div class="decoration"></div>
        <div class="portfolio-item-full-width">
            <iframe class="responsive-video" src="http://player.vimeo.com/video/7449107"></iframe>
            <h4>YouTube Video</h4>
            <p>We like portfolios a lot! We've optimized them to the extreme to make them work like a charm on mobiles!</p>
        </div>
    </div>
</div>  
        
<page:applyDecorator name="footer" encoding="utf-8"/>




</body>
</html>