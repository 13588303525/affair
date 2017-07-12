<%@ page contentType="text/html; charset=UTF-8"%>  
<%@ page import="java.util.*,cn.zucc.affair.pojo.*"%>

<html>  
<head>  
<title></title>  
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.0.0.min.js" ></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/page.js"></script>  
<script type="text/javascript">  
    $(function() {  
        $("#searchButton").click(function(){  
            var myForm = document.getElementById("mainForm");  
           
            if (myForm["pageIndex"])  
                myForm["pageIndex"].value = 1;  
            if (myForm["username"])  
                myForm["username"].value = $("#username").val();  
            
            alert("查询用户名:"+myForm["username"].value);

            $("#mainForm").submit();  
         })  
    });  
</script>  
  
  
</head>  

<body>  
    <table width="600" border=1 cellPadding=0 cellSpacing=0 >  
        <tr>  
            <td colspan="2">用户名 :<input type="text" id="username"  value="" width="450"/></td><td><button id="searchButton">查询</button></td>  
        </tr>  
        <tr>  
            <td>用户id</td><td>用户名</td><td>操作</td>  
        </tr>
        <%
          List list =(List)request.getSession().getAttribute("users");
          for(int i=0;i<list.size();i++){
        	  User user = (User)list.get(i);  
        	  %>
        	    <tr>
        	      <td>
        	        <%=user.getuId()%>
        	      </td>
        	      <td>
        	        <%=user.getuName()%>
        	      </td>
        	      <td>
        	          <form action="user/delUser.action" method = "post">        	      
        	          <input type="hidden" name="user.userid" value="<%=user.getuId()%>" />           	   
        	          <input type="submit" value="删除" height="200">
        	          </form>
        	      </td>
        	    </tr>
        	  <% 
          }
        %>
        <tr>  
            <td colspan="3"><jsp:include page="./page.jsp"></jsp:include></td>  
        </tr>  
    </table>  
    <form action="getUserList.action" id="mainForm" method="post">              
            <input type="hidden" name="username" value="${sessionScope.user.username}" />  
            <input type="hidden" name="pageSize"  value="${sessionScope.page.pageSize}" />  
            <input type="hidden" name="pageIndex"  value="${sessionScope.page.pageIndex}" />  
    </form>  
</body>  
</html>