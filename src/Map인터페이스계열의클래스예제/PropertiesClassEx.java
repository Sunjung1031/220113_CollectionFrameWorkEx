package Map�������̽��迭��Ŭ��������;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesClassEx {

	public static void main(String[] args) {
		//��ü ���� 
		Properties prop = new Properties();
		
		//prop�� ����Ű�� ��ü�� key, value�� �ֱ�  
		prop.setProperty("name", "ȫ�浿"); 
		prop.setProperty("email", "hong77@naver.com");
		prop.setProperty("HP", "010-1234-5678");
		
		//System.out.println(prop);
		//{name=ȫ�浿, HP=010-1234-5678, email=hong77@naver.com}
		
		//��������
		Enumeration enu = prop.propertyNames();
		
		while(enu.hasMoreElements()) {
			String ele = (String)enu.nextElement();
			System.out.println(ele + ":" + prop.getProperty(ele));
		}
	}

}
