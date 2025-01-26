public class CurrentAccount extends Account{
    public CurrentAccount(double balance, double interest) {
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
