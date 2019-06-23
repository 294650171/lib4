<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
<title>企业基本信息管理</title>
<meta name="decorator" content="default" />
<script type="text/javascript">
	$(document).ready(
			function() {
				//$("#name").focus();
				$("#inputForm")
						.validate(
								{
									submitHandler : function(form) {
										loading('正在提交，请稍等...');
										form.submit();
									},
									errorContainer : "#messageBox",
									errorPlacement : function(error, element) {
										$("#messageBox").text("输入有误，请先更正。");
										if (element.is(":checkbox")
												|| element.is(":radio")
												|| element.parent().is(
														".input-append")) {
											error.appendTo(element.parent()
													.parent());
										} else {
											error.insertAfter(element);
										}
									}
								});
				
				$("#province").change(function(){	
					
					var parentId = $("#province").val();
					var sltCity=document.inputForm.city;			
					sltCity.length = 1;
					
			    	$.get("${ctx}/base/region/treeData?level=&parentId="+parentId,
			    		{},
			    		function(data){
			    			var count=data.length;
			    			for(var i=0;i<count;i++){
			    				sltCity[i+1] = new Option(data[i].name, data[i].id);
			    			}
			    	    }
			    	); 			
					
				});
				
				$("#city").change(function(){
					
					var parentId = $("#city").val();
					var county=document.inputForm.county;
					county.length = 1;
					
			    	$.get("${ctx}/base/region/treeData?level=&parentId="+parentId,
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
<body>
	<ul class="nav nav-tabs">
		<li><a href="${ctx}/corp/ueppQyjbxx/">企业基本信息列表</a></li>
		<li class="active"><a
			href="${ctx}/corp/ueppQyjbxx/form?id=${ueppQyjbxx.qyid}">企业基本信息<shiro:hasPermission
					name="corp:ueppQyjbxx:edit">${not empty ueppQyjbxx.qyid?'修改':'添加'}</shiro:hasPermission>
				<shiro:lacksPermission name="corp:ueppQyjbxx:edit">查看</shiro:lacksPermission></a></li>
	</ul>
	<br />
	<form:form id="inputForm" name="inputForm" modelAttribute="ueppQyjbxx"
		action="${ctx}/corp/ueppQyjbxx/save" method="post"
		class="form-horizontal">
		<form:hidden path="qyid" />
		<sys:message content="${message}" />

		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span6">
					<div class="control-group">
						<label class="control-label">企业代码：</label>
						<div class="controls">
							<form:input path="qyid" htmlEscape="false" maxlength="100"
								class="input-xlarge required" />
							<span class="help-inline"><font color="red">*</font> </span>
						</div>
					</div>
				</div>

				<div class="span6">
					<div class="control-group">
						<label class="control-label">企业名称：</label>
						<div class="controls">
							<form:input path="qymc" htmlEscape="false" maxlength="100"
								class="input-xlarge " />
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span6">
					<div class="control-group">
						<label class="control-label">组织机构代码：</label>
						<div class="controls">
							<form:input path="zzjgdm" htmlEscape="false" maxlength="50"
								class="input-xlarge " />
						</div>
					</div>
				</div>

				<div class="span6">
					<div class="control-group">
						<label class="control-label">营业执照注册号：</label>
						<div class="controls">
							<form:input path="yyzzzch" htmlEscape="false" maxlength="50"
								class="input-xlarge " />
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
							<form:select path="province" class="input-large">
							  <form:option value="0" label="请选择所在省份"/>
							  <form:options items="${fns:getRegionList('1','')}" itemLabel="name" itemValue="id" htmlEscape="false"/>
							</form:select>
						</div>
					</div>
				</div>

				<div class="span4">
					<div class="control-group">
						<label class="control-label">市：</label>
						<div class="controls">
							<form:select path="city" class="input-large">
							  <form:option value="0" label="请选择所在城市"/>
							</form:select>					
						</div>
					</div>
				</div>
				
				<div class="span4">
					<div class="control-group">
						<label class="control-label">区/县：</label>
						<div class="controls">
							<form:select path="county" class="input-large">
							  <form:option value="0" label="请选择所在区/县"/>
							</form:select>												
						</div>
					</div>
				</div>				
			</div>
		</div>

		<div class="container-fluid">
			<div class="row-fluid">

				<div class="span12">
					<div class="control-group">
						<label class="control-label">详细地点：</label>
						<div class="controls">
							<form:input path="zcdd" htmlEscape="false" maxlength="100"
								class="input-xlarge " />
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span6">
					<div class="control-group">
						<label class="control-label">企业经济性质：</label>
						<div class="controls">
							<form:input path="jjxz" htmlEscape="false" maxlength="50"
								class="input-xlarge " />
						</div>
					</div>
				</div>

				<div class="span6">
					<div class="control-group">
						<label class="control-label">注册资本(万元)：</label>
						<div class="controls">
							<form:input path="zczb" htmlEscape="false" maxlength="50"
								class="input-xlarge " />
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span6">
					<div class="control-group">
						<label class="control-label">成立日期：</label>
						<div class="controls">
							<input name="clrq" type="text" readonly="readonly" maxlength="20"
								class="input-medium Wdate "
								value="<fmt:formatDate value="${ueppQyjbxx.clrq}" pattern="yyyy-MM-dd HH:mm:ss"/>"
								onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});" />
						</div>
					</div>
				</div>

				<div class="span6">
					<div class="control-group">
						<label class="control-label">详细地点：</label>
						<div class="controls">
							<form:input path="xxdd" htmlEscape="false" maxlength="200"
								class="input-xlarge " />
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span6">
					<div class="control-group">
						<label class="control-label">传真：</label>
						<div class="controls">
							<form:input path="cz" htmlEscape="false" maxlength="50"
								class="input-xlarge " />
						</div>
					</div>
				</div>

				<div class="span6">
					<div class="control-group">
						<label class="control-label">邮箱：</label>
						<div class="controls">
							<form:input path="email" htmlEscape="false" maxlength="100"
								class="input-xlarge " />
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span6">
					<div class="control-group">
						<label class="control-label">企业联系人：</label>
						<div class="controls">
							<form:input path="lxr" htmlEscape="false" maxlength="50"
								class="input-xlarge " />
						</div>
					</div>
				</div>

				<div class="span6">
					<div class="control-group">
						<label class="control-label">企业联系电话：</label>
						<div class="controls">
							<form:input path="lxdh" htmlEscape="false" maxlength="50"
								class="input-xlarge " />
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
							<form:input path="fddbr" htmlEscape="false" maxlength="25"
								class="input-xlarge " />
						</div>
					</div>
				</div>

				<div class="span6">
					<div class="control-group">
						<label class="control-label">法人代表身份证：</label>
						<div class="controls">
							<form:input path="fddbrRyid" htmlEscape="false" maxlength="100"
								class="input-xlarge " />
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
							<form:input path="fddbr" htmlEscape="false" maxlength="25"
								class="input-xlarge " />
						</div>
					</div>
				</div>

				<div class="span6">
					<div class="control-group">
						<label class="control-label">状态：</label>
						<div class="controls">
							<form:input path="datastate" htmlEscape="false"
								class="input-xlarge " />
						</div>
					</div>
				</div>

			</div>
		</div>

		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span6">
					<div class="control-group">
						<label class="control-label">来源标识：</label>
						<div class="controls">
							<form:input path="tag" htmlEscape="false" maxlength="50"
								class="input-xlarge " />
						</div>
					</div>
				</div>

				<div class="span6">
					<div class="control-group">
						<label class="control-label">修改人：</label>
						<div class="controls">
							<form:input path="xgr" htmlEscape="false" maxlength="100"
								class="input-xlarge " />
						</div>
					</div>
				</div>

			</div>
		</div>

		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span6">
					<div class="control-group">
						<label class="control-label">修改日期时间：</label>
						<div class="controls">
							<input name="xgrqsj" type="text" readonly="readonly"
								maxlength="20" class="input-medium Wdate "
								value="<fmt:formatDate value="${ueppQyjbxx.xgrqsj}" pattern="yyyy-MM-dd HH:mm:ss"/>"
								onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});" />
						</div>
					</div>
				</div>

				<div class="span6">
					<div class="control-group">
						<label class="control-label">统一社会信用代码：</label>
						<div class="controls">
							<form:input path="tyshxydm" htmlEscape="false" maxlength="50"
								class="input-xlarge " />
						</div>
					</div>
				</div>

			</div>
		</div>
		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span6">
					<div class="control-group">
						<label class="control-label">是否需要更新：</label>
						<div class="controls">
							<form:input path="needupdateflag" htmlEscape="false"
								class="input-xlarge " />
						</div>
					</div>
				</div>

				<div class="span6"></div>

			</div>
		</div>

		<div class="form-actions">
			<shiro:hasPermission name="corp:ueppQyjbxx:edit">
				<input id="btnSubmit" class="btn btn-primary" type="submit"
					value="保 存" />&nbsp;</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回"
				onclick="history.go(-1)" />
		</div>
	</form:form>
</body>
</html>