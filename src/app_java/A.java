package app_java;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		
		//Remove duplicate element
		
//		int[] x = {9,9,9,8,8,8,7,7,7,6,6,6,5,5,5,4,4,4,3,3,3,2,2,1,1};
//		int[] y = new int[x.length];
//		int j = 0;
//		for (int i = 0; i < x.length-1; i++) {
//			if(x[i]!=x[i+1]) {
//				y[j] = x[i];
//				j++;
//			}
//		}
//		y[j] = x[x.length-1];
//		for (int z : y) {
//			System.out.print(z+" ");
//		}
		
	
	//Bubble sort
		
//		int[] x = {9,9,8,8,8,7,7,7,6,6,5,5,5,4,4,4,3,3,3,2,2,1,1};
//		int temp;
//		for (int i = 0; i < x.length; i++) {
//			for (int j = 0; j < x.length-1; j++) {
//				if(x[j]>x[j+1]) {
//					temp = x[j];
//					x[j] = x[j+1];
//					x[j+1] = temp;
//				}
//			}
//		}
//		for (int z : x) {
//			System.out.print(z+" ");
//		}
		
		
		
		//find duplicate element
		
//		int[] x = {1,2,3,4,5,6,7,8,9,1,3,5,7,9};
//		for (int i = 0; i < x.length; i++) {
//			for (int j = 0; j < x.length-1; j++) {
//				if(x[i]==x[j]&&i!=j) {
//					System.out.println(x[j]);
//				}
//			}
//		}
		
	
		
		//Factorial
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter Number");
//		int x = scan.nextInt();
//		int f = 1;
//		for (int i = 1; i <=x; i++) {
//			f = f*i;
//		}
//		System.out.println(f);
		
		
		//Prime Number
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter Number");
//		int x = scan.nextInt();
//		int j = 0;
//		for (int i = 1; i <=x; i++) {
//			if(x%i==0) {
//				j++;
//			}
//		}if(j==2) {
//			System.out.println("Prime Number");
//		}else {
//			System.out.println("Not prime Number");
//		}
		
		
		//Even or Odd number
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter Number");
//		int x = scan.nextInt();
//		if(x%2==0) {
//			System.out.println("Even number");
//		}else {
//			System.out.println("Odd Number");
//		}
		
		
		//Find Vowel in String
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter String");
//		String x = scan.nextLine();
//		String y = x.toLowerCase();
//		for (int i = 0; i < x.length(); i++) {
//			if(y.charAt(i)=='a'||y.charAt(i)=='e'||y.charAt(i)=='i'||y.charAt(i)=='o'||y.charAt(i)=='u') {
//				System.out.println(x.charAt(i));
//			}
//		}
		
		
		//Fabinous series
		
//		int x= 0;
//		int a = 1;
//		int b = 1;
//		System.out.println(a);
//		System.out.println(b);
//		while(x<=1000) {
//			x = a+b;
//			System.out.println(x);
//			a = b;
//			b = x;
//		}
		
		
		//Palindrome Number
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter Number");
//		int n = scan.nextInt();
//		int r,s = 0;
//		int x = n;
//		while(n>0) {
//			r = n%10;
//			n = n/10;
//			s = s*10+r;
//		}if(x==s) {
//			System.out.println("Palindrome Number");
//		}else {
//			System.out.println("Not Palindrome Number");
//		}
		
		
		//Armstrong Number
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter Number");
//		int n = scan.nextInt();
//		int r,s = 0;
//		int x = n;
//		while(n>0) {
//			r = n%10;
//			n = n/10;
//			s = s+r*r*r;
//		}if(x==s) {
//			System.out.println("Armstrong Number");
//		}else {
//			System.out.println("Not Armstrong Number");
//		}
		
		
		
		//String Palindrome
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter String");
//		String x = scan.next();
//		String y = "";
//		for (int i = x.length()-1; i >=0; i--) {
//			y = y+x.charAt(i);
//		}
//		if(x.equals(y)) {
//			System.out.println("Palindrome");
//		}else {
//			System.out.println("Not Palindrome");
//		}
		
		
		
		//Prefect Number
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter Number");
//		int x = scan.nextInt();
//		int y = 0;
//		for (int i = 1; i < x; i++) {
//			if(x%i==0) {
//				y = y+i;
//			}
//		}if(x==y) {
//			System.out.println("Prefect Number");
//		}else {
//			System.out.println("Not Prefect Number");
//		}
		
		
		
		//find duplicate character in String
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter String");
//		String x = scan.nextLine();
//		char[] ch = x.toCharArray();
//		for (int i = 0; i < x.length(); i++) {
//			for (int j = i+1; j < x.length(); j++) {
//				if(ch[i]==ch[j]) {
//					System.out.println(ch[j]);
//				}
//			}
//		}
		
		
		
		
		//swap two Number without 3rd variable
		
//		int x = 1234;
//		int y = 4321;
//		x = x+y;
//		y = x-y;
//		x = x-y;
//		System.out.println(x);
//		System.out.println(y);
	
	
	//swap two number using 3rd variable
		
//		int x =  134;
//		int y = 365;
//		int z;
//		z = x;
//		x = y;
//		y = z;
//		System.out.println(x);
//		System.out.println(y);
	
	
	
	//Reverse String
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter String");
//		String x = scan.nextLine();
//		for (int i = x.length()-1; i >=0; i--) {
//			System.out.print(x.charAt(i));
//		}
	
	
	//count character in String
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter String");
//		String x = scan.nextLine();
//		String[] y = x.trim().split(" ");
//		System.out.println(x.length());
//		
//		for (String string : y) {
//			System.out.println(string);
//		}
	
	
	//Error or Not
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter Paranthesis");
//		String x = scan.nextLine();
//		int a  = 0;
//		int b = 0;
//		for (int i = 0; i < x.length(); i++) {
//			if(x.charAt(i)=='(') {
//				a++;
//			}else if(x.charAt(i)==')') {
//				b++;
//			}
//		}
//		if(a==b) {
//			System.out.println("Not Error");
//		}else {
//			System.out.println("Error");
//		}
	}
	
	
}
