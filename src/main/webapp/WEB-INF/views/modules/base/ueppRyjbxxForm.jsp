<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>企业人员管理</title>
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
		function addRow(list, idx, tpl, row){
			$(list).append(Mustache.render(tpl, {
				idx: idx, delBtn: true, row: row
			}));
			$(list+idx).find("select").each(function(){
				$(this).val($(this).attr("data-value"));
			});
			$(list+idx).find("input[type='checkbox'], input[type='radio']").each(function(){
				var ss = $(this).attr("data-value").split(',');
				for (var i=0; i<ss.length; i++){
					if($(this).val() == ss[i]){
						$(this).attr("checked","checked");
					}
				}
			});
		}
		function delRow(obj, prefix){
			var id = $(prefix+"_id");
			var delFlag = $(prefix+"_delFlag");
			if (id.val() == ""){
				$(obj).parent().parent().remove();
			}else if(delFlag.val() == "0"){
				delFlag.val("1");
				$(obj).html("&divide;").attr("title", "撤销删除");
				$(obj).parent().parent().addClass("error");
			}else if(delFlag.val() == "1"){
				delFlag.val("0");
				$(obj).html("&times;").attr("title", "删除");
				$(obj).parent().parent().removeClass("error");
			}
		}
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li><a href="${ctx}/base/ueppRyjbxx/">企业人员列表</a></li>
		<li class="active"><a href="${ctx}/base/ueppRyjbxx/form?id=${ueppRyjbxx.id}">企业人员<shiro:hasPermission name="base:ueppRyjbxx:edit">${not empty ueppRyjbxx.id?'修改':'添加'}</shiro:hasPermission><shiro:lacksPermission name="base:ueppRyjbxx:edit">查看</shiro:lacksPermission></a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="ueppRyjbxx" action="${ctx}/base/ueppRyjbxx/save" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<sys:message content="${message}"/>		
		<div class="control-group">
			<label class="control-label">xm：</label>
			<div class="controls">
				<form:input path="xm" htmlEscape="false" maxlength="50" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">zjlxid：</label>
			<div class="controls">
				<form:input path="zjlxid" htmlEscape="false" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">zjlx：</label>
			<div class="controls">
				<form:input path="zjlx" htmlEscape="false" maxlength="10" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">zjhm：</label>
			<div class="controls">
				<form:input path="zjhm" htmlEscape="false" maxlength="50" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">xb：</label>
			<div class="controls">
				<form:input path="xb" htmlEscape="false" maxlength="1" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">csrq：</label>
			<div class="controls">
				<input name="csrq" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
					value="<fmt:formatDate value="${ueppRyjbxx.csrq}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">tag：</label>
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
					value="<fmt:formatDate value="${ueppRyjbxx.xgrqsj}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
			</div>
		</div>
			<div class="control-group">
				<label class="control-label">企业与人员映射中间表：</label>
				<div class="controls">
					<table id="contentTable" class="table table-striped table-bordered table-condensed">
						<thead>
							<tr>
								<th class="hide"></th>
								<th>qyid</th>
								<th>ryzyzglxid</th>
								<th>ryzyzglx</th>
								<th>tag</th>
								<th>xgr</th>
								<th>xgrqsj</th>
								<th>datastate</th>
								<shiro:hasPermission name="base:ueppRyjbxx:edit"><th width="10">&nbsp;</th></shiro:hasPermission>
							</tr>
						</thead>
						<tbody id="ueppQyryList">
						</tbody>
						<shiro:hasPermission name="base:ueppRyjbxx:edit"><tfoot>
							<tr><td colspan="9"><a href="javascript:" onclick="addRow('#ueppQyryList', ueppQyryRowIdx, ueppQyryTpl);ueppQyryRowIdx = ueppQyryRowIdx + 1;" class="btn">新增</a></td></tr>
						</tfoot></shiro:hasPermission>
					</table>
					<script type="text/template" id="ueppQyryTpl">//<!--
						<tr id="ueppQyryList{{idx}}">
							<td class="hide">
								<input id="ueppQyryList{{idx}}_id" name="ueppQyryList[{{idx}}].id" type="hidden" value="{{row.id}}"/>
								<input id="ueppQyryList{{idx}}_delFlag" name="ueppQyryList[{{idx}}].delFlag" type="hidden" value="0"/>
							</td>
							<td>
								<input id="ueppQyryList{{idx}}_qyid" name="ueppQyryList[{{idx}}].qyid" type="text" value="{{row.qyid}}" maxlength="100" class="input-small required"/>
							</td>
							<td>
								<input id="ueppQyryList{{idx}}_ryzyzglxid" name="ueppQyryList[{{idx}}].ryzyzglxid" type="text" value="{{row.ryzyzglxid}}" class="input-small "/>
							</td>
							<td>
								<input id="ueppQyryList{{idx}}_ryzyzglx" name="ueppQyryList[{{idx}}].ryzyzglx" type="text" value="{{row.ryzyzglx}}" maxlength="20" class="input-small "/>
							</td>
							<td>
								<input id="ueppQyryList{{idx}}_tag" name="ueppQyryList[{{idx}}].tag" type="text" value="{{row.tag}}" maxlength="50" class="input-small "/>
							</td>
							<td>
								<input id="ueppQyryList{{idx}}_xgr" name="ueppQyryList[{{idx}}].xgr" type="text" value="{{row.xgr}}" maxlength="100" class="input-small "/>
							</td>
							<td>
								<input id="ueppQyryList{{idx}}_xgrqsj" name="ueppQyryList[{{idx}}].xgrqsj" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
									value="{{row.xgrqsj}}" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
							</td>
							<td>
								<input id="ueppQyryList{{idx}}_datastate" name="ueppQyryList[{{idx}}].datastate" type="text" value="{{row.datastate}}" class="input-small "/>
							</td>
							<shiro:hasPermission name="base:ueppRyjbxx:edit"><td class="text-center" width="10">
								{{#delBtn}}<span class="close" onclick="delRow(this, '#ueppQyryList{{idx}}')" title="删除">&times;</span>{{/delBtn}}
							</td></shiro:hasPermission>
						</tr>//-->
					</script>
					<script type="text/javascript">
						var ueppQyryRowIdx = 0, ueppQyryTpl = $("#ueppQyryTpl").html().replace(/(\/\/\<!\-\-)|(\/\/\-\->)/g,"");
						$(document).ready(function() {
							var data = ${fns:toJson(ueppRyjbxx.ueppQyryList)};
							for (var i=0; i<data.length; i++){
								addRow('#ueppQyryList', ueppQyryRowIdx, ueppQyryTpl, data[i]);
								ueppQyryRowIdx = ueppQyryRowIdx + 1;
							}
						});
					</script>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">uepp_ryzs：</label>
				<div class="controls">
					<table id="contentTable" class="table table-striped table-bordered table-condensed">
						<thead>
							<tr>
								<th class="hide"></th>
								<th>zsjlid</th>
								<th>ryzyzglxid</th>
								<th>ryzyzglx</th>
								<th>ryzslxid</th>
								<th>ryzslx</th>
								<th>sfzzz</th>
								<th>zsbh</th>
								<th>zsyxqrq</th>
								<th>zsyxzrq</th>
								<th>fzdw</th>
								<th>fzrq</th>
								<th>bz</th>
								<th>tag</th>
								<th>xgr</th>
								<th>xgrqsj</th>
								<th>datastate</th>
								<th>status</th>
								<th>qualissuedate</th>
								<th>stampno</th>
								<th>regno</th>
								<th>updatetime</th>
								<shiro:hasPermission name="base:ueppRyjbxx:edit"><th width="10">&nbsp;</th></shiro:hasPermission>
							</tr>
						</thead>
						<tbody id="ueppRyzsList">
						</tbody>
						<shiro:hasPermission name="base:ueppRyjbxx:edit"><tfoot>
							<tr><td colspan="23"><a href="javascript:" onclick="addRow('#ueppRyzsList', ueppRyzsRowIdx, ueppRyzsTpl);ueppRyzsRowIdx = ueppRyzsRowIdx + 1;" class="btn">新增</a></td></tr>
						</tfoot></shiro:hasPermission>
					</table>
					<script type="text/template" id="ueppRyzsTpl">//<!--
						<tr id="ueppRyzsList{{idx}}">
							<td class="hide">
								<input id="ueppRyzsList{{idx}}_id" name="ueppRyzsList[{{idx}}].id" type="hidden" value="{{row.id}}"/>
								<input id="ueppRyzsList{{idx}}_delFlag" name="ueppRyzsList[{{idx}}].delFlag" type="hidden" value="0"/>
							</td>
							<td>
								<input id="ueppRyzsList{{idx}}_zsjlid" name="ueppRyzsList[{{idx}}].zsjlid" type="text" value="{{row.zsjlid}}" maxlength="100" class="input-small required"/>
							</td>
							<td>
								<input id="ueppRyzsList{{idx}}_ryzyzglxid" name="ueppRyzsList[{{idx}}].ryzyzglxid" type="text" value="{{row.ryzyzglxid}}" class="input-small "/>
							</td>
							<td>
								<input id="ueppRyzsList{{idx}}_ryzyzglx" name="ueppRyzsList[{{idx}}].ryzyzglx" type="text" value="{{row.ryzyzglx}}" maxlength="20" class="input-small "/>
							</td>
							<td>
								<input id="ueppRyzsList{{idx}}_ryzslxid" name="ueppRyzsList[{{idx}}].ryzslxid" type="text" value="{{row.ryzslxid}}" class="input-small "/>
							</td>
							<td>
								<input id="ueppRyzsList{{idx}}_ryzslx" name="ueppRyzsList[{{idx}}].ryzslx" type="text" value="{{row.ryzslx}}" maxlength="20" class="input-small "/>
							</td>
							<td>
								<input id="ueppRyzsList{{idx}}_sfzzz" name="ueppRyzsList[{{idx}}].sfzzz" type="text" value="{{row.sfzzz}}" class="input-small "/>
							</td>
							<td>
								<input id="ueppRyzsList{{idx}}_zsbh" name="ueppRyzsList[{{idx}}].zsbh" type="text" value="{{row.zsbh}}" maxlength="50" class="input-small "/>
							</td>
							<td>
								<input id="ueppRyzsList{{idx}}_zsyxqrq" name="ueppRyzsList[{{idx}}].zsyxqrq" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
									value="{{row.zsyxqrq}}" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
							</td>
							<td>
								<input id="ueppRyzsList{{idx}}_zsyxzrq" name="ueppRyzsList[{{idx}}].zsyxzrq" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
									value="{{row.zsyxzrq}}" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
							</td>
							<td>
								<input id="ueppRyzsList{{idx}}_fzdw" name="ueppRyzsList[{{idx}}].fzdw" type="text" value="{{row.fzdw}}" maxlength="100" class="input-small "/>
							</td>
							<td>
								<input id="ueppRyzsList{{idx}}_fzrq" name="ueppRyzsList[{{idx}}].fzrq" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
									value="{{row.fzrq}}" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
							</td>
							<td>
								<input id="ueppRyzsList{{idx}}_bz" name="ueppRyzsList[{{idx}}].bz" type="text" value="{{row.bz}}" maxlength="-1" class="input-small "/>
							</td>
							<td>
								<input id="ueppRyzsList{{idx}}_tag" name="ueppRyzsList[{{idx}}].tag" type="text" value="{{row.tag}}" maxlength="50" class="input-small "/>
							</td>
							<td>
								<input id="ueppRyzsList{{idx}}_xgr" name="ueppRyzsList[{{idx}}].xgr" type="text" value="{{row.xgr}}" maxlength="100" class="input-small "/>
							</td>
							<td>
								<input id="ueppRyzsList{{idx}}_xgrqsj" name="ueppRyzsList[{{idx}}].xgrqsj" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
									value="{{row.xgrqsj}}" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
							</td>
							<td>
								<input id="ueppRyzsList{{idx}}_datastate" name="ueppRyzsList[{{idx}}].datastate" type="text" value="{{row.datastate}}" class="input-small "/>
							</td>
							<td>
								<input id="ueppRyzsList{{idx}}_status" name="ueppRyzsList[{{idx}}].status" type="text" value="{{row.status}}" maxlength="1" class="input-small "/>
							</td>
							<td>
								<input id="ueppRyzsList{{idx}}_qualissuedate" name="ueppRyzsList[{{idx}}].qualissuedate" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
									value="{{row.qualissuedate}}" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
							</td>
							<td>
								<input id="ueppRyzsList{{idx}}_stampno" name="ueppRyzsList[{{idx}}].stampno" type="text" value="{{row.stampno}}" maxlength="20" class="input-small "/>
							</td>
							<td>
								<input id="ueppRyzsList{{idx}}_regno" name="ueppRyzsList[{{idx}}].regno" type="text" value="{{row.regno}}" maxlength="20" class="input-small "/>
							</td>
							<td>
								<input id="ueppRyzsList{{idx}}_updatetime" name="ueppRyzsList[{{idx}}].updatetime" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
									value="{{row.updatetime}}" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
							</td>
							<shiro:hasPermission name="base:ueppRyjbxx:edit"><td class="text-center" width="10">
								{{#delBtn}}<span class="close" onclick="delRow(this, '#ueppRyzsList{{idx}}')" title="删除">&times;</span>{{/delBtn}}
							</td></shiro:hasPermission>
						</tr>//-->
					</script>
					<script type="text/javascript">
						var ueppRyzsRowIdx = 0, ueppRyzsTpl = $("#ueppRyzsTpl").html().replace(/(\/\/\<!\-\-)|(\/\/\-\->)/g,"");
						$(document).ready(function() {
							var data = ${fns:toJson(ueppRyjbxx.ueppRyzsList)};
							for (var i=0; i<data.length; i++){
								addRow('#ueppRyzsList', ueppRyzsRowIdx, ueppRyzsTpl, data[i]);
								ueppRyzsRowIdx = ueppRyzsRowIdx + 1;
							}
						});
					</script>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">人员执业资格：</label>
				<div class="controls">
					<table id="contentTable" class="table table-striped table-bordered table-condensed">
						<thead>
							<tr>
								<th class="hide"></th>
								<th>ryzyzglxid</th>
								<th>ryzyzglx</th>
								<th>balxid</th>
								<th>balx</th>
								<th>datastate</th>
								<th>tag</th>
								<th>xgr</th>
								<th>xgrqsj</th>
								<th>updatetime</th>
								<shiro:hasPermission name="base:ueppRyjbxx:edit"><th width="10">&nbsp;</th></shiro:hasPermission>
							</tr>
						</thead>
						<tbody id="ueppRyzyzgList">
						</tbody>
						<shiro:hasPermission name="base:ueppRyjbxx:edit"><tfoot>
							<tr><td colspan="11"><a href="javascript:" onclick="addRow('#ueppRyzyzgList', ueppRyzyzgRowIdx, ueppRyzyzgTpl);ueppRyzyzgRowIdx = ueppRyzyzgRowIdx + 1;" class="btn">新增</a></td></tr>
						</tfoot></shiro:hasPermission>
					</table>
					<script type="text/template" id="ueppRyzyzgTpl">//<!--
						<tr id="ueppRyzyzgList{{idx}}">
							<td class="hide">
								<input id="ueppRyzyzgList{{idx}}_id" name="ueppRyzyzgList[{{idx}}].id" type="hidden" value="{{row.id}}"/>
								<input id="ueppRyzyzgList{{idx}}_delFlag" name="ueppRyzyzgList[{{idx}}].delFlag" type="hidden" value="0"/>
							</td>
							<td>
								<input id="ueppRyzyzgList{{idx}}_ryzyzglxid" name="ueppRyzyzgList[{{idx}}].ryzyzglxid" type="text" value="{{row.ryzyzglxid}}" class="input-small required"/>
							</td>
							<td>
								<input id="ueppRyzyzgList{{idx}}_ryzyzglx" name="ueppRyzyzgList[{{idx}}].ryzyzglx" type="text" value="{{row.ryzyzglx}}" maxlength="20" class="input-small required"/>
							</td>
							<td>
								<input id="ueppRyzyzgList{{idx}}_balxid" name="ueppRyzyzgList[{{idx}}].balxid" type="text" value="{{row.balxid}}" class="input-small "/>
							</td>
							<td>
								<input id="ueppRyzyzgList{{idx}}_balx" name="ueppRyzyzgList[{{idx}}].balx" type="text" value="{{row.balx}}" maxlength="4" class="input-small "/>
							</td>
							<td>
								<input id="ueppRyzyzgList{{idx}}_datastate" name="ueppRyzyzgList[{{idx}}].datastate" type="text" value="{{row.datastate}}" class="input-small "/>
							</td>
							<td>
								<input id="ueppRyzyzgList{{idx}}_tag" name="ueppRyzyzgList[{{idx}}].tag" type="text" value="{{row.tag}}" maxlength="50" class="input-small "/>
							</td>
							<td>
								<input id="ueppRyzyzgList{{idx}}_xgr" name="ueppRyzyzgList[{{idx}}].xgr" type="text" value="{{row.xgr}}" maxlength="100" class="input-small "/>
							</td>
							<td>
								<input id="ueppRyzyzgList{{idx}}_xgrqsj" name="ueppRyzyzgList[{{idx}}].xgrqsj" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
									value="{{row.xgrqsj}}" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
							</td>
							<td>
								<input id="ueppRyzyzgList{{idx}}_updatetime" name="ueppRyzyzgList[{{idx}}].updatetime" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
									value="{{row.updatetime}}" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
							</td>
							<shiro:hasPermission name="base:ueppRyjbxx:edit"><td class="text-center" width="10">
								{{#delBtn}}<span class="close" onclick="delRow(this, '#ueppRyzyzgList{{idx}}')" title="删除">&times;</span>{{/delBtn}}
							</td></shiro:hasPermission>
						</tr>//-->
					</script>
					<script type="text/javascript">
						var ueppRyzyzgRowIdx = 0, ueppRyzyzgTpl = $("#ueppRyzyzgTpl").html().replace(/(\/\/\<!\-\-)|(\/\/\-\->)/g,"");
						$(document).ready(function() {
							var data = ${fns:toJson(ueppRyjbxx.ueppRyzyzgList)};
							for (var i=0; i<data.length; i++){
								addRow('#ueppRyzyzgList', ueppRyzyzgRowIdx, ueppRyzyzgTpl, data[i]);
								ueppRyzyzgRowIdx = ueppRyzyzgRowIdx + 1;
							}
						});
					</script>
				</div>
			</div>
		<div class="form-actions">
			<shiro:hasPermission name="base:ueppRyjbxx:edit"><input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>