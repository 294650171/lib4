<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>

<%@ attribute name="projectId" type="java.lang.String" required="true" description="项目编号"%>
<%@ attribute name="contentTypeName" type="java.lang.String" required="true" description="文档类型名称"%>
<%@ attribute name="contentType" type="java.lang.String" required="true" description="文档类型"%>
<%@ attribute name="textName" type="java.lang.String" required="true" description="文本名称"%>
<%@ attribute name="textValue" type="java.lang.String" required="true" description="文本内容"%>
<%@ attribute name="textWidth" type="java.lang.String" required="true" description="textarea width"%>
<%@ attribute name="textHeight" type="java.lang.String" required="true" description="textarea height"%>
<%@ attribute name="attachName" type="java.lang.String" required="true" description="附件名称"%>
<%@ attribute name="attachValue" type="java.lang.String" required="true" description="附件内容"%>

<div>
 
	<div class="control-group" >
	    <table>
	      <tr>
	        <td width="10%">
		    <input id="${contentTypeName}Text" type="radio" name="${contentTypeName}" value="text" <c:if test="${contentType ne 'attach'}">checked='checked'</c:if>/>文本<BR>
		    <input id="${contentTypeName}Attach" type="radio" name="${contentTypeName}" value="attach" <c:if test="${contentType eq 'attach'}">checked='checked'</c:if>/>附件	         
	        </td>
	        <td width="90%">
			<div id="${textName}TextDiv" class="controls">
				<textarea id="${textName}" name="${textName}" style="width:${textWidth};height:${textHeight}">${textValue}</textarea>
			</div>
		
			<div id="${textName}AttachDiv" class="controls">
		        <input type="hidden" id="${attachName}" name="${attachName}" value="${attachValue}" />
				<sys:ckfinder input="${attachName}" type="files" uploadPath="/${projectId}" selectMultiple="false"/>
			</div>	         
	        </td>
	      </tr>
	    </table>
	</div>	
</div>

<script type="text/javascript">

	$(function(){
		var v = $("input[name='${contentTypeName}']:checked").val();
		
	    if(v =='attach'){
			$("#${textName}TextDiv").css("display", "none");
	        $("#${textName}AttachDiv").css("display", "block");			  
	    }else{
			$("#${textName}TextDiv").css("display", "block");
	        $("#${textName}AttachDiv").css("display", "none");
	    }
	});
	
	$("[name='${contentTypeName}']").on("change", 
		function (e) { 
		  var v = $(e.target).val();
		  if(v =='attach'){
				$("#${textName}TextDiv").css("display", "none");
		        $("#${textName}AttachDiv").css("display", "block");			  
		  }else{
				$("#${textName}TextDiv").css("display", "block");
		        $("#${textName}AttachDiv").css("display", "none");
		  }
		} 
	); 
	
</script>