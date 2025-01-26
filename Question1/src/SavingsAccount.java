public class SavingsAccount extends Account{
    public SavingsAccount(double balance, double interest) {
        setBalance(balance);
        setInterest(interest);
    }
    @Override
    public double calculateBalanceAfterInterest(){
        double newBalanceAfterInterest = getBalance() + ((getBalance() * getInterest())/100);
        setBalance(newBalanceAfterInterest);
        return newBalanceAfterInterest;
    }
}
