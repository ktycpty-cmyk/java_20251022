package ex01;

public class if조건문06 {

	public static void main(String[] args) {

		/*
		 *  버스 요금 계산표
		 *  요금 : 2000
		 *  65세이상 : 무료
		 *  20 ~ 64 : 할인율 0%
		 *  15 ~ 19 : 할인율 20%
		 *  7 ~ 14 : 할인율 50%
		 *  6 미만 : 무료
		 */
		
		//int age = 12;
		
		/*
		if(age >= 65) {
			System.out.println("무료");
		}else if(age >= 20) {
			System.out.println("2000");
		}else if(age >= 15) {
			System.out.println("1600");
		}else if(age >= 7) {
			System.out.println("1000");
		}else { 
			System.out.println("무료");
		}
			*/
		
		int age = 13;    //나이
		int fee = 2000;  //요금
		double rate = 0; //할인율
		
		if(age>=65) {
			fee = 0;
		}else if(age>=20 & age<65) {
			rate = 0;
		}else if(age>=15 & age<20) {
			rate = 0.2;
		}else if(age>=7 & age < 15) {
			rate = 0.5;
		}else {
			fee = 0;
		}
			
		if(fee != 0) {
		fee = (int)(fee * (1 - rate));
		}
		
		System.out.println(" 나이 " + age + "는 " + fee+"요금 입니다.");

		
		System.out.println("-----------프로그램 종료-------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
