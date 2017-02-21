package deposit_package;

public class Check_Deposit extends Deposit {

	public Check_Deposit(double depositamount) {
		amount = depositamount; 
	}
	@Override
	public String get_deposit() {
		// TODO Auto-generated method stub
		String s = "Deposit " + Double.toString(amount) + " in check!";
		System.out.println(s);
		return s;
	}

}
