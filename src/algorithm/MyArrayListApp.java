/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import java.util.Collections;

/**
 *
 * @author HP
 */
public class MyArrayListApp {
    
      public static void main(String[] args) {
          
          MyArrayList<String> myList;
          myList = new MyArrayList<String>();
          
                  //TAKS2: add at least 5 elements of String type in your collection
        
         myList.add(new String("United States"));
        myList.add(new String("Portugal"));
        myList.add(new String("Russia"));
        myList.add(new String("Argentina"));
        myList.add(new String("Belgium"));
       
        //TASK3: Print the elements from your collection
         System.out.println("The elements are: " +myList.toString());

        //TASK4: call the bubbleSort() method
         
         myList.bubbleSort();

        //TASK5: Print again the elements. Now your colection should be sorted
        
        System.out.println("The elements after  Bubble sort are: " +myList.toString());

        //TASK7: call the simplebubblesort() method and check if it works correct
        //*--------------------------------------------
        // Shuffle the collection  before sorting it
        //*--------------------------------------------
        Collections.shuffle(myList);

        System.out.println("The elements are: " +myList.toString());

        myList.bubbleSort();
        
          System.out.println("The elements after Simple Bubble sort are: " +myList.toString());
          
          
        // TODO code application logic here
    }
}
