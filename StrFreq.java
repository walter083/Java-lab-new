import java.util.Scanner;
public class StrFreq{
	public static void main(String[] args){
		
		String str = String.join(" ", args);
		System.out.println(str);
	
		
		String b="";
		int len=str.length();
		for(int i=0;i<len;i++){
			int count=0;
			if (!b.contains(Character.toString(str.charAt(i))))
			{
				b=b+str.charAt(i);
				for(int j=0;j<len;j++){
	
					if(str.charAt(i)==str.charAt(j)){
						count++;
		
					}
				}
		
			
				System.out.println(str.charAt(i)+" is repeating "+count+" times");
				count=0;
			}
	   }
	}
}
