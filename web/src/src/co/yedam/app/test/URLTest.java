package src.co.yedam.app.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLTest {
	public static void main(String[] args) throws IOException {
		String urlStr = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=430156241533f1d058c603178cc3ca0e&targetDt=20130606";
		URL url = new URL(urlStr);
		BufferedReader bf;
		String line = "";
		String result = "";
		
		bf = new BufferedReader(new InputStreamReader(url .openStream()));
		
		while((line=bf.readLine())!=null) {
			result = result.concat(line);
		}
		System.out.println(result.toString());
	}
}
