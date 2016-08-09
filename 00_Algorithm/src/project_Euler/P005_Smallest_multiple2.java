package project_Euler;

import java.util.HashMap;

public class P005_Smallest_multiple2 {
	
	static HashMap<Integer, Integer> store = new HashMap<Integer, Integer>();
	
	static int[] checkIn=new int[20];
	static int[] total=new int[20];
	
	
	//�� �Լ��� ���� ���� �м��ؼ� �μ��� ���Ѵ�.
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
				
				//System.out.println("����:"+temp);
			}else{
				div++;
			}
			
		}
	}//end function
	
	public static void checkTotal(){
		
		for(int i=0;i<20;i++){
		if(checkIn[i] == total[i] || checkIn[i] < total[i]){
			//System.out.println("����");
		}else if(checkIn[i] > total[i]){
			total[i]+=(checkIn[i]-total[i]);
		}
		
		}//for
		
	}//end function
	
	public static void main(String[] args) {
		
		
		//setCheck(20); //� ������ �μ��� �迭�� �����ϴ� �Լ�
		
		for(int i = 20; i>1;i--){
			setCheck(i);
			checkTotal();
		}
		
		int multiple=1;
		//System.out.print("��=");
		for(int i=0;i<20;i++){
			//System.out.print("["+(i+1)+"]=");
			//System.out.print(total[i]);
			//System.out.print("�� ");
			for(int j=0;j<total[i];j++){
				multiple*=(i+1);
			}
		}
		System.out.println(multiple);
	}//main
	
}//class end
