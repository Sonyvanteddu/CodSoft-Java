package atm_machine;
import java.util.Scanner;

class user_balance{
	private double balance;
	
	
	public user_balance(double current_balance) {
		this.balance=current_balance;
	 }
	public double getBalance() {
		return balance;
	}
	public boolean withdraw(double amount) {
		if(amount<=balance) {
		balance-=amount;
		return true;
		}
		else {
			System.out.println("Insufficient balance!!");
			return false;
		}
		}
	public void deposit(double amount) {
		balance+=amount;
		}
    }
class ATM{
	private user_balance user_account;
	
	public ATM(user_balance user_account) {
		this.user_account=user_account;
	}
	public void menu(){
		System.out.println("Atm Menu:");
		System.out.println("1:current balance");
		System.out.println("2:withdraw amount");
		System.out.println("3: deposit amount");
		System.out.println("4: exit");
		}
public void process(int choice) {
	  Scanner sc=new Scanner(System.in);
	  switch(choice) {
		case 1:
			System.out.println("current balance in your account is :"+user_account.getBalance());
			break;
		case 2:
			System.out.println("enter withdraw amount");
		    double withdraw_amount=sc.nextInt();
			if(withdraw_amount>0) {
			user_account.withdraw(withdraw_amount);
			System.out.println("withdraw Successfull!");
			System.out.println("Available balance:"+user_account.getBalance());
			}
			break;
		case 3:
		   System.out.println("enter deposit amount");
		   double deposit_amount=sc.nextInt();
		    user_account.deposit(deposit_amount);
		    System.out.println("deposit Successfull!");
		    System.out.println("Available balance:"+user_account.getBalance());
		    break;
        case 4:
			System.out.println("Thankyou for using atm!..");
			break;
		default:
			System.out.println("Invalid Option");
			}
		}
}

public class atm_interface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		user_balance user_bal=new user_balance(10000);
		ATM obj=new ATM(user_bal);
		Scanner sc1=new Scanner(System.in);
		while(true) {
		obj.menu();
		System.out.println("enter your choice to continue process");
		int choice=sc1.nextInt();
		obj.process(choice);
		if(choice==4) {
			break;
		}
		}

	}


}
