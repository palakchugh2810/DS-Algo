/**
 * 
 */
package com.ciena.dashboard.service;

/**
 * @author palak
 *
 */

import java.util.*; 
  
class Solution { 
	/*public String largestNumber(final int[] A) {
		
		
    }*/
	public static <T> Object[] convertVectorToArray(Vector<T> vector) 
    { 
  
        // Converting Vector to Array 
        Object[] array = vector.toArray(); 
  
        return array; 
    } 
  
    // The main function that prints the  
    // arrangement with the largest value. 
    // The function accepts a vector of strings     
    static void printLargest(Vector<String> arr){ 
      
        Collections.sort(arr, new Comparator<String>(){ 
  
        // A comparison function which is used by  
        // sort() in printLargest() 
        @Override
        public int compare(String X, String Y) { 
          
        // first append Y at the end of X 
        String XY=X + Y; 
          
        // then append X at the end of Y 
        String YX=Y + X; 
          
        // Now see which of the two formed numbers  
        // is greater 
        return XY.compareTo(YX) > 0 ? -1:1; 
    } 
    }); 
          
    Iterator it = arr.iterator(); 
  
    while(it.hasNext()) 
        System.out.print(it.next()); 
      
    } 
      
    // driver program 
    public static void main (String[] args) { 
          
        Vector<String> arr; 
        arr = new Vector<>(); 
          
        //output should be 6054854654 
        arr.add("54"); 
        arr.add("546"); 
        arr.add("548"); 
        arr.add("60"); 
 Object[] objArray = convertVectorToArray(arr); 
        
        // Convert Object[] to String[] 
        String[] array = Arrays.copyOf(objArray, 
                                       objArray.length, 
                                       String[].class); 
        // Print the String Array 
        System.out.println("Array: "+ Arrays.toString(array)); 
        String str=Arrays.toString(array);
        int size = str.length();
        int [] arrNew = new int [size];
        for(int i=0; i<size; i++) {
        	arrNew[i] = Integer.parseInt(array[i]);
        }
       // largestNumber(arrNew);
        printLargest(arr); 
    } 
} 