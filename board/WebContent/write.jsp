<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>
<script type="text/javascript">
	function formCheck() {
		var title = document.forms[0].title.value;
		// 사용하기 쉽도록 변수를 선언하여 담아주고
		var writer = document.forms[0].regdate.value;
		var regdate = document.forms[0].content.value; // 추가 되었습니다. 글내용 

		if(title == null || title == "") { // null 인지 비교한 뒤
			alert('제목을 입력하세요'); // 경고창을 띄우고
			document.form[0].title.focus(); // 해당 태그에 포커스를 준뒤
			return false; // false 를 리턴합니다.
		}
	
		if(writer == null || writer ==""){
			alert('작성자를 입력하세요');
			document.form[0].writer.focus();
			return false;
		}else if(writer.match(/^(\w+)@(\w+)[.](\w+)$/ig) == null){
			alert('이메일 형식으로 입력하세요 ');
			document.form[0].writer.focus();
			return false;			
		}
		
		
		if(content == null || content ==""){
			alert('내용을 입력하세요');
			document.form[0].content.focus();
			return false;
		}	
		if(regdate == null || redate ==""){
			alert('날짜를 입력하세요');
			document.form[0].regdate.focus();
			return false;
		}else if(regdate.match(/^\d\d\d\d\d\d+$/ig)== null){
			alert('숫자 형식(6자리)으로 입력하세요 ');
			document.form[0].regdate.focus();
			return false;
			
		}

	}
</script>
</head>

<body>
	<form action="index.jsp" onsubmit="return formCheck();" method="post">
	제목: <input type = "text" name="title" /> <br>
	작성자: <input type = "text" name="weiter" /> <br>
	내용 : <textarea rows="10" cols="20" name="content"/></textarea><br>
	날짜: <input type = "text" name="regdate" /> <br>
	<input type = "submit"/>
	</form>
</body>
</html>