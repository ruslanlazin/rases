package ua.pp.lazin.races.Hiber;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Laz on 26.08.2016.
 */

@Entity
@Table(name = "Gamblers")
public class Gambler {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private int GamblerId;

    @Basic
    @Column(name = "login")
    private String login;

    @Basic
    @Column(name = "password")
    private String password;

    @Basic
    @Column(name = "balance")
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
