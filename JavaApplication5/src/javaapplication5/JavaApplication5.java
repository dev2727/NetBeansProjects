/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author anubhav chhillar
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
         int marks[] = new int[6];
        int i;
        float total=0, avg;
        try (Scanner scanner = new Scanner(System.in)) {
            for(i=0; i<6; i++) {
                System.out.print("Enter Marks of Subject"+(i+1)+":");
                marks[i] = scanner.nextInt();
                total = total + marks[i];
            }
        } 
        float per = (total/600)*100;
        System.out.print("The student Grade is: "+ per+"%  ");
        //Calculating average here
        avg = total/6;
        System.out.print("The student Grade is: ");
        if(avg>=80)
        {
            System.out.print("A  ");
        }
        else if(avg>=60 && avg<80)
        {
           System.out.print("B   ");
        } 
        else if(avg>=40 && avg<60)
        {
            System.out.print("C  ");
        }
        else
        {
            System.out.print("D  ");
        }
    }
    
}
