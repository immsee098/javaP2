<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../inc/top.jsp"%>

<style type="text/css">	
	#info, #desc{
		width:900px;		
	}	
	#viewImg{
		float:left;
		padding:10px 30px 30px 30px;
		width:20%;				
	}
	#viewPd{
		float:left;
		padding:0 10px 30px 20px;	
		width:45%;
	}
	#viewBest{
		/*border:1px solid gray;*/
		float:left;
		padding:0 10px 30px 20px;	
		width:15%;
	}
	
	#desc{
		clear:both;
		padding:10px 0 5px 0;		
	}
	
	.line2{
		border-bottom:solid silver 2px;
		padding:0 0 10px 7px;
	}
	.line
	{
		border-bottom:solid 1px silver;
	}
	.boldF{
		font-size:1.2em;
		font-weight:bold;

	}
	.center{
		text-align:center;
	}
	span{
		font-size:0.9em;
	}
	.sp1{
		width:50%;
		float:left;		
	}
	
	form{
		width:350px;
	}
	
		
	p{
		padding:8px;
		font-size:1.0em;
	}
	
	input[type="text"]{
		width:20%;
	}
</style>

<script type="text/javascript">
	$(function(){
		$("#viewImg a").click(function(){
			window.open(
"<c:url value='/shop/product/bigImage.do?imageURL=${vo.imageURL}&productName=${vo.productName}'/>",
					"bigImg",
			"width=400,height=500,left=0,top=0,location=yes,resizable=yes");
		});
		
		$("input[type=button]").click(function(){
			if($("#qty").val().length<1){
				alert("수량을 입력하세요");
				$("#qty").focus();
				return;	
			}
			
			var mode="";
			if($(this).attr("id")=="btOrder"){
				mode="order";
			}else{
				mode="cart";
			}
			
			$("input[name=mode]").val(mode);			
			$("form[name=frmPd]").submit();	
		});
		
		
		
		
	});
</script>

<h2>상품 상세 보기</h2>
<div id="info">
	<div id="viewImg">
		<!-- 상품 이미지 -->
		<p class="center">
		<a href="#">
			<img src
				="<c:url value='/resources/pd_images/${vo.imageURL}'/>" 
				alt="${vo.productName }"
		 		border="0" width="150">
		</a>	
		</p>
		<p class="center">
		<a href="#">
		 	큰이미지 보기</a></p>
	</div>
	<div id="viewPd">
		<form name="frmPd" method="post" 
			action="<c:url value='/shop/cart/cartAdd.do'/>">			
			<!-- 상품명 -->
			<p class="line2">
				<span class="boldF">
					${vo.productName}
				</span>
			</p>
			<p class="line"><span class="sp1">
			<img src="<c:url value='/resources/images/dot2.JPG'/>"> 판매가격</span>				
				<span>
					<fmt:formatNumber value="${vo.sellPrice}"
						pattern="#,###" />원 </span>
			</p>
			<p class="line"><span class="sp1">
			<img src="<c:url value='/resources/images/dot2.JPG'/>"> 적립금</span>
				<span>
					<fmt:formatNumber value="${vo.mileage}"
						pattern="#,###" />원 
				</span>
			</p>
			<p class="line"><span class="sp1">
				<img src="<c:url value='/resources/images/dot2.JPG'/>"> 제조사</span>
				<span>${vo.company}</span>
			</p>
		
			<p class="line"><span class="sp1">
				<img src="<c:url value='/resources/images/dot2.JPG'/>"> 구매수량</span>
				<label for="qty">
				<input type="text" name="quantity" id="qty" value="1" >
				</label>
				<input type="hidden" name="productNo" 
					value="${vo.productNo }" >
				<input type="hidden" name="mode">
					
			</p>
			<p class="center">
				<input type="button" id="btOrder" value="바로구매" >
				<input type="button" id="btCart" value="장바구니담기">
			</p>
		</form>
	</div>
	<!-- 카테고리별 판매가 가장 많은 상품  -->
	<div id="viewBest">
		<c:import url="/shop/order/best5.do?productNo=${vo.productNo}"></c:import>
	
	</div>
</div>
<div id="desc">
	<img src="<c:url value='/resources/images/dot6.JPG'/>">
	<span style="font-size:12pt;font-weight:bold">
		상품상세정보</span>
	<br><br>
	<p>${vo.explains}</p>
	<p>${vo.description}</p>	
</div>


<%@ include file="../../inc/bottom.jsp"%>





