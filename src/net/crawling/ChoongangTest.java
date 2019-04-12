package net.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ChoongangTest {
	
	public static void main(String[] args) {
		// �߾�����ó���п� �������� ���� ũ�Ѹ� �ϱ�
		try {
			//-------------------------------------------------------- 1�������� ũ�Ѹ�
			/* �� 1) URL ����
			String URL = "http://www.choongang.co.kr/html/sub07_01.php";
			
			// �� 2) �߾�����ó���п� �������� HTML���� ���� ��������
			Document doc = Jsoup.connect(URL).get();
			
			// �� 3) ������ 2)�� ���� ����ϱ�
			// System.out.println(doc.toString());
			
			// ��Ҹ� ���������� ����
			// class = "default_title" -> �׷��� �ؿ� . ���� id�� # ����
			Elements elements = doc.select(".default_title");
			
			for(������:��ü��)
			int[] params = {1, 3, 5}
			for(int param : params)
			
			for(Element element : elements) {
				// System.out.println(element.toString());
				// System.out.println(element.tagName());
				System.out.println(element.text());
			} // for end
			*/
			//-------------------------------------------------------- 1�������� ũ�Ѹ�
				// 2) �������� ���� 1 ~ 5 ������ ũ�Ѹ�
			/*
			String URL = "http://www.choongang.co.kr/html/sub07_01.php?";
			for(int page = 1; page <= 5; page++) {
				String params = "";
				params += "page=" + page;
				params += "&mod=&idx=";
				
				Document doc = Jsoup.connect(URL+params).get();
				// Elements elements = doc.select(".default_title");
				// �� elements�� ���� �����. ������ .board_default_list �� �θ��̱⶧��
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
				// ���� ������ �ִٸ� ���鿡�ٰ� . ����ָ�ȴ�
				Elements elements = doc.select(".table.t_sty01 .td_left");
				for(Element element:elements) {
					System.out.println(element.text());
				} // for end
			} // for end
						
		} catch(Exception e) {
			System.out.println("ũ�Ѹ� ���� : " + e);
		}
	} // main() end

} // class end
