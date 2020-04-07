
/**
 * Write a description of class Account here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Account
{
   private double balance;

   
   
   public Account(double init_balance){
       this.balance = init_balance;
    }
   public double getBalance(){
       return this.balance;
    }  
   public boolean deposit(double amtdepo){
       if (amtdepo < 0){
           return false;
        }
       else{
           this.balance = this.balance + amtdepo;
           return true;
        }
    }
   public boolean withdraw(double amtwit){
       if (amtwit < 0){
           return false;
           
        }
       else{
           this.balance = this.balance - amtwit;
           return true;          
        }
    }       
}   
