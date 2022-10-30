
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 21cse079
 */
public class books {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        author obj2=new author("aaa","aaa@gmail.com","male");
        book obj=new book("bbb",obj2,200,2);  
       System.out.println(obj);
        // TODO code application logic here
    }
   
}
class author
{
    String name;
    String mail;
    String gender;
    author(String m,String id,String g)
    {
        name=m;
        mail=id;
        gender=g;
    } 
    public String toString()
    {
        return "name:"+name+" mail id:" + mail +"  gender:"+ gender;
    }
}

class book
{
    String bname;
    author author;
    double price;
    int qty;
 
    book(String n,author a,double p,int q)
    {
        bname=n;
        author=a;
        price=p;
        qty=q;
       
    }
   
    public String toString()
    {
        return "book name:"+ bname+"  author details: "+author+"    price:"+price+"   quantity: "+qty;
    }
   
   
   
   
   
}

