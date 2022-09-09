package AmazonProject;

public class AmazonAccount {

    private String userName, email;
    private Boolean hasPrime;


    public String toString() {
        return "AmazonAccount{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", hasPrime=" + hasPrime +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getHasPrime() {
        return hasPrime;
    }

    public void setHasPrime(Boolean hasPrime) {
        this.hasPrime = hasPrime;
    }



    public AmazonAccount(String userName, String email, Boolean hasPrime) {
        this.userName = userName;
        this.email = email;
        this.hasPrime = hasPrime;


    }
}
