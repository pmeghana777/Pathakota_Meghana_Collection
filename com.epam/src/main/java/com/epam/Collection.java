package com.epam;

import java.util.Arrays;

public class Collection<C> {
	
	private static final int INITIAL_SIZE = 10;
	private Object numbersList[];
	private int size = 0;
	
	public Collection() {
		 numbersList = new Object[INITIAL_SIZE];
	}

	public void addElement(C e) {
		if (size == numbersList.length) {
			updateSize();
		}
		numbersList[size++] = e;
	}
	
	public C getElement(int i) {
		if (size == 0) {
			System.out.println("List is empty");
		}
		else if(i < 0 || i >= size){
			System.out.println("Enter valid index");
		}
		
		return (C) numbersList[i];
	}
	
	public C remove(int i) {
		int check = 0;
		if ( size == 0 ) {
			check = 1;
			System.out.println("The list is Empty");
		}
		else if( i < 0 || i >= size ){
			check = 1;
			System.out.println("Enter valid Index");
		}
		Object it = numbersList[i];
		if(check == 0){
			int numElements = numbersList.length - ( i + 1 ) ;
			System.arraycopy(numbersList, i + 1, numbersList, i, numElements ) ;
			size--;
			System.out.println("Element deleted");
		}
		return (C) it;
	}
	
	public int length() {
		return size;
	}
	
	@Override
	public String toString()  {
		 StringBuilder stringbuilder = new StringBuilder();
		 stringbuilder.append('[');
		 for(int i = 0; i < size ; i++) {
			 stringbuilder.append(numbersList[i].toString());
			 if(i < size - 1){
				 stringbuilder.append(",");
			 }
		 }
		 stringbuilder.append(']');
		 return stringbuilder.toString();
	}
	
	
	private void updateSize() {
		int newSize = numbersList.length * 2;
		numbersList = Arrays.copyOf(numbersList, newSize);
	}

}
