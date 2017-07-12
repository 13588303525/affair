<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Login</title>
</head>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.0.0.min.js" ></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/common.js" ></script>
<script type="text/javascript">
function register() {
	
	var userid = $("#userid").val();
	var pwd = $("#pwd").val();
	var datas={"userid":userid,"pwd":pwd};
    datas["userid"] = userid;
    datas["pwd"] = pwd;
    $.ajax({ 
        type:"POST", 
        url: server + "user/saveUser.action",    
        contentType: "application/json",
        data:JSON.stringify(datas),
        success:function(data){ 
                                  
        } 
    });
}		
function register2() {
	var userid = $("#userid").val();
	var pwd = $("#pwd").val();
	var datas={"userid":userid,"pwd":pwd};
    $.ajax({ 
        type:"POST", 
        url: server + "user/saveUser.action",    
        contentType: "application/json",
        data:JSON.stringify(datas),
        success:function(data){ 
                                  
        } 
    });
}	
function test2() {
	
    $.ajax({ 
        type:"POST", 
        url: server + "user/saveUser2.action",    
        data:groupParams2(document.getElementById("user_form2")),
        success:function(data){ 
                                  
        } 
    });
}	
</script>
<body>

<h2>Hello World!</h2>
<form action="user/showUser.action" method="post" id = "user_form">  
    userid:<input type="text" id="userid" name="userid" >
    pwd:<input type="text" id="pwd" name="pwd" >  
    <input type="submit" value="表单传值"/>
</form>
<input type="button" id="submit3" value="ajax-对象传值" onClick="register2()" />

<form name="myform" action="user/query.action" method="post">       
<input type="submit" value="列表页面" />  
</form>  

<form id = "user_form2">  
    userid:<input type="text" name="user.userid" >
    pwd:<input type="text" name="user.pwd" >  
    name:<input type="text" name="user.username" >
    <input type="submit" value="ajax-Binder对象传值" onClick="test2()" />  
</form>

</body>
</html>
