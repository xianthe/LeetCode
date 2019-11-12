import java.util.*;
import java.io.*;

class Solution {
    /**
        int[] nums [2, 7, 11, 15]
        int target 9
        
        return[index of 2, index of 7]
        
        {2 = 0, 7 = 1, ... }
        {nums[i], i}
    **/
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> missingNums = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++)
        {
            // i = 1
            int missingNum = target - nums[i]; // 9 - 2
            
            if (missingNums.containsKey(missingNum)) // 7?
            {
                int[] answer = {missingNums.get(missingNum), i}; // 7's idx, i
                return answer;
            }
            else {
                Integer firstIndex = nums[i];
                Integer secondIndex = i;
                
                missingNums.put(firstIndex, secondIndex);
            }
        }     
        
        //return empty int[]
        return new int[]{};
    }
}

public class TwoSum {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }
    
        String result = "";
        for(int index = 0; index < length; index++) {
            int number = nums[index];
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static String integerArrayToString(int[] nums) {
        return integerArrayToString(nums, nums.length);
    }
    
    public static void main(String[] args) throws IOException {
        /**
         * for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                doSomething(line);
                }
         */
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println("line: " + line + " line: " + line.length());
            // if (line.length() == 1 && )
            // {
                int[] nums = stringToIntegerArray(line);

    
                line = in.readLine();
                int target = Integer.parseInt(line);
                
                int[] ret = new Solution().twoSum(nums, target);
                
                String out = integerArrayToString(ret);
                
                System.out.print(out);
            
            // }
            // else {
            //     break;
            // }
        }

    }
}
