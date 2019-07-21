<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>corp_cert管理</title>
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
		<li><a href="${ctx}/mycorp/cert/">资质列表</a></li>
		<li class="active"><a href="${ctx}/mycorp/cert/cert?id=${corpCert.id}">企业资质<shiro:hasPermission name="mycorp:cert:edit">${not empty corpCert.id?'修改':'添加'}</shiro:hasPermission><shiro:lacksPermission name="mycorp:cert:edit">查看</shiro:lacksPermission></a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="corpCert" action="${ctx}/mycorp/cert/upload" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<form:hidden path="corpId"/>
		<form:hidden path="tyshxydm"/>
		
		<sys:message content="${message}"/>
        <div class="control-group">
			<label class="control-label">资质类别：</label>
			<div class="controls">
                <form:select path="certTypeId" class="input-xlarge required">
					<form:options items="${fns:getDictList('corp_cert_type')}" itemLabel="label" itemValue="value" htmlEscape="false"/>
				</form:select>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">证书编号：</label>
			<div class="controls">
				<form:input path="certNo" htmlEscape="false" maxlength="50" class="input-xlarge required "/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">资质名称：</label>
			<div class="controls">
				<form:input path="certName" htmlEscape="false" maxlength="200" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">发证日期：</label>
			<div class="controls">
				<input name="issueDate" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate required"
					value="<fmt:formatDate value="${corpCert.issueDate}" pattern="yyyy-MM-dd"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd',isShowClear:false});"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">证书有效期起：</label>
			<div class="controls">
				<input name="validDateStart" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate required"
					value="<fmt:formatDate value="${corpCert.validDate}" pattern="yyyy-MM-dd"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd',isShowClear:false});"/>
				<span class="help-inline"><font color="red">*</font> </span>
				如证书上无此项，可以填发证日期
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">证书有效期止：</label>
			<div class="controls">
				<input name="validDate" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate required"
					value="<fmt:formatDate value="${corpCert.validDate}" pattern="yyyy-MM-dd"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd',isShowClear:false});"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">发证机关：</label>
			<div class="controls">
				<form:input path="issueAuthority" htmlEscape="false" maxlength="100" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">资质等级：</label>
			<div class="controls">
				<form:input path="certLevel" htmlEscape="false" maxlength="50" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">序列名称：</label>
			<div class="controls">
				<form:input path="tradeType" htmlEscape="false" maxlength="50" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">专业名称：</label>
			<div class="controls">
				<form:input path="majorType" htmlEscape="false" maxlength="50" class="input-xlarge "/>
			</div>
		</div>
        <div class="control-group" id="photoDiv">
			<label class="control-label">资质证书：</label>
            <div class="controls">
				<form:hidden id="nameImage" path="photo" htmlEscape="false" maxlength="255" class="input-xlarge"/>
				<sys:ckfinder input="nameImage" type="images" uploadPath="/photo" selectMultiple="false" maxWidth="600" maxHeight="600"/>
			</div>
		</div>
		<div class="form-actions">
			<shiro:hasPermission name="mycorp:cert:edit"><input id="btnSubmit" class="btn btn-primary" type="submit" value=" 保 存 "/>&nbsp;</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>