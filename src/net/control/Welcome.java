package net.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet {
	
	// ���Ȯ�� (�� �ּҸ� �������� �˻�)
	// http://localhost:9090/mvcTest/wel.do
	
	// Welcome ����Ŭ������
	// web.xml(��ġ������)�� ����ؾ� �Ѵ�
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// <form method=get> ������� ��û������
		try {
			// 1) ���ڿ� ���� -> AJAX (plain : �ܼ��� ���ڿ�)
			// resp.setContentType("text/plain; charset=UTF-8");
			
			// 2) HTML ���������� ���� (html : ��������)
			resp.setContentType("text/html; charset=UTF-8");
			PrintWriter out = resp.getWriter();
			out.println("<!DOCTYPE html>");
			out.println("<html lang='ko'>");
			out.println("<head>");
			out.println("<meta charset='UTF-8'>");
			out.println("<title>ȯ���մϴ�</title>");
			out.println("	</head>");
			out.println("	<body>");
			out.println("		<strong>���ѹα�</strong>");
			out.println("		<hr>");
			out.println("		<span style='color:tomato'>���ʽ��ڸ���</span>");
			out.println("		<hr>");
			out.println("	<table border='1'>");
			out.println("	<tr>");
			out.println("	<th>�̸�</th>");
			out.println("	<td>����ȭ</td>");
			out.println("	</tr>");
			out.println("	</table>");
			out.println("</body>");
			out.println("</html>");
			out.close(); // �ڿ��ݳ�
		} catch (Exception e) {
			System.out.println("��û����" + e);
		} // try end
	} // doGet() end

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// <form method=post> ������� ��û������
	} // doPost() end
	
} // class end
