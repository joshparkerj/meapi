package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.db.Access;
import com.revature.db.Character;

public class CharacterServlet extends HttpServlet {

	private static final long serialVersionUID = -2727459809246958765L;
	static ObjectMapper objectMapper;
	static {
		objectMapper = new ObjectMapper();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt(req.getPathInfo().substring(1));
		try {
			Character c = Access.getAccess().Character.getByID(id);
			String cstr = objectMapper.writeValueAsString(c);
			System.out.print(cstr);
			res.setContentType("application/json");
			PrintWriter out = res.getWriter();
			out.println(cstr);
			out.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
