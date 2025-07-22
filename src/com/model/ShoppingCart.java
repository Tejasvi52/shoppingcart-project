package com.model;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class ShoppingCart {
	private List<Product>products1=new ArrayList<>();
	
	private Map<String,Product>products=new HashMap<>();
	private Object s;
	private Object c;

	private double totalPrice;
	
	private List<Product> cart = new ArrayList<>();


	private int id;
	public void addProduct() 
	{
		
		System.out.println("Choose an option to filter products:");
		System.out.println("1. By ID");
		System.out.println("2. By Name");
		System.out.println("3. By Price");

		Scanner s = new Scanner(System.in);
		int filterOption = s.nextInt();

		TreeSet<Product> ProductSet;
		if (filterOption == 1) {
		    ProductSet = new TreeSet<>((o1, o2) -> Integer.compare(o1.getId(), o2.getId()));
		} else if (filterOption == 2) {
		    ProductSet = new TreeSet<>((o1, o2) -> o1.getName().compareTo(o2.getName()));
		} else {
		    ProductSet = new TreeSet<>((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
		}


		Product p1=new Product(101,"SmartPhone",35000);
		Product p2=new Product(102,"Laptop",55000);
		Product p3=new Product(103,"LCD",30000);
		Product p4=new Product(104,"Camera",25000);
		Product p5=new Product(105,"Computer",37000);
		
        System.out.println("Available Products:");
		
		ProductSet.add(p1);
		ProductSet.add(p2);
		ProductSet.add(p3);
		ProductSet.add(p4);
		ProductSet.add(p5);
		
		for (Product p : ProductSet) {
		    System.out.println(p);
		}

		if (filterOption == 1) {
		    System.out.println("Choose product from above list by ID:");
		    int id = s.nextInt();
		    for (Product p : ProductSet) {
		        if (p.getId() == id) {
		            System.out.println("You have chosen:" + p.getId() + p.getName() + p.getPrice());
		        }
		    }
		} else if (filterOption == 2) {
		    System.out.println("Choose product from above list by Name:");
		    s.nextLine(); 
		    String name = s.nextLine();
		    for (Product p : ProductSet) {
		        if (p.getName().equalsIgnoreCase(name)) {
		            System.out.println("You have chosen:" + p.getId() + p.getName() + p.getPrice());
		        }
		    }
		} else {
		    System.out.println("Choose product from above list by Price:");
		    double price = s.nextDouble();
		    for (Product p : ProductSet) {
		        if (p.getPrice() == price) {
		            System.out.println("You have chosen:" + p.getId() + p.getName() + p.getPrice());
		        }
		    }
		}
		
		for (Product p : ProductSet) {
            if (p.getId() == id) {
                cart.add(p1);
                System.out.println("You have chosen:" + p1.getId() + p1.getName() + p1.getPrice());
                displayCart();
                break;
            }
        }
		
		float totalprice=0;
		
		while(true) {
		for(Product p:ProductSet) {
			System.out.println(p);
		}
		Scanner s1=new Scanner(System.in);
		//System.out.println();
		System.out.println("Choose product from above list by ID:");
		int i=s.nextInt();
		
		for(Product p:ProductSet) {
			if(p.getId()==i) {
				
				totalprice+=p.getPrice();
			
			
				System.out.println("You have chosen:"+p1.getId()+  p1.getName()+  p1.getPrice());
				System.out.println("Total Price:"+totalprice);
				
				break;
			}
		}
		 System.out.println("Do you want to add more products or remove any product?");
	        System.out.println("\nChosse an Option:1.ADD  2.REMOVE  3.EXIT ");
	        
	          if (i == 1) {
	            
	            System.out.println("You have added:" + ProductSet);
	        } else {
	            
	        }
	        int i1 = s.nextInt();
	        s.nextLine();
	

	        if (i1 == 1) {
	        	
	            
	        } else if (i1 == 2) {
	            removeProduct(ProductSet, s);
	        } else if (i1 == 3) {
	            break;
	        } else {
	            System.out.println("Invalid option.");
	        }
	    }
	}

	private void displayCart() {
		
		
	}

	private void removeProduct(TreeSet<Product> ProductSet, Scanner s) {
	    System.out.println("Enter ID of Product to remove:");
	    int id = s.nextInt();
	    s.nextLine();
	    
	    Product productToRemove = null;
	    for (Product p : ProductSet) {
	        if (p.getId() == id) {
	            productToRemove = p;
	            break;
	        }
	    }

	    if (productToRemove != null) {
	        ProductSet.remove(productToRemove);
	        System.out.println("Product removed successfully!");
	        System.out.println("Removed Product: " + productToRemove);
	    } else {
	        System.out.println("Product not found.");
	    }
	    System.out.println("Do you want to exit? (yes/no)(3/4)");
	    String input = s.nextLine();
	    if (input.equalsIgnoreCase("yes")) {
	    	
	        System.out.println("Thanks for Shopping!");
	        System.exit(0);
	        
	    } else if (input.equalsIgnoreCase("no")) {
	        
	        System.out.println("Available Products:");
	        
	        for (Product product : ProductSet) {
	            System.out.println(product);
	        }
	        System.out.print("Choose product from above list by ID: ");
	        int id1 = s.nextInt();
	        s.nextLine();
	    }else {
	    	System.out.println("Invalid Option");
	    	System.exit(0);
	       
	    }
	}

	private void productToRemove() {
		
		
	}}
		


	


