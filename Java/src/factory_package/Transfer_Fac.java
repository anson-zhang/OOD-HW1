package factory_package;

import deposit_package.Deposit;
import deposit_package.Transfer_Deposit;

public class Transfer_Fac implements Deposit_Factory {

	@Override
	public Deposit createDeposit(double depositamount) {
		// TODO Auto-generated method stub
		return new Transfer_Deposit(depositamount);
	}

}
