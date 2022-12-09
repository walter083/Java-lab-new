import java.util.Scanner;

public class Fibonacci{

	public static void main(String[] args){
  			System.out.print("enter no:");
	
		
			int i=0,a=0,b=1,c;
			Scanner input = new Scanner(System.in);
			int num=input.nextInt();
			
			System.out.println("the fibonacci series is ");
			if(num==1){
				System.out.println(a);
			
			}
			else if(num==0){
				System.out.println("none");
			}
			
			else{
			System.out.println(a);
			System.out.println(b);
			for(i=0;i<num-2;i++){
				c=a+b;
				System.out.println(c);
				a=b; b=c;}
				}
	}
}





