package com.linkedlist.main;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
* <h1>FirstLastPositon Search/h1>
* The FirstLastPositon program search First and Last position of the occurance
* of an element in a Linked List 
*
* @author  Promise Francis
* @version 1.0
* @since   11/20/2019 
*/
public class FirstLastPositonSearch {

	public static void main(String[] args) {		
		listPosition();
	}
	
	/**
	   * This method is used to  search First and Last position 
	   * of the occurance of an element in a Linked List  
	   * 
	   */
	public static void listPosition(){
		
		LinkedList<String> lList=null;
		//Enter lenght of linked list
		System.out.println( "Enter lenght of Linked List");
		Integer lenght =Integer.parseInt(readConsole());
		
		//Enter integer corresponding to the lenght
		System.out.println( "Enter "+ lenght +" Integers seprated by space");
		lList = new LinkedList<String>(Arrays.asList(readConsole().split(" ")));
		
		//Validation, Check whether the list count equal to lenght
		while (lList.size()!=lenght){
			System.out.println("Incorrect Input !");
			System.out.println( "Enter "+ lenght +" Integers seprated by space");
			 lList = new LinkedList<String>(Arrays.asList(readConsole().split(" ")));
		}
		//Enter the number to search 
		System.out.println( "Enter the number to search for occurance");
		String searchNum =readConsole();
		
		//List First and last position
		System.out.println("First Position : "+lList.indexOf(searchNum));
		System.out.println("Last Position : "+lList.lastIndexOf(searchNum));
	}
	
	
	/**
	   * This method is used to  read from console  
	   * @return String    Return the console value
	   */
	public static String readConsole(){		
	    Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		return s;
	}

}
