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
        
        int value = ((int) Math.random() * 10)%2;
		
    	System.out.println("Random value : "+value);
    			
    	if(value == 1) {
    	System.out.println("Employee present");
    	} else {
    	System.out.println("Employee absent");
    	}
    	System.out.println("Enter daily/part");
    	int n=sc.nextInt();
        switch(n)
        {
                case 1 :
                calDailywage();
                break;
                case 2 :
                addParttime();
                break;
		case 3 :
		calMonwage();
		break;
                case 4 ;
		wagTotal();
		break;
		default :
                System.out.println("Invalid");
                break;
    }
	    
 }
        public static void addParttime(){
        	int wage;
        	wage=20*8;
        	System.out.println(wage);
        }
        public static void calDailywage() {
        	int wage;
        	wage=20*8;
        	System.out.println(wage);
        }
        public static void calMonwage(){
		int wage;
		wage=20*8*20;
		System.out.println(wage);
	}
	public static void wageTotal(){
		int w;
		
		for(i=0;i<=20;i++){
		  w=i*8*20;
		}
		System.out.println(w);
	}
	
}
    
    

