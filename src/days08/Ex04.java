package days08;

/**
 * @author kenik
 * @date 2026. 5. 20. 오전 11:05:17
 * @subject 
 * @content String
 *           : charAt(), length(), split(), join(), repeat(), substring(), indexOf()
 * 
 */
public class Ex04 {

   public static void main(String[] args) {
      // 주민등록번호(Resident Registration Number:RRN)
      String rrn = "830412-1700001";
      
      // 1)      830412-*******
      String  result = toMaskedRRN(rrn);
      System.out.println( result );
      
      // 2)      830412-1******      성별
      result = toMaskedRRNWithGender(rrn);
      System.out.println( result );

   } // main

   // [2] 풀이
   private static String toMaskedRRNWithGender(String rrn) { 
      int index = rrn.indexOf('-'); ;
      return   String.format("%s*******",  rrn.substring(0, index + 2) ) ;
   }

   private static String toMaskedRRN(String rrn) {      
      // '-'
      int index = rrn.indexOf('-');
//      System.out.println("> 찾은 위치: " + index);
      return   String.format("%s*******",  rrn.substring(0, index + 1) ) ;      
   }
   
   /* [1] 풀이
   private static String toMaskedRRNWithGender(String rrn) {
      String [] rrnArr = rrn.split("-");
      String rrnFront = rrnArr[0];
      String rrnBack = rrnArr[1];
      char gender = rrnBack.charAt(0);
      
      return   String.format("%s-%c******", rrnFront, gender) ;   
   }

   private static String toMaskedRRN(String rrn) {      
      return   String.format("%s-*******",  rrn.split("-")[0]) ;      
   }
   */

} // class






