<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>企业基本信息修改申请表管理</title>
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
		<li><a href="${ctx}/corp/corpBasicInfoApplication/">企业基本信息修改申请表列表</a></li>
		<li class="active"><a href="${ctx}/corp/corpBasicInfoApplication/form?id=${corpBasicInfoApplication.id}">企业基本信息修改申请表<shiro:hasPermission name="corp:corpBasicInfoApplication:edit">${not empty corpBasicInfoApplication.id?'修改':'添加'}</shiro:hasPermission><shiro:lacksPermission name="corp:corpBasicInfoApplication:edit">查看</shiro:lacksPermission></a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="corpBasicInfoApplication" action="${ctx}/corp/corpBasicInfoApplication/save" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<sys:message content="${message}"/>		
		<div class="control-group">
			<label class="control-label">企业名称：</label>
			<div class="controls">
				<form:input path="qymc" htmlEscape="false" maxlength="100" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">组织机构代码：</label>
			<div class="controls">
				<form:input path="zzjgdm" htmlEscape="false" maxlength="50" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">营业执照注册号：</label>
			<div class="controls">
				<form:input path="yyzzzch" htmlEscape="false" maxlength="50" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">khyh：</label>
			<div class="controls">
				<form:input path="khyh" htmlEscape="false" maxlength="100" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">yhzh：</label>
			<div class="controls">
				<form:input path="yhzh" htmlEscape="false" maxlength="50" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">sfsyq：</label>
			<div class="controls">
				<form:input path="sfsyq" htmlEscape="false" maxlength="1" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">gcjsry_zs：</label>
			<div class="controls">
				<form:input path="gcjsryZs" htmlEscape="false" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">gcjsry_gjzcrs：</label>
			<div class="controls">
				<form:input path="gcjsryGjzcrs" htmlEscape="false" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">gcjsry_zjzcrs：</label>
			<div class="controls">
				<form:input path="gcjsryZjzcrs" htmlEscape="false" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">sylxid：</label>
			<div class="controls">
				<form:input path="sylxid" htmlEscape="false" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">sylx：</label>
			<div class="controls">
				<form:input path="sylx" htmlEscape="false" maxlength="8" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">provinceid：</label>
			<div class="controls">
				<form:input path="provinceid" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">省：</label>
			<div class="controls">
				<form:input path="province" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">cityid：</label>
			<div class="controls">
				<form:input path="cityid" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">市：</label>
			<div class="controls">
				<form:input path="city" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">countyid：</label>
			<div class="controls">
				<form:input path="countyid" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">区/县：</label>
			<div class="controls">
				<form:input path="county" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">zcdd：</label>
			<div class="controls">
				<form:input path="zcdd" htmlEscape="false" maxlength="100" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">jjxzid：</label>
			<div class="controls">
				<form:input path="jjxzid" htmlEscape="false" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">企业经济性质：</label>
			<div class="controls">
				<form:input path="jjxz" htmlEscape="false" maxlength="50" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">注册资本(万元)：</label>
			<div class="controls">
				<form:input path="zczb" htmlEscape="false" maxlength="50" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">zyfw：</label>
			<div class="controls">
				<form:input path="zyfw" htmlEscape="false" maxlength="-1" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">jyfw：</label>
			<div class="controls">
				<form:input path="jyfw" htmlEscape="false" maxlength="-1" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">成立日期：</label>
			<div class="controls">
				<input name="clrq" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
					value="<fmt:formatDate value="${corpBasicInfoApplication.clrq}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">qyjj：</label>
			<div class="controls">
				<form:input path="qyjj" htmlEscape="false" maxlength="-1" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">详细地点：</label>
			<div class="controls">
				<form:input path="xxdd" htmlEscape="false" maxlength="200" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">yzbm：</label>
			<div class="controls">
				<form:input path="yzbm" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">cz：</label>
			<div class="controls">
				<form:input path="cz" htmlEscape="false" maxlength="50" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">邮箱：</label>
			<div class="controls">
				<form:input path="email" htmlEscape="false" maxlength="100" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">webaddress：</label>
			<div class="controls">
				<form:input path="webaddress" htmlEscape="false" maxlength="100" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">企业联系人：</label>
			<div class="controls">
				<form:input path="lxr" htmlEscape="false" maxlength="50" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">企业联系电话：</label>
			<div class="controls">
				<form:input path="lxdh" htmlEscape="false" maxlength="50" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">法人代表身份证：</label>
			<div class="controls">
				<form:input path="fddbrRyid" htmlEscape="false" maxlength="100" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">法人代表：</label>
			<div class="controls">
				<form:input path="fddbr" htmlEscape="false" maxlength="25" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">qyfzr_ryid：</label>
			<div class="controls">
				<form:input path="qyfzrRyid" htmlEscape="false" maxlength="100" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">qyfzr：</label>
			<div class="controls">
				<form:input path="qyfzr" htmlEscape="false" maxlength="25" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">cwfzr_ryid：</label>
			<div class="controls">
				<form:input path="cwfzrRyid" htmlEscape="false" maxlength="100" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">cwfzr：</label>
			<div class="controls">
				<form:input path="cwfzr" htmlEscape="false" maxlength="25" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">jsfzr_ryid：</label>
			<div class="controls">
				<form:input path="jsfzrRyid" htmlEscape="false" maxlength="100" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">jsfzr：</label>
			<div class="controls">
				<form:input path="jsfzr" htmlEscape="false" maxlength="25" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">aqfzr_ryid：</label>
			<div class="controls">
				<form:input path="aqfzrRyid" htmlEscape="false" maxlength="100" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">aqfzr：</label>
			<div class="controls">
				<form:input path="aqfzr" htmlEscape="false" maxlength="25" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">datastate：</label>
			<div class="controls">
				<form:input path="datastate" htmlEscape="false" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">来源标识：</label>
			<div class="controls">
				<form:input path="tag" htmlEscape="false" maxlength="50" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">xgr：</label>
			<div class="controls">
				<form:input path="xgr" htmlEscape="false" maxlength="100" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">xgrqsj：</label>
			<div class="controls">
				<input name="xgrqsj" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
					value="<fmt:formatDate value="${corpBasicInfoApplication.xgrqsj}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">xmjlzs：</label>
			<div class="controls">
				<form:input path="xmjlzs" htmlEscape="false" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">aqy：</label>
			<div class="controls">
				<form:input path="aqy" htmlEscape="false" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">zjy：</label>
			<div class="controls">
				<form:input path="zjy" htmlEscape="false" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">sgy：</label>
			<div class="controls">
				<form:input path="sgy" htmlEscape="false" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">统一社会信用代码：</label>
			<div class="controls">
				<form:input path="tyshxydm" htmlEscape="false" maxlength="50" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">proc_ins_id：</label>
			<div class="controls">
				<form:input path="procInsId" htmlEscape="false" maxlength="50" class="input-xlarge "/>
			</div>
		</div>
		<div class="form-actions">
			<shiro:hasPermission name="corp:corpBasicInfoApplication:edit"><input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>