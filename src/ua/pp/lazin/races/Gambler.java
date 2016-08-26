package ua.pp.lazin.races;

/**
 * Created by Laz on 26.08.2016.
 */
public class Gambler {
    private int GamblerId;
    private String login;
    private String password;
    private int balance;

    public int getGamblerId() {
        return GamblerId;
    }

    public void setGamblerId(int gamblerId) {
        this.GamblerId = gamblerId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
