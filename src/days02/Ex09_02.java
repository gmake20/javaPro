package days02;

/**
 * @author kenik
 * @date 2026. 5. 12. 오후 4:22:40
 * @subject 기본형 > 숫자형 > 정수형 설명
 * @content 
 *    byte(1)
 *    short(2)
 *    int(4) 
 *    long(8)
 *      +
 *    문자타입: char(유니코드 2)  
 * 
 */
public class Ex09_02 {

	public static void main(String[] args) {
		 
		String name = "홍길동";
		byte kor = 89, eng = 87, mat = 56;  // 21억 int X, 0~100 byte
		// Type mismatch: cannot convert from char to String
		//String gender = 'M';
		// Type mismatch: cannot convert from int to short
		// X short tot =  kor + eng + mat ;
	    short tot = (short) (kor + eng + mat);  // 강제형변환 방법         // 0 ~ 300
	    //           short/int 77
		// double avg = tot / 3D;
	    // double avg = tot / 3D;
	    // double avg = tot / 3.0;
	    double avg = (double)tot / 3;
		
	    double y = 10;
	    long x = 3000000000L;
	    
	    
	    
		// 홍길동 국:89, 영:87, 수:56, 총점:232, 평균:77.000000 ( 77.333333... )
		System.out.printf("%s 국:%d, 영:%d, 수:%d, 총점:%d, 평균:%f"
				, name, kor, eng, mat, tot, avg);
				

	} // main

} // class
