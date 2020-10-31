import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class q  
{  
    public static void main(String[] args) {  
        int rows, cols, sumRow,numcol,count;  
        Scanner scn = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter number of Questions !!!");
        //number of question
         numcol = scn.nextInt();
          int a[][]= new int[numcol][3];
          for(int i = 0 ; i<numcol;i++){
            for(int j = 0 ; j<3 ; j++){
              //for random desijon making for question like it will insert 0 and 1 Randomly 
              a[i][j] = rand.nextInt(2);
            }
          }
          for(int i = 0 ; i<numcol;i++){
              System.out.print("Question No  "+(i+1)+" : ");
            for(int j = 0 ; j<3 ; j++){
              System.out.print(" "+a[i][j]+" ");//print question
            }
            System.out.println();
          }
          rows = a.length; // rows length
          count = 0;// counter for question
          for(int i = 0; i < rows; i++){  
              sumRow = 0;  
              for(int j = 0; j < 3; j++){  
                sumRow = sumRow + a[i][j];//sum row   
              }  
              if(sumRow > 1){//desion
                 count++;
              }
        }  
        System.out.println("\nTotal Question: "+count);
    }  
}  