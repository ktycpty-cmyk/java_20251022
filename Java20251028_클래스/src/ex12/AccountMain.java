package ex12;

public class AccountMain {

	public static void main(String[] args) {

		Account account = new Account();
		account.setBalance(10000);
		System.out.println(account.getbalance());
		
		account.setBalance(-100);
		System.out.println(account.getbalance());
		
		account.setBalance(2000000);
		System.out.println(account.getbalance());
		
		account.setBalance(300000);
		System.out.println(account.getbalance());
	}

}
