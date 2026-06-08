package days18;

import java.util.Enumeration;
import java.util.Properties;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties p = System.getProperties();
		// 열거자
		Enumeration<String> en =  (Enumeration<String>) p.propertyNames();
		while (en.hasMoreElements()) {
			String key = (String) en.nextElement();
			String value = p.getProperty(key);
			System.out.printf("%s: %s\n",key,value);
			
		}
	}

}
