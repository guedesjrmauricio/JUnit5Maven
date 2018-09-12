package BankAccount.JUnit5Maven;
/*
 * Created on 07-Nov-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author hqy1
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class BankAccount {
	double balance;
	double limit;
	double lowestBalance;
	
	public BankAccount(double b, double l, double lb){
		balance=b;
		limit=l;
		lowestBalance=lb;
	}
	
	//Withdraw money
	public void withdraw( double amount )
	{
		if( amount < limit )
			throw new IllegalArgumentException("Valor de opera��o menor que o limite.");
		else if( balance-amount < lowestBalance )
			throw new IllegalArgumentException("Valor a subtrair maior que o balance.");
		else{
			balance=balance-amount;
		}
	}
	
	//Deposit money
	public void deposit(double amount){
		if( amount < this.limit )
			throw new IllegalArgumentException();
		balance=balance+amount;
	}
	
	//Get the value of balance
	public double getBalance(){
		return balance;
	}
}
