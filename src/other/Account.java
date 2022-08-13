package other;

public class Account {

    private String name;

    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {

        if (balance <= 0){

            throw new RuntimeException("SufficientFundNotAvailable  current balance: " + getBalance());
        }
        this.balance = balance;
    }

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public void depositMoney(int amount){

        setBalance(getBalance() + amount);
    }

    public void withdrawMoney(int amount){

        setBalance(getBalance() - amount);
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
