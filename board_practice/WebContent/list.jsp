<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*"%> <%-- JDBC 관련 import --%>    
<%@ page import = "java.text.SimpleDateFormat" %>
<%!

Connection conn = null ;
Statement stmt = null;
PreparedStatement pstmt = null;
ResultSet rs = null ;
int cnt = 0;


final String DRIVER = "oracle.jdbc.driver.OracleDriver";
final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
final String USERID = "scott0316";
final String USERPW = "tiger0316";

%>

<%!
	final String SQL_WRITE_SELECT =
	"SELECT * FROM writeboard ORDER BY wb_uid DESC";
%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>글 목록</title>
<style>
table {width: 100%;}
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}
</style>
</head>
<body>
<% 
	try {
		Class.forName(DRIVER);
	}

%>







