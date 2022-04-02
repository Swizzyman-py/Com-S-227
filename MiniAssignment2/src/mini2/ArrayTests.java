package mini2;
import mini2.ArrayAdventures; 
public class ArrayTests 
{ 
  public static void main(String[] args) 
  { 
    // a sample test of lastIndexOf method 
    int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }; 
    ArrayAdventures.remove(arr, 3);  
    System.out.println("0 1 2 4 5 6 7 8 9 0");
    
    ArrayAdventures.removeAndShiftUp(arr, 3);
    System.out.println("0 0 1 2 4 5 6 7 8 9");
    
    int[] runArray = {0, 0, 0 , 1, 2 ,3 ,4 ,5 ,5 ,5 ,6 ,7 ,8, 9, 9, 9, 9};
    
    boolean[] myRuns = ArrayAdventures.findRuns(runArray);
    for (boolean element: myRuns) {
        System.out.print(element + " ");
    }
    System.out.print("\n");
    
    ArrayAdventures.removeOddElements(arr);
    
    int[][] arr2D = {{ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 },
    			   { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 },
    			   { 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 }};
    
    System.out.println(ArrayAdventures.toString2D(arr2D));
    
  } 
} 