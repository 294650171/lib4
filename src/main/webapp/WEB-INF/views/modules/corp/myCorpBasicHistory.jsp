<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
<title>修改记录信息</title>
<meta name="decorator" content="default" />
<script type="text/javascript">
	$(document).ready( function() { });
</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li ><a href="${ctx}/mycorp/basicinfo/info">基本信息</a></li>
		<li class="active"><a href="${ctx}/mycorp/basicinfo/history">修改历史记录</a></li>
	</ul>
	<br />
    <c:forEach items="${list}" var="item">
    <table id="contentTable" class="table table-striped table-bordered table-condensed">
    		<thead>
    			<tr>
    				<th>单位名称</th>
    				<th>省</th>
    				<th>市</th>
    				<th>县/区</th>
    				<th>注册地址</th>
    			</tr>
    		</thead>
    		<tbody>
    		    <td>${item.qymc}</td>
    		    <td>${item.province}</td>
    		    <td>${item.city}</td>
    		    <td>${item.county}</td>
    		    <td>${item.zcdd}</td>
    		</tbody>
    </table>

    <act:histoicFlow procInsId="${item.procInsId}"/>
	</c:forEach>

</body>
</html>