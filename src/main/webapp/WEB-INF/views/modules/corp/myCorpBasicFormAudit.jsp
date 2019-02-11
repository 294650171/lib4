<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
<title>基本信息</title>
<meta name="decorator" content="default" />
<script type="text/javascript">
	$(document).ready( function() {  });
</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="active"><a href="#">基本信息</a></li>
	</ul>
	<br />
	<form:form id="inputForm" modelAttribute="bean"
		action="${ctx}/mycorp/basicinfo/audit" method="post"
		class="form-horizontal">
		<form:hidden path="qyid" />
        <form:hidden path="id"/>
        <form:hidden path="act.taskId"/>
		<form:hidden path="act.taskName"/>
		<form:hidden path="act.taskDefKey"/>
		<form:hidden path="act.procInsId"/>
        <form:hidden path="act.procDefId"/>
        <form:hidden id="flag" path="act.flag"/>
		<sys:message content="${message}"/>

        <!-- 流程信息-->
        <div class="container-fluid">
            <div class="row-fluid">
        					<div class="col-xs-12">
        						<div class="control-group">
        							<label class="control-label">审批意见：</label>
        							<div class="controls">
        								<form:textarea path="act.comment" rows="2" maxlength="20" cssStyle="width:600px"/>
        							</div>
        						</div>
        					</div>

        					<div class="col-xs-12">
        						<div class="control-group">
        							<center>

        				<input id="btnSubmit" class="btn btn-primary" type="submit" value="同 意" onclick="$('#flag').val('true')"/>&nbsp;
                        <input id="btnSubmit" class="btn btn-inverse" type="submit" value="驳 回" onclick="$('#flag').val('false')"/>&nbsp;

        			    <input id="btnCancel" class="btn" type="button" value=" 返  回 " onclick="history.go(-1)"/>
        							</center>
        						</div>
        					</div>
        				</div>
            <act:histoicFlow procInsId="${bean.act.procInsId}"/>
        </div>

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
						<label class="control-label">注册地址：</label>
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
	</form:form>
</body>
</html>