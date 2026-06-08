package days03;

import java.util.HashMap;
import java.util.Map;

public class Ex03 {

	public static void main(String[] args) {
		double money = 1234567.9077;
		// > money=1,234,567.91
		System.out.printf("> money=%,.2f",money);

		String str = String.format("> money=%,.2f",money);
		System.out.println(str);
		
		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
	       Map<String, Integer> map = new HashMap<String, Integer>();
	        for(String[] arr:clothes) {
	            if(map.containsKey(arr[1])) 
	                map.put(arr[1],map.get(arr[1]).intValue()+1);
	            else
	                map.put(arr[1],1);
	        }
	        int answer = 1;        
	        for(String key: map.keySet()) {
	            answer *= map.get(key);            
	        }
	        answer += map.size();		
	}

}
