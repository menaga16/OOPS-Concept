
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 21cse079
 */

public class attendance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Student obj=new Student();
       obj.getdata();
       obj.display();
        
        // TODO code application logic here
    }
    
}
class Student
{
    int total;
    int present;
    String name,rollno;
    
    void getdata()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter your name:");
        name=obj.next();
        System.out.println("enter your rollno:");
        rollno=obj.next();
        
        System.out.println("enter the total no of working days:");
        total=obj.nextInt();
        System.out.println("enter the no of days you were present:");
        present=obj.nextInt();
    }
    void display()
    {
        double report=(present*100)/total;
        System.out.println("percentage: "+report);
        System.out.println("report");
        if (report>=90)
        {
            System.out.println("your marks-5");
        }
        else if(report>=80&&report<90)
        {
            System.out.println(("your mark-4"));
        }
         else if(report>=75&&report<80)
        {
            System.out.println("your mark-3");
        }
        else
         {
             System.out.println("your marks-0");
         }
        
}