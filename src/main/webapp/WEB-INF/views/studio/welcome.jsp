<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<META  http-equiv="Content-Type"  content="text/html;charset=UTF-8">
<title><fmt:message key="welcome.title" />
</title>
<link rel="stylesheet"
	href="<c:url value="/resources/styles/blueprint/reset.css" />"
	type="text/css" media="screen, projection">
<link rel="stylesheet"
	href="<c:url value="/resources/styles/blueprint/screen.css" />"
	type="text/css" media="screen, projection">
<link rel="stylesheet"
	href="<c:url value="/resources/styles/blueprint/print.css" />"
	type="text/css" media="print">

<link rel="stylesheet" type="text/css" media="screen"
	href="<c:url value="/resources/scripts/jquery-ui-1.8.13/css/redmond/jquery-ui-1.8.13.custom.css" />" />
<link rel="stylesheet" type="text/css" media="screen"
	href="<c:url value="/resources/scripts/jqGrid/css/ui.jqgrid.css" />" />

<script
	src="<c:url value="/resources/scripts/jquery-1.6.1/jquery-1.6.1.min.js" />"
	type="text/javascript"></script>
<script
	src="<c:url value="/resources/scripts/jquery-ui-1.8.13/jquery-ui-1.8.13.custom.min.js" />"
	type="text/javascript"></script>
<script
	src="<c:url value="/resources/scripts/jqGrid/i18n/grid.locale-en.js" />"
	type="text/javascript"></script>
<script
	src="<c:url value="/resources/scripts/jqGrid/jquery.jqGrid.min.js"  />"
	type="text/javascript"></script>
	
<script
	src="<c:url value="/resources/scripts/knockout/knockout-latest.js"  />"
	type="text/javascript"></script>
	
<script
	src="<c:url value="/resources/scripts/jquery-tmpl/jquery.tmpl.min.js"  />"
	type="text/javascript"></script>	

<script
	src="<c:url value="/resources/scripts/studio.js"  />"
	type="text/javascript"></script>
<script
	src="<c:url value="/resources/scripts/Project.js"  />"
	type="text/javascript"></script>	
	

<!--[if lt IE 8]>
		<link rel="stylesheet" href="<c:url value="/resources/styles/blueprint/ie.css" />" type="text/css" media="screen, projection">
	<![endif]-->
<style type="text/css">
		body { font-size: 62.5%; }
		label, input { display:block; }
		input.text { margin-bottom:12px; width:95%; padding: .4em; }
		fieldset { padding:0; border:0; margin-top:25px; }
		h1 { font-size: 1.2em; margin: .6em 0; }
		div#users-contain {  width: 350px; margin: 20px 0; }
		div#users-contain table { margin: 1em 0; border-collapse: collapse; width: 100%; }
		div#users-contain table td, div#users-contain table th { border: 1px solid #eee; padding: .6em 10px; text-align: left; }
		.ui-button { outline: 0; margin:0; padding: .4em 1em .5em; text-decoration:none;  !important; cursor:pointer; position: relative; text-align: center; }
		.ui-dialog .ui-state-highlight, .ui-dialog .ui-state-error { padding: .3em;  }
		
		
	</style>
<script type="text/javascript">
	function test(){
		$("#dialog").dialog({modal: true, minWidth:800});
		$("#accordion").accordion({fillSpace: true});
	}
</script>
</head>
<body>
<br><br>
<!--a href="javascript:test();">Test</a-->
<br><br>
<a href="#" id="Project">Project</a>
<br><br>


<div id="dialog" title="Basic dialog">
	<p>This is the default dialog which is useful for displaying information. The dialog window can be moved, resized and closed with the 'x' icon.</p>
	<div id="accordion">
	<h3><a href="#">General</a></h3>
	<div style="height:250px">
		<p>
		Mauris mauris ante, blandit et, ultrices a, suscipit eget, quam. Integer
		ut neque. Vivamus nisi metus, molestie vel, gravida in, condimentum sit
		amet, nunc. Nam a nibh. Donec suscipit eros. Nam mi. Proin viverra leo ut
		odio. Curabitur malesuada. Vestibulum a velit eu ante scelerisque vulputate.
		</p>
	</div>
	<h3><a href="#">Fields</a></h3>
	<div style="height:250px">
		<p>
		Sed non urna. Donec et ante. Phasellus eu ligula. Vestibulum sit amet
		purus. Vivamus hendrerit, dolor at aliquet laoreet, mauris turpis porttitor
		velit, faucibus interdum tellus libero ac justo. Vivamus non quam. In
		suscipit faucibus urna.
		</p>
	</div>
	
	
	<button id="create-user" class="ui-button ui-state-default ui-corner-all" onclick="javascript:$('#dialog').dialog('close');">Cancel</button>
</div>

	
</body>
</html>