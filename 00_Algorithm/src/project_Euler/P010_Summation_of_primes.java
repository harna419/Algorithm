package project_Euler;

/*
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
 * */

public class P010_Summation_of_primes {
	
	public static boolean check(long num){
		
		for(int i=2;i*i<=num;i++){
			if(num==0){
				return true;
			}else if(num%i==0){
				return false;
			}
		}//for
		
		return true;
	}
	
	public static void main(String[] args) {
		
		long num=2000000L;
		long count=3;
		long sum=2;
		
		while(num>count){
					
			if(check(count)){ 
				
				sum+=count;
				System.out.println(sum);
			}
		count+=2;	
		}//while
		
		System.out.println(sum);
	}//main
}//class
