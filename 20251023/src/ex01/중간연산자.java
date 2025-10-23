package ex01;


/*
 * ++A : 선위 연산자(증강)
 * B++ : 후위 연산자
 * --A : 감소
 * B--
 */







public class 중간연산자 {

	public static void main(String[] args) {
		
		
		
		int iNum = 10;
		System.out.println(iNum);
		
		System.out.println("iNum 1증가 -1");
		
		iNum = iNum+1;
		
		System.out.println(iNum);
		
		System.out.println("iNum 1증가 -2");
		iNum += 1;
		
		System.out.println(iNum);
		
		System.out.println("iNum 1증가 -3");
		++iNum;

		System.out.println(iNum);
				
		System.out.println("iNum 1증가 -4");
		iNum++;
		
		System.out.println(iNum);
		
		System.out.println("-----------------------------------");
		
		System.out.println("선위 연산자 1증가 -5");
		int iA = ++iNum;
		/*
		 * 1Num += 1;
		 * int iA = iNum
		 */
		
		System.out.println(iA);
		System.out.println(iNum);
		
		System.out.println("후위 연산자 1증가 -6");
		iNum2 = 1;
		int iB = iNum2++
				
		/*
		 * int iB  = iNum2;
		 * iNum2 = 2
		 */
		
		System.out.println(ib);
		System.out.println(iNum2);
		
	}

}
