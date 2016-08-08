package project_Euler;

/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *Find the sum of all the multiples of 3 or 5 below 1000. 
 */

public class P1_Multiples_of_3_and_5 {
	public static void main(String[] args) {
		int sum=0;

		
		for(int i=1;i<1000;i++){
			if(i%3 ==0){sum+=i;} //3의 배수면 합 한다.
			if(i%5 ==0){sum+=i;} //5의 배수면 합 한다.
			if(i%3 == 0 && i%5 ==0){sum-=i;} //3과 5의 배수이면 빼준다.
		}
		
		System.out.println("sum of all the Multiples of 3 or 5 below 1000 : "+sum);
		
	}
}
