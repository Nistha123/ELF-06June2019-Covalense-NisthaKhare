package com.covalense.emp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.covalense.emp.dao.EmployeeDao;
import com.covalense.emp.dao.EmployeeDaoFactory;
import com.covalense.emp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
@WebServlet("/show")
public class ShowEmployeeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		EmployeeDao dao = EmployeeDaoFactory.getInstance();
		EmployeeInfoBean bean = dao.getEmployeeInfo(Integer.parseInt(req.getParameter("id")));

		RequestDispatcher dispatcher = null;
		PrintWriter out = resp.getWriter();
		
		if (bean == null) {
	
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<BR>");
			out.print("<BR>");
			out.print("<BR>");
			out.print("<BR>");
			out.print("<h3 style=\"color: red\" class=\"head text-center\">");
			out.print("Some unknown error");
			out.print("<BR>");
			out.print("</h3>");
			out.print("</BODY>");
			out.print("</HTML>");

		} else {
			
			HttpSession httpSession = req.getSession(false);
			if (httpSession == null) {
				// Invalid session ; Generate Login Page with Error Info
				out.print("</br>");
				out.print("</br>");
				out.print("<HTML>");
				out.print("<BODY>");
				out.print("<BR>");
				out.print("<BR>");
				out.print("<BR>");
				out.print("<BR>");
				out.print("<h3 style=\"color: red\" class=\"head text-center\">");
				out.print("Invalid session, please login to continue");
				out.print("<BR>");
				out.print("</h3>");
				out.print("</BODY>");
				out.print("</HTML>");
				dispatcher = req.getRequestDispatcher("Login.html");
				dispatcher.include(req, resp);
			} else {
			
			out.print("<html lang=\"en\">");
			out.print("<head>");
			out.print("    <meta charset=\"UTF-8\">");
			out.print("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
			out.print("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">");
			out.print("    <title>Document</title>");
			out.print(
					"    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"");
			out.print(
					"        integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">");
			out.print(
					"    <link rel=\"stylesheet\" href=\"/Pentagram.css\">																																							");
			out.print(
					"</head>                                                                                                                                                                                                      ");
			out.print(
					"                                                                                                                                                                                                             ");
			out.print(
					"<body>                                                                                                                                                                                                       ");
			out.print(
					"    <nav class=\"navbar navbar-expand-lg navbar-dark primary-color\" style=\"background-color: rgb(129, 124, 124)\">                                                                                             ");
			out.print(
					"        <div class=\"offset-3 input-group md-form form-sm form-2 pl-0\" style=\"width: 50%;\">                                                                                                                  ");
			out.print("<form action=\"./display\" method=\"get\">");
			out.print(
					"            <input name=\"search\" class=\"form-control my-0 py-1 red-border\" style=\"background-color: white ; border-radius: 100px; padding: 20px 20px; border: 2px solid\" type=\"text\" placeholder=\"Search Everything.....\"  ");
			out.print(
					"                aria-label=\"Search\">                                                                                                                                                                         ");
			out.print(
					"            <div class=\"input-group-append\">                                                                                                                                                                 ");
			
			out.print(
					"                <button class=\"offset-8\"  style=\"background-color: darkgray; color: black; border-radius: 50px; padding: 2px;\">Search</button> ");
			out.print("</form");
			out.print(
					"                <button class=\"offset-8\" style=\"float: right; margin-left: 70px;\"><a href='./logout'>logout</a></button>                                                                                                            ");
			out.print(
					"            </div>                                                                                                                                                                                           ");
			out.print(
					"    </nav>                                                                                                                                                                                                   ");
			out.print(
					"    <hr>                                                                                                                                                                                                     ");
			out.print("<BR>Id is " + bean.getId());
			out.print("<BR>name is " + bean.getName());
			out.print("<BR>phone is " + bean.getPhone());
			out.print("<BR>Age is " + bean.getAge());
			out.print("<BR>Salary is " + bean.getSalary());
			out.print("<BR>Account no is " + bean.getAcnt_no());
			out.print("<BR>DOB is " + bean.getDob());
			out.print("<BR>Designation is " + bean.getDesignation());
			out.print("<BR>Dept ID is " + bean.getDept_ID());
			out.print("<BR>Manager ID is " + bean.getManager_ID());
			out.print(
					"    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"                                                                                                                                           ");
			out.print(
					"        integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\">                                                                                         ");
			out.print(
					"    </script>                                                                                                                                                                                                ");
			out.print(
					"    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js        ");
			out.print(
					"        integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\">                                                                                         ");
			out.print(
					"    </script>                                                                                                                                                                                                ");
			out.print(
					"    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js                                                                                                                     ");
			out.print(
					"        integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\">                                                                                         ");
			out.print(
					"    </script>                                                                                                                                                                                                ");
			out.print(
					"</body>                                                                                                                                                                                                      ");
			out.print("</html>");
			}

		}
		
		
	}

}
