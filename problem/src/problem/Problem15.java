package problem;
import java.util.Scanner;
public class Problem15 {
/*	
	������ �߻��Ͽ� �߻��� ���ڸ� ���ߴ� ���� ���α׷�

    �����߻�) 1. int a=(int)(Math.random()*100) : 0 - 99 ������ ����

              2. �� import java.util.Random;

                 �� Random ����1 = new Random();

                 �� int ����2 = ����1.nextInt(�ִ밪); 

                          ==>  0 ~ (�ִ밪 - 1)������ ������ ��


	*/
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("*** ������ �߻��Ͽ����ϴ�...���߾� ������...*** ");  
		
		int a = (int)(Math.random()*100);
		int num = 0;
		int count = 0;
		
		System.out.println("������� : " + a);
		
		while(a != num){
		
			num = in.nextInt();
			
			if(num < a) {
				System.out.println("��ǻ���� ���ڰ� �� Ů�ϴ�..");
			}
			
			if(num > a){
				System.out.println("��ǻ���� ���ڰ� �� �۽��ϴ�..");
			}
			
			count++;
	
		}
		
		System.out.printf("��ī��ī...%d������ ���߼̽��ϴ�...",count);
		
		
		
		
		
		
	}
	
	
	
}
