package assisted_projects;

import java.util.Scanner;

//Question- Take amount from user. If amount is less than balance then throw exception otherwise reduce balance
//and show remaining one

class BalanceException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static int balance =10000;
	static public boolean isEligible(int amount) {
		if (amount < balance)
			return true;
		else
			return false;
	}
	public static int getBalance() {
		return balance;
	}
	public static void setBalance(int balance) {
		BalanceException.balance = balance;
	}
	
	
}

public class customException {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter amount to withdraw");
			int amount=sc.nextInt();
			try{
			if(BalanceException.isEligible(amount)){
				BalanceException.setBalance(BalanceException.balance-amount);
				System.out.println("You remaining balance:::"+ BalanceException.getBalance());
			}
			
			else
				throw new BalanceException();
			}
			catch(BalanceException e){
				e.printStackTrace();
			}
		}
	}
	
}