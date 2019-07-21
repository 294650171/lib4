<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>企业证书管理</title>
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
		<li class="active"><a href="${ctx}/corp/ueppQyzs/">企业证书列表</a></li>
		<shiro:hasPermission name="corp:ueppQyzs:edit"><li><a href="${ctx}/corp/ueppQyzs/form">企业证书添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="ueppQyzs" action="${ctx}/corp/ueppQyzs/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<shiro:hasPermission name="corp:ueppQyzs:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="ueppQyzs">
			<tr>
				<shiro:hasPermission name="corp:ueppQyzs:edit"><td>
    				<a href="${ctx}/corp/ueppQyzs/form?id=${ueppQyzs.id}">修改</a>
					<a href="${ctx}/corp/ueppQyzs/delete?id=${ueppQyzs.id}" onclick="return confirmx('确认要删除该企业证书吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>