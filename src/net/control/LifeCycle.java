package net.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycle extends HttpServlet {

	// 결과확인
	// http://localhost:9090/mvcTest/life.do
	
	/*
		HttpServlet 생명주기-----------------------------------
			init() : 서블릿이 시작되면 1번만 호출
				   -> service() : 사용자가 요청할때만 호출
				   -> service()
				   -> service()
				   -> service()
				   				-> destory() : 서버가 중지되면 호출
		-----------------------------------------------------
	*/
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// method = get 방식 요청이 들어오면
		super.doGet(req, resp);
		System.out.println("doget() 호출...");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// method = post 방식 요청이 들어오면
		super.doPost(req, resp);
		System.out.println("doPost() 호출...");
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// method = get 방식으로 요청되면 doGet() 함수 호출
		// method = post 방식으로 요청되면 doPost() 함수 호출
		// 두 함수를 구분해서 호출해주는 역할
		super.service(arg0, arg1);
		System.out.println("service() 호출...");
	}

	@Override
	public void destroy() {
		// 서버가 중지되면 1번만 실행
		super.destroy();
		System.out.println("destroy() 호출...");
	}

	@Override
	public void init() throws ServletException {
		// 서블릿 호출되면 1번만 실행
		// 초기환경 구축할 때 사용
		super.init();
		System.out.println("init() 호출...");
	}
	
	
} // class end
