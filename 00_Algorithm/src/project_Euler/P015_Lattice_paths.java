package project_Euler;

/*
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.

How many such routes are there through a 20×20 grid?
 * */

public class P015_Lattice_paths {
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();

		long[][] arr=new long[21][21];
		
		arr[0][0]=0;
		for(int i=1;i<21;i++){
			arr[0][i]=1;
			arr[i][0]=1;
		}
		
		for(int i=1;i<21;i++){
			for(int j=1;j<21;j++){
				arr[i][j]+=arr[i-1][j]+arr[i][j-1];
				
			}//for inner
		}//for out
		//long start = System.currentTimeMillis();
		long end = System.currentTimeMillis();
		System.out.println("수행시간 : " + (end - start));
		
		System.out.println(arr[20][20]);
		
		
	}//main
	
	
}//class end
