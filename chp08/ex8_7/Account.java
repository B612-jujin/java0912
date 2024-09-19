package chp08.ex8_7;

public class Account {
    private String name;

    private String password;

    private  String accNumber;

    private int balance;

    public Account(String accNumber, String name, String password , int balance) {
        this.name = name;
        this.password = password;
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", accNumber='" + accNumber + '\'' +
                ", balance=" + balance +
                '}';
    }


    public void deposit(int amount) {
        balance += amount;
        System.out.printf("%d원 입금되었습니다.\n", amount);
    }
    public int withdraw(int amount) {
        setBalance(balance - amount);
        System.out.printf("%d원 출금되었습니다.\n", amount);
        return amount;
    }

}


