package com.sort.homework;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;


public class InsertionSort {
    public static void main (String [] args){
        String fileName =
      "/Users/jerom/Documents/GitHub/class-java/sort/demo/src/main/java/com/sort/cupcake_3906.json";
    // String fileName =
    //   "/Users/jerom/Documents/GitHub/class-java/sort/demo/src/main/java/com/sort/cupcake_10.json";

    // read cupcake names
    JSONArray cupcakeArray = JSONFile.readArray(fileName);
    String[] cupcakeNameArray = nameArray(cupcakeArray);
    System.out.println(cupcakeNameArray);

    // print unsorted list
    System.out.println("----- Unsorted array -----");
    print(cupcakeNameArray);

    // sort
    insertSort(cupcakeNameArray);

    // print sorted list
    System.out.println("----- Sorted array----- ");
    print(cupcakeNameArray);

    // print statistics
    System.out.println("----- Statistics -----");
    System.out.printf("Size of array = %d\n", cupcakeNameArray.length);
    System.out.printf("Count = %d\n", count);
  }

  

// print cupcake array
  public static void print(String[] cupcakeNameArray) {
    System.out.printf("Number\tName\n");
    System.out.printf("------\t---------------\n");
    for (int i = 0; i < cupcakeNameArray.length; i++) {
      System.out.printf("%04d\t%s\n", i, cupcakeNameArray[i]);
         }
    }
    
    // insertion sort array 
    public static void insertSort(String[] cupcakeArrayStrings){
            int i ;
            int j;
            for (i = 1; i < cupcakeArrayStrings.length; i++){
                String currentCupcake = cupcakeArrayStrings[i]:
                j = i - 1;
                
            }


            
        }
    }


