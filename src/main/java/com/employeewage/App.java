package com.employeewage;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welocome to Employee Wage Computation Program" );
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        switch(n)
        {
                Case 1 :
                calDailywage();
                break;
                Case 2 :
                addParttime();
                break;
                default :
                System.out.println("Invalid")
    }
    
    
}
