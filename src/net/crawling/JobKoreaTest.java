package net.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JobKoreaTest {
	
	public static void main(String[] args) {
		// ���ڸ��ƿ��� frontend �˻� �� 3���������ִ� ȸ��� ũ�Ѹ� �ϱ�
		/*
		try {
			// 1) URL ����
			String URL = "http://www.jobkorea.co.kr/Search/AjaxSearchList/?";
			
			// 2) �˻���
			String KEYWORD = "frontend";
			
			// 3) ��û������
			int PAGE = 3;
			
			// 4) �Ķ����
			String params = "";
			params += "pageType=GI";
			params += "&stext=" + KEYWORD;
			params += "&pageSize=10";
			params += "&ord=1";
			params += "&IsCoInfoSC=false";
			params += "&IsRecruit=false";
			params += "&page=" + PAGE;
			params += "&Order=1";
			// System.out.println(params);
			
			// 5) HTML ���� ���� ��������
			Document doc = Jsoup.connect(URL+params).get();
			// System.out.println(doc.toString());
			
			// 6) ��Һ� ����
			// <li>
			// Elements elements = doc.select("li");
			
			// <ul class = detailList>
			// Elements elements = doc.select(".detailList li");
			
			// <div class = list>
			// Elements elements = doc.select(".list .detailList li");
			
			// <article id = "smGiList">
			// Elements elements = doc.select("#smGiList .list .detailList li");
			
			Elements elements = doc.select("#smGiList .list .detailList li .corpName .giTitle");
			for(Element element:elements) {
				System.out.println(element.text());
			} // for end
			
			
		} catch(Exception e) {
			System.out.println("ũ�Ѹ� ���� : " + e);
		}
		*/
		try {
			String URL = "http://www.jobkorea.co.kr/Search/AjaxSearchList/?";
			String KEYWORD = "frontend";
			int PAGE = 1;
			
			for(PAGE=1; PAGE<=3; PAGE++) {
				String params = "";
				params += "pageType=GI";
				params += "&stext=" + KEYWORD;
				params += "&pageSize=10";
				params += "&ord=1";
				params += "&IsCoInfoSC=false";
				params += "&IsRecruit=false";
				params += "&page=" + PAGE;
				params += "&Order=1";
			
			
				Document doc = Jsoup.connect(URL+params).get();
				Elements elements = doc.select("#smGiList .list .detailList li .corpName .giTitle");
			
				for(Element element:elements) {
					System.out.println(element.text());
				} // for end
			
			} // for end
		} catch(Exception e) {
			System.out.println("ũ�Ѹ� ���� : " + e);
		}
	} // main() end

} // class end
