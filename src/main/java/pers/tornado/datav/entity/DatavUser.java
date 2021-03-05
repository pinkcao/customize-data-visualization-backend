package pers.tornado.datav.entity;

public class DatavUser {
    private int userID ;
    private String userAccount;
    private String userPassword;
    private String userEmail;
    private int disabled;

    public DatavUser(int userID, String userAccount, String userPassword, String userEmail, int disabled) {
        this.userID = userID;
        this.userAccount = userAccount;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.disabled = disabled;
    }

    @Override
    public String toString() {
        return "DatavUser{" +
                "userID=" + userID +
                ", userAccount='" + userAccount + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", disabled=" + disabled +
                '}';
    }

    public DatavUser() {
    }

    public int getuserID() {
        return userID;
    }

    public void setuserID(int userID) {
        this.userID = userID;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getDisabled() {
        return disabled;
    }

    public void setDisabled(int disabled) {
        this.disabled = disabled;
    }
}
