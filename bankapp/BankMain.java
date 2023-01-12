package gr.aueb.cf.exercisesch11oop.bankapp;

import gr.aueb.cf.exercisesch11oop.bankapp.model.JointAccount;
import gr.aueb.cf.exercisesch11oop.bankapp.model.Holder;
import gr.aueb.cf.exercisesch11oop.bankapp.model.OverdraftAccount;

/**
 * This class uses instances of {@link Holder} to create a {@link JointAccount}
 * and also creates a new {@link OverdraftAccount} with the purpose of testing
 * their respective Public API services.
 */
public class BankMain {

    public static void main(String[] args) throws Exception {
        try {
            //Creating a new Holder and an Overdraft Account instance
            Holder holderOverdraft = new Holder(5L,"John","Doe","R650");
            OverdraftAccount overdraftAccount = new OverdraftAccount
                    (5,holderOverdraft,"GR55533","R650",100.00);
            //Using the withdrawOverdraft method which is a Public API service of the OverdraftAccount class
            overdraftAccount.withdrawOverdraft(500,"R650");
            //Getting the balance of the account
            System.out.println("Your current account balance is: " + overdraftAccount.getBalance());
            //Overdraft account holder information
            holderOverdraft.getHolderInfo();
            //Account state information
            System.out.println("Your current account information: " + overdraftAccount.getAccountState());

            System.out.println();

            //Creating two new holder instances to use as parameters in the JointAccount class
            Holder holderBob = new Holder(1L,"Bob","Dylan","R150");
            Holder holderAlice = new Holder(2L,"Alice","Cooper","R160");
            //Creating a new JointAccount instance
            JointAccount jointAccount1 = new JointAccount(10, holderBob, holderAlice,"GR54321","R200",500.00);
            //Depositing and getting the account's balance
            jointAccount1.deposit(1000.00);
            System.out.println("Your current account balance is: " + jointAccount1.getAccountBalance());
            //Getting information for the two Joint Account holders
            holderBob.getHolderInfo();
            holderAlice.getHolderInfo();
            //Account state information
            System.out.println("Your Joint Account state is: " + jointAccount1.getAccountState());
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }
    }
}
