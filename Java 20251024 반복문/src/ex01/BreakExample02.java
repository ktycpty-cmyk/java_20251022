package ex01;

public class BreakExample02 {

	public static void main(String[] args) {
		
		/*
		 * 1 ~ ?
		 * 이때 총합이 10000 이상 되는 순간 ? 값 찾기
		 */
		
		
		
		while(true) {
			//1~6사이 정수 랜덤하게 변수 num저장
			int sum = 0;
			int i = 0;
			
	
			while(true) {
				i++;
				sum += i;
				
				if(sum>=10000) {
					break;
				}
			}
			
			System.out.println("총합 : " + sum + ", i : " + 1);
			System.out.println("프로그램 종료");
			
	       }
	}
}
