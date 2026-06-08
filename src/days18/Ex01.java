package days18;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author scm
 * @date 2026. 6. 5. 오전 9:01:12
 * @subject Queue
 * @content   ㄴ FIFO
 *            ㄴ offer()       poll()/peek()     isEmpty()
 */
public class Ex01 {

	public static void main(String[] args) {
		// E : Element (요소)
		Queue q = new LinkedList();
		q.offer("안정빈");
		q.offer("조지훈");
		System.out.println(q.offer("문규리"));

		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}

	}

}
