import java.util.Scanner;

public class palinstr{
	public static void main(String rgs[]){
		int i,j,flag=0;
		Scanner inp=new Scanner(System.in);
		System.out.print("enter the str:");
		String s=inp.nextLine();
		 j=s.length()-1;
		 for(i=0;i<j/2;i++,j--){
		 	if(s.charAt(i)!=s.charAt(j))
		 	{flag=1; break;}
		 
		 }
		 if(flag==1)
		 	System.out.println("not palindrome");
		else{
			System.out.println("palindrome");
		}
	}

}
