public class MyArrays{
  public static void main(String[] args){
    // Test cases for return copy:
    int[] array1 = new  int[]{7,8,9};
    int[] array2 = new  int[]{};
    int[] array3 = new  int[]{0,0, 2,5,6};
    System.out.print("Original array:" + array1 + "New array" + returnCopy(array1)+ "Are the values equal:" + arrayToString(array1).equals(arrayToString(returnCopy(array1))));
    System.out.print("Original array:" + array2 + "New array" + returnCopy(array2)+ "Are the values equal:" + arrayToString(array2).equals(arrayToString(returnCopy(array2))));
    System.out.print("Original array:" + array3 + "New array" + returnCopy(array3)+ "Are the values equal:" + arrayToString(array3).equals(arrayToString(returnCopy(array3))));

  }
  public static String arrayToString(int[] nums){
    String result = "[";
    for (int i = 0; i < nums.length; i++)
    {
      result += nums[i];
      if (i < nums.length - 1){
        result += ", ";
      }
    }
    return result
  }
  public static int[] returnCopy(int[]ary)
  { int[] ans = new int[ary.length];
    for( int i = 0; i < ary.length; i++)
    {
      ans[i] = ary[i];
    }
    return ans; 
  }
}
