package days17;

/**
 * @author scm
 * @date 2026. 6. 4. 오후 3:19:48
 * @subject 
 * @content 배열단점 : 배열크기 자동 증가/감소 안됨.
 *                  [1][2][3][4][5]

 *          링크드리스트 구조
 */
public class Ex10 {

	public static void main(String[] args) {
		Node node1 = new Node();
		node1.value = 10;      
		Node node2 = new Node();
		node2.value = 15;
		node1.next = node2;
		Node node3 = new Node();
		node3.value = 17;
		node2.next = node3;
		Node node4 = new Node();
		node4.value = 34;
		node3.next = node4;      
		node4.next = null;
		
		Node node = node1;
		while(node != null) {
			System.out.println(node.value);
			node = node.next;
		}
	}

}


class Node {
	int value;
	Node next;
}