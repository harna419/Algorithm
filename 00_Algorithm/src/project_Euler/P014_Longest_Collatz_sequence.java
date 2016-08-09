package project_Euler;

/*
 * The following iterative sequence is defined for the set of positive integers:

n ¡æ n/2 (n is even)
n ¡æ 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 ¡æ 40 ¡æ 20 ¡æ 10 ¡æ 5 ¡æ 16 ¡æ 8 ¡æ 4 ¡æ 2 ¡æ 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. 
Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
 * */

public class P014_Longest_Collatz_sequence {

	public static void main(String[] args) {
		
		long number=0;
		long max=0;
		long maxValue=0;
		long chain=0;
		
		for(int i=2;i<1000000;i++){
			number=i;
			chain=0;
			while(true){
				if(number==1){break;}
				if((number%2)==0){number=(number/2);chain++;
				}else{number=(number*3)+1;chain++;}
				//System.out.println(number);
			}//while
			
		if(max<chain){
			System.out.println("max= "+max);max=chain;maxValue=i;}
		
		}//for
		
		System.out.println(maxValue);
		
	}//main end
	
}//class end
