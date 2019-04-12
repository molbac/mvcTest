package net.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class MywebTest {
	
	public static void main(String[] args) {
		// myweb ������Ʈ �Խ��� ũ�Ѹ� �ϱ�
		try {
			// 1) URL ����
			String URL = "http://172.16.10.6:9090/myweb/index.jsp";
			
			// 2) index.jsp�� HTML���� ���� ��������
			// -> ���������� ������ �ҽ������ ����
			Document doc = Jsoup.connect(URL).get();
			
			// 3) ������ 2)�� ���� ����ϱ�
			// System.out.println(doc.toString());
			// System.out.println(doc.text());
			// System.out.println(doc.title());
			System.out.println(doc.body());
			
		} catch(Exception e) {
			System.out.println("ũ�Ѹ� ���� : " + e);
		}
	} // main() end

} // class end
