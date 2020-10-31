/*package whatever //do not write package name here */
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class GFG {
	public static void main (String[] args) {
	    Scanner scn = new Scanner(System.in);
	    String number = scn.next();
	   // if(number.lenth() >=1 && <=20){
	            if(number.length()== 10){
	                if(number.charAt(0) == '7'|| number.charAt(0) == '8'|| number.charAt(0) == '9'){
	                    System.out.println("Valid");
	                }
	            }else if(number.length()== 11){
	                if(number.charAt(0) == '0'){
	                    if(number.charAt(1) == '7'|| number.charAt(1) == '8'|| number.charAt(0) == '1'){
	                    System.out.println("Valid");
	                    }
	                }
	            }else if(number.length()== 12){
	                if(number.charAt(0) == '9' || number.charAt(1) == '1'){
	                    if(number.charAt(0) == '7'|| number.charAt(0) == '8'|| number.charAt(0) == '9'){
	                    System.out.println("Valid");
	                    }
	                }
	            else{
	                System.out.println("Invalid");
				}
				scn.close();
	//    }
	}
}
}