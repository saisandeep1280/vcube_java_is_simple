package com.miniproblem;

class Bank{
	static int amount = 1000;
	int deposit(int amountdeposit) {
		System.out.println("amount deposit successfully");
		amount = amount +amountdeposit;
		return amount;
	}
	int withDraw (int amountwithdraw) {
		if(amountwithdraw<amount) {
			System.out.println("amount withdraw successfully");
			amount =amount-amountwithdraw;
			return amount;
		}
		else {
			System.out.println("insuffent blance");
			return amount;
		}
	}
	int checkblance() {
		System.out.println("the blance check successfully");
		return amount;
	}
}
public class Banking {
	public static void main(String[] args) {
		Bank b =new Bank();
		System.out.println(b.checkblance());
		System.out.println(b.deposit(500));	
		System.out.println(b.withDraw(250));
		System.out.println(b.checkblance());

	}

}
