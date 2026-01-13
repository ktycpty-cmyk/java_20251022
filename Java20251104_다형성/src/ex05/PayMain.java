package ex05;

public class PayMain {

	public static void main(String[] args) {
		
		CreditCard cr = new CreditCard();
		cr.fare(10000);

		System.out.println("--------------------");
		
		SamsungPay sp = new SamsungPay();
		sp.charge(10000);
		
		System.out.println("--------------------");
		
		Payment p = new Kakaopay();
		p.pay(50000);
		
	}

}
