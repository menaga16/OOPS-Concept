import java.util.Scanner;
public class Creditcard {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int i=1;
        System.out.println("Enterthe number of customers:");
        int n=obj.nextInt();
        Customer c[]=new Customer[n];
       for(i=0;i<n;i++){
            System.out.println("Enter the customer "+(i+1)+" name:");
            String na=obj.next();
            System.out.println("Enter the Card number:");
            int cno=obj.nextInt();
            System.out.println("Enter the Pin Number:");
            int pi=obj.nextInt();
            System.out.println("Enter the Amount:");
            double amt=obj.nextDouble();
            c[i]=new Customer(na,cno,pi,amt);
            c[i].viewcreditamount();
            c[i].viewpin();
            System.out.println("\n enter any one of the following choices which you want to do");
            
            System.out.println("1- Pay Balance");
            System.out.println("2- Change Pin");
            System.out.println("Enter choice:");
            int ch=obj.nextInt();
            if(ch==1){
             c[i].paybalance();
            }
            else if(ch==2)
            {
             System.out.println("Enter New pin to be changed:");
             int newpin=obj.nextInt();
             c[i].setpin(newpin);
             c[i].changepin();
            }
            System.out.println(c[i]);
            System.out.println("---------------");
        }
        
    }
}
interface Creditcardinterface
{
   public void viewcreditamount();
   public void viewpin();
   public void changepin();
   public void paybalance();
}
class Customer implements Creditcardinterface
{
    String name;
    double cardnumber;
    int pin=1234;
    double creditamount=0;
    Customer(String n,double cn,int p,double ca)
    {
        name=n;
        cardnumber=cn;
        pin=p;
        creditamount=ca;
    }
    @Override
    public void viewcreditamount()
    {
        System.out.println("Credit Card Amount="+creditamount);
    }
    @Override
    public void changepin()
    {
        System.out.println("Your Secret pin"+pin);
    }
    public void setpin(int p)
    {
            pin=p;
    }
    public void viewpin()
    {
        System.out.println("Your Secret pin"+pin);
    }
    public void paybalance()
    {
        Scanner obj=new Scanner(System.in);
        if(creditamount!=0){
        System.out.println("Enter the paid amount:");
        double paid=obj.nextDouble();
        double balance=creditamount-paid;
        System.out.println("----------------------------");
        System.out.println("your Balance amount:"+balance);
        }
        else
        System.out.println("No Balance amount");
    }
    public String toString()
    {
        return "\nName:"+name+"\nCardnumber:"+cardnumber;
    }
}