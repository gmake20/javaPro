package days17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author scm
 * @date 2026. 6. 4. 오후 2:32:54
 * @subject String[] -> ArrayList 변환
 * @content ArrayList -> String[] 변환
 */
public class Ex08 {

	public static void main(String[] args) {
		String [] names = {"박예진", "양희동", "박정현", "김대원", "주정호", "이찬희"};

		// [2] T == Type == 자료형
		List list = Arrays.asList(names);
		System.out.println(list);
		ArrayList alist = new ArrayList(list);
		// Collection c <= List list
		// list = new ArrayList(Arrays.asList(names));
		
		
		// [1]
		/*
		ArrayList list = new ArrayList();
		for(int i=0;i<names.length;i++)
			list.add(names[i]);
		System.out.println(list);
		*/
		
		ArrayList nameList = new ArrayList(Arrays.asList(names));
		System.out.println(nameList);
		String [] names2 = (String [])nameList.toArray(new String[0]);
		System.out.println(Arrays.toString(names2));
	}

}
