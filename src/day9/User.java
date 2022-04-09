package day9;

import java.time.LocalDate;

public class User {

    private String name;
    private String email;
    private String userName;
    private String password;

    private String address;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean checkPassword(String userEnterPasswod){
        if(this.password == userEnterPasswod){
            return true;
        }
        else {
            return false;
        }
    }

}
