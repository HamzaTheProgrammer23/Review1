
public class Main {
    public static void main(String[] args) {
        User user1 = new User("Hamza", "Abdulaziz", "Yunqpaperboy@hotmail.com");
        User user2 = new User("Amin","Abdulaziz","Amindad245@gmail.com");

        CheckingAccount account1 = new CheckingAccount("123000",2500, user1);
        System.out.println(user1+ "    " + account1);

        SavingsAccount account1Savings = new SavingsAccount("1230000",4000,user2);

        account1.withdraw(2300);
        System.out.println(account1.getBalance());

        account1.withdraw(300);
        System.out.println(account1.getBalance());

        account1Savings.calculateInterest(200);
        System.out.println(account1.getBalance());
    }
}