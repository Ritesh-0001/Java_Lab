// design a java prgm with one method to put even and odd element of an array in two separate arrays and another method to find to transpose of matrix by implementing the concept of overriding.

import java.util.*;
public class matrix
{
    static void even_odd(){
        int array[] = {13,45,50,24,86,98,56};
        int e=0,o=0,j=0,k=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
               
                e++;
            }
            else{
               
                o++;
            }
            }
        int even[]=new int[e];
        int odd[]=new int[o];

        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                even[j++]=array[i];
               
            }
            else{
                odd[k++]=array[i];
               
            }
            }
            System.out.println("Printing even elements:");
            for(int i=0;i<even.length;i++){
                System.out.println(even[i]);
            }
            System.out.println("Printing odd elements:");
            for(int i=0;i<odd.length;i++){
                System.out.println(odd[i]);
            }
        }
    public static void main(String args[]){
            even_odd();
            int array[][]={{1,2,3},{4,5,6},{7,8,9}};
            int transpose[][]=new int[3][3];  //3 rows and 3 columns  
    
            //Code to transpose a matrix  
            for(int i=0;i<3;i++){    
            for(int j=0;j<3;j++){    
            transpose[i][j]=array[j][i];  
            }    
            }    
            
            System.out.println("Printing Matrix without transpose:");  
            for(int i=0;i<3;i++){    
            for(int j=0;j<3;j++){    
            System.out.print(array[i][j]+" ");    
            }    
            System.out.println();//new line    
            }    
            System.out.println("Printing Matrix After Transpose:");  
            for(int i=0;i<3;i++)
            {    
                for(int j=0;j<3;j++)
                {    
                    System.out.print(transpose[i][j]+" ");    
                }    
                System.out.println();//new line    
            }    

    }

}  
        
    
    
    
 