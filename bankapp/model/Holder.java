package gr.aueb.cf.exercisesch11oop.bankapp.model;

/**
 * This class is used to create Account Holders.
 */
public class Holder {
    private final Long id;
    private final String firstname;
    private final String lastname;
    private final String ssn;

    public Holder() {
        id = 0L;
        firstname = "";
        lastname = "";
        ssn = "";
    }

    public Holder(Long id, String firstname, String lastname, String ssn) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
    }

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSsn() {
        return ssn;
    }

    /**
     * Prints the Holder's personal information.
     */
    public void getHolderInfo() {
        System.out.println("ID: " + id + ", " + "Firstname: " +
                firstname + ", " + "Lastname: " + lastname + ", " + "SSN: " + ssn);
    }

    /**
     * Returns only the firstname and lastname,so it can be used
     * to print the account's state without printing the Holders personal
     * information as well.
     * The getHolderInfo() above prints the Holders personal information,
     * regardless if the Holder has an account or not.
     * @return
     *      holder's firstname and lastname
     */
    public String toString() {
        return "Firstname: " + firstname + ", Lastname: " + lastname + " ";
    }
}
