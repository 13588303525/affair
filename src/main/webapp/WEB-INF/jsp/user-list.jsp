<%@ page contentType="text/html; charset=UTF-8"%>  
<%@ page import="java.util.*,cn.zucc.affair.pojo.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<html>  
<head>  
<title></title>             
</head>  
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.0.0.min.js" ></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrapv3.js"></script>  
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap-paginator.js"></script>  
<script type="text/javascript" src="${pageContext.request.contextPath}/js/common.js" ></script>
<link href="${pageContext.request.contextPath}/css/bootstrapv3.css" rel="stylesheet" type="text/css">
<script type="text/javascript">  
var currentPage = ${page.pageIndex};
var totalPages = ${page.pageTotal};
function gotoPage(page,user){
    $.ajax({ 
        type:"POST", 
        url: server + "user/queryByCriteria.action?pn="+page,    
        contentType: "application/json",
        data:user,
        success: function (data) {  
            $("#example").empty();  
            list = data.list;  
            page = data.page;
           if (list != null) {  
              $.each( list, function(index, user){    
                  var html = '<tr>'+//  
                     '<td>'+user.userid+'</td>'+//  
                     '<td>'+user.username+'</td>'+//                          
                     '<td><a href="#">操作</a></td>'+//  
                     '</tr>';  
                     $("#example").append(html);   
                  });  
            }
           else{  
              $("example").append('没有找到相应数据');  
           }
           totalPages = page.pageTotal;
           currentPage = page.pageIndex;
           initPage();
         }  
    });
}
function initPage(){
	
	var options = {
            bootstrapMajorVersion: 3, //版本
            currentPage: currentPage, //当前页数
            totalPages: totalPages, //总页数

		    itemTexts : function (type, page, current) {
		        switch (type) {
		            case "first":
		                return "首页";
		            case "prev":
		                return "上一页";
		            case "next":
		                return "下一页";
		            case "last":
		                return "末页";
		            case "page":
		                return page;
		        }
		    },
		    // 点击事件，用于通过ajax来刷新整个list列表
		    onPageClicked : function (event, originalEvent, type, page) {
		        // 按分页从后台获取第 + page + 页的具体数据
		    	   alert("go to page " + page);
		           var username =  document.getElementById("user.username").value; 
		           var user=JSON.stringify({"username":username});
		    	   gotoPage(page,user);
		    }
		};
	$('#page').bootstrapPaginator(options);
}
$(function() {  
      $("#searchButton").click(function(){  
          var username =  $("#username").val()
          var user=JSON.stringify({"username":username});
          gotoPage(1,user);
          document.getElementById("user.username").value = username;
       })  
 });  
</script>  
<body onload="initPage()">  
    <div class="row">  
        <table class="table table-striped" >  
            <thead>
                <tr>
                    <th colspan="2">
                       <div class="input-group input-group-sm">
                         <span class="input-group-addon">@</span>
                         <input type="text" class="form-control" placeholder="Twitterhandle" id="username">
                       </div>
                    </th>
                    <th>
                        <button id="searchButton" class="btn btn-primary">查询</button>
                   </th>
                </tr>
                <tr>  
                    <th>用户id</th>  
                    <th>用户名</th>                   
                    <th>操作</th>  
                </tr>  
            </thead>  
            <tbody id="example">  
                <c:forEach items="${list}" var="user" varStatus="status">  
                    <tr>  
                        <td>${user.userid}</td>  
                        <td>${user.username}</td>           
                        <td><a href="">操作</a></td>              
                    </tr>  
                </c:forEach>  
            </tbody>  
        </table>  
    </div>  
      
    <div align="center">  
       <ul id='page'></ul>
    </div>  
    <input type="hidden" id="user.username" value="${sessionScope.user.username} " />  
</body>  
</html>