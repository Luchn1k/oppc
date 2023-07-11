package encapsulation;

public class Encapsulation {
    private String userName;
    private String bankAcc;
    private String branch;
    private String contactNumber;

    public Encapsulation(String userName){
        this.userName = userName;
        this.bankAcc = "1232424234234234";
    }

    public String getUserName(){
        return  userName;
    }

    public String getBankAcc() {
        return bankAcc;
    }

    public String getBranch() {
        return branch;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber){
        this.contactNumber = contactNumber;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}

class Test{

    public static void main(String[] args) {
        Encapsulation en = new Encapsulation("Saman");
        System.out.println(en.getUserName());
        System.out.println(en.getBranch());



    }
}
