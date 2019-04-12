package net.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginProc_v1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// method = get ��� ��û
		try {
			// 1) �ѱ����ڵ�
			resp.setCharacterEncoding("UTF-8");
			
			// 2) ����ڰ� ��û�� ������ ������ �Űܴ��
			String uid = req.getParameter("uid").trim();
			String upw = req.getParameter("upw").trim();
			
			// 3) ��û�� ����ڿ��� ����
			PrintWriter out = resp.getWriter();
			out.println("<!DOCTYPE html>");
			out.println("<html lang='ko'>");
			out.println("<head>");
			out.println("<meta charset='UTF-8'>");
			out.println("<title>�α��ΰ��</title>");
			out.println("	</head>");
			out.println("	<body>");
			out.println("		���̵� : <strong>" + uid + "</strong>");
			out.println("		<hr>");
			out.println("		��й�ȣ : <strong>" + upw + "</strong>");
			out.println("		<hr>");
			out.println("</body>");
			out.println("</html>");
			out.close(); // �ڿ��ݳ�
		} catch (Exception e) {
			System.out.println("��û���� : " + e);
		} // try end
	} // doGet() end
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// method = post ���
		try {
			// 1) �ѱ����ڵ�
			req.setCharacterEncoding("UTF-8");
			
			// 2) ����ڰ� ��û�� ������ ������ �Űܴ��
			String uid = req.getParameter("uid").trim();
			String upw = req.getParameter("upw").trim();
			
			// 3) ��û�� ����ڿ��� ����
			PrintWriter out = resp.getWriter();
			out.println("<!DOCTYPE html>");
			out.println("<html lang='ko'>");
			out.println("<head>");
			out.println("<meta charset='UTF-8'>");
			out.println("<title>�α��ΰ��</title>");
			out.println("	</head>");
			out.println("	<body>");
			out.println("		���̵� : <strong>" + uid + "</strong>");
			out.println("		<hr>");
			out.println("		��й�ȣ : <strong>" + upw + "</strong>");
			out.println("		<hr>");
			out.println("</body>");
			out.println("</html>");
			out.close(); // �ڿ��ݳ�
		} catch (Exception e) {
			System.out.println("��û���� : " + e);
		} // try end
	} // doPost() end

} // class end
