public class Main
{
	public static void main(String[] args) {
		System.out.println("****Hello Encapsultation*****");
		Bank bank = new Bank();
		bank.deposit(56789);
		bank.withdraw(5500);
		System.out.println("*****Deposit*****"+bank.getLastDeposit());
		System.out.println("*****balance*****"+bank.getBalance());
		System.out.println("*****Withdraw*****"+bank.getLastWithdraw());
	}
}

class Bank {
        private double balance;
        private double lastDeposit;
        private double lastWithdraw;
    	//Getter and setter
		public void deposit(double amount){
		    if(amount > 100){
		        balance = balance + amount;
		        lastDeposit = amount;
		    }
		}
		
		public void setCheckBalance(double balance){
            this.balance = balance;
		}
		
		public void withdraw(double amount){
		    if(amount < balance && amount > 100)
            balance = balance - amount; 
            lastWithdraw = amount;
		}
	
		
		public double getBalance(){
		    return balance;
		}
		public double getLastDeposit(){
		    return lastDeposit;
		}
		
		public double getLastWithdraw(){
		    return lastWithdraw;
		}
}

