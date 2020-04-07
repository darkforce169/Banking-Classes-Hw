
import java.util.ArrayList;
public class Bank
{
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    private int numberOfCustomers;
    private String bankName;
    
    public Bank(String bName){
        this.bankName = bName;
    }
    public void addCustomer(String f, String l){
        this.customers.add(new Customer(f, l));
    }
    public int getNumOfCustomers(){
        return this.customers.size();        
    }
    public Customer getCustomer(int index){    
        return this.customers.get(index);
    }    
    public String getBankName(){
        return this.bankName;
    }
}
