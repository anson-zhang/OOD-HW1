package deposit_package;

public class Transfer_Deposit extends Deposit {

	public Transfer_Deposit(double depositamount) {
		amount = depositamount; 
	}
	@Override
	public void get_deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit " + Double.toString(amount) + " in transfer!");
	}

}
