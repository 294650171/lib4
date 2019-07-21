<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>文件导入管理</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			
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
		<li class="active"><a href="${ctx}/base/importSrcFile/">文件导入列表</a></li>
		<shiro:hasPermission name="base:importSrcFile:edit"><li><a href="${ctx}/base/importSrcFile/form">文件导入添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="importSrcFile" action="${ctx}/base/importSrcFile/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li><label>文件名称：</label>
				<form:input path="name" htmlEscape="false" maxlength="100" class="input-medium"/>
			</li>
			<li><label>类型：</label>
				<form:input path="type" htmlEscape="false" maxlength="32" class="input-medium"/>
			</li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>文件名称</th>
				<th>URL</th>
				<th>类型</th>
				<th>更新日期</th>
				<th>备注</th>
				<shiro:hasPermission name="base:importSrcFile:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="importSrcFile">
			<tr>
				<td><a href="${ctx}/base/importSrcFile/form?id=${importSrcFile.id}">
					${importSrcFile.name}
				</a></td>
				<td>
					${importSrcFile.url}
				</td>
				<td>
					${importSrcFile.type}
				</td>
				<td>
					<fmt:formatDate value="${importSrcFile.updateDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<td>
					${importSrcFile.remarks}
				</td>
				<shiro:hasPermission name="base:importSrcFile:edit"><td>
					<!--<a href="${ctx}/base/importSrcFile/delete?id=${importSrcFile.id}" onclick="return confirmx('确认要删除该文件导入吗？', this.href)">删除</a>-->
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>