public class Main {
    public static void main(String[] args) {
    LexBank.printReport();

    //LexAccount account=null;
    LexAccount account1= LexBank.openAccount("Acc 1");
    account1.deposit(100.0);
    LexAccount account2= LexBank.openAccount("Acc 2");
    account2.deposit(200.0);
    LexAccount account3= LexBank.openAccount("Acc 3");
    account3.deposit(300.0);
    account3.deposit(300.0);
    //LexBank.transfer(1001,1001);
    LexBank.printReport();

        //double from=1001, toA=1002;
        //double belopp=300;
        //LexBank.accountTransfer(from,toA,belopp);
    }
}