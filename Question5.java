import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int len = in.nextInt();
    int[] nums = new int[len];

    for (int i = 0; i < len; i++){
      int num = in.nextInt();
      nums[i] = num;
    }

    int mode = 0;
    int count = 0;

    for (int i : nums){
      int tmp_count = 0;
      if (mode != i){
        for (int j : nums){
          if (i == j){
            tmp_count++;
          }
        }
        if (tmp_count > count){
          mode = i;
          count = tmp_count;
        }
      }
    }
    System.out.println(mode);
  }
}
