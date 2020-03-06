package com.epam;

import java.util.Scanner;

public class CollectionTesting {
	
	public static void main(String[] args) {
		
		Collection<Integer> list = new Collection<Integer>();
		boolean checkStatus = true;
        Scanner sc =  new Scanner(System.in);
        
        while(checkStatus) {
        	
	        	System.out.println("Select an option between 1 to 6 : ");
	        	System.out.println("1. Add an element to the list");
	        	System.out.println("2. Delete an element from the list");
	        	System.out.println("3. Show the length of List");
	        	System.out.println("4. Access an element with given index");
	        	System.out.println("5. Printing elements of list");
	        	System.out.println("6. To exit");
	        	
	        	int option = sc.nextInt();
	        	
	        	switch(option) {
	        		case 1 : 
	        			System.out.println("Enter the number to add ");
	        			list.addElement(sc.nextInt());
	        			break;
		        	case 2 : 
		        		System.out.println("Enter index of number to delete from the list");
		        		System.out.println("The list is as follows" + "\n" + (list) );
		        		list.remove(sc.nextInt());
		        	    break;
		        	case 3 : 
		        		System.out.println("The size of list is : " +list.length());
			        	break;
		        	case 4 :
		        		System.out.println("Enter index (index of first element is 0) : ");
		        		System.out.println("Element is " + list.getElement(sc.nextInt()));
		        	    break;
		        	case 5 : 
		        		 System.out.println("The elements in the list are : " + "\n" + list);
			        	 break;
		        	case 6:
		        		checkStatus = false;
		        		break;
			        default:
			        	System.out.println("Enter valid option");
			        	break;
			        		 
	        	}
	        	
        }
        	
	}

}
