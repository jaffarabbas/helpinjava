/**
 * checker
 */
import java.util.Random;
import java.util.Scanner;
import java.util.*;

class random{
    Scanner sscn = new Scanner(System.in);
    Random new_number = new Random();

    int num1,rand_number;

    public int Number(){
        int number = sscn.nextInt();
        return number;
    }

    public void guess(){
        System.out.println("Enter number : ");
        rand_number = new_number.nextInt(10);
        while(true){
            num1 = Number();
            if(num1 == rand_number){
                System.out.println("Success!!!");
                break;
            }
            else{
                System.out.println("Retry!!!");
            }
        }
    }

    public random(){
        guess();
    }
}



public class checker {
    public static void main(String[] args) {
        random object = new random();
    }
}