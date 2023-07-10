public class BankSystem {

    private final String name;
    private int accountId;
    private float initialAmount;
    private final String password;

    public BankSystem(String name, String password){
        this.name = name;
        this.password = password;
    }

    public void setAccountId(int accountId){
        this.accountId = accountId;
    }

    public void setInitialAmount(float initialAmount){
        this.initialAmount = initialAmount;
    }

    public String getName(){
        return this.name;
    }

    public int getAccountId(){
        return this.accountId;
    }

    public double getInitialAmount(){
        return this.initialAmount;
    }
}
