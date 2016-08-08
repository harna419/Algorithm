package project_Euler;

/*
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 ¡¿ 99.
	Find the largest palindrome made from the product of two 3-digit numbers.
 * */

public class P004_Largest_palindrome_product {

	public static String reverseString(String s) {
	    return ( new StringBuffer(s) ).reverse().toString();
	  }
	
	public static boolean check(int num){
		
		String str = num+"";
		reverseString(str);
		if(str.equals(reverseString(str))){return true;	}
		
		return false;
		
	}
	
	public static void main(String[] args) {
		int max=0;
		
		for(int a=100;a<1000;a++){
			for(int b=100;b<1000;b++){
				if(check(a*b)){if(max<a*b){max=a*b;}}
			}//in for
		}//out for
		System.out.println(max);
	}//main
	
}//class
