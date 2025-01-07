

public class LexAccount {
    private String name;
    private static double balance;
    private static double accBase=1000.0;
    private static double accNr;



    public LexAccount(String accName) {
        setName(accName);
        balance = 0.0;
        accNr = genAccountNumber();
        outMessage("Created successfully."+accNr);
    }

    public void setName(String accName) {
        name = accName;
    }

    public String getName() {
        return name;
    }

    public static double getBalance() {
        return balance;
    }

    public double getAccountNr() {
        return accNr;
    }

    public static void setAccountNr(double accountNr){accNr=accountNr; }

    public void deposit(double amount) {
        balance += amount;
        outMessage("Deposit of " + amount + " Successfully.");
    }

    public void withdraw(double amount) {
        balance -= amount;
        outMessage("Withdraw of " + amount + " Successfully.");
    }


    public void outMessage(String msg) {
        String message = "Account '" + name + "' : ";
        message += msg;
        System.out.println(message);
    }

    public double genAccountNumber() {
        accBase++;
        return accBase;
    }



}
