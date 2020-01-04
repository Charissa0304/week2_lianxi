<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<!-- 引入 css -->
<link rel="stylesheet" type="text/css" 
href="${pageContext.request.contextPath}/resource/css/bootstrap.css">
<!-- 引入js -->
<script type="text/javascript" src="${pageContext.request.contextPath}/resource/js/jquery-3.2.1.js"></script>
</head>
<body>
   <div>
     <form action="/selects" method="post" id="form1">
        价格:<input type="text" name="startPrice" value="${goodsVO.startPrice }">--<input type="text" name="endPrice" value="${goodsVO.endPrice }">
        百分比:<input type="text" name="startSales" value="${goodsVO.startSales }">--<input type="text" name="endSales" value="${goodsVO.endSales }">
        排序:<select name="orderColumn">
           <option value="price" ${goodsVO.orderColumn=="price"?"selected":"" }>价格</option>
           <option value="sales" ${goodsVO.orderColumn=="sales"?"selected":"" }>百分比</option>
        </select>
        
        <select name="orderMethod">
           <option value="desc" ${goodsVO.orderColumn=="desc"?"selected":"" }>倒序</option>
           <option value="asc" ${goodsVO.orderColumn=="asc"?"selected":"" }>正序</option>
        </select>
     </form> 
   </div>
   
   <table class="table table-hover">
     <tr>
        <td>商品ID</td>
        <td>商品名称</td>
        <td>商品价格</td>
        <td>商品销售比</td>
     </tr>
     <c:forEach items="${info.list }" var="g">
        <tr>
           <td>${g.id }</td>
           <td>${g.name }</td>
           <td>${g.price }</td>
           <td>${g.sales }</td>
        </tr>
     </c:forEach>
     <tr>
        <td colspan="11">
          <jsp:include page="/WEB-INF/view/pages.jsp"></jsp:include>
        </td>
     </tr>
   </table>
</body>
 <script type="text/javascript">
    function goPage(page){
    	location.href="/selects?page="+page+"&"+$("form1").serialize();
    }
 </script>
</html>