public class Main {
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount(1000, 3);
        savingsAccount.displayBalance();
        savingsAccount.calculateBalanceAfterInterest();
        savingsAccount.displayBalance();

        CurrentAccount currentAccount = new CurrentAccount(1550.73, 3.5);
        currentAccount.displayBalance();
        currentAccount.calculateBalanceAfterInterest();
        currentAccount.displayBalance();
    }
}