/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concatenate;

import java.util.Scanner;

/**
 *
 * @author 21cse075
 */
public class mark {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner a=new Scanner(System.in);
        int m;
        System.out.println("enter your mark");//TODO code application logic here
        m=a.nextInt();
        if(m>=90)
            System.out.println("excellent");
        else if(m>=80)
            System.out.println("very good");
        else if(m>=70)
            System.out.println("good");
        else if(m>=60)
            System.out.println("yet to be improve");
        else 
            System.out.println("work hard");
         // TODO code application logic here
    }
    
}
