<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../inc/top.jsp"%>    
<style type="text/css">
	.cartListTbl{
		width:650px;		
	}
	.cartListTbl td{
		padding:10px;
	}
	.cartListTbl caption{
		visibility:hidden;
	}
	.cartListDiv1{
		width:650px;
		text-align:center;		
		margin:10px;
	}
	
	
	.divForm fieldset	{
		width: 100%;
	}
	.divForm span{
		font-size:0.9em; 
	}	
	.divForm legend	{
		visibility:hidden;
		font-size:0.1em;
		}	
	.divForm label, .divForm .sp1	{
		text-align: left;
	}
	.divForm .title{
		font-size:1.1em;
		font-weight:bold;	
	}
	.divForm .titleP, .titleP{
		margin:10px 0;	
		border: none;
	}
	.divForm .lbl{
		float: none;
		text-align: left;
		padding: 3px 0;
		clear: both;		
		font-weight: bold;
		}
	.divForm p	{
		clear: both;
		border-bottom: 1px solid #eee;
		padding: 5px 0;
		margin: 0;
		overflow: auto;
		}		
</style>

<script type="text/javascript" 
	src="<c:url value='/resources/js/member.js'/>"></script>
<script type="text/javascript">
	$(function(){
		$.setAddress();			
		
		$("input[name=delivery]").click(function(){
			$.setAddress();			
		});	
	});
	
	$.setAddress=function(){
		if($("#delivery1").is(":checked")){
			$("#customerName").val($("#oName").text());
			$("#zipcode").val($("#oZipcode").text());
			$("input[name=address]").val($("#oAddress1").html());
			$("input[name=addressDetail]").val($("#oAddress2").html());
			
			if($("#oHp1").text()!=null && $("#oHp1").text()!=''){
				$("#hp").val($("#oHp1").text()+"-"+$("#oHp2").text()+"-"
					+$("#oHp3").text());
			}
		}else{
			$("#customerName").val("");
			$("#zipcode").val("");
			$("input[name=address]").val('');
			$("input[name=addressDetail]").val('');
			$("#hp").val("");			
		}
	}
	
</script>
<p class="titleP">  
	<img src="<c:url value='/resources/images/dotLong3.JPG'/>" align="absmiddle" />
    <span style="font-size:13pt;font-weight:bold">주문서 작성</span>
</p>  

<div>
    <table class="cartListTbl box2" 
	summary="장바구니 목록에 관한 표로써, 상품명,가격, 수량, 금액 등의 정보를 제공합니다.">
	<caption>장바구니 목록</caption>
	<colgroup>
		<col width="49%" />
		<col width="17%" />
		<col width="17%" />
		<col width="*" />		
	</colgroup>
	<thead>
		<tr>
			<th scope="col">상품명</th>
			<th scope="col">가격</th>
			<th scope="col">수량</th>
			<th scope="col">금액</th>			
		</tr>
	</thead>
	<tbody>
		<c:if test="${empty list }">
			<tr class="align_center">
				<td colspan="4">장바구니가 비었습니다.</td>
			</tr>
		</c:if>
		<c:if test="${!empty list }">
			<c:set var="buyPrice" value="0" />
			<c:set var="delivery" value="0" />
			<c:set var="sumPrice" value="0" />
			
			<!--반복 시작 -->	
			<c:forEach var="map" items="${list }">	
				<c:set var="sum" value="${map['SELLPRICE']* map['QUANTITY']}" />
				<tr class="align_right">
					<td class="align_left">
						<img src=
						"<c:url value='/resources/pd_images/${map["IMAGEURL"]}'/>" 
							alt="${map['PRODUCTNAME']}" width="50"
							align="absmiddle">
						${map['PRODUCTNAME']}</td>
					<td><fmt:formatNumber value="${map['SELLPRICE']}" 
						pattern="#,###"/>원 </td>
					<td>${map['QUANTITY']}</td>
					<td><fmt:formatNumber value="${sum}" 
						pattern="#,###"/>원 </td>							
				</tr>
				
				<c:set var="buyPrice" value="${buyPrice+sum }" />				
			</c:forEach>
			<!-- 반복 끝 -->			
			<c:if test="${buyPrice<30000 }">
				<c:set var="delivery" value="3000" />
			</c:if>
			
			<c:set var="sumPrice" value="${buyPrice+delivery }" />
			
			<tr>
				<td colspan="3" align="right" style="border-right:none">
					총 구매금액 : <br>
					   + 배송비 : <br>
					총 주문합계 :    
				</td>
				<td align="right" style="border-left:none">
					<fmt:formatNumber value="${buyPrice}" 
						pattern="#,###"/>원<br>
					<fmt:formatNumber value="${delivery}" 
						pattern="#,###"/>원<br>
					<fmt:formatNumber value="${sumPrice}" 
						pattern="#,###"/>원<br>
						
				</td>
			</tr>
		</c:if>
	</tbody>
