package days02;

/**
 * @author scm
 * @date 2026. 5. 12. 오후 4:22:49
 * @subject 기본형 > 숫자형 > 정수형
 * @content
 * 		byte(1)
 * 		short(2)
 * 		int(4)
 * 		long(8)
 * 		
 * 		char(유니코드 2)
 */
public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 이름 변수
		// 국어,영어,수학 변수
		// 총점
		// 평균
		// 출력형식:  홍길동 국:89, 영:87, 수:56, 총점:???, 평균:???

		/*
		String name="홍길동";
		int kor=89,eng=87,mat=56,total=0;
		double avg = 0.0f;
		total = kor+eng+mat;
		avg = total / 3d;
		System.out.printf("%s 국:%d, 영:%d, 수:%d, 총점:%d, 평균:%f",name,kor,eng,mat,total,avg);
		*/
		
		
		String name="홍길동";
		int kor=89,eng=87,mat=56;
		int total= kor+eng+mat;
		double avg = total / 3;
		System.out.printf("%s 국:%d, 영:%d, 수:%d, 총점:%d, 평균:%f",name,kor,eng,mat,total,avg);			
		
		
		
	}

}
