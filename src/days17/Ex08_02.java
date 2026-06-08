package days17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex08_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("박예진");
		list.add("양희동");
		list.add("박정현");

		//[1]
		/*
		String[] names = new String[list.size()];
		for(int i=0;i<names.length;i++)
			names[i] = (String)list.get(i)
				;
		*/
		
		// [2] String[] -> Objects[]
		
		
		
//		String [] names = (String[])list.toArray(new String[0]);
		String [] names = (String[])list.toArray(String[]::new);
		System.out.println(Arrays.toString(names));;
		// String[]::new == new String[]
		// IntFunction타입
		
		
//		ArrayList nameList = new ArrayList(Arrays.asList(names));
//		System.out.println(nameList);
//		String [] names2 = (String [])nameList.toArray(new String[0]);
//		System.out.println(Arrays.toString(names2));		
	}

}
