/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kahvedukkanlari;

/**
 *
 * @author yalci
 */
public abstract class BaseCustomerManager implements CustomerService {

    @Override
    public void Save(Customer customer) {
        System.out.println("Veri Tabanına Kaydedildi " + customer.getFirstName());
    }

   

}
