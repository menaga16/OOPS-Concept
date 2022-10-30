import java.util.Scanner;
public class Transport {
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       int i;
       System.out.println("Enter Number of Objects");
       int n=obj.nextInt();
       Car A[]=new Car[n];
       for(i=1;i<=n;i++)
       {
        
        System.out.println("1-transportvehicle() method");
        System.out.println("2-privatevehicle() method");
        System.out.println("Enter choice:");
        int ch=obj.nextInt();
        if(ch==1)
        {
            System.out.println("Enter Validity Number:");
            int vn=obj.nextInt();
            System.out.println("Enter Start date:");
            int sd=obj.nextInt();
            System.out.println("Enter Period:");
            int p=obj.nextInt();
            transportvehicle tv=new transportvehicle(vn,sd,p);
            System.out.println(tv);
        }
        else if(ch==2)
        {
            System.out.println("Enter Owner Name:");
            String on=obj.next();
            System.out.println("Enter Owner Address:");
            String oa=obj.next();
            privatevehicles pv=new privatevehicles(on,oa);
            System.out.println(pv);
        }
        else
        {
            break;
        }
       }
       
    }
}
abstract class Car
{
    int reg_no;
    String model;
    String reg_date;
}
class transportvehicle extends Car
{
    int Validity_no;
    int start_date;
    int period;
    transportvehicle(int vn,int sd,int p)
    {
        Validity_no=vn;
        start_date=sd;
        period=p;
        reg_no=1;
        model="yamaha Rx100";
        reg_date="09/09/2022";
    }
    @Override
    public String toString()
    {
        return "\nValidity Number="+Validity_no+"\nStart date="+start_date+"\nPeriod="+period+"\nRegister Number="+reg_no+"\nModel name="+model+"\nRegidter date="+reg_date;
    }
}
class privatevehicles extends Car
{
    String owner_name;
    String owner_address;
    privatevehicles(String on,String oa)
    {
        owner_name=on;
        owner_address=oa;
        reg_no=1;
        model="Yamaha RX100";
        reg_date="09/09/2022";
    }
    @Override
    public String toString()
    {
        return "\nOwner Name="+owner_name+"\nOwner Adress="+owner_address+"\nRegister Number="+reg_no+"\nModel name="+model+"\nRegister date="+reg_date;
    }
}