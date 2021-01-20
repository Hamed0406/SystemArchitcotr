package Ovnning.V1.FacsadeOvnning;

/**
 * @author Hamed Adeli,
 * h.adeli.meadeli@gmail.com
 * 1/20/2021
 */
public class User {
    private  String userID;
    private int balance=0;


    public User(String userID, int balance) {
        this.userID = userID;
        this.balance = balance;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void addFound(int amount)
    {
        balance=balance+amount;
    }
    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                ", balance='" + balance + '\'' +
                '}';
    }
}
