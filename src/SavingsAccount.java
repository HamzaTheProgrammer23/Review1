public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double balance, User user) {
        super(accountNumber, balance, String.valueOf(user));
    }
    public void calculateInterest(double balance) {
        double interest = getBalance() * 0.02;
        System.out.println(getBalance() + interest);
        System.out.println("Added interest amount is $" + interest +
                "Current Balance is $   ." + interest + getBalance());
    }
    public void withdraw(double amount) {
        if (getBalance() - amount >= 100) {

            System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + getBalance());
        } else {
            System.out.println("Withdrawal failed. Minimum balance of $100 required.");
        }
    }
}
