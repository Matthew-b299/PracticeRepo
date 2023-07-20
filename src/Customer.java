public class Customer {
    private String name;
    private String address;
    private double balance;

    public Customer(String name, double balance, String address){
        this.name = name;
        this.balance = balance;
        this.address= address;
    }

   public double deposit(double amount)
    {

        balance = balance + amount;
        return balance;
    }

    
   public void withdraw(double amount)
    {

        if(balance > amount)
        {
            balance = balance - amount;
        }

        else {

            System.out.println("Insuffucient Funds!");
            System.out.println("You currently have " + balance + " dollars in your account and you are trying to withdraw " + amount);
        }
        
    }




  public void getBalance()
    {

     System.out.print("The balance in this account is " + balance);
        
    }

    public void getName()
    {

     System.out.print("The balance in this account is " + name);
        
    }

    public void getAddress()
    {

     System.out.print("The balance in this account is " + address);
        
    }

    
    
}
