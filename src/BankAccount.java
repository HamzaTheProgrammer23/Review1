abstract class BankAccount {
    private String accountNumber;
    private double balance;
    private String user;

    public BankAccount(String accountNumber, double balance, String user) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.user = user;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    // Withdraw method (no minimum balance restriction)
    public abstract void withdraw(double amount);
}
