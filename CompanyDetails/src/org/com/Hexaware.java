package org.com;


import java.util.Scanner;
import org.com.Hexaware;
public class Hexaware {
	String companyname = "Hexaware";
	public void companyname () {
		System.out.println("companyname = hexaware");
	}
	String companyaddress = "chennai";
	public void companyaddress() {
		System.out.println("companyaddress = chennai");
	}

   public static void main(String[] args) {
	    Scanner s =new Scanner(System.in);
	    System.out.println("Enter the companyname");
	    System.out.println("Enter the companyaddress");
	    Hexaware h = new Hexaware();
	    h.companyname();
        h.companyaddress();
   }
   }