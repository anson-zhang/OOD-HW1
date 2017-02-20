package deposit_package;

public class Cash_Deposit extends Deposit {

	public Cash_Deposit(double depositamount) {
		amount = depositamount; 
	}
	@Override
	public void get_deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit " + Double.toString(amount) + " in cash!");
	}
	
}
