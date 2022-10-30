package exp5;
import java.util.Scanner;
import packagenew.*;
public class Expt5{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println(" 1. Addition \n 2.lower case and upper case concertion \n 3.number Pattern\n 4.Exit");
        int i=1;
        while(i==1)
        {
        System.out.println("enter your choice:");
        int ch=obj.nextInt();
            switch (ch) {
                case 1:
                    packagenew.pack1.Package1 p1=new  packagenew.pack1.Paackage1();
                    p1.calculation(10,20);
                    break;
                case 2:
                    packagenew.pack2.Package2 p2=new packagenew.pack2.Package2();
                    p2.strings("oops lab");
                    break;
                case 3:
                    packagenew.pack3.Package3 p3=new packagenew.pack3.Package3();
                    p3.Pattern(5);
                    break;
                case 4:
                    i=0;
                    break;
                default:
                    break;
            }
    }
    }
}