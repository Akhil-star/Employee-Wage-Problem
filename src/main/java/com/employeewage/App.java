package com.employeewage;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welocome to Employee Wage Computation Program" );
        int employeePresent = 1;
		
    	int value = ((int) Math.random() * 10)%2;
    			
    	System.out.println("Random value : "+value);
    			
    	if(value == 1) {
    	System.out.println("Employee present");
    	} else {
    	System.out.println("Employee absent");
    			}
    }
}
