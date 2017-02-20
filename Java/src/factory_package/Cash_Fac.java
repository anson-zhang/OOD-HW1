package factory_package;

import deposit_package.Cash_Deposit;
import deposit_package.Deposit;

public class Cash_Fac implements Deposit_Factory {

	@Override
	public Deposit createDeposit(double depositamount) {
		// TODO Auto-generated method stub
		return new Cash_Deposit(depositamount);
	}

}
