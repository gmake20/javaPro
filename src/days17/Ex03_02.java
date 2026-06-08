package days17;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Ex03_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalTime st = LocalTime.of(9,0,0);
		LocalTime nt = LocalTime.now();
		
		Duration d = Duration.between(st, nt);
		long d_s = d.getSeconds();
		System.out.println(d_s);
		// System.out.println(d.getNano());
		// System.out.println(d.get(ChronoUnit.SECONDS));
		
		int h = (int) (d.getSeconds()/60/60);
		int m = (int) (d.getSeconds()/60);
		int s = (int) (d.getSeconds()%60);
		System.out.println(m + "분" + s + "초가 흘렀다.");
		
		// d.get(ChronoUnit.MINUTES);
	}

}
