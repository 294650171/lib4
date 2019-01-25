<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>企业证照管理</title>
	<meta name="decorator" content="default"/>
	<link rel="stylesheet" href="${ctxStatic}/viewerjs/viewer.css">
	<style>
        #certAttachList {
          list-style: none;
          margin: 0;
          padding: 0;
        }

        #certAttachList > li {
          border: 1px solid transparent;
          float: left;

        }
        #certAttachList > li > img {
          float: left;
          cursor: zoom-in;
          width: 100px;
          height: 100px;
        }
      </style>
	<script src="${ctxStatic}/viewerjs/viewer.js" type="text/javascript"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			 var galley = document.getElementById('certAttachList');
             var viewer = new Viewer(galley);
             viewer.show();
		});

	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/corp/corpCertAttach/">企业证照列表</a></li>
		<shiro:hasPermission name="corp:corpCertAttach:edit"><li><a href="${ctx}/corp/corpCertAttach/form">企业证照添加</a></li></shiro:hasPermission>
	</ul>

  <ul id="certAttachList">
    <c:forEach items="${page.list}" var="corpCertAttach" varStatus="status">
    <li><img src="${corpCertAttach.url}" alt="${corpCertAttach.photoName}"></li>
    </c:forEach>
  </ul>


</body>
</html>