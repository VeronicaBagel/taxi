package com.revotech.auto.entity;

/**
 * Class {@code Customer} is an entity which defines necessary fields for customer info.
 * @author Revotech
 */
public class Customer {
    private String login;
    private String password;
    private String email;

    public Customer(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public Customer() {
        super();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
