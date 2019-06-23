<%@ page contentType="text/html;charset=UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ taglib prefix="fns" uri="/WEB-INF/tlds/fns.tld" %>
<%@ taglib prefix="sys" tagdir="/WEB-INF/tags/sys" %>

<c:set var="ctx" value="${pageContext.request.contextPath}${fns:getAdminPath()}"/>

<c:set var="fctx" value="${pageContext.request.contextPath}${fns:getFrontPath()}"/>
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
	<title>企业注册</title>
	<meta name="decorator" content="default"/>
	<style type="text/css">
      html,body,table{background-color:#f5f5f5;width:100%;text-align:center;}.form-register-heading{font-family:Helvetica, Georgia, Arial, sans-serif, 黑体;font-size:30px;margin-bottom:20px;color:#0663a2;}
      .form-register{margin:auto;position:absolute;text-align:left;width:950px;padding:25px 29px 29px;margin:0 auto 20px;background-color:#fff;border:1px solid #e5e5e5;
        	-webkit-border-radius:5px;-moz-border-radius:5px;border-radius:5px;-webkit-box-shadow:0 1px 2px rgba(0,0,0,.05);-moz-box-shadow:0 1px 2px rgba(0,0,0,.05);box-shadow:0 1px 2px rgba(0,0,0,.05);}
      .form-register .checkbox{margin-bottom:10px;color:#0663a2;} .form-register .input-label{font-size:16px;line-height:23px;color:#999;}
      .form-register .input-block-level{font-size:16px;height:auto;margin-bottom:15px;padding:7px;*width:283px;*padding-bottom:0;_padding:7px 7px 9px 7px;}
      .form-register .btn.btn-large{font-size:16px;} .form-register #themeSwitch{position:absolute;right:15px;bottom:10px;}
      .form-register div.validateCode {padding-bottom:15px;} .mid{vertical-align:middle;}
	  .form-register {margin:auto;position: absolute; top: 100px; left: 0; bottom: 0px; right: 0;} 
	  .form-register .control-group {margin-bottom:8px;}
	  .form-register .control-label {padding-top:3px;} .form-register .controls {text-align:left;overflow-x:auto;overflow-y:hidden;}
	  .form-register .controls label.error {background-position:0 2px;}      
	  .input-xlarge {width:300px;}.input-xxlarge {width:460px;}
      .help-block,.help-inline {color:#aaaaaa;} .alert {margin-bottom:10px;}
      .header{height:80px;padding-top:20px;} .alert{position:relative;width:300px;margin:0 auto;*padding-bottom:0px;}
      label.error{background:none;width:270px;font-weight:normal;color:inherit;margin:0;}

      body{
          background:#fff url("${ctxStatic}/images/loginback.jpg") no-repeat left top;
          background-size:100%;
          height:100%;
      }
      html,body{ margin:0px; height:100%; }
      #registerBody {height:100%; }
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
			
			$("#provinceid").change(function(){
				var parentId = $("#provinceid").val();
				var sltCity=document.inputForm.cityid;			
				sltCity.length = 1;
				
		    	$.get("${fctx}/base/region/treeData?level=&parentId="+parentId,
		    		{},
		    		function(data){
		    			var count=data.length;
		    			for(var i=0;i<count;i++){
		    				sltCity[i+1] = new Option(data[i].name, data[i].id);
		    			}
		    	    }
		    	);
			});
			
			$("#cityid").change(function(){
				var parentId = $("#cityid").val();
				var county=document.inputForm.countyid;
				county.length = 1;
				
		    	$.get("${fctx}/base/region/treeData?level=&parentId="+parentId,
		    		{},
		    		function(data){
		    			var count=data.length;
		    			for(var i=0;i<count;i++){
		    				county[i+1] = new Option(data[i].name, data[i].id);
		    			}
		    	    }
		    	);
			});			
		});
	</script>
</head>
<body id="registerBody">
    <h1 class="form-register-heading">企业注册申请</h1>
	<form:form id="inputForm" name="inputForm" class="form-register" modelAttribute="corpBasicInfoApplication" action="${fctx}/corp/corpRegisterApplication/save" 
	method="post" ENCTYPE="multipart/form-data">
		<form:hidden path="id"/>
		<form:hidden path="photo"/>
		
		<sys:message content="${message}"/>	
		
		<form:hidden path="type" value="2"/>	

		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span6">
					<div class="control-group">
						<label class="control-label">统一社会信用代码：</label>
						<div class="controls">
							<form:input path="tyshxydm" htmlEscape="false" minlength="18" maxlength="18" class="input-xlarge required"/>
							<span class="help-inline"><font color="red">*</font> </span>
						</div>						
					</div>
				</div>

				<div class="span6">
					<div class="control-group">
						<label class="control-label">企业名称：</label>
						<div class="controls">
							<form:input path="qymc" htmlEscape="false" maxlength="100"
								class="input-xlarge required" />
							<span class="help-inline"><font color="red">*</font> </span>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span4">
						<label class="control-label">省：</label>
						<div class="controls">
							<form:select path="provinceid" class="input-large">
							  <form:option value="0" label="请选择所在省份"/>
							  <form:options items="${fns:getRegionList('1','')}" itemLabel="name" itemValue="id" htmlEscape="false"/>
							</form:select>
							<span class="help-inline"><font color="red">*</font> </span>
						</div>
				</div>
				<div class="span4">
						<label class="control-label">市：</label>
						<div class="controls">
							<form:select path="cityid" class="input-large">
							  <form:option value="0" label="请选择所在城市"/>
							</form:select>		
							<span class="help-inline"><font color="red">*</font> </span>			
						</div>
				</div>	
				<div class="span4">
						<label class="control-label">区/县：</label>
						<div class="controls">
							<form:select path="countyid" class="input-large">
							  <form:option value="0" label="请选择所在区/县"/>
							</form:select>	
							<span class="help-inline"><font color="red">*</font> </span>											
						</div>
				</div>				
			</div>
		</div>		
		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span6">
					<div class="control-group">
						<label class="control-label">注册地址：</label>
						<div class="controls">
							<form:input path="zcdd" htmlEscape="false" maxlength="100" class="input-xlarge required" />
							<span class="help-inline"><font color="red">*</font> </span>
						</div>
					</div>
				</div>
				<div class="span6">
					<div class="control-group">
						<label class="control-label">办公地点：</label>
						<div class="controls">
						    <form:input path="xxdd" htmlEscape="false" maxlength="100" class="input-xlarge required" />
						    <span class="help-inline"><font color="red">*</font> </span>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span4">
					<div class="control-group">
						<label class="control-label">企业联系人：</label>
						<div class="controls">
							<form:input path="lxr" htmlEscape="false" maxlength="20" class="input-large required" />
							<span class="help-inline"><font color="red">*</font> </span>
						</div>
					</div>
				</div>
				<div class="span4">
					<div class="control-group">
						<label class="control-label">联系人手机号：</label>
						<div class="controls">
							<form:input path="lxdh" htmlEscape="false" minlength="11" maxlength="11" class="input-large required" />
							<span class="help-inline"><font color="red">*</font> </span>
						</div>
					</div>
				</div>
				<div class="span4">
					<div class="control-group">
						<label class="control-label">电子信箱：</label>
						<div class="controls">
							<form:input path="email" htmlEscape="false" maxlength="50" class="input-large "/>
						</div>
					</div>
				</div>				
			</div>
		</div>	
		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span6">
					<div class="control-group">
						<label class="control-label">法人代表：</label>
						<div class="controls">
							<form:input path="fddbr" htmlEscape="false" maxlength="100" class="input-large required"/>
							<span class="help-inline"><font color="red">*</font> </span>
						</div>
					</div>
				</div>
				<div class="span6">
					<div class="control-group">
						<label class="control-label">法人代表身份证号：</label>
						<div class="controls">
							<form:input path="fddbrRyid" htmlEscape="false" maxlength="100" class="input-large required"/>
							<span class="help-inline"><font color="red">*</font> </span>
						</div>
					</div>
				</div>
			</div>
		</div>	
		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span12">
					<div class="control-group">
						<label class="control-label">营业执照：</label>
						<div class="controls">
                            
				<form:input path="attachmentFile" type="file" htmlEscape="false" maxlength="200" class="input-xlarge"/>	
				<c:if test="${not empty corpBasicInfoApplication.photo}">
				<a href="${corpBasicInfoApplication.photo}" target="_blank">附件</a>
				</c:if>                            
                            <span class="help-inline"><font color="red">*</font> </span>
						</div>
					</div>
				</div>
			</div>
		</div>		
		<div class="form-actions">
			<input id="btnSubmit" class="btn btn-primary" type="submit" value="提  交 "/>&nbsp;
		</div>
	</form:form>
</body>
</html>