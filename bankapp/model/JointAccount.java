package gr.aueb.cf.exercisesch11oop.bankapp.model;

/**
 * This class creates a Joint Account which
 * uses two instances of the {@link Holder} class as parameters
 * along with an {@link #id}, an {@link #iban}, a {@link #ssn} and the account's {@link #balance}.
 * It has a Public API that offers
 * services to the user.
 */
public class JointAccount {
    private final int id;
    private final Holder holder1;
    private final Holder holder2;
    private final String iban;
    private final String ssn;
    private double balance;

    public JointAccount(int id, Holder holder1, Holder holder2, String iban, String ssn, double balance) {
        this.id = id;
        this.holder1 = holder1;
        this.holder2 = holder2;
        this.iban = iban;
        this.ssn = ssn;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public Holder getHolder1() {
        return holder1;
    }

    public Holder getHolder2() {
        return holder2;
    }

    public String getIban() {
        return iban;
    }

    public String getSsn() {
        return ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Public API

    /**
     * Deposits zero or positive amount of money
     * to account's balance.
     * @param amount       the amount of money to be deposited
     * @throws Exception   if the amount is negative
     */
    public void deposit(double amount) throws Exception {
        try {
            if (amount >= 0) {
                balance += amount;
            } else throw new Exception("Negative amount exception");
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Withdraws a certain amount of money from
     * account's balance
     * @param amount       the amount of money to be withdrawn
     * @throws Exception   if balance is insufficient
     *                     or invalid ssn
     */
    public void withdraw(double amount,String ssn) throws Exception {
        try {
            if(!isSsnValid(ssn)) throw new Exception("SSN not valid Exception");
            if(amount <= balance) {
                balance -= amount;
            }else {
                throw new Exception("Insufficient balance exception.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Returns the account's balance.
     *
     * @return
     *      the account's balance.
     */
    public double getAccountBalance() {
        return getBalance();
    }

    /**
     * Returns the account's state and all its information.
     *
     * @return
     *      Account ID,IBAN,holder 1 and 2,SSN and balance
     */
    public String getAccountState() {
        return "" + "ID: " + id + ", IBAN: " + iban + ", " + holder1 + ", "
                + holder2 + ",SSN: " + ssn + ",Balance: " + balance + "";
    }

    /**
     * Checks if the SSN is valid in order to let the user withdraw
     * money from the account.
     *
     * @param ssn  the user's ssn
     * @return
     *       ssn validity
     */
    private boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }
}
