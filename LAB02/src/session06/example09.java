package session06;

public class example09 {
    private int accountID;
    private String holderName;
    private String accountType;
    {
        accountID = 100;
        holderName = "john";
        accountType = "savings";
    }
    public void displayAccountDetail(){
        System.out.println("Account Details");
        System.out.println("================");
        System.out.println(accountID + accountType);
    }

}
