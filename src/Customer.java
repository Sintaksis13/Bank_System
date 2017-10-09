import java.util.ArrayList;

public class Customer {

    Customer(String name, double transaction){
        this.name = name;
        this.balance += transaction;
        this.transactions.add(transaction);
    }

    private String name;
    private double balance;
    private ArrayList<Double> transactions = new ArrayList<>();

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<Double> getTransaction() {
        return transactions;
    }

    public void setTransaction(double transaction) {
        this.transactions.add(transaction);
        this.balance += transaction;
    }

    public int getTransactionSize(){
        return transactions.size();
    }
}
