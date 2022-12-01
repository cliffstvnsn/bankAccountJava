public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount(100.00, 50.00);
        bankAccount1.addDepositChecking(75.50);
        bankAccount1.addDepositSavings(30.00);
        bankAccount1.withdrawChecking(300.00);
        bankAccount1.withdrawSavings(20.00);
        System.out.println(bankAccount1.seeTotalBalance());
    }
}