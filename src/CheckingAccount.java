public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountNumber, double balance, User user) {
        super(accountNumber, balance, String.valueOf(user));
    }


    // Withdraw method (no minimum balance restriction)
    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("You have successfully withdrawn $" + amount);
            System.out.println("New balance: $" + getBalance());
        } else {
            System.out.println("Withdraw amount exceeds balance. Please try again");
        }
    }
}