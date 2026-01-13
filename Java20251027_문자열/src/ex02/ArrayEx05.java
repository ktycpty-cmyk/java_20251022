package ex02;

import java.util.Arrays;

public class ArrayEx05 {

	public static void main(String[] args) {
		/*
		 * 정수 배열 5개 생성후
		 * 각 배열 초기화 이후, 각 배열 합을 구해서 출력
		 * 
		 * -- 배열 복사 System.arraycopy
		 */
		
		int[] numArr = {90,80,70,60,50,};
			
			System.out.println("old numArr 길이 : " + numArr.length);
			System.out.println(Arrays.toString(numArr));
		
		//배열을 10개로 확장
		int[] temp = new int[10];
		System.arraycopy(numArr, 0, temp, 0, numArr.length);
		
        numArr = temp;
		
		System.out.println("new numArr 길이 : " + numArr.length);
		
		System.out.println(Arrays.toString(numArr));
	}

}
