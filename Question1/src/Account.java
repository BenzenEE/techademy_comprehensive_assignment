public class Account {
    private double balance;
    private double interest;

    public double calculateBalanceAfterInterest(){
        return balance + ((balance * interest)/100);
    }
    public void displayBalance() {
        System.out.println("Current Balance: " + String.format("%.2f", balance));
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
}
