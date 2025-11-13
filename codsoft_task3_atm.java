import java.util.*;
class BankAccount
{
    double balance_amount;
    BankAccount(double balance_amount)
    {
        this.balance_amount=balance_amount;
    }
    double checkbalance()
    {
        return balance_amount;
    }
    boolean withdraw(double amt)
    {
        if(amt>0 && amt<=balance_amount)
        {
            balance_amount=balance_amount - amt;
            return true;
        }
        return false;
    }
    boolean deposit(double amount)
    {
        if(amount>0)
        {
            balance_amount+=amount;
            return true;
        }
        return false;
    }
}
public class codsoft_task3_atm
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        BankAccount ob=new BankAccount(2000);
        int ch;
        do
        {
        System.out.print("\n1.Check Balance "+" 2.Withdraw amount "+" 3.Deposit Amount "+" 4.Exit ");
        System.out.println("\nChoose any of these options");
        ch=sc.nextInt();
        switch(ch)
        {
           case 1:
           System.out.println("Balance is:"+ob.checkbalance());
           break;
           case 2:
           System.out.println("Enter the withdrawl amount:");
           double amt=sc.nextDouble();
           if (ob.withdraw(amt))
           {
            System.out.println("Completed. Balance is: " + ob.balance_amount);
           }
           else
           {
            System.out.println("Insufficient balance");
           }
           break;
           case 3:
           System.out.println("Enter the deposit amount:");
           double amount=sc.nextDouble();
           if(ob.deposit(amount))
           System.out.println("Completed. Balance is:"+ob.balance_amount);
           else
           System.out.println("Invalid amount");
           break;
           case 4:
           System.out.println("Thank You");
           break;
           default:
           System.out.println("Wrong Choice");
        }
    } while(ch!=4);
           sc.close();
    }
}