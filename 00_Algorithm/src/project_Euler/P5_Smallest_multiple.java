package project_Euler;

/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
	What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * */

public class P5_Smallest_multiple {
	
	public static boolean check(int num){
		
		for(int i=2;i<21;i++){
			if(!(num%i ==0)){ return false;} 
		}//for
		return true;
	}
	
	public static void main(String[] args) {
		
		int count=2;
		
		while(true){
			if(check(count)){break;}
			count++;
		}
		System.out.println(count);
		
	}//main
}//class
