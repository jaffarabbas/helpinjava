/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Random;
import java.util.Scanner;

class Queue { 
    int front, rear, size; 
    int capacity; 
    int array[]; 
  
    public Queue(int capacity) 
    { 
        this.capacity = capacity; 
        front = this.size = 0; 
        rear = capacity - 1; 
        array = new int[this.capacity]; 
    } 
  
    // Queue is full when size becomes 
    // equal to the capacity 
    boolean isFull(Queue queue) 
    { 
        return (queue.size == queue.capacity); 
    } 
  
    // Queue is empty when size is 0 
    boolean isEmpty(Queue queue) 
    { 
        return (queue.size == 0); 
    } 
  
    
    // It changes rear and size 
    void Enqueue(int item) 
    { 
        if (isFull(this)) 
            return; 
        this.rear = (this.rear + 1) % this.capacity; 
        this.array[this.rear] = item; 
        this.size = this.size + 1; 
        System.out.println(item + " Enqueued to queue"); 
    } 
  
    //  remove an item from queue. 
    // It changes front and size 
    int  Dequeue() 
    { 
        if (isEmpty(this)) 
            return Integer.MIN_VALUE; 
  
        int item = this.array[this.front]; 
        this.front = (this.front + 1) % this.capacity; 
        this.size = this.size - 1; 
        return item; 
    } 
  
    //  get front of queue 
    int Get_Front() 
    { 
        if (isEmpty(this)) 
            return Integer.MIN_VALUE; 
  
        return this.array[this.front]; 
    } 
  
    //  get rear of queue 
    int Get_Rear() 
    { 
        if (isEmpty(this)) 
            return Integer.MIN_VALUE; 
  
        return this.array[this.rear]; 
    } 

    // print the queue

    public void print(Queue queue){
        if(!isEmpty(queue)){
            System.out.print("[");
            for(int i = front;i<=rear;i++){
                System.out.print(" "+ array[i]);
            }
            System.out.println(" ]");
        }
    }
} 
 

class market{
    Queue queue = new Queue(7);
    Scanner scn = new Scanner(System.in);
    float Value1,Value2;

    void ValueCheck(){
        queue.Enqueue(44);
        queue.Enqueue(55);
        queue.Enqueue(99);
        queue.Enqueue(94);
        queue.Enqueue(66);
        queue.Enqueue(77);
        queue.Enqueue(18);
        float avgerage=0;
        System.out.println("Comparing Values");
        Value1 = 60;
        Value2 = 40;
        queue.print(queue);
        for(int i  = 0;i<queue.capacity;++i){
            avgerage+=queue.Dequeue();
        }
        float result = avgerage/queue.capacity;
        if(result > Value1){
            System.out.println("Value2 : "+Value2+"\nValue1 : "+Value1+"\nCompared Value : "+result);
            System.out.println("Buy this Stocks");
        }else if(result <= Value2){
            System.out.println("Value2 : "+Value2+"\nValue1 : "+Value1+"\nCompared Value : "+result);
            System.out.println("Don't Buy!!");
        }
    }
    void Update(){
       while(!queue.isEmpty(queue)){
           queue.Dequeue();
           System.out.println("Filtering!!!");
       }
       if(queue.isEmpty(queue)){
           while (!queue.isFull(queue)){
               System.out.println("Add new Data");
               int num = scn.nextInt();
               queue.Enqueue(num);
           }
       }
    }
    public market(){
        System.out.println("Select \n1)Checking Values\n2)Update\n3)Exit");
        while(true){
            System.out.print("Enter Number : ");
            int number = scn.nextInt();
            switch (number){
                case 1:
                    ValueCheck();
                    break;
                case 2:
                    Update();
                    break;
                default:
                    System.out.println("Enter accurate number!");
                    break;
            }
            if(number == 3){
                break;
            }
        }
    }
}




//* b
class b{
    Queue queue = new Queue(7);
    Scanner scn = new Scanner(System.in);
    public float BuyLimit,saleLimit;
    public void BuyingOrder(){
        System.out.println("Buy New Item to Stocks ");
        int num  = scn.nextInt();
        if(num <= BuyLimit){
            queue.Enqueue(num);
            System.out.println("Stock Brought!!!!!!!!!!!!");
        }else{
            System.out.println("Greater then Limit Prise");
        }
    }
    public void SaleingOrder(){
        System.out.println("Sell New Item form the Stocks");
        int SailedCheck  = queue.Dequeue();
        if(SailedCheck >= saleLimit){
            System.out.println("Stock Sailed");
        }else{
            queue.Enqueue(SailedCheck);
            System.out.println("Lower Then Limit");
        }
    }
    public b(){
        this.BuyLimit = 500;
        this.saleLimit = 100;
        tester();
    }
    public void tester(){
        System.out.println("1)Buy new Stocks\n2)Sell new Stocks\n3)Show Stock\n4)Exit");
        while(true){
            System.out.print("Enter Number : ");
            int number = scn.nextInt();
            switch (number){
                case 1:
                    BuyingOrder();
                    break;
                case 2:
                    SaleingOrder();
                    break;
                case 4:
                    queue.print(queue);
                    break;
                default:
                    System.out.println("Error!");
                    break;
            }
            if(number == 4){
                break;
            }
        }
    }
}

public class question_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("1)Part A \n2)Part B\n3)Exit");
        while(true){
            System.out.print("Enter Number : ");
            int number = scn.nextInt();
            switch (number){
                case 1:
                    market stock = new market();
                    break;
                case 2:
                    b NYC = new b();
                    break;
                default:
                    System.out.println("Error!");
                    break;
            }
            if(number == 3){
                break;
            }
        }
    }
}
