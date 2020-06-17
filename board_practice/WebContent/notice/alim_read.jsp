<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"
     import="java.util.*,java.io.*"%>
<%
	Calendar cal=Calendar.getInstance();
	int yy=cal.get(Calendar.YEAR);
	int mm=cal.get(Calendar.MONTH)+1;
	int dd=cal.get(Calendar.DAY_OF_MONTH);
	out.println("<font color=blue><b>");
	out.println(yy+"년 "+mm+"월 "+dd+"일");
	out.println("</b></font>");
	String filename=yy+"";
	if(mm<10)
		filename+=("0"+mm);
	else
		filename+=mm;
	
	if(dd<10)
		filename+=("0"+dd);
	else
		filename+=dd;
	
	filename+=".html";
	out.println("["+filename+"]");
	
	String readFile
	=config.getServletContext().getRealPath("/notice");
	readFile+="/"+filename;
	
	//out.println("readFile: "+readFile);
	//out.println("<br>");
	
	FileReader fr=null;
	BufferedReader br=null;
	try{
		fr=new FileReader(readFile);
		br=new BufferedReader(fr);
		String contents="";
		while((contents=br.readLine())!=null){
			
			out.println(contents+"<br>");
		}
		fr.close(); br.close();		
		
	}catch(FileNotFoundException e){
		out.println("<b>오늘은 공지사항 없습니다.</b>");
		out.println("<a href='javascript:self.close();'>");
		out.println("닫기</a>");
	}catch(IOException e){
		out.println("IO오류: "+e.getMessage());
	}
	

%>

<%
/* 1. 공지파일을 읽기 위해 오늘 날짜를 구한다.
2. 날짜.html[20080717.html] -> 파일명을 만들고
3. 그 파일명과 파일을 읽는 노드스트림 연결
4. 필터링
5. 스트림을 통해 읽기
6. 읽은 내용을 웹브라우저에 출력
7. 스트림 닫기
*/
%>