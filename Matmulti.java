import java.util.Scanner;

public class Matmulti{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int i,j,a,b,x,y,k,sum;
		System.out.print("enter no of rows of matrix 1:");
		a=input.nextInt();
		System.out.print("enter no of colunms of matrix 1: ");
		b=input.nextInt();
		
		int mat1[][]=new int [a][b];
		for (i=0;i<a;i++){
			for(j=0;j<b;j++){
				mat1[i][j]=input.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("enter the no of rowsof mat 2:");
		x=input.nextInt();
		System.out.println("enter the no of columns of mat 2:");
		y=input.nextInt();
		int mat2[][]=new int [x][y] ;
		System.out.println("enter the elememts ");
		for(i=0;i<x;i++){
			for(j=0;j<y;j++){
				mat2[i][j]=input.nextInt();
			
			}
			System.out.println();
		}
		
		if (b!=x){
			System.out.println("multipltication not possibble");
		}
		else{
			System.out.print("product is:");
			for(i=0;i<a;i++){
				for(j=0;j<y;j++){
					sum=0;
					for(k=0;k<b;k++){
						sum+=mat1[i][k]*mat2[k][j];
					
					}
					System.out.print(sum+" ");
				}
				System.out.println();
			}
		
		}
		
	}
}
