<jsp:directive.page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"/>  
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.0.0.min.js" ></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/page.js"></script>  

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<c:set var="pageIndex" scope="session" value="${sessionScope.page.pageIndex}"/>
<c:set var="rowTotal" scope="session" value="${sessionScope.page.rowTotal}"/>
<c:set var="pageSize" scope="session" value="${sessionScope.page.pageSize}"/>
<c:set var="pageTotal" scope="session" value="${sessionScope.page.pageTotal}"/>
当前第  
<c:out value="${pageIndex}"/>  
页 共有  
<c:out value="${rowTotal}"/>  
结果 每页  
<c:out value="${pageSize}"/>  
条    
<c:choose>
  <c:when test="${pageIndex > 1}">
    <a href="javascript:gotoPage(1);">首页</a>   
  </c:when>
  <c:otherwise>
        首页
  </c:otherwise>
</c:choose>
<c:choose>
  <c:when test="${pageIndex  > 1}">
     <a href="javascript:gotoPage(${pageIndex - 1});">上页</a>   
  </c:when>
  <c:otherwise>
        上页
  </c:otherwise>
</c:choose>

<c:choose>
  <c:when test="${pageIndex < pageTotal}">
      <a href="javascript:gotoPage(${pageIndex + 1});">下页</a>   
  </c:when>
  <c:otherwise>
        下页
  </c:otherwise>
</c:choose>

<c:choose>
  <c:when test="${pageIndex < pageTotal}">
      <a href="javascript:gotoPage(${pageTotal});">尾页</a>   
  </c:when>
  <c:otherwise>
       尾页
  </c:otherwise>
</c:choose>

跳转到  
<input name="inputPageIndex" id="inputPageIndex" type="text" size="3" value="${pageIndex}"/>  
页   
<input name="Submit" type="submit" onClick="javascript:gotoPageByIndex(${pageTotal})" value=""/>  