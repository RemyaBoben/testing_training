package com.training.demo_maven2;

import java.util.Scanner;

public class Calculator {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cObj = new Calculator();
		Scanner sObj = new Scanner(System.in);
		int sVal1 =sObj.nextInt();
		int sVal2 =sObj.nextInt();
		char xVal1 =sObj.next().toLowerCase().charAt(0);
		calculate(sVal1,sVal2,xVal1);
	}*/
	public static double calculate(int sVal1,int sVal2,char xVal1) {
		
		double result=0 ;
		switch (xVal1) {
		case 'a':
			result =sVal1+sVal2;
			break;
		case 's':
			result =sVal1-sVal2;
			break;
		case 'm':
			result =sVal1*sVal2;
			break;
		case 'd':
			result =sVal1/sVal2;
			break;
		}
		return result;
	}
	
}
