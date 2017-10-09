public class Main {

    public static void main(String[] args) throws Exception {

        Bank bank = new Bank();

        bank.addNewBranch("Luxe");
        bank.addNewBranch("Donate");
        bank.addNewClientToBranch("Luxe", "Melt", 515.50);
        bank.addNewTransactionToCustomer("Luxe", "Melt", 500);
        bank.addNewClientToBranch("Luxe", "Pete", 515.50);
        bank.addNewTransactionToCustomer("Luxe", "Pete", 600);
        bank.addNewTransactionToCustomer("Luxe", "Melt", -400);
        bank.addNewClientToBranch("Donate", "John", 515.50);
        bank.addNewTransactionToCustomer("Donate", "Lucy", 500);
        bank.showCustomers("Luxe");
        bank.showCustomers("Donate");

    }

}
