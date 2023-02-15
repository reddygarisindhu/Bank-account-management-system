package bankapplication;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = input.next();
		System.out.println("Enter your age:");
		int age = input.nextInt();
		System.out.println("Enter  your gender");
		String gender  = input.next();
		System.out.println("Enter your kyc number(Aadhar)");
		String kyc= input.next();
		System.out.println("Enter your address");
		String address = input.next();
		System.out.println("Select your Account type");
		String accountType= input.next();
		
		System.out.println("Hello "+name);
		System.out.println("age: " +age);
		System.out.println("gender: " +gender);
		System.out.println("kyc: " +kyc);
		System.out.println("address: " +address);
		
		if(accountType.equalsIgnoreCase("Saving")) {
			System.out.println("You selected Savings Account");
		}
		else if(accountType.equalsIgnoreCase("Current")) {
			System.out.println("You selected Current Account");
		}
		else {
			System.out.println("You selected Invalid Account Type");
		}
		
       try {
		FileWriter writer = new FileWriter("file.txt");
		     writer.write("Name: " + name +"\n");
		     writer.write("Age: " + age +"\n");
		     writer.write("Gender: " + gender +"\n");
		     writer.write("kyc: " + kyc +"\n");
             writer.write("address: " + address +"\n"); 
             writer.write("Account Type: " + accountType +"\n");
		     writer.close();
		     System.out.println("Account information has been saved to file");

       }catch(IOException e) {
    	   e.printStackTrace();
       }

	}
	


	




	}


