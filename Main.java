public class Main{
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Dan", 19, 725, 500);
        BankAccount b2 = new BankAccount("Woody", 19, 730, 1500);
        BankAccount b3 = new BankAccount("cap", 19, 123, 1200);

        BankAccount.ShowAccount();

        b1.showBalance();
        b2.showBalance();
        b3.showBalance();

        BankAccount.transfer(b1, b2, 500);
        BankAccount.transfer(b3, b1, 1000);

        b1.showBalance();
        b2.showBalance();
        b3.showBalance();
    }
}