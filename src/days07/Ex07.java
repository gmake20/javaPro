package days07;

public class Ex07 {

	public static void main(String[] args) {
		String card ="7655-8988-9234-5677";
		int num = (int)(Math.random() * 4);
		String[] cardArr = card.split("-");
		cardArr[num] = "****";
		
		System.out.println(String.join("-", cardArr));
	    // System.out.println(cardArr[0]+cardArr[1]+cardArr[2]+cardArr[3]);
	}

}
