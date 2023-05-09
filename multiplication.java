import java.util.*;
public class multiplication{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row of 1st square matrix");
		int row1=sc.nextInt();
		System.out.println("Enter the column of 1st square matrix");
		int col1=sc.nextInt();
		System.out.println("Enter the 1st Matrix");
		int arr1[][]=new int[row1][col1];
		for(int i=0;i<row1;i++){
			for(int j=0;j<col1;j++){
				arr1[i][j]=sc.nextInt();
				}
			}
		System.out.println("Enter the row of 2nd square matrix");
		int row2=sc.nextInt();
		System.out.println("Enter the column of 2nd square matrix");
		int col2=sc.nextInt();
		System.out.println("Enter the 2nd Matrix");
		int arr2[][]=new int[row1][col1];
		for(int i=0;i<row2;i++){
			for(int j=0;j<col2;j++){
				arr2[i][j]=sc.nextInt();
				}
			}
			
		System.out.println("Printing product of matrix 1 & 2");
		for(int i=0;i<row2;i++){
			for(int j=0;j<col2;j++){
				System.out.print(arr1[i][j]*arr2[i][j]+" ");
				}
				System.out.println();
			}
			
		}
	}