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
public class Concatenate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        
        System.out.println("enter a number:");
        int b=a.nextInt();
        for(int i=1;i<=b;i++)
        {
            System.out.print(" "+i);
        }
        // TODO code application logic here
    }
    
}
