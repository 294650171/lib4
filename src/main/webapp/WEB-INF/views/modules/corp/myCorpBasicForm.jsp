<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
<title>基本信息</title>
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
			});
</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="active"><a href="#">基本信息</a></li>
	</ul>
	<br />
	<form:form id="inputForm" modelAttribute="bean"
		action="${ctx}/mycorp/basicinfo/save" method="post"
		class="form-horizontal">
		<form:hidden path="qyid" />
		<sys:message content="${message}" />

		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span6">
					<div class="control-group">
                        <label class="control-label">统一社会信用代码：</label>
						<div class="controls">${bean.tyshxydm} </div>

					</div>
				</div>

				<div class="span6">
					<div class="control-group">
						<label class="control-label">企业名称：</label>
						<div class="controls">
						<form:input path="qymc" htmlEscape="false" maxlength="50" class="input-xlarge " />
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
						<div class="controls"> ${bean.zzjgdm}
						</div>
					</div>
				</div>

				<div class="span6">
					<div class="control-group">
						<label class="control-label">营业执照注册号：</label>
						<div class="controls">${bean.yyzzzch}
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span6">
					<div class="control-group">
						<label class="control-label">省：</label>
						<div class="controls">
							<form:input path="province" htmlEscape="false" maxlength="20"
								class="input-xlarge " />
						</div>
					</div>
				</div>

				<div class="span6">
					<div class="control-group">
						<label class="control-label">市：</label>
						<div class="controls">
							<form:input path="city" htmlEscape="false" maxlength="20"
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
						<label class="control-label">区/县：</label>
						<div class="controls">
							<form:input path="county" htmlEscape="false" maxlength="20"
								class="input-xlarge " />
						</div>
					</div>
				</div>

				<div class="span6">
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
						<div class="controls">${bean.jjxz}
						</div>
					</div>
				</div>

				<div class="span6">
					<div class="control-group">
						<label class="control-label">注册资本(万元)：</label>
						<div class="controls">${bean.zczb}
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
							<fmt:formatDate value="${bean.clrq}" pattern="yyyy-MM-dd"/>
						</div>
					</div>
				</div>

				<div class="span6">
					<div class="control-group">
						<label class="control-label">详细地点：</label>
						<div class="controls">${bean.xxdd}
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
							${bean.cz}
						</div>
					</div>
				</div>

				<div class="span6">
					<div class="control-group">
						<label class="control-label">邮箱：</label>
						<div class="controls">
							${bean.email}
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
							${bean.lxr}
						</div>
					</div>
				</div>

				<div class="span6">
					<div class="control-group">
						<label class="control-label">企业联系电话：</label>
						<div class="controls">
							${bean.lxdh}
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
							${bean.fddbr}
						</div>
					</div>
				</div>

				<div class="span6">
					<div class="control-group">
						<label class="control-label">法人代表身份证：</label>
						<div class="controls">
							${bean.fddbrRyid}
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
							${bean.tag}
						</div>
					</div>
				</div>

				<div class="span6">
					<div class="control-group">
						<label class="control-label">修改日期时间：</label>
						<div class="controls">
							<fmt:formatDate value="${bean.xgrqsj}" pattern="yyyy-MM-dd HH:mm:ss"/>
						</div>
					</div>
				</div>

			</div>
		</div>
		<div class="container-fluid">
        			<div class="row-fluid">
                    <div class="control-group">
        						<label class="control-label">营业执照：</label>
        						<div class="controls">
                                    <form:hidden id="nameImage" path="photo" htmlEscape="false" maxlength="255" class="input-xlarge"/>
                                    <sys:ckfinder input="nameImage" type="images" uploadPath="/photo" selectMultiple="false" maxWidth="100" maxHeight="100"/>
        						</div>
        					</div>
        			</div>
        		</div>

		<div class="form-actions">

				<input id="btnSubmit" class="btn btn-primary" type="submit"
					value="保 存" />&nbsp;
			<input id="btnCancel" class="btn" type="button" value="返 回"
				onclick="history.go(-1)" />
		</div>
	</form:form>
</body>
</html>