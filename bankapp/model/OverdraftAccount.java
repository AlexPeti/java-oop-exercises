package gr.aueb.cf.exercisesch11oop.bankapp.model;

/**
 * This class is used to create accounts with the capability
 * to perform overdraft withdrawals.
 */
public class OverdraftAccount {
    private final int id;
    private final String iban;
    private final Holder holder;
    private final String ssn;
    private double balance;

    public OverdraftAccount(int id,Holder holder, String iban,String ssn, double balance) {
        this.id = id;
        this.holder = holder;
        this.iban = iban;
        this.ssn = ssn;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public Holder getHolder() {
        return holder;
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

    //Public API - Services

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
     * This method allows the user to perform normal or overdraft
     * withdrawals with a limit at -1000.
     *
     * @param amount     the amount to withdraw
     * @param ssn        the valid ssn
     * @throws Exception
     *               if ssn is invalid
     */

    public void withdrawOverdraft(double amount,String ssn) throws Exception {
        try {
            if(!isSsnValid(ssn)) throw new Exception("SSN not valid Exception");
            if (balance > - 1000) {
                balance -= amount;
            }
            //Setting an overdraft limit
            if (balance < - 1000){
                setBalance(-1000.00);
                System.out.println("Overdraft withdrawal limit reached.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Checks if the SSN is valid in order to let the user withdraw
     * money from the account.
     *
     * @param  ssn  the user's ssn
     * @return
     *       ssn validity
     */
    private boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }

    /**
     * Returns the account's state and all its information.
     *
     * @return
     *      Account ID,IBAN,firstname,lastname,SSN and balance
     */
    public String getAccountState() {
        return "ID: " + id + ",IBAN: " + iban + ", " + holder + ",SSN: " +
                ssn + ",Balance: " + balance + "";
    }
}
