package _GUI.entity;

public class CustomerEntity {

    private String CustomerId;
    private String CustomerName;
    private int CustomerAge;
    private String level;
    private String job;
    private int savedMoney;

    public String getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(String customerId) {
        CustomerId = customerId;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public int getCustomerAge() {
        return CustomerAge;
    }

    public void setCustomerAge(int customerAge) {
        CustomerAge = customerAge;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getSavedMoney() {
        return savedMoney;
    }

    public void setSavedMoney(int savedMoney) {
        this.savedMoney = savedMoney;
    }
}
