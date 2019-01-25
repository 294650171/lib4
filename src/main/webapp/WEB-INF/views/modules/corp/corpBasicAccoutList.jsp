<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>企业基本帐号管理</title>
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
		<li class="active"><a href="${ctx}/corp/corpBasicAccout/">企业基本帐号列表</a></li>
		<shiro:hasPermission name="corp:corpBasicAccout:edit"><li><a href="${ctx}/corp/corpBasicAccout/form">企业基本帐号添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="corpBasicAccout" action="${ctx}/corp/corpBasicAccout/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li><label>name：</label>
				<form:input path="name" htmlEscape="false" maxlength="50" class="input-medium"/>
			</li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>name</th>
				<th>update_date</th>
				<th>remarks</th>
				<shiro:hasPermission name="corp:corpBasicAccout:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="corpBasicAccout">
			<tr>
				<td><a href="${ctx}/corp/corpBasicAccout/form?id=${corpBasicAccout.id}">
					${corpBasicAccout.name}
				</a></td>
				<td>
					<fmt:formatDate value="${corpBasicAccout.updateDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<td>
					${corpBasicAccout.remarks}
				</td>
				<shiro:hasPermission name="corp:corpBasicAccout:edit"><td>
    				<a href="${ctx}/corp/corpBasicAccout/form?id=${corpBasicAccout.id}">修改</a>
					<a href="${ctx}/corp/corpBasicAccout/delete?id=${corpBasicAccout.id}" onclick="return confirmx('确认要删除该企业基本帐号吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>