package Bank;

public class BankInfo {

	public void savings() {
		// TODO Auto-generated method stub
		System.out.println("Total Savings: 54846516");
	}

	public void Fixed() {
		System.out.println("Fixed Deposit: 5000000");
	}

	public void Deposit() {
		// TODO Auto-generated method stub
		System.out.println("Total Deposit : 54684521");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank AB = new AxisBank();
		BankInfo Bank=new BankInfo();
		AB.Deposit();
		Bank.Fixed();
		Bank.savings();
	}

}
