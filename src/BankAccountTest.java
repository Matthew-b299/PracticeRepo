public class BankAccountTest{
    public static void main(String[] args)
    {

        Customer cust = new Customer("Matthew Brown", 900.00, "130 Bellamy Road N");

       // cust.getBalance();
        cust.deposit(1000);
        System.out.println(" ");
        //cust.getBalance();


        System.out.println(" ");
        cust.withdraw(4500);


    }
}