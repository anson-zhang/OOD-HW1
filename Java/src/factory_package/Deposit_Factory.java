package factory_package;

import deposit_package.Deposit;

public interface Deposit_Factory {
	public Deposit createDeposit(double depositamount);
}
