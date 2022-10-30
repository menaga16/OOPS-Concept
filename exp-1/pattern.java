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
public class pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows to print the pattern :");
        int rows = a.nextInt();
        System.out.println("Printing the pattern");
        for (int i=1;i<= rows;i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
         // TODO code application logic here
    }
    
    }}
