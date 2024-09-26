package chp08.ex8_9;

public class AccountTest {
    public static void main(String[] args) {
        Account a = new Account("123-45", 10000);
        Account b = new Account("567-89", 10000);
        while (a.transfer(b,3000)){
            System.out.printf("송금이 완료되었습니다.");
        }
        System.out.println(a.toStr());
        System.out.println(b.toStr());
    }
}
class Account {
    private String accountNumber;
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public boolean transfer(Account dest, int amount) {
        this.balance =balance - amount;
        dest.setBalance(dest.balance + amount);;
        return (this.balance < amount ? false : true);
    }

    public String toStr(){
        return "Account { num: "+accountNumber + " balance: " + balance+"}";
    }

}
