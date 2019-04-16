package ArrayConcept;

import java.util.ArrayList;

public class ArrayListConcept {


    public static void main(String [] args) {

     ArrayList <String> arr = new ArrayList<String>();

            arr.add("Java");
            arr.add("Selenium");
            arr.add("Ruby");
            arr.add("Pearl");
            arr.add("Python");
            arr.add("Cucumber");

            System.out.println(arr.size());

           // System.out.println(arr.get(3));

            for(int i = 0; i<arr.size();i++){

                System.out.println(arr.get(i));
            }

            arr.add("Automation");

            System.out.println(arr.size());

                for(int i = 0;i<arr.size();i++){

                    System.out.println(arr.get(i));
                }

            arr.remove(2);

            System.out.println(arr.size());



    }


    }

