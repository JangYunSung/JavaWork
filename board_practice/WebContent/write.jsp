<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>글작성</title>
<script type="text/javascript">
function checkSubmit() {   
	frm = document.forms["frm"];
	
	var name = frm["name"].value.trim();
	var subject = frm["subject"].value.trim();
	
	if(name == ""){
		alert("작성자를 입력하지 않았습니다.");
		frm["name"].foucs();
		return false;
	}
	if(subject == ""){
		alert("제목을 입력하지 않았습니다.");
		frm["subject"].foucs();
		return false;
	
}
</script>
</head>


<body>
<h2>글작성</h2>
<form name="frm" action="writeOk.jsp" method="post" onsubmit="return checkSubmit()">
작성자:
<input type="text" name="name"/><br>
제목:
<input type="text" name="subject"/><br>
내용:<br>
<textarea name="content"></textarea>
<br><br>
<input type="submit" value="등록"/>
</form>
<br>
<button type="button" onclick="location.href='list.jsp'">목록</button>
</body>
</html>