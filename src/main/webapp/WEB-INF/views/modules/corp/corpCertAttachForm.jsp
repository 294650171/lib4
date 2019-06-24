<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>企业证照管理</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			//$("#name").focus();
			$("#inputForm").validate({
				submitHandler: function(form){
					loading('正在提交，请稍等...');
					form.submit();
				},
				errorContainer: "#messageBox",
				errorPlacement: function(error, element) {
					$("#messageBox").text("输入有误，请先更正。");
					if (element.is(":checkbox")||element.is(":radio")||element.parent().is(".input-append")){
						error.appendTo(element.parent().parent());
					} else {
						error.insertAfter(element);
					}
				}
			});
		});
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li><a href="${ctx}/corp/corpCertAttach/">企业证照列表</a></li>
		<li class="active"><a href="${ctx}/corp/corpCertAttach/form?id=${corpCertAttach.id}">企业证照查看</a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="corpCertAttach" action="${ctx}/corp/corpCertAttach/save" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<form:hidden path="tyshxydm"/>
		<form:hidden path="zzjgdm"/>
		<sys:message content="${message}"/>
		<div class="control-group">
			<label class="control-label">证照类型：</label>
			<div class="controls">
			    <form:select path="certType" class="input-large ">
			        <form:option value="">请选择</form:option>
			        <form:option value="1">营业执照</form:option>
			        <form:option value="2">资质证书</form:option>
			    </form:select>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">证照号码：</label>
			<div class="controls">
				<form:input path="certNo" htmlEscape="false" maxlength="50" class="input-xlarge"/>
			</div>
		</div>
		<!--<div class="control-group">
			<label class="control-label">名称：</label>
			<div class="controls">
				<form:input path="name" htmlEscape="false" maxlength="200" class="input-xlarge "/>
			</div>
		</div>-->
		<div class="control-group">
			<label class="control-label">资质证书附件：</label>
			<div class="controls">
				<form:hidden id="nameImage" path="url" htmlEscape="false" maxlength="255" class="input-xlarge"/>
                <sys:ckfinder input="nameImage" type="images" uploadPath="/photo" selectMultiple="false" maxWidth="600" maxHeight="600" />
			</div>
		</div>

		<div class="control-group">
			<label class="control-label">备注：</label>
			<div class="controls">
				<form:textarea path="remarks" htmlEscape="false" rows="4" maxlength="200" class="input-xxlarge "/>
			</div>
		</div>
		<div class="form-actions">
		<!--  
			<shiro:hasPermission name="corp:corpCertAttach:edit"><input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;</shiro:hasPermission>
			-->
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>