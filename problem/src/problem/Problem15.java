package problem;
import java.util.Scanner;
public class Problem15 {
/*	
	난수를 발생하여 발생된 숫자를 맞추는 게임 프로그램

    난수발생) 1. int a=(int)(Math.random()*100) : 0 - 99 사이의 난수

              2. ① import java.util.Random;

                 ② Random 변수1 = new Random();

                 ③ int 변수2 = 변수1.nextInt(최대값); 

                          ==>  0 ~ (최대값 - 1)사이의 임의의 수


	*/
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("*** 난수가 발생하였습니다...맞추어 보세요...*** ");  
		
		int a = (int)(Math.random()*100);
		int num = 0;
		int count = 0;
		
		System.out.println("정답출력 : " + a);
		
		while(a != num){
		
			num = in.nextInt();
			
			if(num < a) {
				System.out.println("컴퓨터의 숫자가 더 큽니다..");
			}
			
			if(num > a){
				System.out.println("컴퓨터의 숫자가 더 작습니다..");
			}
			
			count++;
	
		}
		
		System.out.printf("추카추카...%d번만에 맞추셨습니다...",count);
		
		
		
		
		
		
	}
	
	
	
}
