package kahvedukkanlari;

public class StarbucksCustomerManager extends BaseCustomerManager {

    CustomerCheckService customerCheckService = new CustomerCheckManager();
   
    private int id =1, DateOfBirth=1985;
    private String firstName="Engin", lastName="Demiroğ", NationalityId="10020030099";
    
    
    
    @Override
    public void Save(Customer customer) {
        if(customer.getId() == id && customer.getDateOfBirth() == DateOfBirth && customer.getFirstName().equals(firstName)
                && customer.getLastName().equals(lastName) && customer.getNationalityId().equals(NationalityId)){
            System.out.println("Veri Tabanına Kaydedildi " + customer.getFirstName());
            
        }else{
            System.out.println("Bu Kişi Sistemde Kayıtlı Değil");
        }
        
    }

}
