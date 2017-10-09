import java.util.ArrayList;

public class Branch {

    String name;

    Branch(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getListOfCustomers() {
        return listOfCustomers;
    }

    private ArrayList<Customer> listOfCustomers = new ArrayList<>();
    public void addNewCustomer(String name, double transaction) throws Exception{

        if (listOfCustomers.isEmpty()){
            listOfCustomers.add(new Customer(name, transaction));
        }
        else{
            for (Customer customer: listOfCustomers) {
                if (customer.getName().equals(name)) {
                    System.out.println("Sorry. Customer with same name already have!");
                    break;
                }
            }
            listOfCustomers.add(new Customer(name, transaction));
        }
    }

    public void addNewTransaction(String name, double transaction){
        int i = 0;
        for(;i < listOfCustomers.size();){
            if(listOfCustomers.get(i).getName().equals(name)){
                listOfCustomers.get(i).setTransaction(transaction);
                break;
            }
            else i++;
        }
        if(i == listOfCustomers.size())
            System.out.println("Sorry. Customer with that name was not found!");

    }

}
