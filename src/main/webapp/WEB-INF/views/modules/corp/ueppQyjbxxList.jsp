<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>企业基本信息管理</title>
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
		function synchCert(qymc){
			// 发送任务完成请求

		$.ajax({
				type : "POST",
				url : '${ctx}/corp/synch',
				data : {
					"qymc" : qymc
				},
				success : function(data) {
					top.$.jBox.tip("任务完成:" + data.msg);
					//location = '${pageContext.request.contextPath}' + data;
					//location.reload();
				},
				dataType : "json"
			});
		}
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/corp/ueppQyjbxx/">企业基本信息列表</a></li>
		<shiro:hasPermission name="corp:ueppQyjbxx:edit"><li><a href="${ctx}/corp/ueppQyjbxx/form">企业基本信息添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="ueppQyjbxx" action="${ctx}/corp/ueppQyjbxx/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li><label>企业代码：</label> <form:input path="qyid"
					htmlEscape="false" maxlength="100" class="input-large" />
			</li>
			<li><label>企业名称：</label> <form:input path="qymc"
					htmlEscape="false" maxlength="100" class="input-large" />
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
				<th>组织机构代码(社会信用代码)</th>
				<th>单位地址</th>
				<th>企业联系电话</th>
				<th>单位类型</th>
				<th>统一社会信用代码</th>
				<th>属地</th>
				<shiro:hasPermission name="corp:ueppQyjbxx:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="ueppQyjbxx">
			<tr>
				<td><a href="${ctx}/corp/ueppQyjbxx/form?qyid=${ueppQyjbxx.qyid}">
					${ueppQyjbxx.qymc}
				</a></td>
				<td> ${ueppQyjbxx.zzjgdm} </td>
				<td> ${ueppQyjbxx.xxdd} </td>
				<td> ${ueppQyjbxx.lxdh} </td>
				<td>  </td>
				<td> ${ueppQyjbxx.tyshxydm} </td>
				<td> ${ueppQyjbxx.province}-${ueppQyjbxx.city}-${ueppQyjbxx.county} </td>
				<shiro:hasPermission name="corp:ueppQyjbxx:edit"><td>
					<a href="#" onclick="synchCert('${ueppQyjbxx.qymc}');">同步资质</a>
    				<a href="${ctx}/corp/ueppQyjbxx/form?qyid=${ueppQyjbxx.qyid}">修改</a>
					<a href="${ctx}/corp/ueppQyjbxx/delete?qyid=${ueppQyjbxx.qyid}" onclick="return confirmx('确认要删除该企业基本信息吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>