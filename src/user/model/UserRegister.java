package user.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.model.Product;
import com.model.ShoppingCart;
import com.model.User;

public class UserRegister {
	public static void main(String[] args) {
	
		ShoppingCart cart=new ShoppingCart();

		Scanner s=new Scanner(System.in);
		
		
		
			System.out.println("Welcome to our ShoppingCart!");
			System.out.println("======User Registeration======");
			
			
			System.out.println("Enter Username:");
			String username=s.nextLine();
			System.out.println("Enter email:");
			String email=s.nextLine();
			System.out.println("Enter password:");
			String password=s.nextLine();
			System.out.println("Enter Confirm password:");
			String cpass=s.nextLine();
			
			if(password.equals(cpass)) {
			System.out.println("Registration Successfully....");
			
			}
			else {
				System.out.println("Do not match password");
				System.exit(0);
			
			}
				
			
				System.out.println("\nChoose an option:1.Login 2.Logout");
			int choice=s.nextInt();
			if(choice==1) {
				System.out.println("=====Login====");
				s.nextLine();
			
				System.out.println("");
				
			
				System.out.println("Enter Username:");
				String logUser=s.nextLine();
				System.out.println("Enter password:");
				String logPass=s.nextLine();
				System.out.println("Enter Confirm Password:");
				String pass=s.nextLine();
				
				if(logPass.equals(pass)) {
					System.out.println("Login successfully");
					cart.addProduct();

				}
				else {
					System.out.println("Do not match password please try to again..");
					
				}
				
				s.close();
				
			}
	
			else {
				System.out.println("Logout:");
				
				
			}
	}


			
	
			
		

	private static void displayProducts(Scanner s) {
		
		
	}

	private static void login(Scanner s) {
		
		
	}

	private static void Register(Scanner s) {
		
		
	}

}
