<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../inc/adminTop.jsp" %>
<style type="text/css">
	caption{
		visibility:hidden;
		font-size:0.1em;
	}	
	.divList, .divRight, .divPage, .divList table{
		width:700px;
	}	
	.divList{
		margin:10px 0;
	}		
	.divPage{
		text-align:center;		
		padding:5px 0;
	}		
	.divRight{
		text-align:right;	
		width:700px;
	}

</style>

<script type="text/javascript">
	$(function(){
		$("#btDelMulti").click(function(){
			$('form[name=frmList]').prop("action",
					"<c:url value='/admin/product/deleteMulti.do'/>");	
			$('form[name=frmList]').submit();	
			
			//document.frmList.action="";
			//document.frmList.submit();
		});
		
		
	});
	
	
	function pageFunc(curPage){		
		$("input[name=currentPage]").val(curPage);
		$("form[name=frmPage]").submit();
	}
</script>	
<h2>상품 목록</h2>
<c:if test="${!empty param.eventName }">
	${param.eventName } 상품   ${pagingInfo.totalRecord }건입니다.
</c:if>
<c:if test="${empty param.eventName }">
	전체 상품   ${pagingInfo.totalRecord }건입니다.
</c:if>

<!-- 페이징 처리를 위한 form 시작-->
<form name="frmPage" method="post" 
	action="<c:url value='/admin/product/productList.do'/>">
	<input type="text" name="eventName" 	value="${param.eventName }">
	<input type="text" name="currentPage">	
</form>
<!-- 페이징 처리 form 끝 -->

<form name="frmList" method="post" 
	action="<c:url value='/admin/product/productList.do'/>">
<div class="divRight">	
	이벤트 상품 조회
	<select name="eventName">
		<option value=""></option>
		<option value="NEW" 
			<c:if test="${param.eventName=='NEW' }">
				selected
			</c:if>
		>신상품</option>
		<option value="BEST"
			<c:if test="${param.eventName=='BEST' }">
				selected
			</c:if>
		>인기상품</option>
		<option value="MD"
			<c:if test="${param.eventName=='MD' }">
				selected
			</c:if>
		>MD추천상품</option>				
	</select>
	<input type ="image" src="<c:url value='/resources/images/bt_search3.png'/>" 
		align="absmiddle" onclick="" >		
</div>
<div class="divList">
<table width="700" class="box2" 
	summary="상품목록에 관한 표로써, 번호, 제목, 작성자, 작성일, 조회수에 대한 정보를 제공합니다.">
	<caption>상품 목록</caption>
	<colgroup>
		<col style="width:5%" />
		<col style="width:15%" />
		<col style="width:32%" />
		<col style="width:15%" />
		<col style="width:15%" />	
		<col style="width:9%" />
		<col style="width:9%" />			
	</colgroup>
	<thead>
	  <tr>
		<th><input type="checkbox" name="chkAll" ></th>
		<th scope="col">상품이미지</th>
		<th scope="col">상품이름</th>
		<th scope="col">가격</th>
		<th scope="col">등록일</th>
		<th scope="col">수정</th>
		<th scope="col">삭제</th>
	  </tr>
	</thead> 
	<tbody>  
	<c:if test="${empty list }">
		<tr class="align_center">
			<td colspan="7">해당 상품이 없습니다.</td>
		</tr>
	</c:if>
	<c:if test="${!empty list }">	
		<!-- 반복 시작 -->
		<c:set var="idx" value="0" />
		<c:forEach var="vo" items="${list }">
			<tr class="align_center">
				<td>
				<!-- List 타입의 프로퍼티에 값을 전달하고 싶으면, 
				폼에서 "프로퍼티명[인덱스].프로퍼티" 같이 입력 폼의 이름을 구성하면 됨 -->
					<input type="checkbox" id="chk_${idx }" 
						name="pdItems[${idx }].productNo" 
						value="${vo.productNo }">
					<input type="text" name="pdItems[${idx }].imageURL" 
						value="${vo.imageURL }">					
				</td>
				<td>
					<img src="<c:url value='/resources/pd_images/${vo.imageURL }'/>" 
						alt="${vo.productName }" width="50">
				</td>
				<td class="align_left">${vo.productName }</td>
				<td class="align_right"><fmt:formatNumber value="${vo.sellPrice }"
					pattern="#,###"/>원 </td>
				<td><fmt:formatDate value="${vo.regDate }"
					pattern="yyyy-MM-dd"/></td>
				<td><a href="#">수정</a></td>
				<td><a href="#">삭제</a></td>				
			</tr>
			
			<c:set var="idx" value="${idx+1}" />
		</c:forEach>
		<!-- 반복 끝 -->
	</c:if>
	
	</tbody>
</table>
</div>
<div class="divPage">
	<!-- 페이지 번호 추가 -->		
	<c:if test="${pagingInfo.firstPage>1 }">
		<a href="#" onclick="pageFunc(${pagingInfo.firstPage-1})">			
		    <img src='<c:url value="/resources/images/first.JPG" />'  border="0">	
		</a>
	</c:if>
					
	<!-- [1][2][3][4][5][6][7][8][9][10] -->
	<c:forEach var="i" begin="${pagingInfo.firstPage }" 
			end="${pagingInfo.lastPage }">
		<c:if test="${i==pagingInfo.currentPage }">
			<span style="color:blue;font-weight:bold">${i }</span>
		</c:if>
		<c:if test="${i!=pagingInfo.currentPage }">						
			<a href="#" onclick="pageFunc(${i})">
				[${i }]
			</a>
		</c:if>		
	</c:forEach>
	
	<c:if test="${pagingInfo.lastPage<pagingInfo.totalPage }">
		<a href="#" onclick="pageFunc(${pagingInfo.lastPage+1})">			
			<img src="<c:url value="/resources/images/last.JPG" />" border="0">
		</a>
	</c:if>
	<!--  페이지 번호 끝 -->
</div>

<div class="divRight">
	<input type="button" id="btDelMulti" value="선택한 상품 삭제" ><br><br>
	선택한 상품을
	<select name="eventSel">
		<option value=""></option>
		<option value="NEW">신상품으로</option>
		<option value="BEST">인기상품으로</option>
		<option value="MD">MD추천상품으로</option>
	</select>
	<input type="button" id="btEventMulti" value="등록" >
</div>
</form>



<%@ include file="../../inc/adminBottom.jsp" %>







