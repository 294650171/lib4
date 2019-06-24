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
		<li class="active"><a href="${ctx}/mycorp/cert/form?id=${corpCert.id}">企业资质修改</a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="corpCert" action="${ctx}/mycorp/cert/upload" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<form:hidden path="corpId"/>
		<form:hidden path="tyshxydm"/>
		
		<form:hidden path="certNo"/>
		
		<sys:message content="${message}"/>
		<div class="control-group">
			<label class="control-label">资质类别：</label>
			<div class="controls">
			<!--
				<form:input path="certType" htmlEscape="false" maxlength="50" class="input-xlarge "/>
				-->
				${corpCert.certType }
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">资质证书号：</label>
			<div class="controls">
			<!--
				<form:input path="certNo" htmlEscape="false" maxlength="50" class="input-xlarge "/>
				-->
				${corpCert.certNo }
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">资质名称：</label>
			<div class="controls">
			<!--
				<form:input path="certName" htmlEscape="false" maxlength="200" class="input-xlarge "/>
				-->
				${corpCert.certName }
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">发证日期：</label>
			<div class="controls">
			<!--
				<input name="issueDate" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
					value="<fmt:formatDate value="${corpCert.issueDate}" pattern="yyyy-MM-dd"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd',isShowClear:false});"/>
					-->
				<fmt:formatDate value="${corpCert.issueDate}" pattern="yyyy-MM-dd"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">证书有效期：</label>
			<div class="controls">
			<!--
				<input name="validDate" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
					value="<fmt:formatDate value="${corpCert.validDate}" pattern="yyyy-MM-dd"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd',isShowClear:false});"/>
					-->
				<fmt:formatDate value="${corpCert.validDate}" pattern="yyyy-MM-dd"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">发证机关：</label>
			<div class="controls">
			<!--
				<form:input path="issueAuthority" htmlEscape="false" maxlength="100" class="input-xlarge "/>
				-->
				${corpCert.issueAuthority }
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">资质等级：</label>
			<div class="controls">
			<!--
				<form:input path="certLevel" htmlEscape="false" maxlength="50" class="input-xlarge "/>
				-->
				${corpCert.certLevel }
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">业务类型：</label>
			<div class="controls">
			<!-- 
				<form:input path="tradeType" htmlEscape="false" maxlength="50" class="input-xlarge "/>
				-->
				${corpCert.tradeType }
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">专业种类：</label>
			<div class="controls">
			    <!--  
				<form:input path="majorType" htmlEscape="false" maxlength="50" class="input-xlarge "/>
				-->
				${corpCert.majorType }
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