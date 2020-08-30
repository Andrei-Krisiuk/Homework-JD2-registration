package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.RegistrationInfo;
import parameters.Parameters;

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Controller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}
	
	private void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
		response.setContentType("text/html");
  
		RegistrationInfo registrationInfo = new RegistrationInfo();

		registrationInfo.setLogin(request.getParameter(Parameters.LOGIN));
		registrationInfo.setPassword(request.getParameter(Parameters.PASSWORD));
		registrationInfo.setName(request.getParameter(Parameters.NAME));
		registrationInfo.setSurname(request.getParameter(Parameters.SURNAME));
		registrationInfo.setYearBirthday(request.getParameter(Parameters.YEARBIRTHDAY));

		request.setAttribute("registrationInfo", registrationInfo);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/main.jsp");
		requestDispatcher.forward(request, response);
	}
}
