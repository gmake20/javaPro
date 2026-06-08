package days07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Ex01_03 {


    public static int[] solution(String[] genres, int[] plays) {      
        // 앨범장르 [고유번호1, 재생횟수1, 고유번호2, 재생횟수2]
        //           0         1         2         3
        Map<String, Integer[]> map = new HashMap<String, Integer[]>();
        // 앨범장르 max재생횟수 
        Map<String, Integer> mapMax = new HashMap<String, Integer>();

        for(int i=0;i<genres.length;i++) {
            String key = genres[i];
            int playCnt = plays[i];
//            int maxPlay = mapMax.containsKey(key)?mapMax.get(key):0;
//            if(playCnt>maxPlay) mapMax.put(key,playCnt);
            int maxPlay = mapMax.containsKey(key)?mapMax.get(key):0;
            maxPlay += playCnt;
            mapMax.put(key,maxPlay);
            
            if(!map.containsKey(key)) {
            	Integer[] tmp = {0, 0, 0, 0};
                map.put(key,tmp);
            }
            Integer[] arr = map.get(key);
            if(arr[1]<playCnt || (arr[1] == playCnt && arr[0] > i)) {
                arr[2] = arr[0];
                arr[3] = arr[1];
                arr[1] = playCnt;
                arr[0] = i;
            }
            else if(arr[3]<playCnt || (arr[3] == playCnt && arr[2] > i)) {
                arr[3] = playCnt;
                arr[2] = i;
                
            }
        }
        
        
        List<String> sortedKeys = mapMax.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        ArrayList<Integer> list = new ArrayList<>();
        for (String key : sortedKeys) {
            Integer[] arr = map.get(key);
            list.add(arr[0]);
            if(arr[3]>0) list.add(arr[2]);
        }
        
        
        int[] answer = list.stream().mapToInt(i->i).toArray();;
        return answer;
    }	
	
	public static void main(String[] args) {
//		String[] x = new String[]{"classic", "pop", "classic", "classic", "pop"};
//		int[] y =new int[]{500, 600, 150, 800, 2500};
		
//		String[] x = new String[]{"jazz", "rap", "hiphop","jazz","jazz", "hiphop"};
//		int[] y =new int[]{100,1000,50,100,50,500};
		
		String[] x = new String[]{"pop", "pop", "pop", "rap", "rap"};
		int[] y =new int[]{45, 50, 40, 60, 70};
				
		Ex01_03.solution(x,y);
		
		
		System.out.println("[구구단 세로 출력]");
		// scm
		for(int k=2;k<=9;k+=3) {
			for(int i=1;i<=9;i++) {
				int max = k+3>10?10:k+3;
				for(int j=k;j<max;j++) {
					System.out.printf("%d*%d=%2d\t",j,i,i*j);
				}
				System.out.println();
			}
			System.out.println();
		}

		// 강사님
		for(int k=1;k<=3;k++) {
			for(int i=1;i<=9;i++) {
				
				for(int j=3*k-1;j<=3*k+1;j++) {
					System.out.printf("%d*%d=%2d\t",j,i,i*j);
				}
				System.out.println();
			}
			System.out.println();
		}


	}

}
