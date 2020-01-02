<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>insert title</title>
<link rel="stylesheet" href="<c:url value="/css/mainstyle.css"/>"
	type="text/css">
</head>

<body>
	<div>
		<p>
			<img src='<c:url value="/pd_images/${param.imgUrl}" />' border="0"
				width="380" alt="${param.pdName}">
		</p>
		<p>
			<button onclick="self.close()">닫기</button>
		</p>
	</div>
</body>

</html>
