<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'costlist.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
		
	</script>
  </head>
  
  <body>
  	<table>
  		<s:iterator value="costs">
     		<tr>
     			<td><s:property value="cost_id"/></td>
     			<td><s:property value="name"/></td>
     			<td><s:date format="yyyy-MM-dd" name="creatime"/></td>
     		</tr>
     	</s:iterator>
  	</table>
     <div id="pages">
     	<s:if test="page>1">
     		<a href="cost/costslist?page=<s:property value="page-1"/>">上一页</a>
     	</s:if>
     	<s:else>
     		<a href="#">上一页</a>
     	</s:else>
     	
     	<s:iterator begin="1" end="totalPage" var="p">
     		<s:if test="#p==page">
     			<a href="#" style="color:red"><s:property value="#p"/></a>
     		</s:if>
     		<s:else>
     			<a href='cost/costslist?page=<s:property value="#p"/>'>
     				<s:property value="#p"/>	</a>
     		</s:else>
     	</s:iterator>
     	
     	<s:if test="page<totalPage">
     		<a href="cost/costslist?page=<s:property value="page+1"/>">下一页</a>
     	</s:if>
     	<s:else>
     		<a href="#">下一页</a>
     	</s:else>
     </div>
  </body>
</html>
