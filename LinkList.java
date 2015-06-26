/**
 * Created by Ankit on 25-06-2015.
 */
import java.util.*;
public class LinkList {
    private Node head;
    private Node tail;

    Node currentNode=new Node();
    Node tempNode=new Node();
    int position;
    int i=1;
 public static Scanner sc=new Scanner(System.in);
public void insert(Object o){
    Node someNode=new Node();
    someNode.object=o;
    if(head==null){
        someNode.next=null;
        someNode.previous=null;
        head=someNode;

        tail=someNode;
    }
    else {
        tail.next=someNode;
        someNode.previous=tail;
        someNode.next=null;
        tail=someNode;
    }
}
    public void insertFirst(Object o){
        Node someNode1=new Node();
        someNode1.object=o;
        someNode1.next=head;
        someNode1.previous=null;
        head.previous=someNode1;
        head=someNode1;
    }
    public void insertMiddle(Object o){
        Node someNode2=new Node();
     someNode2.object=o;
        System.out.println("plz enter the position");
        position=sc.nextInt();
        currentNode=head;
      while (position!=i+1){
          currentNode=currentNode.next;
          i++;
      }
        if(position==i+1){
         someNode2.previous=currentNode;
            someNode2.next=currentNode.next;
            currentNode.next=someNode2;
            currentNode=someNode2.next;
            currentNode.previous=someNode2;
        }
    }
    public void insertLast(Object o){
        Node someNode3=new Node();
        someNode3.object=o;
        someNode3.next=null;
        tail.next=someNode3;
        someNode3.previous=tail;
        tail=someNode3;
    }


   // code for deleting the node

    public void deleteFirst(){
        tempNode=head;
        head=head.next;
        System.out.println("deleted object"+tempNode.object);

    }

public void deleteMiddle(){
    currentNode=head;
    System.out.println("plz enter the position where you want to delete the node");
    position=sc.nextInt();
    while(position!=i+1){
        currentNode=currentNode.next;
        i++;
    }
    if(position==i+1){
        tempNode=currentNode.next;
        currentNode.next=tempNode.next;
        tempNode.next=currentNode;
        currentNode.previous=tempNode.previous;
        System.out.print("deleted object"+tempNode.object);
    }
}
public void deletedLast(){
  tempNode=head;
    while(tempNode.next!=tail){
        tempNode=tempNode.next;
    }
    tail=tempNode;
    tempNode=tempNode.next;
    tail.next=null;
    System.out.println("deleted object"+tempNode.object);
}











    //for fetching object of the list
    public Object fetch(int index){
      Node wantedNode=head;
        for(int i=0;i<index;i++){
            if(wantedNode==null){
                return null;
            }
          wantedNode=wantedNode.next;
        }
        return wantedNode.object;
    }

public void print(){
    Node printNode=new Node();
    printNode=head;
    while(printNode != null){

        System.out.print(printNode.object +"\n");
printNode=printNode.next;
    }


}

}
