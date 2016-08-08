package project_Euler;

/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
 * */

public class P007_10001st_prime {
	
	public static boolean check(int num){
		for(int i=2;i<num;i++ ){
			if(num==2){
				return true;
			}else if(num%i==0){
				return false;
			}
		}
		return true;
	}//end
	
	public static void main(String[] args) {
		int count=0;
		int prime=2;
		
		while(count<10001){
			if(check(prime)){
				count++;
				System.out.println(prime+" "+count);
			}
			prime++;
		}//while end
		
		System.out.println(prime);
		
	}//main
}//class
