import java.util.ArrayList;

public class Bank {

    ArrayList<Branch> listOfBranches = new ArrayList<>();
    public void addNewBranch(String name){
        listOfBranches.add(new Branch(name));
    }

    public void addNewClientToBranch(String branchName, String customerName, double transaction) throws Exception {

        int i = 0;
        for (; i < listOfBranches.size();) {
            if(listOfBranches.get(i).getName().equals(branchName)){
                listOfBranches.get(i).addNewCustomer(customerName, transaction);
                break;
            }
            else
                i++;
            if(i == listOfBranches.size()){
                System.out.println("Sorry. That branch was not found!");
                break;
            }
        }

    }

    public void addNewTransactionToCustomer(String branchName, String customerName, double transaction) throws Exception {
        for (int i = 0; i < listOfBranches.size();) {
            if (listOfBranches.isEmpty()){
                listOfBranches.get(i).addNewTransaction(customerName, transaction);
                break;
            }
            if(listOfBranches.get(i).getName().equals(branchName)){
                listOfBranches.get(i).addNewTransaction(customerName, transaction);
                break;
            }
            else
                i++;
            if(i == listOfBranches.size()){
                System.out.println("Sorry. That branch was not found!");
                break;
            }


        }
    }

    public void showCustomers(String branchName){
        int i = 0;
        for (; i < listOfBranches.size();) {
            if(listOfBranches.get(i).getName().equals(branchName)){
                for (Customer customer: listOfBranches.get(i).getListOfCustomers()) {
                    System.out.println(customer.getName() + " " + customer.getTransaction() + " " + customer.getBalance());
                }
                break;
            }
            else
                i++;
            if(i == listOfBranches.size()){
                System.out.println("Sorry. That branch was not found!");
                break;
            }
        }
    }



}
