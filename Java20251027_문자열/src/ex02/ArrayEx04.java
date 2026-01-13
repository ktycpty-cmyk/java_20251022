package ex02;

import java.util.Arrays;

public class ArrayEx04 {

	public static void main(String[] args) {
		//배열길이 
		
		int[] numArr = {90,80,70,60,50,};
			
			System.out.println("old numArr 길이 : " + numArr.length);
			System.out.println(Arrays.toString(numArr));
		
		//배열을 10개로 확장
		int[] temp = new int[10];
		for(int i = 0; i<numArr.length; i++) {
			temp[i] = numArr[i];
		}
		
		numArr = temp;
		System.out.println("new numArr 길이 : " + numArr.length);
		
		System.out.println(Arrays.toString(numArr));
	}

}
