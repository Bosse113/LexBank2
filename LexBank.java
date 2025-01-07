import java.util.ArrayList;

public class LexBank {

    private static ArrayList<LexAccount> accounts = new ArrayList<>();

    private LexBank() {

    }

    public static LexAccount openAccount(String accName) {
        LexAccount account = new LexAccount(accName);
        accounts.add(account);
        outMessage("New account " + accName + " with AccNr: "+ account.getAccountNr()+" opened.");
        return account;
    }

    public void transfer(double accFrom, double accTo, double amount) {
        double balFrom, balTo;
        LexAccount.setAccountNr(accFrom);
        balFrom = LexAccount.getBalance();
        LexAccount.setAccountNr(accTo);
        balTo = LexAccount.getBalance();

        System.out.println("From: " + balFrom + ",To: " + balTo);

    }

    public static void outMessage(String msg) {
        String message = "Lex Bank '" + msg + "' : ";
        System.out.println(msg);
    }

    public static void printReport() {

        System.out.println("----------------------------------");
        StringBuilder output;
        output = new StringBuilder("\n------Lex Bank Report-------------");
        for (LexAccount acc : accounts) {
            output.append("\n '").append(acc.getName()).append("' Account number: ").append(acc.getAccountNr()).append(" balance: ").append(acc.getBalance());
        }
        output.append("\n----------------------------------");
        System.out.println(output);

    }
//MYCKET att komplettera
    static void accountTransfer(double fromAcc, double toAcc,double amount)
    {
        int indexFromAcc=accounts.indexOf(fromAcc);
        System.out.println(indexFromAcc);
        LexAccount kontoFran = accounts.get(indexFromAcc);
        System.out.println(kontoFran);

    }


}
