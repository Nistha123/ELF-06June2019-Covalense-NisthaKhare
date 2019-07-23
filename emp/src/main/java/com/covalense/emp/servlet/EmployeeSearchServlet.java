package com.covalense.emp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.covalense.emp.dao.EmployeeDao;
import com.covalense.emp.dao.EmployeeDaoFactory;
import com.covalense.emp.dto.EmployeeInfoBean;

/**
 * Servlet implementation class EmployeeListDisplayServlet
 */
@WebServlet("/empSearch")
public class EmployeeSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
//		EmployeeDao dao = EmployeeDaoFactory.getInstance();
//		List<EmployeeInfoBean> empBean = searchLikeEmployee(request.getParameter("search"));

		RequestDispatcher dispatcher = null;
		//2.  validate the session
		HttpSession session = request.getSession(false);
		if (session == null) {
			
			// Invalid session ; Generate Login Page with Error Info
			out.print("<h1><span='color:red'>Invalid Session !!! Plzz Login </span></h1>");
			out.print("</br>");
			out.print("</br>");
			dispatcher = request.getRequestDispatcher("Login.html");
			dispatcher.include(request, response);
		} else {
			
			String url = "EmployeeSearch.jsp";
			request.getRequestDispatcher(url).forward(request, response);

			/*
			 * out.print("<html lang=\"en\">"); out.print("<head>");
			 * out.print("    <meta charset=\"UTF-8\">"); out.
			 * print("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"
			 * );
			 * out.print("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">");
			 * out.print("    <title>Document</title>"); out.print(
			 * "    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\""
			 * ); out.print(
			 * "        integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">"
			 * ); out.print(
			 * "    <link rel=\"stylesheet\" href=\"/Pentagram.css\">																																							"
			 * ); out.print(
			 * "</head>                                                                                                                                                                                                      "
			 * ); out.print(
			 * "                                                                                                                                                                                                             "
			 * ); out.print(
			 * "<body>                                                                                                                                                                                                       "
			 * ); out.print(
			 * "    <nav class=\"navbar navbar-expand-lg navbar-dark primary-color\" style=\"background-color: rgb(129, 124, 124)\">                                                                                             "
			 * ); out.print(
			 * "        <div class=\"offset-3 input-group md-form form-sm form-2 pl-0\" style=\"width: 50%;\">                                                                                                                  "
			 * ); out.print(
			 * "            <h3 class=\"head text-center offset-3\" style=\"color: azure;\">Employee List Found</h3> "
			 * ); out.print(
			 * "            </div>                                                                                                                                                                                           "
			 * ); out.print(
			 * "    </nav>                                                                                                                                                                                                   "
			 * ); out.print(
			 * "    <hr>                                                                                                                                                                                                     "
			 * ); for (EmployeeInfoBean bean : empBean) {
			 * out.print("<BR><a href='./show?id="+bean.getId()+"'>"); out.print("Id is:" +
			 * bean.getId()); out.print("</a>"); } out.print(
			 * "    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"                                                                                                                                           "
			 * ); out.print(
			 * "        integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\">                                                                                         "
			 * ); out.print(
			 * "    </script>                                                                                                                                                                                                "
			 * ); out.print(
			 * "    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js        "
			 * ); out.print(
			 * "        integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\">                                                                                         "
			 * ); out.print(
			 * "    </script>                                                                                                                                                                                                "
			 * ); out.print(
			 * "    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js                                                                                                                     "
			 * ); out.print(
			 * "        integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\">                                                                                         "
			 * ); out.print(
			 * "    </script>                                                                                                                                                                                                "
			 * ); out.print(
			 * "</body>                                                                                                                                                                                                      "
			 * ); out.print("</html>");
			 */
		}
		

	}
	private List<EmployeeInfoBean> searchLikeEmployee(String id) {

		EmployeeDao dao = EmployeeDaoFactory.getInstance();
		List<EmployeeInfoBean> beans = dao.getAllEmployeeInfo(id);

		return beans;
	}


}
