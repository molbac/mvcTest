package net.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycle extends HttpServlet {

	// ���Ȯ��
	// http://localhost:9090/mvcTest/life.do
	
	/*
		HttpServlet �����ֱ�-----------------------------------
			init() : ������ ���۵Ǹ� 1���� ȣ��
				   -> service() : ����ڰ� ��û�Ҷ��� ȣ��
				   -> service()
				   -> service()
				   -> service()
				   				-> destory() : ������ �����Ǹ� ȣ��
		-----------------------------------------------------
	*/
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// method = get ��� ��û�� ������
		super.doGet(req, resp);
		System.out.println("doget() ȣ��...");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// method = post ��� ��û�� ������
		super.doPost(req, resp);
		System.out.println("doPost() ȣ��...");
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// method = get ������� ��û�Ǹ� doGet() �Լ� ȣ��
		// method = post ������� ��û�Ǹ� doPost() �Լ� ȣ��
		// �� �Լ��� �����ؼ� ȣ�����ִ� ����
		super.service(arg0, arg1);
		System.out.println("service() ȣ��...");
	}

	@Override
	public void destroy() {
		// ������ �����Ǹ� 1���� ����
		super.destroy();
		System.out.println("destroy() ȣ��...");
	}

	@Override
	public void init() throws ServletException {
		// ���� ȣ��Ǹ� 1���� ����
		// �ʱ�ȯ�� ������ �� ���
		super.init();
		System.out.println("init() ȣ��...");
	}
	
	
} // class end
