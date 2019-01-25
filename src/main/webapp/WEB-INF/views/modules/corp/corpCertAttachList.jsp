<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>企业证照管理</title>
	<meta name="decorator" content="default"/>
	<link rel="stylesheet" href="${ctxStatic}/viewerjs/viewer.css">
    	<style>
            #certAttachList {
                display:none;
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
    			 var corpCertGalley = document.getElementById('certAttachList');
                 var corpCertViewer = new Viewer(corpCertGalley);
                 //viewer.show();
                 $('#photoViewBtn').click(function(){corpCertViewer.show();});
    		});
            function page(n,s){
            			$("#pageNo").val(n);
            			$("#pageSize").val(s);
            			$("#searchForm").submit();
                    	return false;
                    }
    	</script>

</head>
<body>
	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/corp/corpCertAttach/">企业证照列表</a></li>
		<shiro:hasPermission name="corp:corpCertAttach:edit"><li><a href="${ctx}/corp/corpCertAttach/form">企业证照添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="corpCertAttach" action="${ctx}/corp/corpCertAttach/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<ul class="ul-form">
			<!--<li><label>名称：</label>
				<form:input path="name" htmlEscape="false" maxlength="200" class="input-medium"/>
			</li>-->
			<li class="btns"><a href="#" class="btn" id="photoViewBtn"> 照片视图 </a></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
			    <th>编号</th>
			    <th>证照类型</th>
			    <th>证照号码</th>
				<th>名称</th>
				<th>更新时间</th>
				<th>备注</th>
				<shiro:hasPermission name="corp:corpCertAttach:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="corpCertAttach" varStatus="status">
			<tr>
                <td>
			       <a href="${ctx}/corp/corpCertAttach/form?id=${corpCertAttach.id}">${ status.index + 1}</a>
			    </td>
			    <td>
			    <c:choose>
                    <c:when test="${corpCertAttach.certType == 1}">营业执照</c:when>
                    <c:when test="${corpCertAttach.certType == 2}">资质证书</c:when>
                    <c:otherwise>其他</c:otherwise>
                </c:choose>
			    </td>
                <td>
					${corpCertAttach.certNo}
				</td>
				<td><a href="${ctx}/corp/corpCertAttach/form?id=${corpCertAttach.id}">
					${corpCertAttach.photoName}
				</a></td>
				<td>
					<fmt:formatDate value="${corpCertAttach.updateDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<td>
					${corpCertAttach.remarks}
				</td>
				<shiro:hasPermission name="corp:corpCertAttach:edit"><td>
    				<a href="${ctx}/corp/corpCertAttach/form?id=${corpCertAttach.id}">修改</a>
					<a href="${ctx}/corp/corpCertAttach/delete?id=${corpCertAttach.id}" onclick="return confirmx('确认要删除该企业证照吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>

	<ul id="certAttachList">
        <c:forEach items="${page.list}" var="corpCertAttach">
        <li><img src="${corpCertAttach.url}" alt="${corpCertAttach.photoName}"></li>
        </c:forEach>
      </ul>

</body>
</html>