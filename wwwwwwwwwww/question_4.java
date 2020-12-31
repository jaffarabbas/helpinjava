import java.util.Scanner;


class LinkedList{

    public Node head;
    static class Node{
        int data;
        Node node;
        public Node(int d){
            this.data = d;
            Node node = null;
        }
    }
    //print the list
    public void print(){
        Node value = head;
        System.out.print("[");
        while(value!=null){
            System.out.print(" "+value.data);
            value = value.node;
        }
        System.out.println(" ]");
    }
    //List size
    public int listsize(){
        Node value = head;
        int count=0;
        while (value!=null){
            value = value.node;
            count++;
        }
        return (count);
    }
   
    public void insertBeg(int newData){
        Node newNode = new Node(newData);
        newNode.node = head;
        head = newNode;
    }
   
    public void InsertList(int index,int newData){
        if(index <= listsize()){
            if(index <= 0){
                insertBeg(newData);
            }else if(index == listsize()){
                InsertAtLast(newData);
            }else {
                Node newNode = new Node(newData);
                Node p = head;int count = 0;
                while(count!=index-1){
                    p = p.node;
                    count++;
                }
                newNode.node = p.node;
                p.node = newNode;
            }
        }else{
            System.out.println("Out of Bound Index must fill index : "+listsize());
        }
    }

    public void InsertAtLast(int newData){
        if(head == null){
            head = new Node(newData);
            return;
        }
        Node newNode = new Node(newData);
        newNode.node = null;
        Node last = head;
        while (last.node!=null){
            last = last.node;
        }
        last.node = newNode;
    }
  
    public void SwapAdjesunt(){
        Node pointer = head;
        while (pointer != null && pointer.node != null) {
            int temp = pointer.data;
            pointer.data = pointer.node.data;
            pointer.node.data = temp;
            pointer = pointer.node.node;
        }
    }
}


public class question_4 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scn = new Scanner(System.in);
        System.out.println("Number of Nodes");
        int numberOfNode = scn.nextInt();
        System.out.println("Enter list elements : ");
        for(int i = 0 ; i < numberOfNode ; ++i){
            int num  =scn.nextInt();
            list.InsertList(i,num);
        }
        System.out.println("List before Adjusting");
        list.print();
        list.SwapAdjesunt();
        System.out.println("List After Adjusting");
        list.print();
    }
}
