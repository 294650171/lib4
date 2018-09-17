<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>网站数据管理</title>
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
		<li class="active"><a href="${ctx}/crawler/qualitySuperPub/">网站数据列表</a></li>
		<shiro:hasPermission name="crawler:qualitySuperPub:edit"><li><a href="${ctx}/crawler/qualitySuperPub/form">网站数据添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="qualitySuperPub" action="${ctx}/crawler/qualitySuperPub/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li><label>工程名称：</label>
				<form:input path="projectName" htmlEscape="false" maxlength="64" class="input-medium"/>
			</li>
			<li><label>施工单位：</label>
				<form:input path="constructionCorp" htmlEscape="false" maxlength="64" class="input-medium"/>
			</li>
			<li><label>监理单位：</label>
				<form:input path="supervisorCorp" htmlEscape="false" maxlength="64" class="input-medium"/>
			</li>
			<li><label>项目经理：</label>
				<form:input path="projectManager" htmlEscape="false" maxlength="64" class="input-medium"/>
			</li>
			<li><label>项目总监：</label>
				<form:input path="projectDirector" htmlEscape="false" maxlength="64" class="input-medium"/>
			</li>
			<li><label>质量监督部门：</label>
				<form:input path="qualitySuperDept" htmlEscape="false" maxlength="64" class="input-medium"/>
			</li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>工程名称</th>
				<th>施工单位</th>
				<th>监理单位</th>
				<th>项目经理</th>
				<th>项目总监</th>
				<th>质量监督部门</th>
				<th>注册日期</th>
				<th>开工日期</th>
				<th>主体分部计划完工日期</th>
				<th>竣工验收日期</th>
				<th>链接地址</th>
				<th>update_date</th>
				<shiro:hasPermission name="crawler:qualitySuperPub:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="qualitySuperPub">
			<tr>
				<td><a href="${ctx}/crawler/qualitySuperPub/form?id=${qualitySuperPub.id}">
					${qualitySuperPub.projectName}
				</a></td>
				<td>
					${qualitySuperPub.constructionCorp}
				</td>
				<td>
					${qualitySuperPub.supervisorCorp}
				</td>
				<td>
					${qualitySuperPub.projectManager}
				</td>
				<td>
					${qualitySuperPub.projectDirector}
				</td>
				<td>
					${qualitySuperPub.qualitySuperDept}
				</td>
				<td>
					<fmt:formatDate value="${qualitySuperPub.regDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<td>
					<fmt:formatDate value="${qualitySuperPub.startDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<td>
					<fmt:formatDate value="${qualitySuperPub.finishDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<td>
					<fmt:formatDate value="${qualitySuperPub.acceptDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<td>
					${qualitySuperPub.url}
				</td>
				<td>
					<fmt:formatDate value="${qualitySuperPub.updateDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<shiro:hasPermission name="crawler:qualitySuperPub:edit"><td>
    				<a href="${ctx}/crawler/qualitySuperPub/form?id=${qualitySuperPub.id}">修改</a>
					<a href="${ctx}/crawler/qualitySuperPub/delete?id=${qualitySuperPub.id}" onclick="return confirmx('确认要删除该网站数据吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>