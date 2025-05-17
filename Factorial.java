package com.practice;

public class Factorial {
	public int primeOrNot(int num){
		int sum=1;
		if(num<=0) 
			return -1;
		for(int i=1;i<=num;i++) {
			sum=sum*i;
		}
		return sum;
	}
	public int primeOrNot1(int num1) {
		int sum1=1;
		if(num1<=0) 
			return -1;
		for(int i=1;i<=num1;i++) {
			sum1=sum1*i;
		}
		return sum1;
		
	}
	
	public static void main(String[] args) {
		Factorial fact = new Factorial();
		System.out.println("Factorial is "+fact.primeOrNot(5));
		System.out.println("Factorial is "+fact.primeOrNot1(7));
	}
	
}


