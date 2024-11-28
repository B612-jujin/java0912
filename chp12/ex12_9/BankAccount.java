package chp12.ex12_9;

public class BankAccount {
    private final String username;
    private final String accountNumber;
    private long balance;

    public BankAccount(String username, String accountNumber, long balance) {
        this.username = username;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("%s\t%s\t%d", username, accountNumber, balance);
    }
}
