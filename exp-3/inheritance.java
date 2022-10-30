
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 21cse075
 */
public class inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        cylinder obj=new cylinder();
        System.out.println(obj);
        System.out.println("radius="+obj.getradius());
        System.out.println("color="+obj.getcolor());
        System.out.println("area of the circle="+obj.getarea());
        System.out.println("height of the cylinder="+obj.getheight());
        System.out.println("volume of the cylinder"+ "="+obj.getvolume());
        System.out.println();
        Scanner obj1=new Scanner(System.in);
        System.out.println("enter the radius of the circle:");
        double r=obj1.nextDouble();
        System.out.println("enter the height of the cylinder:");
        double h=obj1.nextDouble();
        System.out.println("enter the color:");
        String c=obj1.next();
        cylinder obj2=new cylinder(r,h,c);
        System.out.println("radius="+obj2.getradius());
        System.out.println("color="+obj2.getcolor());
        System.out.println("area of the circle="+obj2.getarea());
        System.out.println("height of the cylinder="+obj2.getheight());
        System.out.println("volume of the cylinder="+obj2.getvolume());
        System.out.println(obj2);
        System.out.println();
        obj2.setradius();
        System.out.println();
        obj2.setheight();
        System.out.println();
        obj2.setcolor();
        System.out.println();
        System.out.println("volume="+obj2.getvolume());
        System.out.println(obj2);
    }
    
}
class circle
{
    double radius;
    String color;
    circle()
    {
        radius=5.1;
        color="blue";
    }
    circle(double r)
    {
        radius=r;
    }
    circle(double ra,String co)
    {
        radius=ra;
        color=co;
    }
    double getradius()
    {
        return radius;
    }
    void setradius()
    {
        System.out.println("enter new radius value:");
        Scanner o=new Scanner(System.in);
        double rad=o.nextDouble();
        radius=rad;
    }
    String getcolor()
    {
        return color;
    }
    void setcolor()
    {
        System.out.println("enter new color value:");
        Scanner o=new Scanner(System.in);
        String co=o.next();
        color=co;
    }
    double getarea()
    {
        double area;
        area=Math.PI*radius*radius;
        return area;
    }
    @Override
    public String toString()
    {
        return "circle[radius="+radius+",color="+color+"]";
    }
}
 
class cylinder extends circle
{
    double height;
    cylinder()
    {
        super();
        height=5.10;
    }
    cylinder(double ra)
    {
        super (ra);
        radius=ra;
    }
    cylinder(double ra,double he)
    {
        height=he;
        radius=ra;
    }
    cylinder(double ra,double he,String s)
    {
        radius=ra;
        height=he;
        color=s;
    }
    double getheight()
    {
        return height;
    }
    void setheight()
    {
        System.out.println("enter new height value:");
        Scanner o=new Scanner(System.in);
        double rad=o.nextDouble();
        height=rad;
    }
    double getvolume()
    {
        double volume;
        volume=(Math.PI*radius*radius*height);
        return volume;
    }
}     
    
