package gr.aueb.cf.exercisesch11oop.model;

public class UserMain {

    public static void main(String[] args) {
        User marios = new User(10,"Marios","Avramidis");
        UserCredentials mariosAccount = new UserCredentials
                (10,"marios123","avramidis123");

        /*System.out.println("ID: " + marios.getId() + ", " + "Firstname: "
                + marios.getFirstname() + ", " + "Lastname: " + marios.getLastname());

        System.out.println("ID: " + mariosAccount.getId() + ", " + "Username: "
                + mariosAccount.getUsername() + ", " + "Password: " + mariosAccount.getPassword());*/

        System.out.println(marios.getFields());
        System.out.println(mariosAccount.getFieldsUserCredentials());
    }
}
