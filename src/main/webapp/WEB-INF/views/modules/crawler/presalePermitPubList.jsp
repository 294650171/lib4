<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>商品房预售许可证管理</title>
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
		<li class="active"><a href="${ctx}/crawler/presalePermitPub/">商品房预售许可证列表</a></li>
		<shiro:hasPermission name="crawler:presalePermitPub:edit"><li><a href="${ctx}/crawler/presalePermitPub/form">商品房预售许可证添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="presalePermitPub" action="${ctx}/crawler/presalePermitPub/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li><label>单位名称：</label>
				<form:input path="corpName" htmlEscape="false" maxlength="64" class="input-medium"/>
			</li>
			<li><label>商品房屋名称：</label>
				<form:input path="commondityHourseName" htmlEscape="false" maxlength="100" class="input-medium"/>
			</li>
			<li><label>商品房屋坐落：</label>
				<form:input path="commondityHourseAddress" htmlEscape="false" maxlength="200" class="input-medium"/>
			</li>
			<li><label>商品房屋使用性质：</label>
				<form:input path="commondityHourseType" htmlEscape="false" maxlength="32" class="input-medium"/>
			</li>
			<li><label>上市预售建筑面积：</label>
				<form:input path="area" htmlEscape="false" class="input-medium"/>
			</li>
			<li><label>许可证号：</label>
				<form:input path="licenseNo" htmlEscape="false" maxlength="64" class="input-medium"/>
			</li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>单位名称</th>
				<th>商品房屋名称</th>
				<th>商品房屋坐落</th>
				<th>商品房屋使用性质</th>
				<th>上市预售建筑面积</th>
				<th>许可证号</th>
				<th>update_date</th>
				<shiro:hasPermission name="crawler:presalePermitPub:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="presalePermitPub">
			<tr>
				<td><a href="${ctx}/crawler/presalePermitPub/form?id=${presalePermitPub.id}">
					${presalePermitPub.corpName}
				</a></td>
				<td>
					${presalePermitPub.commondityHourseName}
				</td>
				<td>
					${presalePermitPub.commondityHourseAddress}
				</td>
				<td>
					${presalePermitPub.commondityHourseType}
				</td>
				<td>
					${presalePermitPub.area}
				</td>
				<td>
					${presalePermitPub.licenseNo}
				</td>
				<td>
					<fmt:formatDate value="${presalePermitPub.updateDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<shiro:hasPermission name="crawler:presalePermitPub:edit"><td>
    				<a href="${ctx}/crawler/presalePermitPub/form?id=${presalePermitPub.id}">修改</a>
					<a href="${ctx}/crawler/presalePermitPub/delete?id=${presalePermitPub.id}" onclick="return confirmx('确认要删除该商品房预售许可证吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>