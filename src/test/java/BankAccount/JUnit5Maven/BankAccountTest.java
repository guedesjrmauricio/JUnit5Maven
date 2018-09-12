package BankAccount.JUnit5Maven;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import BankAccount.JUnit5Maven.BankAccount;

class BankAccountTest 
{
	private BankAccount ba;
	
	@Test
	void testWithdraw() {
		try {
			System.out.println(ba.getBalance());
			ba.withdraw(100);
		}
		catch (IllegalArgumentException e) {
			String message = "Withdraw failed( " + e.getMessage() + " ), Balance is:"+ ba.getBalance();
			System.out.println( message );
			fail( message );
		}
		assertTrue(ba.getBalance()==200);
	}

	@Test
	void testDeposit() {
		try
		{
			ba.deposit(100);
	    	System.out.println(ba.getBalance());
		}
		catch (IllegalArgumentException e) {
			String message = "Deposit failed( " + e.getMessage() + " ), Balance is:"+ ba.getBalance();
			System.out.println( message );
			fail( message );
		}
		assertTrue(ba.getBalance()==400);
	}

	@Test
	public void testDeposit0(){
    	try {
    		ba.deposit(0);
    		System.out.println(ba.getBalance());
    		String message = "Deposit failed per accept values 0, Balance is:"+ ba.getBalance();
			System.out.println( message );
			fail( message );
		}
		catch (IllegalArgumentException e) {
			System.out.println("Deposit failed (0 amound), Balance is:"+ba.getBalance());
		}
    }
    
	@Test
    public void testWithdrawSmaller0(){
    	try {
    		ba.withdraw(-10);
    		System.out.println(ba.getBalance());
    		String message = "Deposit failed per accept values smaller than 0, Balance is:"+ ba.getBalance();
			System.out.println( message );
			fail( message );
		}
		catch (IllegalArgumentException e) {
			System.out.println("Withdraw teste success (<0 amound), Balance is:"+ba.getBalance());
			assertTrue( true );
		}
    }
    
	@Test
	public void testWithdraw0(){
    	try {
    		ba.withdraw(0);
    		System.out.println(ba.getBalance());
    		String message = "Withdraw failed per accept values 0, Balance is:"+ ba.getBalance();
			System.out.println( message );
			fail( message );
		}
		catch (IllegalArgumentException e) {
			System.out.println("Withdraw success (0 amound), Balance is:"+ba.getBalance());
			assertTrue( true );
		}
    }
	
	@Test
	public void testLimit(){
    	try {
    		ba.withdraw(150);
    		System.out.println(ba.getBalance());
    		assertEquals( 150, ba.getBalance() );
		}
		catch (IllegalArgumentException e) {
			System.out.println("Withdraw failed (limit), Balance is:"+ba.getBalance());
		}
    }
	
	@Test
	void testGetBalance() {
		System.out.println(ba.getBalance());
	}

	@BeforeAll
    static void beforeAll() {
        System.out.println("Before all test methods");
    }
	
	@BeforeEach
	void beforeEach()
	{
		System.out.println("Before each test methods");
		this.ba=new BankAccount(300,100,0);
	}	
}
