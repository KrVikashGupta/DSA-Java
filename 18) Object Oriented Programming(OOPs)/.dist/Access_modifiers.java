public class Access_modifiers {
    public static void main(String args[]) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "VKG";
        //myAcc.password = "qwertyu"; //  we can not access but we can change pwd not access beacause this is private 
        myAcc.setPassword("qwerty");
    }
    
}
class  BankAccount {
    public String username; // we can also write default 
    private String passward;
    
    public void setPassword(String pwd) {  //    we can not access but we can change pwd  so create a function .we can write default acc. to requirement
        password = pwd;
    }
}