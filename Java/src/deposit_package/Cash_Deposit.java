package deposit_package;

public class Cash_Deposit extends Deposit {

	public Cash_Deposit(double depositamount) {
		amount = depositamount; 
	}
	@Override
	public String get_deposit() {
		// TODO Auto-generated method stub
		String s = "Deposit " + Double.toString(amount) + " in cash!";
		System.out.println(s);
		return s;
	}
	
}
