<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>密码重置申请管理</title>
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
    <legend>密码重置审核</legend>
	<br/>
	<form:form id="inputForm" modelAttribute="resetPasswordApply" action="${ctx}/corp/resetPasswordApprove/approve" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<form:hidden path="status"/>
		
		<form:hidden path="act.taskId"/>
		<form:hidden path="act.procInsId"/>
		
		<form:hidden path="act.flag"/>
		
		<sys:message content="${message}"/>		
		<div class="control-group">
			<label class="control-label">统一社会信用代码：</label>
			<div class="controls">
				${resetPasswordApply.entityCode }
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">企业名称：</label>
			<div class="controls">
				${resetPasswordApply.entityName }
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">附件：</label>
			<div class="controls">
				<c:if test="${not empty resetPasswordApply.attach}">
				<a href="${resetPasswordApply.attach}" target="_blank">附件</a>
				</c:if>				
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">手机号：</label>
			<div class="controls">
				${resetPasswordApply.mobile }
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">电子邮箱：</label>
			<div class="controls">
				${resetPasswordApply.email }
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">申请日期：</label>
			<div class="controls">
				<fmt:formatDate value="${resetPasswordApply.applyDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">审核日期：</label>
			<div class="controls">
				<fmt:formatDate value="${resetPasswordApply.approveDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">状态：</label>
			<div class="controls">
				${fns:getDictLabel(resetPasswordApply.status, 'reset_password_apply_status', '')}
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">备注：</label>
			<div class="controls">
				${resetPasswordApply.remarks }
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
		  <c:if test="${resetPasswordApply.status eq '0' }">
			<input id="btnApprove" class="btn btn-primary" type="button" value="审核通过"/>&nbsp;&nbsp;
			<input id="btnReject" class="btn btn-warning" type="button" value="审核退回"/>&nbsp;&nbsp;
		  </c:if>			
		</div>
	</form:form>
</body>
</html>