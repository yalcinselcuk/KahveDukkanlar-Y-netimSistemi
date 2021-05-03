package kahvedukkanlari;

public class MernisServiceAdapter implements CustomerCheckService {

    String firstName, lastName, NationalityId;
    int id, DateOfBirth;

    public MernisServiceAdapter(String firstName, String lastName, int id, String NationalityId, int DateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.NationalityId = NationalityId;
        this.DateOfBirth = DateOfBirth;

    }

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        System.out.println("");
        return true;
    }

}
