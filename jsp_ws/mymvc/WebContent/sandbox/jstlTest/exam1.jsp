<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>배송비 구하기</h3>
<c:set var="sum" value="0"></c:set>
<c:set var="totalPrice" value="25000"></c:set>
<c:set var="delivery" value="0"></c:set>

<c:if test="${totalPrice<30000 }">
	<c:set var="delivery" value="3000"></c:set>
</c:if>

<c:set var="sum" value="${totalPrice + delivery }"></c:set>
<hr>
금액 : ${totalPrice } <br>
배송비 : ${delivery } <br>
총 주문합계 :  ${sum }


</body>
</html>