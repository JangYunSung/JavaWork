package com.command;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lec.beans.AjaxCategory;
import com.lec.beans.CategoryDAO;
import com.lec.beans.CategoryDTO;

public class CategoryListCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		StringBuffer message = new StringBuffer();
		String status = "FAIL";
		int depth;
		int parent;  // 초기값을 초기화해준다
		String n;
		String de = request.getParameter("depth");
		String pa =  request.getParameter("parent");
		if(de ==null) {
			depth= 1;
		}else {
			n = (de);	
			depth = Integer.parseInt(n);
		}
		if(pa==null) {
			parent=0;
		}else {
			parent = Integer.parseInt(pa);
		}
		
		CategoryDAO dao = new CategoryDAO(); 
		CategoryDTO[] arr = null;
		
		try {              //SelectByCategory에 depth값과 parent값을 넣어 실행해준다
			arr = dao.selectByCategory(depth, parent);  
			
			if(arr == null) {
				message.append("뽑아낼 데이터가 없습니다");
			} else {
				status = "OK";
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		AjaxCategory result = new AjaxCategory();
		
		result.setStatus(status);
		result.setMessage(message.toString());
		
		if(arr != null) {
			result.setCount(arr.length);
			result.setList(Arrays.asList(arr));
		}
		
		ObjectMapper mapper = new ObjectMapper();  // Json 매핑할 객체
		
		try {
			String jsonString = 
					mapper.writerWithDefaultPrettyPrinter()
						.writeValueAsString(result);
			response.setContentType("application/json; charset=utf-8"); // SET!! ContentType은 json을 사용할것이고 utf-8로 인코딩할것이다
			response.getWriter().write(jsonString);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	} // end execute()
}


