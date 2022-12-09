import java.util.Scanner;

public class Shps{
	public static void main(String[] args){
	
		Scanner inp=new Scanner(System.in);
		System.out.print("1.rectangle\n2.tringle\n3.circle\nenter choice:");
		int choice=inp.nextInt();
		switch(choice){
			case 1:Rectangle r=new Rectangle();
		  			System.out.println("no of sides:"+r.noofsides());
		  			break;
		  	case 2:Triangle t=new Triangle();
		  			System.out.println("no of sides:"+t.noofsides());
		  			break;
		  	case 3:Circle c=new Circle();
		  			System.out.println("no of sides:"+c.noofsides());
		  			break;
			default :System.out.println("invalid");
		  			break;
		}
		
	}
}
 class Shapes{
 
 	 Shapes(){}
 }
 class Rectangle extends Shapes{
 	int sides=4;
 	int noofsides(){
 		return sides;
 	}
 }
class Triangle extends Shapes{
 	int sides=3;
 	int noofsides(){
 		return sides;
 	}
 }
class Circle extends Shapes{
 	int sides=1;
 	int noofsides(){
 		return sides;
 	}
 }
