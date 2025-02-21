public class BankAccount {
    private String name;
    private int age;
    private int id;
    private double balance;
    private static int AccountCount = 0;

    public BankAccount(String name, int age, int id, double balance){
        this.name = name;
        this.age = age;
        this.id = id;
        this.balance = balance;
        AccountCount++;
    }

    public void showBalance(){
        System.out.println( this.name + " have Balance " + this.balance + " baht.\n");
    }

    public static void ShowAccount(){
        System.out.println("Account: " + AccountCount + "\n");
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public int getId(){
        return this.id;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public static boolean transfer(BankAccount fromAccount, BankAccount toAccount, double amount){
        if(fromAccount.getBalance() < amount){
            System.out.println("Not enough balance in the account.\n");
            return false;
        }

        toAccount.setBalance(toAccount.getBalance() + amount);
        fromAccount.setBalance(fromAccount.getBalance() - amount);
        System.out.println("The transfer is completed.\n");
        return true;
    }
}