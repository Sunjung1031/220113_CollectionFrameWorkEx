package Map인터페이스계열의클래스예제;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesClassEx {

	public static void main(String[] args) {
		//객체 생성 
		Properties prop = new Properties();
		
		//prop이 가리키는 객체에 key, value값 넣기  
		prop.setProperty("name", "홍길동"); 
		prop.setProperty("email", "hong77@naver.com");
		prop.setProperty("HP", "010-1234-5678");
		
		//System.out.println(prop);
		//{name=홍길동, HP=010-1234-5678, email=hong77@naver.com}
		
		//가져오기
		Enumeration enu = prop.propertyNames();
		
		while(enu.hasMoreElements()) {
			String ele = (String)enu.nextElement();
			System.out.println(ele + ":" + prop.getProperty(ele));
		}
	}

}
