package ArrayConcept;

import java.util.LinkedList;

public class LinkedListConcept {


    public static void main(String [] args){

       LinkedList <String> linkedList  = new LinkedList<String>();

                linkedList.add("Java");
                linkedList.add("Selenium");
                linkedList.add("UFT");
                linkedList.add("Pearl");
                linkedList.add("Python");
                linkedList.add("Ruby");

                System.out.println(linkedList.size());

                 for(int i = 0; i<=linkedList.size();i++){

                System.out.println(linkedList.get(i));
        }
                 linkedList.addFirst("Automation");
                linkedList.addLast("Test");

                for(int i = 0; i<=linkedList.size();i++){

                 System.out.println(linkedList.get(i));
        }
                 linkedList.remove(3);


                for(int i = 0; i<=linkedList.size();i++){

                    System.out.println(linkedList.get(i));
                }


    }
}
