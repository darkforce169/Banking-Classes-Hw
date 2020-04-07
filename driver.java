
/**
 * Write a description of class driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class driver
{
    public static void main(String[] args){
        Account account1 = new Account(100000);        //settings the two accounts for customer 1 n 2
        Account account2 = new Account(100000);
        Bank bank1 = new Bank("China Bank");
        
        System.out.println("***SOMETHING IS WRONG WITH THE getAccount method I THINK***");

        
        bank1.addCustomer("Gu", "Chun");
        bank1.addCustomer("Zi", "Yan");
        
        System.out.println("Number of customers in "+bank1.getBankName()+": "+bank1.getNumOfCustomers());
        System.out.println("Customer of index 0 is "+bank1.getCustomer(0).getFirstName()+" "+bank1.getCustomer(0).getLastName());
        System.out.println("Customer of index 1 is "+bank1.getCustomer(1).getFirstName()+" "+bank1.getCustomer(1).getLastName());
        
        
       
        bank1.getCustomer(0).setAccount(account1);
        System.out.println(bank1.getCustomer(0).getFirstName()+" "+bank1.getCustomer(0).getLastName()+"'s account: " + bank1.getCustomer(0).getAccount());
        
        System.out.println("Gu Chun's balance: "+bank1.getCustomer(0).getAccount().getBalance());
        System.out.println("Did Gu Chun deposited? "+bank1.getCustomer(0).getAccount().deposit(20000));
        System.out.println("Did Gu Chun withdraw? "+bank1.getCustomer(0).getAccount().withdraw(10000));
        System.out.println("Gu Chun's balance after deposit and withdraw: "+bank1.getCustomer(0).getAccount().getBalance());
        
        
        
        bank1.getCustomer(0).setAccount(account2);
        System.out.println(bank1.getCustomer(1).getFirstName()+" "+bank1.getCustomer(1).getLastName()+"'s account: " + bank1.getCustomer(1).getAccount());
        
        System.out.println("Zi Yan's balance: "+bank1.getCustomer(1).getAccount().getBalance());
        System.out.println(bank1.getCustomer(1).getAccount().deposit(50000));
        System.out.println(bank1.getCustomer(1).getAccount().withdraw(10000));
        System.out.println("Zi Yan's balance after deposit and withdraw: "+bank1.getCustomer(1).getAccount().getBalance());
    }
        
}
