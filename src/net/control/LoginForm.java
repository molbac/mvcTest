package net.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginForm extends HttpServlet {
	
	// ���Ȯ��
	// http://localhost:9090/mvcTest/login.do

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// method = get ��� ��û
		// ������ �̵�
		// 1) ����� �̵�
		//    ���� �������� �̵��� �������� ����
		//    http://localhost:9090/mvcTest/control/loginForm.jsp
		// resp.sendRedirect("control/loginForm.jsp");
		
		// 2) �������������� �߻��� ��û(req), ����(resp) ��ü�� ������ �̵�
		// ���� (���ư����ʰ� �ѹ��� �̵��ؼ� ����)
		// http://localhost:9090/mvcTest/login.do
		String view = "control/loginForm.jsp";
		RequestDispatcher rd = req.getRequestDispatcher(view);
		rd.forward(req, resp);
	} // doget() end

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// method = post ��� ��û
	} // doPost() end

	/*@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {		
	} // service() end

	@Override
	public void destroy() {	
	} // destroy() end

	@Override
	public void init() throws ServletException {
	} // init() end
	*/
} // class end
