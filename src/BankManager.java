public class BankManager {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount();
        SavingsAccount savingsAccount = new SavingsAccount();
        COD cod = new COD();

        checkingAccount.acctNumber = "123";
        checkingAccount.balance = 495.22;
        System.out.println(checkingAccount.acctNumber);
        System.out.println(checkingAccount.balance);

        System.out.println("********************");

        savingsAccount.acctNumber = "456";
        savingsAccount.balance = 2500.00;
        System.out.println(savingsAccount.acctNumber);
        System.out.println(savingsAccount.balance);

        System.out.println("********************");

        cod.acctNumber = "789";
        cod.balance = 5037.81;
        System.out.println(cod.acctNumber);
        System.out.println(cod.balance);
    }
}
