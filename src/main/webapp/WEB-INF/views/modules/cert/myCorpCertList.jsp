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
        function synchCert(qymc){
        		$.ajax({
        				type : "POST",
        				url : '${ctx}/corp/synch',
        				data : {
        					"qymc" : qymc
        				},
        				success : function(data) {
        					top.$.jBox.tip("任务完成:" + data.msg + " ,请手动刷新！");
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
		<li class="active"><a href="${ctx}/mycorp/cert/">资质列表</a></li>
		<shiro:hasPermission name="mycorp:cert:edit"><li><a href="${ctx}/mycorp/cert/form">资质添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="corpCert" action="${ctx}/cert/corpCert/" method="post" class="breadcrumb form-search" style="display:none;">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<!--<ul class="ul-form">
			<li><label>企业代码：</label>
				<form:input path="corpId" htmlEscape="false" maxlength="100" class="input-medium"/>
			</li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>-->
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
			    <th>编号</th>
				<th>资质类别</th>
				<th>资质证书号</th>
				<th>资质名称</th>
				<th>证照</th>
				<th>发证日期</th>
				<th>证书有效期</th>
				<th>资质等级</th>
				<th>业务类型</th>
				<th>专业种类</th>
				<th>来源</th>
				<shiro:hasPermission name="mycorp:cert:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="corpCert" varStatus="status">
			<tr>
			    <td>
			        <a href="${ctx}/mycorp/cert/form?id=${corpCert.id}">${ status.index + 1}</a>
			    </td>
				<td>
					${corpCert.certType}
				</td>
				<td>
					${corpCert.certNo}
				</td>
				<td>
					<a href="${ctx}/mycorp/cert/form?id=${corpCert.id}">${corpCert.certName}</a>
				</td>
				<td><a href="${corpCert.photo}" target="_blank">${corpCert.photoName}</a>
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
				    <c:choose>
                        <c:when test="${corpCert.tag eq 'crawler' }">
                           系统
                        </c:when>
                        <c:otherwise>
                            企业
                        </c:otherwise>
                    </c:choose>
				</td>
				<shiro:hasPermission name="mycorp:cert:edit"><td>
    				<a href="${ctx}/mycorp/cert/form?id=${corpCert.id}">修改</a>
					<a href="${ctx}/mycorp/cert/delete?id=${corpCert.id}" onclick="return confirmx('确认要删除该资质吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
	<div class="text-center">
	    <shiro:hasPermission name="mycorp:cert:edit">
	    <input id="btnSubmit" class="btn btn-primary" type="button" value="同  步" onclick="synchCert('${corpCert.qymc}');"/>&nbsp;
	    </shiro:hasPermission>
    </div>

	<div class="alert alert-success">
	注意：<br/>
	1. 如发现企业资质为空，请先点击“同步”按钮从省系统同步资质信息，如同步之后仍然为空，请联系系统技术支持排查问题。<br/>
	2. 一个资质证书号对应一个电子证照
	</div>
</body>
</html>