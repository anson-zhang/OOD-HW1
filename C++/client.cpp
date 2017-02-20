#include <iostream>
#include <string>
#include <vector>

using namespace std;


class Deposit {
protected:
	double amount;

public:
	virtual ~Deposit() {};
	virtual string get_deposit() = 0;
};

class Cash_Deposit : public Deposit {
public:
	Cash_Deposit(double deposit_amount) {
		amount = deposit_amount;
	}
	~Cash_Deposit() {}
	string get_deposit() {
		string s = "Deposit ";
		s += to_string(amount);
		s += " in cash!";
		cout << endl << s << endl;
		return s;
	}
};

class Check_Deposit : public Deposit {
public:
	Check_Deposit(double deposit_amount) {
		amount = deposit_amount;
	}
	~Check_Deposit() {}
	string get_deposit() {
		string s = "Deposit ";
		s += to_string(amount);
		s += " in check!";
		cout << endl << s << endl;
		return s;
	}
};

class Transfer_Deposit : public Deposit {
public:
	Transfer_Deposit(double deposit_amount) {
		amount = deposit_amount;
	}
	~Transfer_Deposit() {}
	string get_deposit() {
		string s = "Deposit ";
		s += to_string(amount);
		s += " in transfer!";
		cout << endl << s << endl;
		return s;
	}
};

class DepositFactory {
public:
	DepositFactory() {}
	virtual ~DepositFactory() {}
	virtual Deposit * createDeposit(double deposit_amount) = 0;
};

class CashFac : public DepositFactory {
public:
	~CashFac() {};
	Deposit* createDeposit(double deposit_amount) {
		return new Cash_Deposit(deposit_amount);
	}
};

class CheckFac : public DepositFactory {
public:
	~CheckFac() {};
	Deposit* createDeposit(double deposit_amount) {
		return new Check_Deposit(deposit_amount);
	}
};

class TransferFac : public DepositFactory {
public:
	~TransferFac() {};
	Deposit* createDeposit(double deposit_amount) {
		return new Transfer_Deposit(deposit_amount);
	}
};

class Debit_Card {
public:
	void balance_adjust() {
	}
};

int main() {
	int type;
	double deposit_amount;
	vector<string> histories;
	while(true) {
		cout << "Please choose an option: " << endl;
		cout << "	1: Cash Deopsit" << endl;
		cout << "	2: Check Deopsit" << endl;
		cout << "	3: Transfer Deposit" << endl;
		cout << "	4: Print histories" << endl;
		cout << "	5: Exit" << endl;
		cin >> type;
		if (type == 5) break;
		switch(type) {
			case 1 : {
				cout << "Please input the deposit amount: ";
				cin >> deposit_amount;
				CashFac* cashfac = new CashFac();
				Deposit* cashdeposit = cashfac -> createDeposit(deposit_amount);
				histories.push_back(cashdeposit -> get_deposit());
				delete cashfac;
				delete cashdeposit;
				break;
			}
			case 2 : {
				cout << "Please input the deposit amount: ";
				cin >> deposit_amount;
				CheckFac* checkfac = new CheckFac();
				Deposit* checkdeposit = checkfac -> createDeposit(deposit_amount);
				histories.push_back(checkdeposit -> get_deposit());
				delete checkfac;
				delete checkdeposit;
				break;
			}
			case 3 : {
				cout << "Please input the deposit amount: ";
				cin >> deposit_amount;
				TransferFac* transferfac = new TransferFac();
				Deposit* transferdeposit = transferfac -> createDeposit(deposit_amount);
				histories.push_back(transferdeposit -> get_deposit());
				delete transferfac;
				delete transferdeposit;
				break;
			}
			case 4 : {
				for (int i = 0; i < histories.size(); ++i) {
					cout << histories[i] << endl;
				}
				break;
			}
			default : {
				cout << "Invalid input!" << endl;
			}
		}
		cout << endl << endl << endl;
	}
}