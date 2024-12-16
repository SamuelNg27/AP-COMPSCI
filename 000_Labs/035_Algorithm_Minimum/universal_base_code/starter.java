/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
			int arraySize = (int)(Math.random() * 149) + 51;
			int [] arr = new int[arraySize];
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			double sum = 0.0;
			
			for(int i=0; i<arr.length; i++){
				arr[i] =  (int)(Math.random() * 100) + 1;
				
				if(arr[i] < min){
					min = arr[i];
				}
				if(arr[i] > max){
					max = arr[i];
				}
				sum = sum + arr[i];
			}
			double average = sum/(double)arr.length;
			
			System.out.println("The minumum of 1000 random numbers is:"+min);
			System.out.println("The maximum of 1000 random numbers is:"+max);
			System.out.println("The average of 1000 random numbers is:" +average);
			System.out.println("There are "+arr.length+" elements");
		
		
	}
}
