package kahvedukkanlari;

public class Customer {

    private int id, DateOfBirth;
    private String firstName, lastName, NationalityId;

    public Customer(int id, int DateOfBirth, String firstName, String lastName, String NationalityId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.NationalityId = NationalityId;
        this.DateOfBirth = DateOfBirth;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(int DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalityId() {
        return NationalityId;
    }

    public void setNationalityId(String NationalityId) {
        this.NationalityId = NationalityId;
    }

}
