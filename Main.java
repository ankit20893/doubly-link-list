/**
 * Created by Ankit on 25-06-2015.
 */
import java.util.*;
public class Main {
   static int choice;
   static Object obj;

    public static void main(String arg[])
    {
        LinkList list1=new LinkList();


        boolean menu=true;
        //choice=sc1.nextInt();
        while(menu){
            System.out.println("\n 1.INSERT THE DATA INTO LIST");
         System.out.println("\n 2.INSERT AT BEGINNING OF THE LIST");
            System.out.println("\n 3.INSERT AT MIDDLE OF THE LIST");
            System.out.println("\n 4.INSERT AT END OF THE LIST");
            System.out.println("\n 5.DELETE NODE FROM BEGINNING");
            System.out.println("\n 6.DELETE NODE FROM MIDDLE");
            System.out.println("\n 7.DELETE NODE FROM END");
            System.out.println("\n 8.PRINT THE LIST");
            System.out.println("\n 9.EXIT FROM THE MENU");
            System.out.println("PLZ Enter Your Choice");
            choice=LinkList.sc.nextInt();
            switch(choice){
                case 1:System.out.println("plz insert the data");
                    obj=LinkList.sc.nextInt();
                    list1.insert(obj);
                    break;
                case 2:System.out.println("plz insert the data");
                    obj=LinkList.sc.nextInt();
                    list1.insertFirst(obj);
                    break;
                case 3:System.out.println("plz insert the data");
                    obj=LinkList.sc.nextInt();
                    list1.insertMiddle(obj);
                    break;
                case 4:System.out.println("plz insert the data");
                    obj=LinkList.sc.nextInt();
                    list1.insertLast(obj);
                    break;
                case 5:
                    list1.deleteFirst();
                    break;
                case 6:
                    list1.deleteMiddle();
                    break;
                case 7:;
                    list1.deletedLast();
                    break;
                case 8:;
                    list1.print();
                    break;
                case 9:System.exit(0);
                    break;
                default:System.out.println("Sorry, you have entered wrong choice");

            }
        }
    /*
      LinkList list1=new LinkList();
        LinkList list2=new LinkList();
        list1.insert("Hello");
        list1.insert("world");
        list1.insert("ankit@gmail.com");
        list1.fetch(1);
        list1.print();

*/

    }
}
