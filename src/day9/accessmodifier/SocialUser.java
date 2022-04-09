package day9.accessmodifier;

public class SocialUser {

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

    /*You can call this method to check your password and you need to pass the password that user has entered
    alsdjfsldfjskdfj
    dalksdjflaksdjfs
    dlajsdlkjfalsdkj
    a;lksdjfldkjlskd
     */

    public boolean checkPassword(String userEnterPasswod){
        if(this.password == userEnterPasswod){
            return true;
        }
        else {
            return false;
        }
    }

}
