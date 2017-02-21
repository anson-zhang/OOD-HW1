package deposit_package;

public class Transfer_Deposit extends Deposit {

	public Transfer_Deposit(double depositamount) {
		amount = depositamount; 
	}
	@Override
	public String get_deposit() {
		// TODO Auto-generated method stub
		String s = "Deposit " + Double.toString(amount) + " in transfer!";
		System.out.println(s);
		return s;
	}

}
