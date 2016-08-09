package project_Euler;

public class P005_Smallest_multiple2 {
	
	static int[] checkIn=new int[20];
	static int[] total=new int[20];
	
	
	//이 함수는 들어온 값을 분석해서 인수를 구한다.
	public static void setCheck(int num){
		int temp=num;
		int div=2;
		
		for(int i=0;i<20;i++){
			checkIn[i]=0;
		}
		
		while(true){
			if(temp==1){break;}
			if(temp%div==0){
				
				temp=temp/div;
				checkIn[div-1]+=1;
				div=2;
				
			}else{
				div++;
			}
		}
	}//end function
	
	public static void checkTotal(){
		
		for(int i=0;i<20;i++){
		if(checkIn[i] > total[i]){
			total[i]+=(checkIn[i]-total[i]);
		}
		
		}//for
		
	}//end function
	
	public static void main(String[] args) {

		for(int i = 20; i>1;i--){
			setCheck(i);
			checkTotal();
		}
		
		int multiple=1;
		for(int i=0;i<20;i++){
			for(int j=0;j<total[i];j++){
				multiple*=(i+1);
			}
		}
		System.out.println(multiple);
	}//main
	
}//class end
