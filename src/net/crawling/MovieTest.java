package net.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MovieTest {
	
	public static void main(String[] args) {
		try {
			String URL = "https://movie.naver.com/movie/bi/mi/pointWriteFormList.nhn?";
			String params = "code=167651&type=after&onlyActualPointYn=N&order=sympathyScore&page=";
			int PAGE = 1;
			
			for(PAGE=1; PAGE<=10; PAGE++) {
				Document doc = Jsoup.connect(URL+params+PAGE).get();
				// Elements elements = doc.select(".score_reple p");
				
				Elements elements = doc.select(".score_reple");
				// class = ico_viewer 요소 제거하기
				elements.select(".ico_viewer").remove();
				
				for(Element element:elements) {
					System.out.println(element.text());
				} // for end
			
			} // for end
		} catch(Exception e) {
			System.out.println("크롤링 실패 : " + e);
		}
	} // main() end

} // class end
