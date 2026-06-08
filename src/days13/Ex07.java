package days13;

/**
 * @author kenik
 * @date 2026. 5. 28. 오후 2:35:54
 * @subject 
 * @content 
 * 
 */
public class Ex07 {

   public static void main(String[] args) {
      /*
       * [ 클래스들 간의 관계 ]
       * 1. 집합(소속) 관계: has-a 관계
       *    예) 자동차 클래스: Car
       *        엔진  클래스: Engine
       *        Car > Engine(1)
       *        부서 > 부서원(10)
       *        
       * 2. 상속 관계: is-a 관계
       * */
      
      Engine engine = new Engine();      
      Car myCar = new Car(engine); // 생성자 - DI  의존성 주입
      myCar.speedUp(100);
      System.out.println( myCar.getEngine().speed );
      
      // 10년
      Engine nEngine = new Engine();
      myCar.setEngine(nEngine); // setter - DI

   } // main

} // class







