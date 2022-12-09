import java.util.Scanner;

public class prime{

	public static void main(String[] args){
  			System.out.print("enter"+" "+"no:\n");
	
		
			int i=0,j,flag=0;
			Scanner input = new Scanner(System.in);
			int num=input.nextInt();
			for(i=2;i<=num;i++){
				for(j=2;j<=i/2;j++){
					if(i%j==0){
						flag=1;
					    break;
					}
				
				
				}
				if (flag==0)
					System.out.println(i+"is prime");
				flag=0;
			
			
			}
	}
}





