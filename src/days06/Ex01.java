package days06;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2026. 5. 18. 오전 7:43:38
 * @subject 신창만
 * @content 
 * 
 */
public class Ex01 {

	public static void main(String[] args) {
		// [복습문제]	  로또 번호 발생 -> 출력.
        int[] lottoNumbers = new int[6];
        // 0: 아랫첨자값  LowerBound
        // 5: 윗첨자값   UpperBound    lottoNumbers.length - 1
        int lottoNumber;
        boolean isFlag = false;
        int index = 0;
        // 1. 로또번호 발생시켜서 배열에 채우기
        lottoNumber = (int)(Math.random()*45)+1;
        lottoNumbers[index++] = lottoNumber;
        // 1-2. 로또번호 발생+ 중복체크 + 배열 채우기        
        while ( index <= 5 ) {
        	isFlag = false;
        	lottoNumber = (int)(Math.random()*45)+1;
        	// 1-3. 배열 로또번호들과 lottoNumber 중보체크
        	for (int i = 0; i < index; i++) {
    			if (lottoNumbers[i] == lottoNumber) {
					isFlag = true;
					break;
				} // if
    		} // for
        	
        	if( !isFlag   ) {
        		lottoNumbers[index++] = lottoNumber;
        	}
		} // while
        
        
        // 2. 로또 배열 출력
        for (int i = 0; i <= lottoNumbers.length -1; i++) {
			//System.out.printf("lottoNumbers[%d]=%d\n", i, lottoNumbers[i]);
        	System.out.printf("[%d]", lottoNumbers[i]);
		}
        
		
	} // main

} // class













/*
 * [복습문제1]
 * 1. 두 정수(n,m)의 홀수의 합
 *   (조건: while 문 사용하기 )
 * 2. 세 정수(x,y,z)를 입력받아서 가장 큰 값, 가장 작은 값 구해서 출력  
 * 3. 20개 정수 중에 가장 큰 값, 작은 값 
 *   (배열 사용)
 * 4. 국어 점수를 입력받아서 수,우,미,양,가 출력
 *   1) if문 사용
 *   2) switch문 사용  
 * 5. 로또 번호 발생~  
 * */





