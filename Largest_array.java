/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
public class Largest_array 
{
  public static void main(String[] args) 
  {
    int a[] = new int[] { 12, 44, 23, 56, 23, 78, 13 };
    int max = a[0];
    int index = 0;
    for (int i = 0; i < a.length; i++) 
    {
      if (max < a[i]) 
      {
        max = a[i];
        System.out.println(max);
        index = i;
      }
    }
    System.out.println("Index position of Maximum value in an array is  :  " + index);
} 
}