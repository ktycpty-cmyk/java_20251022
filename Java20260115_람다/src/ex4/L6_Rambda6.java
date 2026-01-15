package ex4;



import java.util.function.BiPredicate;





public class L6_Rambda6 {

	public static void main(String[] args) {
		
		BiPredicate<String, String> f = (id, pw) ->
			
			id.equals("admin") && pw.equals("1234") ? true : false;
		
			boolean flag = f.test("admin", "1234");
			
			if(flag == true) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패");
			}
			
		}

	}
