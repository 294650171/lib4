<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>企业密码找回申请管理</title>
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
		<li class="active"><a href="${ctx}/corp/corpAccountResetPassApplication/">企业密码找回申请列表</a></li>
		<shiro:hasPermission name="corp:corpAccountResetPassApplication:edit"><li><a href="${ctx}/corp/corpAccountResetPassApplication/form">企业密码找回申请添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="corpAccountResetPassApplication" action="${ctx}/corp/corpAccountResetPassApplication/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li><label>企业名称：</label>
				<form:input path="name" htmlEscape="false" maxlength="100" class="input-medium"/>
			</li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>统一社会信用代码</th>
				<th>组织机构代码</th>
				<th>企业名称</th>
				<th>联系人手机号码</th>
				<th>附件URL</th>
				<th>update_date</th>
				<th>备注</th>
				<shiro:hasPermission name="corp:corpAccountResetPassApplication:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="corpAccountResetPassApplication">
			<tr>
				<td><a href="${ctx}/corp/corpAccountResetPassApplication/form?id=${corpAccountResetPassApplication.id}">
					${corpAccountResetPassApplication.tyshxydm}
				</a></td>
				<td>
					${corpAccountResetPassApplication.zzjgdm}
				</td>
				<td>
					${corpAccountResetPassApplication.name}
				</td>
				<td>
					${corpAccountResetPassApplication.cellphone}
				</td>
				<td>
					${corpAccountResetPassApplication.url}
				</td>
				<td>
					<fmt:formatDate value="${corpAccountResetPassApplication.updateDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<td>
					${corpAccountResetPassApplication.remarks}
				</td>
				<shiro:hasPermission name="corp:corpAccountResetPassApplication:edit"><td>
    				<a href="${ctx}/corp/corpAccountResetPassApplication/form?id=${corpAccountResetPassApplication.id}">修改</a>
					<a href="${ctx}/corp/corpAccountResetPassApplication/delete?id=${corpAccountResetPassApplication.id}" onclick="return confirmx('确认要删除该企业密码找回申请吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>