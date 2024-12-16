/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.raiseSalary(20);
		double a = michael.getAnnualSalary();
		Employee Jim = new Employee(2474, "Jim","Halpert", 4416.66);
		Jim.raiseSalary(10);
		double x = Jim.getAnnualSalary();
		Employee Pam = new Employee(2011, "Pam","Beesly", 2250);
		Pam.raiseSalary(50);
		double y = Pam.getAnnualSalary();
		Employee Bob = new Employee(2934, "Billy","Bob", 1239.32);
		Bob.raiseSalary(500);
		double z = Bob.getAnnualSalary();
		michael.employeeToString();
		System.out.println(a);
		Jim.employeeToString();
		System.out.println(x);
		Pam.employeeToString();
		System.out.println(y);
		Bob.employeeToString();
		System.out.println(z);
		
	}
}
