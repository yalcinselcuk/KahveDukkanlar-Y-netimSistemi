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
public class CustomerCheckManager implements CustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return true;
    }

}
