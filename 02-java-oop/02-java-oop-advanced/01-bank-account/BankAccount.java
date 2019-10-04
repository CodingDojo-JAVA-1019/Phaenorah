import java.util.*;

public class BankAccount {
    private String accountNumber = "";
    private double checkingBalance;
    private double savingsBalance;
    public static int numberOfAccounts = 0;
    public static int totalAmount = 0;

    public BankAccount(double checkingBalance, double savingsBalance) {        
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numberOfAccounts++;
        this.accountNumber = setAccountNumber();
        totalAmount += checkingBalance + savingsBalance;

    }
    public BankAccount() {
        this.accountNumber = setAccountNumber();

    }
    public double getCheckingBalance() {
        return checkingBalance;
    }
    public double getSavingsBalance() {
        return savingsBalance;
    }
    private String setAccountNumber() {
		Random randomGenerator = new Random();
		String accountNumber = "";		
		for(int i = 0; i < 10; i++){
			accountNumber += randomGenerator.nextInt(10);
		}
		return accountNumber;
    }    
    public String getAccountNumber() {
		return accountNumber;
    }
    public void setCheckingBalance(double balance) {
        checkingBalance = balance;
        totalAmount += checkingBalance;
    }
    public void setSavingsBalance(double balance) {
        savingsBalance = balance;
        totalAmount += savingsBalance;
    }
    public double depositChecking(double amount) {
        checkingBalance += amount;
        totalAmount += amount;
        return checkingBalance;
    }
    public double depositSavings(double amount) {
        savingsBalance += amount;
        totalAmount += amount;
        return savingsBalance;
    }
    public double withdrawChecking(double amount) {
        checkingBalance -= amount;
        totalAmount += amount;
        return checkingBalance;
    }
    public double withdrawSavings(double amount) {
        savingsBalance -= amount;
        totalAmount += amount;
        return savingsBalance;
    }
    
}