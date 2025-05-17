package com.practice;

public class AmstrongNumber{
	public int factorial(int i) { 
		int temp=i;
		int sum=0; 
		   while(i>0) { 
		   int rev=i%10; 
		   sum= sum + rev*rev*rev; 
		   i= i/10; 
		  } 
		  if(temp==sum) { 
		   System.out.println(temp+" is an Armstrong number"); 
		  } 
		  else { 
		   System.out.println(temp+" is not an  Amstrong Number"); 
		  } 
		 return sum; 
		 } 
		 public static void main(String[] args) { 
			 AmstrongNumber obj = new AmstrongNumber();
			 obj.factorial(153);
		 } 

}
