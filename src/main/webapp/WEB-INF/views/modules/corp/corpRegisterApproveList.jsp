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
		<li class="active"><a href="${ctx}/corp/corpRegisterApply/approveList">密码重置申请列表</a></li>
	</ul>
	<form:form id="searchForm" modelAttribute="resetPasswordApply" action="${ctx}/corp/resetPasswordApprove/approveList" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
			<li><label class="control-label">状态：</label>
				<form:select path="status" class="input-large ">
					<form:option value="0" label="待审核"/>
					<form:option value="1" label="已审核"/>
					<form:option value="2" label="已退回"/>
				</form:select>
			</li>								
			<li class="btns">&nbsp;&nbsp;&nbsp;<input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/>
			</li>
			<li class="clearfix"></li>		
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
				<th>备注</th>
				<th>状态</th>
				<shiro:hasPermission name="corp:resetPasswordApply:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="resetPasswordApply">
			<tr>
				<td><a href="${ctx}/corp/resetPasswordApprove/approveForm?id=${resetPasswordApply.id}">
					${resetPasswordApply.entityCode}
				</a></td>
				<td>
					${resetPasswordApply.entityName}
				</td>
				<td>
					<a href="${resetPasswordApply.attach}" target="_blank">附件</a>
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
					${resetPasswordApply.remarks}
				</td>				
				<td>
					${fns:getDictLabel(resetPasswordApply.status, 'reset_password_apply_status', '')}
				</td>
																
				<shiro:hasPermission name="corp:resetPasswordApply:edit"><td>
    				<a href="${ctx}/corp/resetPasswordApprove/approveForm?id=${resetPasswordApply.id}">
    				<c:choose>
    				  <c:when test="${resetPasswordApply.status eq '1' }">审核</c:when>
    				  <c:otherwise>查看</c:otherwise>
    				</c:choose>
    				</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>