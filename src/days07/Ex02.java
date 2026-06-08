package days07;

/**
 * @author kenik
 * @date 2026. 5. 19. 오전 10:09:40
 * @subject 
 * @content 
 * 
 */
public class Ex02 {

   public static void main(String[] args) {
      
      // 홍길동 98 78 77     엔터
      // String name = scanner.next();
      // int kor = scanner.nextInt();
      // int eng = scanner.nextInt();
      // int mat = scanner.nextInt();
      
      String inputValue = "홍길동, 98, 78, 77";
      String [] dataArr = inputValue.split(",");
      
      String [] dataArr2 = inputValue.split("\\s*,\\s*");
           
      String name;
      int kor, eng, mat; 
      
      // 1. inputValue 문자열을 구분자( 콤마 )로 잘라내기 -> 문자열 4개
      //  메서드의 매개변수로   String regex 선언
      //  regex == Regual Expression == 정규 표현식
      // String [] dataArr = inputValue.split(",");
      System.out.println( dataArr.length);
      // 2. 국,영,수 -> int 변환시켜서 각 변수에 대입.
      name = dataArr[0];
      // kor = Integer.parseInt(dataArr[1]);
      
      kor = Integer.parseInt(dataArr[1].trim());
      
      eng = Integer.parseInt(dataArr2[1]);
      
//      System.out
//         .printf("홍길동")
//         .printf("서영학")
//         .printf("이창익");
      

   } // main

} // class

















