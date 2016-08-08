package project_Euler;

import java.util.ArrayList;

public class P003_Largest_prime_factor {

	
	public static boolean prime_check(int num){
		
		for(int i=2;i<num;i++){
			if(num%i==0){
				return false;
			}
		}
		
		return true;
	}// check end
	
	
	public static void main(String[] args) {
		
		//long num=13195;
		long num=600851475143L;
		long count=2;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(true){
			if(num%count==0){
				num=num/count;
				if(prime_check((int)count)){list.add((int)count);}
				
			}
			count++;
			if(num==1){break;}
		}//while end
		
		//System.out.println(list.size());
		System.out.println("list = ");
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+" ");
		}
		
	}//main
	
}//class
