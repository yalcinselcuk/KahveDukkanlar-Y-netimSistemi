package kahvedukkanlari;

public class KahveDukkanlari {

    public static void main(String[] args) {
        Customer customer = new Customer(1, 1985, "Engin", "Demiroğ", "10020030099");

        BaseCustomerManager customerManager = new StarbucksCustomerManager();
        customerManager.Save(customer);
        
        System.out.println("*******************************************************");
        
        Customer customerr = new Customer(1, 1986, "Engin", "Demiroğ", "10020030099");

        BaseCustomerManager customerManagerr = new StarbucksCustomerManager();
        customerManagerr.Save(customerr);
    }

}
