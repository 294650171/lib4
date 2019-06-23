<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>企业注册申请管理</title>
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
			
			$("#btnApprove").click(function(){
				$("#status").val("1");
				$(document.getElementById('act.flag')).val("true");
				$("#inputForm").submit();
				top.$('.jbox-body .jbox-icon').css('top','55px');
			});	
			
			$("#btnReject").click(function(){
				var opinion =  $("#approveOpinion").val();
				if(opinion == ""){
					alert("退回时，请填写审核意见！");
					return;
				}
				
	    		top.$.jBox.confirm("确认要退回吗？","系统提示",function(v,h,f){
	    			if(v=="ok"){
	    				$("#status").val("2");
	    				$(document.getElementById('act.flag')).val("false");
	    				$("#inputForm").submit();
	    			}
	    		},{buttonsFocus:1});

				top.$('.jbox-body .jbox-icon').css('top','55px');
			});			
		});
	</script>
</head>
<body>
    <legend>企业注册审核</legend>
	<br/>
	<form:form id="inputForm" modelAttribute="corpBasicInfoApplication" action="${ctx}/corp/corpRegisterApprove/approve" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<form:hidden path="datastate"/>
		
		<form:hidden path="act.taskId"/>
		<form:hidden path="act.procInsId"/>
		
		<form:hidden path="act.flag"/>
		
		<sys:message content="${message}"/>		
		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span6">
					<div class="control-group">
						<label class="control-label">统一社会信用代码：</label>
						<div class="controls">
							${corpBasicInfoApplication.tyshxydm }
						</div>						
					</div>
				</div>

				<div class="span6">
					<div class="control-group">
						<label class="control-label">企业名称：</label>
						<div class="controls">
						    ${corpBasicInfoApplication.qymc }
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span4">
					<div class="control-group">
						<label class="control-label">省：</label>
						<div class="controls">
							${corpBasicInfoApplication.province }
						</div>
					</div>
				</div>
				<div class="span4">
					<div class="control-group">
						<label class="control-label">市：</label>
						<div class="controls">
							${corpBasicInfoApplication.city }			
						</div>
					</div>
				</div>	
				<div class="span4">
					<div class="control-group">
						<label class="control-label">区/县：</label>
						<div class="controls">
							${corpBasicInfoApplication.county }										
						</div>
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
							${corpBasicInfoApplication.zcdd }
						</div>
					</div>
				</div>
				<div class="span6">
					<div class="control-group">
						<label class="control-label">办公地点：</label>
						<div class="controls">
						    ${corpBasicInfoApplication.xxdd }
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
							${corpBasicInfoApplication.lxr }
						</div>
					</div>
				</div>
				<div class="span4">
					<div class="control-group">
						<label class="control-label">企业联系电话：</label>
						<div class="controls">
							${corpBasicInfoApplication.lxdh }
						</div>
					</div>
				</div>
				<div class="span4">
					<div class="control-group">
						<label class="control-label">电子信箱：</label>
						<div class="controls">
							${corpBasicInfoApplication.email }
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
							${corpBasicInfoApplication.fddbr }
						</div>
					</div>
				</div>
				<div class="span6">
					<div class="control-group">
						<label class="control-label">法人代表身份证：</label>
						<div class="controls">
							${corpBasicInfoApplication.fddbrRyid }
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
                                    <form:hidden id="nameImage" path="photo" htmlEscape="false" maxlength="255" class="input-xlarge"/>
                                    <sys:ckfinder input="nameImage" type="images" uploadPath="/photo" selectMultiple="false" maxWidth="100" maxHeight="100"/>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label"></label>
			<div class="controls">
			</div>
		</div>		
		<div class="control-group">
			<label class="control-label">审核意见：</label>
			<div class="controls">
				<form:input path="act.comment" htmlEscape="false" maxlength="100" class="input-xlarge "/>
			</div>
		</div>		
		<div class="form-actions">
		  <c:if test="${corpBasicInfoApplication.datastate eq '0' }">
			<input id="btnApprove" class="btn btn-primary" type="button" value="审核通过"/>&nbsp;&nbsp;
			<input id="btnReject" class="btn btn-warning" type="button" value="审核退回"/>&nbsp;&nbsp;
		  </c:if>			
		</div>
	</form:form>
</body>
</html>