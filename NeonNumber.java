package com.practice;

public class NeonNumber {
	public static void main(String[] args) {
		int num=9;
		int num1 = num*num;
		int sum=0;
			while(num1>0) {
				int res1=(num1%10);
				num1=num1/10;
				sum=sum+res1;
			}
		System.out.println((num==sum)? +num+" is a Neon Number" : "Not a Neon Number");
		int i=12;
		int num2 = i*i;
		int sum1=0;
			while(num2>0) {
				int res=(num2%10);
				num2=num2/10;
				sum1=sum1+res;
			}
		System.out.println((i==sum1)? +i+" is a Neon Number" : +i+ " is not a Neon Number");
	}
}