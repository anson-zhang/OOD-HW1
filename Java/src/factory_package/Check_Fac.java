package factory_package;

import deposit_package.Check_Deposit;
import deposit_package.Deposit;

public class Check_Fac implements Deposit_Factory {

	@Override
	public Deposit createDeposit(double depositamount) {
		// TODO Auto-generated method stub
		return new Check_Deposit(depositamount);
	}

}
