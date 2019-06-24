<%@ page contentType="text/html;charset=UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ taglib prefix="fns" uri="/WEB-INF/tlds/fns.tld" %>
<%@ taglib prefix="sys" tagdir="/WEB-INF/tags/sys" %>

<c:set var="ctx" value="${pageContext.request.contextPath}${fns:getAdminPath()}"/>

<c:set var="ctxStatic" value="${pageContext.request.contextPath}/static"/>

<script src="${ctxStatic}/jquery/jquery-1.8.3.min.js" type="text/javascript"></script>
<link href="${ctxStatic}/bootstrap/2.3.1/css_${not empty cookie.theme.value ? cookie.theme.value : 'cerulean'}/bootstrap.min.css" type="text/css" rel="stylesheet" />
<script src="${ctxStatic}/bootstrap/2.3.1/js/bootstrap.min.js" type="text/javascript"></script>
<link href="${ctxStatic}/bootstrap/2.3.1/awesome/font-awesome.min.css" type="text/css" rel="stylesheet" />

<link href="${ctxStatic}/jquery-select2/3.4/select2.min.css" rel="stylesheet" />
<script src="${ctxStatic}/jquery-select2/3.4/select2.min.js" type="text/javascript"></script>
<link href="${ctxStatic}/jquery-validation/1.11.0/jquery.validate.min.css" type="text/css" rel="stylesheet" />
<script src="${ctxStatic}/jquery-validation/1.11.0/jquery.validate.min.js" type="text/javascript"></script>
<link href="${ctxStatic}/jquery-jbox/2.3/Skins/Bootstrap/jbox.min.css" rel="stylesheet" />
<script src="${ctxStatic}/jquery-jbox/2.3/jquery.jBox-2.3.min.js" type="text/javascript"></script>
<script src="${ctxStatic}/My97DatePicker/WdatePicker.js" type="text/javascript"></script>
<script src="${ctxStatic}/common/mustache.min.js" type="text/javascript"></script>
<link href="${ctxStatic}/common/jeesite.css" type="text/css" rel="stylesheet" />

<link rel="shortcut icon" href="${ctxStatic}/favicon.ico" type="image/x-icon" />

<script src="${ctxStatic}/common/jeesite.js" type="text/javascript"></script>
<script type="text/javascript">var ctx = '${ctx}', ctxStatic='${ctxStatic}';</script>

<html>
<head>
	<title>密码重置申请管理</title>
	<meta name="decorator" content="default"/>
	<style type="text/css">
      html,body,table{background-color:#f5f5f5;width:100%;text-align:center;}.form-resetPass-heading{font-family:Helvetica, Georgia, Arial, sans-serif, 黑体;font-size:30px;margin-bottom:20px;color:#0663a2;}
      .form-resetPass{margin:auto;position:absolute;text-align:left;width:800px;height:600px;padding:25px 29px 29px;margin:0 auto 20px;background-color:#fff;border:1px solid #e5e5e5;
        	-webkit-border-radius:5px;-moz-border-radius:5px;border-radius:5px;-webkit-box-shadow:0 1px 2px rgba(0,0,0,.05);-moz-box-shadow:0 1px 2px rgba(0,0,0,.05);box-shadow:0 1px 2px rgba(0,0,0,.05);}
      .form-resetPass .checkbox{margin-bottom:10px;color:#0663a2;} .form-resetPass .input-label{font-size:16px;line-height:23px;color:#999;}
      .form-resetPass .input-block-level{font-size:16px;height:auto;margin-bottom:15px;padding:7px;*width:283px;*padding-bottom:0;_padding:7px 7px 9px 7px;}
      .form-resetPass .btn.btn-large{font-size:16px;} .form-resetPass #themeSwitch{position:absolute;right:15px;bottom:10px;}
      .form-resetPass div.validateCode {padding-bottom:15px;} .mid{vertical-align:middle;}
	  .form-resetPass {margin:auto;position: absolute; top: 100px; left: 0; bottom: 0px; right: 0;} 
	  .form-resetPass .control-group {margin-bottom:8px;}
	  .form-resetPass .control-label {padding-top:3px;} .form-resetPass .controls {text-align:left;overflow-x:auto;overflow-y:hidden;}
	  .form-resetPass .controls label.error {background-position:0 2px;}      
	  .input-xlarge {width:300px;}.input-xxlarge {width:460px;}
      .help-block,.help-inline {color:#aaaaaa;} .alert {margin-bottom:10px;}
      .header{height:80px;padding-top:20px;} .alert{position:relative;width:300px;margin:0 auto;*padding-bottom:0px;}
      label.error{background:none;width:270px;font-weight:normal;color:inherit;margin:0;}

      body{
          background-size:100%;
          height:100%;
      }
      html,body{ margin:0px; height:100%; }
      #resetPassBody {height:100%; }
    </style>	
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
			
			$("#btnSubmit").click(function(){
				var attach = $("#attach").val();
				var attachmentFile = $("#attachmentFile").val();
				if(attach == "" && attachmentFile == ""){
					alert("附件不能为空");
					return;
				}
				$("#inputForm").submit();
				top.$('.jbox-body .jbox-icon').css('top','55px');
			});				
			
		});
	</script>
</head>
<body id="resetPassBody">
<br/>
    <h1 class="form-resetPass-heading">密码重置申请</h1>
    
	<form:form id="inputForm" modelAttribute="resetPasswordApply" action="${pageContext.request.contextPath}${fns:getFrontPath()}/corp/resetPasswordApply/save" 
	method="post" class="form-resetPass" ENCTYPE="multipart/form-data">
		<sys:message content="${message}"/>	
		<form:hidden path="id"/>
		<form:hidden path="attach"/>	
		<div class="control-group">
			<label class="control-label">统一社会信用代码：</label>
			<div class="controls">
				<form:input path="entityCode" htmlEscape="false" minlength="18" maxlength="18" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">企业名称：</label>
			<div class="controls">
				<form:input path="entityName" htmlEscape="false" maxlength="64" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">附件：</label>
			<div class="controls">
				<form:input path="attachmentFile" type="file" htmlEscape="false" maxlength="200" class="input-xlarge"/>	
				<c:if test="${not empty resetPasswordApply.attach}">
				<a href="${resetPasswordApply.attach}" target="_blank">附件</a>
				</c:if>				
				<span class="help-inline"><font color="red">*</font> </span>		
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">联系人手机号：</label>
			<div class="controls">
				<form:input path="mobile" htmlEscape="false" minlength="11" maxlength="11" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> 用于接收重置密码，请填写正确。</span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">电子邮箱：</label>
			<div class="controls">
				<form:input path="email" htmlEscape="false" maxlength="64" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> 用于接收重置密码，请填写正确。</span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">备注：</label>
			<div class="controls">
				<form:textarea path="remarks" htmlEscape="false" rows="4" maxlength="200" class="input-xxlarge "/>
			</div>
		</div>
		<c:if test="${resetPasswordApply.status eq '0' }">
		<div class="control-group">
			<label class="control-label">状态：</label>
			<div class="controls">
				退回
			</div>
		</div>		
		<div class="control-group">
			<label class="control-label">审核意见：</label>
			<div class="controls">
				${resetPasswordApply.approveOpinion }
			</div>
		</div>		
		</c:if>
		<div class="control-group">
			<label class="control-label"></label>
			<div class="controls">
				<input id="btnSubmit" class="btn btn-primary" type="button" value="提 交"/>&nbsp;&nbsp;
			</div>
		</div>
		<BR><BR>
	</form:form>
	<BR><BR>
</body>
</html>