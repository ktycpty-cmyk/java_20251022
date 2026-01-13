package ex01;

public class ForEx03 {

	public static void main(String[] args) {
		
		
		int sum=0;
		int i=1;
		/*
		 * 1~100까지 짝수 합
		 */
		/*
		for(int i=0; i<=100; i+=2) {
			sum += i;
		}
		*/
		
		for(; i<=100; ) {
			if(i % 2 == 0)
				sum += i;         
				
			i++;
		}
		
		System.out.println("합 : " + sum);
		
		

	}

}