</table>
</div>       
<br />
<div class="divForm">    
	<form name="frm1" method="post" 
		action="<c:url value='/shop/order/orderSheet.do'/>" >
	<fieldset>
		<legend>상품 받으시는 분</legend>

		<p class="titleP">
	    	<img src="${pageContext.request.contextPath}/resources/images/dot7.JPG" align="absmiddle" />
	    	<span class="title">주문하시는 분</span>
	    </p>
    
       <p><span class="sp1">이름</span>
         <span id="oName" >${memberVo.name }</span>
	   </p>
       <p>
           <span class="sp1">주소</span>
           <span id="oZipcode">${memberVo.zipcode }</span>
           <span id="oAddress1">${memberVo.address }</span>
           <span id="oAddress2">${memberVo.addressDetail }</span>
       </p>
       <p>
           <span class="sp1">연락처</span>
           <c:if test="${!empty memberVo.hp1}">
	           <span id="oHp1">${memberVo.hp1 }</span>
	           - <span id="oHp2">${memberVo.hp2 }</span>
	           - <span id="oHp3">${memberVo.hp3 }</span>
           </c:if>
		</p>
       <p>
           <span class="sp1">이메일</span>
           <c:if test="${!empty memberVo.email1 }">
	           <span>${memberVo.email1 }@${memberVo.email2 }</span>           
           </c:if>           
       </p>
    
    	<br /> 
	    <p class="titleP">
	    	<img src="${pageContext.request.contextPath}/resources/images/dot7.JPG" align="absmiddle" />
	    	<span class="title">상품 받으시는 분</span>
	    </p>	
	    <p>        
	        <span class="sp1">배송지 선택</span>    	       
	        <input type="radio" name="delivery" id="delivery1" checked> 
	        <label for="delivery1" class="lbl">주문고객과 동일 주소</label>                 
	        <input type="radio" name="delivery"	id="delivery2" > 
	        <label for="delivery2" class="lbl">새로운 주소 입력</label>
	    </p>
        <p>
            <label for="customerName">성명</label> 
            <input type="Text" name="customerName" id="customerName">
        </p>
        <p>
            <label for="zipcode">주소</label>                           
            <input type="Text" name="zipcode" id="zipcode" size="15" title="우편번호">
&nbsp;		<input type="Button" value="우편번호찾기" id="btnZipcode"/>
            <br />
            <span class="sp1">&nbsp;</span>
            <input type="Text" name="address"  size="60" title="주소">
            <br />
            <span class="sp1">&nbsp;</span>
            <input type="Text" name="addressDetail"  size="60" title="상세주소">           
        </p>
        <p>
            <label for="hp">연락처</label>
            <input type="Text" name="hp" id="hp" size="17">
        </p>
        <p>
            <label for="message">배송시 요청사항</label>
                <textarea name="message" id="message" cols="82" rows="3" ></textarea>
        </p>    
	
    <br />
    <p class="titleP">
    	<img src="${pageContext.request.contextPath}/resources/images/dot7.JPG" align="absmiddle" />
    	<span class="title">결제 정보</span>
    </p>	
    <p>
        <span class="sp1">결제금액</span>
        <span><fmt:formatNumber value="${sumPrice}" 
						pattern="#,###"/>원</span>
    </p>
    <p class="center">
        <input type="submit" value="결제하기"  />
    </p>
    
    <!-- 주문 총 금액 hidden field -->
    <input type="text" name="totalPrice" value="${sumPrice }" >
    
    </fieldset>
</form>

</div>
    
<%@ include file="../../inc/bottom.jsp"%>    