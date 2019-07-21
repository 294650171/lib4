<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>文件导入管理</title>
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
		<li><a href="${ctx}/base/importSrcFile/">文件导入列表</a></li>
		<li class="active"><a href="${ctx}/base/importSrcFile/form?id=${importSrcFile.id}">文件导入<shiro:hasPermission name="base:importSrcFile:edit">${not empty importSrcFile.id?'修改':'添加'}</shiro:hasPermission><shiro:lacksPermission name="base:importSrcFile:edit">查看</shiro:lacksPermission></a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="importSrcFile" action="${ctx}/base/importSrcFile/save" method="post" class="form-horizontal" enctype="multipart/form-data">
		<form:hidden path="id"/>
		<sys:message content="${message}"/>
        <!--<div class="control-group">
			<label class="control-label">类型：</label>
			<div class="controls">
				<form:input path="type" htmlEscape="false" maxlength="32" class="input-xlarge "/>
			</div>
		</div>-->
        <div class="control-group">
            <label class="control-label">请上传文件：</label>
            <div class="controls">
                <input type="file" name="file" />
            </div>
        </div>

		<div class="control-group">
			<label class="control-label">备注：</label>
			<div class="controls">
				<form:textarea path="remarks" htmlEscape="false" rows="4" maxlength="200" class="input-xxlarge "/>
			</div>
		</div>
		<div class="form-actions">
			<shiro:hasPermission name="base:importSrcFile:edit"><input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>