package ex02;

public class ArrayEx02 {

	public static void main(String[] args) {
		
		/*
		 * 정수 배열 5개 생성후
		 * 각 배열 초기화 이후, 각 배열 합을 구해서 출력
		 */
		
		int[] numArr = {90,80,70,60,50};
		
		numArr[0] = 90;
		numArr[1] = 80;
		numArr[2] = 70;
		numArr[3] = 60;
		numArr[4] = 50;
		
		int sum=0;
		
			
		for(int i=0; i<5; i++)
			sum += numArr[i];
		System.out.println("총합 : " + sum);
		/*
		 * sum = sum + numArr[0]
		 * sum = sum + numArr[1]
		 * sum = sum + numArr[2]
		 * sum = sum + numArr[3]
		 * sum = sum + numArr[4]
		 */
		
		
	}

}
