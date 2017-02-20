package deposit_package;

public class Check_Deposit extends Deposit {

	public Check_Deposit(double depositamount) {
		amount = depositamount; 
	}
	@Override
	public void get_deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit " + Double.toString(amount) + " in check!");
	}

}
