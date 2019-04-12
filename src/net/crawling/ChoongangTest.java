package net.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ChoongangTest {
	
	public static void main(String[] args) {
		// 중앙정보처리학원 공지사항 제목 크롤링 하기
		try {
			//-------------------------------------------------------- 1페이지만 크롤링
			/* ★ 1) URL 선언
			String URL = "http://www.choongang.co.kr/html/sub07_01.php";
			
			// ★ 2) 중앙정보처리학원 공지사항 HTML문서 내용 가져오기
			Document doc = Jsoup.connect(URL).get();
			
			// ★ 3) 가져온 2)의 내용 출력하기
			// System.out.println(doc.toString());
			
			// 요소를 개별적으로 접근
			// class = "default_title" -> 그래서 밑에 . 붙음 id면 # 붙음
			Elements elements = doc.select(".default_title");
			
			for(개별값:전체값)
			int[] params = {1, 3, 5}
			for(int param : params)
			
			for(Element element : elements) {
				// System.out.println(element.toString());
				// System.out.println(element.tagName());
				System.out.println(element.text());
			} // for end
			*/
			//-------------------------------------------------------- 1페이지만 크롤링
				// 2) 공지사항 제목 1 ~ 5 페이지 크롤링
			/*
			String URL = "http://www.choongang.co.kr/html/sub07_01.php?";
			for(int page = 1; page <= 5; page++) {
				String params = "";
				params += "page=" + page;
				params += "&mod=&idx=";
				
				Document doc = Jsoup.connect(URL+params).get();
				// Elements elements = doc.select(".default_title");
				// 위 elements와 같은 결과값. 이유는 .board_default_list 가 부모이기때문
				Elements elements = doc.select(".board_default_list .default_title");
				for(Element element:elements) {
					System.out.println(element.text());
				} // for end
			} // for end
			*/
			//--------------------------------------------------------
			String URL = "http://www.soldesk.com/board/board_bagic/board_list.asp?scrID=0000000173&pageNum=9&subNum=1&ssubNum=1&";
			for(int page = 1; page <= 2; page++) {
				String params = "";
				params += "page=" + page;
				params += "&bd_num=&act=list&s_string=";
				
				Document doc = Jsoup.connect(URL+params).get();
				// 만약 공백이 있다면 공백에다가 . 찍어주면된다
				Elements elements = doc.select(".table.t_sty01 .td_left");
				for(Element element:elements) {
					System.out.println(element.text());
				} // for end
			} // for end
						
		} catch(Exception e) {
			System.out.println("크롤링 실패 : " + e);
		}
	} // main() end

} // class end
