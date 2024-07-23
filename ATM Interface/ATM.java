import java.util.Scanner;
class BankAccount {
	private double bal;

	public BankAccount(double initialBalance) {
		this.bal = initialBalance;
	}

	public double getBalance() {
		return bal;
	}

	public void deposit(double amount) {
		bal += amount;
		System.out.println("Deposit successful New balance: " + bal);
	}

	public boolean withdraw(double amount) {
		if (amount <= bal) {
			bal -= amount;
			System.out.println("Withdrawal successful. New balance: " + bal);
			return true;
		} else {
			System.out.println("Insufficient funds. Withdrawal failed.");
			return false;
		}
	}
}

class ATM1 {
	private BankAccount bankAccount;
	private Scanner scanner;

	public ATM1(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
		this.scanner = new Scanner(System.in);
	}

	public void displayMenu() {
		System.out.println("Welcome to the ATM Machine!");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Exit");
		System.out.print("Choose an option: ");
	}

	public void start() {
		int choice;
		do {
			displayMenu();
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				checkBalance();
				break;
			case 2:
				deposit();
				break;
			case 3:
				withdraw();
				break;
			case 4:
				System.out.println("Thank you for using the ATM. Goodbye!");
				break;
			default:
				System.out.println("Invalid option. Please try again.");
			}
		} while (choice != 4);
	}

	public void checkBalance() {
		System.out.println("Your balance is: " + bankAccount.getBalance());
	}

	public void deposit() {
		System.out.print("Enter amount to deposit: ");
		double amount = scanner.nextDouble();
		bankAccount.deposit(amount);
	}

	public void withdraw() {
		System.out.print("Enter amount to withdraw: ");
		double amount = scanner.nextDouble();
		bankAccount.withdraw(amount);
	}
}

public class ATM {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000.0); // Initial balance
		ATM1 atm = new ATM1(account);
		atm.start();
	}
}
