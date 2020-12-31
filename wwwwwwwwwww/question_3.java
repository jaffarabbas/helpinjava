import java.util.Scanner;

class LinkedList{
   public Node head;
   static class Node{
       int nodeData;
       Node nextNode;
       public Node(int d){
           this.nodeData = d;
           Node nextNode = null;
       }
   }
   public void print(){
       Node val = head;
       System.out.print("[");
       while(val!=null){
           System.out.print(" "+val.nodeData);
           val = val.nextNode;
       }
       System.out.println(" ]");
   }
   public int Size(){
       Node val = head;
       int count=0;
       while (val!=null){
           val = val.nextNode;
           count++;
       }
       return (count);
   }
   public boolean isEmpty(){
       return (Size()<=0);
   }
   public boolean isFull(){
       return (Size()>0);
   }
   public int ListPeek(){
       if(!isEmpty()){
           return head.nodeData;
       }else{
           return 0;
       }
   }
   public int ListPeekFirst(){
       if(!isEmpty()){
           return head.nodeData;
       }else{
           return 0;
       }
   }
   public int ListPeekLast(){
       Node val = head;
       Node lastValue = head.nextNode;
       while (lastValue!=null){
           val = val.nextNode;
           lastValue = lastValue.nextNode;
       }
       return val.nodeData;
   }
   public void InsertAtBeginning(int newData){
       Node newNode = new Node(newData);
       newNode.nextNode = head;
       head = newNode;
   }
   public void InsertList(int index,int newData){
       if(index <= Size()){
           if(index <= 0){
               InsertAtBeginning(newData);
           }else if(index == Size()){
               InsertAtLast(newData);
           }else {
               Node newNode = new Node(newData);
               Node p = head;int count = 0;
               while(count!=index-1){
                   p = p.nextNode;
                   count++;
               }
               newNode.nextNode = p.nextNode;
               p.nextNode = newNode;
           }
       }else{
           System.out.println("Out of Bound Index must fill index : "+Size());
       }
   }
   public void InsertAtLast(int newData){
       if(head == null){
           head = new Node(newData);
           return;
       }
       Node newNode = new Node(newData);
       newNode.nextNode = null;
       Node last = head;
       while (last.nextNode!=null){
           last = last.nextNode;
       }
       last.nextNode = newNode;
   }
   public void DeleteFirstNode(){
       Node val = head;
       head = head.nextNode;
       val.nextNode = null;
   }
   public void DeleteWithValue(int val){
       Node ptr = head;
       Node ForwardPointer = head.nextNode;
       if(head.nodeData == val){
           System.out.println("Done");
           DeleteFirstNode();
       }else {
           while (ForwardPointer.nodeData != val && ForwardPointer.nextNode != null) {
               ptr = ptr.nextNode;
               ForwardPointer = ForwardPointer.nextNode;
           }
           if (ForwardPointer.nodeData == val) {
               ptr.nextNode = ForwardPointer.nextNode;
               ForwardPointer.nextNode = null;
           } else {
               System.out.println("Value Not Found");
           }
       }
   }
   public int Search(int val){
       Node ptr = head;int count=0;
       while (ptr.nodeData != val && ptr.nextNode!=null){
           ptr = ptr.nextNode;
           count++;
       }
       if(ptr.nodeData == val){
           return count;
       }else{
           return 0;
       }
   }
   public int SearchValue(int val){
       Node ptr = head;int count=0;
       while (ptr.nodeData != val && ptr.nextNode!=null){
           ptr = ptr.nextNode;
           count++;
       }
       if(ptr.nodeData == val){
           return ptr.nodeData;
       }else{
           return 0;
       }
   }
   public void SortLinkedList(int numberOfNodes){
       Node currentNode;
       Node newNode;
       int i,j;
       int temp;
       for(i=numberOfNodes-2;i>=0;i--){
           currentNode = head;
           newNode = currentNode.nextNode;
           for(j=0;j<=i;j++){
               if(currentNode.nodeData > newNode.nodeData){
                   temp = currentNode.nodeData;
                   currentNode.nodeData = newNode.nodeData;
                   newNode.nodeData = temp;
               }
               currentNode = newNode;
               newNode = newNode.nextNode;
           }
       }
   }
   public void mergeLinks(LinkedList list,LinkedList list2,LinkedList list3){
         Node ptr = list.head;
         while (ptr.nextNode!=null){
             ptr = ptr.nextNode;
         }
         ptr.nextNode = list2.head;
         if(list3.head == null){list3.head = list.head;}
   }
   public void EvenOdds(){
       Node ptr = head;
       int even=0,odd=0;
       while (ptr.nextNode!=null){
           if(ptr.nodeData%2==0){
               even++;
           }else{
               odd++;
           }
           ptr = ptr.nextNode;
       }
       System.out.println("Even : "+even+"\nOdd : "+odd);
   }
}


public class question_3 {
   public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    LinkedList list = new LinkedList();
    LinkedList list2 = new LinkedList();
    LinkedList thirdNode = new LinkedList();
    int numberOfNode = 5;
    list.InsertList(0, 66);
    list.InsertList(1, 7);
    list.InsertList(2, 2);
    list.InsertList(3, 67);
    list.InsertList(4, 99);
    list2.InsertList(0, 5);
    list2.InsertList(1, 6);
    list2.InsertList(2, 4);
    list2.InsertList(3, 50);
    list2.InsertList(4, 100);

    System.out.println("List 1 : ");
    list.print();
    System.out.println("List 2 : ");
    list2.print();
    //Sort
    System.out.println("Sort Them individually");
    list.SortLinkedList(numberOfNode);
    list2.SortLinkedList(numberOfNode);
    System.out.println("List 1 After Sorting: ");
    list.print();
    System.out.println("List 2 After Sorting: ");
    list2.print();
    System.out.println("Merge them : ");
    thirdNode.mergeLinks(list,list2,thirdNode);
    thirdNode.print();
    System.out.println("Sort Them Again : ");
    thirdNode.SortLinkedList(numberOfNode*2);
    thirdNode.print();
    System.out.println("Enter 1)Display List\n2)Delete User define val\n3)Search Define val\n4)count Odd and Even nodes\n5)Exit");
    while(true){
        System.out.print("Enter Number : ");
        int number = scn.nextInt();
        switch (number){
            case 1:
                thirdNode.print();
                break;
            case 2:
                System.out.print("Enter Number : ");
                int num = scn.nextInt();
                thirdNode.DeleteWithValue(num);
                break;
            case 3:
                System.out.print("Enter Number : ");
                int num2 = scn.nextInt();
                System.out.println(thirdNode.SearchValue(num2)+" At index : "+thirdNode.Search(num2));
                break;
            case 4:
                thirdNode.EvenOdds();
                break;
            default:
                System.out.println("Error!");
                break;
        }
        if(number == 5){
            break;
        }
    }
   }
}
