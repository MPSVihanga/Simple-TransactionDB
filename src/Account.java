public class Account {

    private String accId;
    private String name;
    private double amount;



    public Account() {
    }

    public Account(String accId, String name, double amount) {
        this.accId = accId;
        this.name = name;
        this.amount = amount;
    }

    public String getAccId() {
        return accId;
    }

    public void setAccId(String accId) {
        this.accId = accId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accId='" + accId + '\'' +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
