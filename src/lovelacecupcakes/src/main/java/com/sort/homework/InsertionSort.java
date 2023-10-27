package com.sort.homework;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;



public class InsertionSort {

  public static int count = 0;
  public static void main(String[] args) {
    String fileName =
      "/Users/bryanheraz/Documents/GitHub/Lovelace-Cupcakes-Insertion-Sort/src/lovelacecupcakes/target/classes/com/sort/homework/cupcake_3906.json";
    // String fileName =
    //   "/Users/bryanheraz/Documents/GitHub/Lovelace-Cupcakes-Insertion-Sort/src/lovelacecupcakes/target/classes/com/sort/homework/cupcake_test_5.json";

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

  // get array of cupcake names
  public static String[] nameArray(JSONArray cupcakeArray) {
    String[] arr = new String[cupcakeArray.size()];

    // get names from json object
    for (int i = 0; i < cupcakeArray.size(); i++) {
      JSONObject o = (JSONObject) cupcakeArray.get(i);
      String name = (String) o.get("name");
      arr[i] = name;
    }
    return arr;
  }

  // insertion sort array 
  public static void insertSort(String[] cupcakeArrayStrings) {
    int i;
    int j;
    for (i = 1; i < cupcakeArrayStrings.length; i++) {
      String currentCupcake = cupcakeArrayStrings[i];
      j = i - 1;

      //In this while loop, elements will will be compared and shift to the right 
      // the order is correct
      while (j >= 0 && currentCupcake.compareTo(cupcakeArrayStrings[j]) < 0) {
        cupcakeArrayStrings[j + 1] = cupcakeArrayStrings[j];
        j--;
        count++;
      }
      cupcakeArrayStrings[j + 1] = currentCupcake;

    }
  }
}