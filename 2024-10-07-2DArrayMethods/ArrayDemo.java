 import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()
    int [] arr0 = {1,2,3,4};
    int [] arr4 = {};
    int [][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
    int [][] arr2 = {{1,2,3,6,7},{4,5,6},{7,9}};
    int [][] arr3 = {{},{},{},{}};
    System.out.println("Test cases for arrToString");
    System.out.println("Expected: " + Arrays.toString(arr0) + " Obtained: " + arrToString(arr0) + " Are these the same? : " + arrToString(arr0).equals(Arrays.toString(arr0)));
    System.out.println("Expected: " + Arrays.deepToString(arr1) + " Obtained: " + arrToString(arr1) + " Are these the same? : " + arrToString(arr1).equals(Arrays.toString(arr1)));
    System.out.println("Expected: " + Arrays.deepToString(arr2) + " Obtained: " + arrToString(arr2) + " Are these the same? : " + arrToString(arr2).equals(Arrays.toString(arr2)));
    System.out.println("Expected: " + Arrays.deepToString(arr3) + " Obtained: " + arrToString(arr3) + " Are these the same? : " + arrToString(arr3).equals(Arrays.toString(arr3)));
    System.out.println("Expected: " + Arrays.toString(arr4) + " Obtained: " + arrToString(arr4) + " Are these the same? : " + arrToString(arr4).equals(Arrays.toString(arr4)));
    int[][] arr5 = {{0,0,0}, {1,2,0}, {}};
    int[][] arr6 = {{}, {1,0,0}, {2,4}};
    System.out.println("Test cases for countZeros2D");
    System.out.println("Expected: 0 Obtained: " + countZeros2D(arr1));
    System.out.println("Expected: 0 Obtained: " + countZeros2D(arr3));
    System.out.println("Expected: 0 Obtained: " + countZeros2D(arr2));
    System.out.println("Expected: 4 Obtained: " + countZeros2D(arr5));
    System.out.println("Expected: 2 Obtained: " + countZeros2D(arr6));
    int[][] arr_0 = {{1, 2, 3, 4}};
    int[][] arr_1 = {{1, 2}, {3}};
    int[][] arr_2 = {{}, {}};
    int[][] arr_3 = {{}, {3}};
    System.out.println("Test cases for htmlTable");
    System.out.println("Expected: <table><tr><td>1</td><td>2</td><td>3</td><td>4</td></tr></table> Obtained: " + htmlTable(arr_0) + " Are they the same? :" + "<table><tr><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>".equals(htmlTable(arr_0)));
    System.out.println("Expected: <table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table> Obtained: " + htmlTable(arr_1) + " Are they the same? :" + "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>".equals(htmlTable(arr_1)));
    System.out.println("Expected: <table><tr></tr><tr></tr></table> Obtained: " + htmlTable(arr_2) + " Are they the same? :" + "<table><tr></tr><tr></tr></table>".equals(htmlTable(arr_2)));
    System.out.println("Expected: <table><tr></tr><tr><td>3</td></tr></table> Obtained: " + htmlTable(arr_3) + " Are they the same? :" + "<table><tr></tr><tr><td>3</td></tr></table>".equals(htmlTable(arr_3)));

  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
    String result = "[";
    for (int i = 0; i < ary.length; i++)
    {
      result += ary[i];
      if (i < ary.length - 1){
        result += ", ";
      }
    }
    return result + "]";
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
    String s = "[";
    for (int i = 0; i < ary.length; i++){
      s += arrToString(ary[i]);
      if (i < ary.length - 1){
        s += ", ";
      }
    }
    return s + "]";
    //this should use arrToString(int[])
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int count = 0;
    for (int i = 0; i < nums.length ; i++){
      for ( int j = 0; j <nums[i].length; j++){
        if (nums[i][j] == 0) count++ ;  
      }
    }
    return count;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
   public static int arr2DSum(int[][]nums){
      int answer = 0;
      for (int i = 0; i < nums.length; i++){
         for ( int j = 0; j < nums[i].length; j++){
   	answer += nums[i][j];
         }
       }
      return answer;
   }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
    for (int i = 0; i < vals.length ; i++)
    {
      for(int j =0 ; j < vals[i].length; j++)
      {
        if (vals[i][j] < 0){
          if (i == j){
            vals[i][j] = 1;
          }
          else {
            vals[i][j] = 0;
          }
        }
      }
    }
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[] copyHelper(int[] nums){
     int [] arr = new int [ nums.length];
     for ( int i = 0; i < nums.length; i++){
  	arr[i] = nums[i];
     }
    return arr;
  }
  public static int[][] copy(int[][] nums){
    int [][] arr = new int [nums.length][];
    for (int i =0; i < nums.length; i++){
  	int [] subarr = new int [nums[i].length];
  	for (int j = 0; j < nums[i].length; j++){
  	  subarr[j] = nums[i][j];
  	}
  	arr[i] = subarr;
     }
    return arr;
    }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int [][] arr = new int[nums[0].length][nums.length];
    for (int i = 0; i < arr.length; i++)
    {
        for(int j =0; j <arr[0].length; j++)
  	{
  	  arr[i][j] = nums[j][i];
  	}
    }
    return arr;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTablehelper(int[]nums){
    String answer = "<tr>";
    for (int i = 0; i < nums.length; i++)
    {
      answer = answer + "<td>" + nums[i] + "</td>";
    } 
    return answer + "</tr>";
  }

  public static String htmlTable(int[][]nums){
    String answer = "<table>";
    for (int i = 0; i < nums.length; i++){
      answer += htmlTablehelper(nums[i]);
    }
    return answer + "</table>";
  }
}
