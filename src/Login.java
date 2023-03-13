public class Login {
    private String userName;
    private String userPin;

    public void setUserName(String userName)
    {
        this.userName=userName;
    }
    public String getUserName()
    {
        if(userName=="Abhi Sakhare")
        {
            return "User Name is valid, plz Enter PIN";
        }
        else {
            return "User Name is Invalid";
        }
    }
    public void setUserPin(String userPin)
    {
        this.userPin=userPin;
    }
    public String getUserPin()
    {
        if(userPin=="143143")
        {
            return "User Pin is Verify, plz login!";
        }
        else {
            return "User Pin is Invalid";
        }
    }
}
class PageUser{
    public static void main(String[] args) {
        Login l1 = new Login();
        l1.setUserName("Abhi Sakhare");
        System.out.println(l1.getUserName());
        l1.setUserPin("143143");
        System.out.println(l1.getUserPin());
    }

}
