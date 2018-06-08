<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>corp_cert管理</title>
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
		<li class="active"><a href="${ctx}/cert/corpCert/">企业资质列表</a></li>
		<shiro:hasPermission name="cert:corpCert:edit"><li><a href="${ctx}/cert/corpCert/form">企业资质添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="corpCert" action="${ctx}/cert/corpCert/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li><label>企业代码：</label>
				<form:input path="corpId" htmlEscape="false" maxlength="100" class="input-medium"/>
			</li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>企业代码</th>
				<th>资质类别</th>
				<th>资质证书号</th>
				<th>资质名称</th>
				<th>发证日期</th>
				<th>证书有效期</th>
				<th>资质等级</th>
				<th>业务类型</th>
				<th>专业种类</th>
				<th>状态</th>
				<th>标记</th>
				<shiro:hasPermission name="cert:corpCert:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="corpCert">
			<tr>
				<td><a href="${ctx}/cert/corpCert/form?id=${corpCert.id}">
					${corpCert.corpId}
				</a></td>
				<td>
					${corpCert.certType}
				</td>
				<td>
					${corpCert.certNo}
				</td>
				<td>
					${corpCert.certName}
				</td>
				<td>
					<fmt:formatDate value="${corpCert.issueDate}" pattern="yyyy-MM-dd"/>
				</td>
				<td>
					<fmt:formatDate value="${corpCert.validDate}" pattern="yyyy-MM-dd"/>
				</td>
				<td>
					${corpCert.certLevel}
				</td>
				<td>
					${corpCert.tradeType}
				</td>
				<td>
					${corpCert.majorType}
				</td>
				<td>
					${corpCert.statuslabel}
				</td>
				<td>
					${corpCert.tag}
				</td>
				<shiro:hasPermission name="cert:corpCert:edit"><td>
    				<a href="${ctx}/cert/corpCert/form?id=${corpCert.id}">修改</a>
					<a href="${ctx}/cert/corpCert/delete?id=${corpCert.id}" onclick="return confirmx('确认要删除该corp_cert吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>