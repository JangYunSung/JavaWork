package com.command.write;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lec.beans.WriteDAO;

public class DeleteCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		WriteDAO dao = new WriteDAO();

		int uid = Integer.parseInt(request.getParameter("uid"));
		int cnt = 0;

		if (uid > 0 && uid !=0) {

			try {
				 cnt = dao.deleteByUid(uid);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		
		request.setAttribute("delete", cnt);
		
	}

}
