<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>密码重置申请管理</title>
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
		<li class="active"><a href="${ctx}/corp/resetPasswordApply/">密码重置申请列表</a></li>
		<shiro:hasPermission name="corp:resetPasswordApply:edit"><li><a href="${ctx}/corp/resetPasswordApply/form">密码重置申请添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="resetPasswordApply" action="${ctx}/corp/resetPasswordApply/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>统一社会信用代码</th>
				<th>企业名称</th>
				<th>附件</th>
				<th>手机号</th>
				<th>电子信箱</th>
				<th>申请日期</th>
				<th>状态</th>
				<th>备注</th>
				<shiro:hasPermission name="corp:resetPasswordApply:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="resetPasswordApply">
			<tr>
				<td><a href="${ctx}/corp/resetPasswordApply/form?id=${resetPasswordApply.id}">
					${resetPasswordApply.entityCode}
				</a></td>
				<td>
					${resetPasswordApply.entityName}
				</td>
				<td>
					${resetPasswordApply.attach}
				</td>				
				<td>
					${resetPasswordApply.mobile}
				</td>
				<td>
					${resetPasswordApply.email}
				</td>				
				<td>
					<fmt:formatDate value="${resetPasswordApply.applyDate}" pattern="yyyy-MM-dd HH:mm"/>
				</td>
				<td>
					${fns:getDictLabel(resetPasswordApply.status, 'reset_password_apply_status', '')}	
				</td>
				<td>
					${resetPasswordApply.remarks}
				</td>																
				<shiro:hasPermission name="corp:resetPasswordApply:edit"><td>
    				<a href="${ctx}/corp/resetPasswordApply/form?id=${resetPasswordApply.id}">修改</a>
					<a href="${ctx}/corp/resetPasswordApply/delete?id=${resetPasswordApply.id}" onclick="return confirmx('确认要删除该密码重置申请吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>