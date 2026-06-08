package days18;

/**
 * @author scm
 * @date 2026. 6. 5. 오후 3:37:08
 * @subject 열거형(enum) 
 * @content  ㄴ jdk1.5 새로 추가
 *           ㄴ 서로 관련있는 상수들의 집합을 클래스로 선언한것
 */
public class Ex14 {

	public static void main(String[] args) {
		Card card = Card.CLOVER;
		System.out.println(Card.CLOVER);
		System.out.println(Card.CLOVER.name());
		System.out.println(Card.CLOVER.ordinal());

		switch(card) {
		case CLOVER:
			System.out.println("CLOVER");
			break;
		case HEART:
			System.out.println("HEART");
			break;
		case DIAMOND:
			System.out.println("DIAMOND");
			break;
		case SPADE:
			System.out.println("SPADE");
			break;
		default:
			System.out.println("INVALID");
			break;
		}
	}

}
//
//class Gender {
//	public static final boolean 남자 = true;
//	public static final boolean 여자 = false;	
//}
//
//
//class Card {
//	public static final int CLOVER = 1;
//	public static final int HEART = 2;
//	public static final int DIAMOND = 3;
//	public static final int SPADE = 4;
//
//}