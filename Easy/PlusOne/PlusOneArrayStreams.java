import java.util.*;

//class Solution {
class PlusOneArrayStreams{
    //[1, 2, 3] => [1, 2, 4]
    //[9, 9, 9] => [1, 0 , 0, 0]
    public int[] plusOne(int[] digits) {
       // work through array backward (last digit first)
       // add this digit * multiple value (starting with 1) in an int value (tempSum)     
       
       int multiple = 1;
       List<Integer> result = new ArrayList<Integer>();
       int i = digits.length - 1;
       int tempSum = 0;
        
        while (i >= 0)
        {
            // add this digit * multiple value (starting with 1) in an int value (tempSum)
            tempSum += digits[i] * multiple;
            // increment the multiple value by 10
            multiple *= 10;
            i--;
        }
        
        // add one to temp sum
        tempSum++; //tempsum 124
        
        // parse this number back into an int array
        System.out.println(result);
        // stream result to characters map each to int value and return an array
        return Integer.toString(tempSum)
                      .chars()
                      .map(j -> j - '0')
                      .toArray();
    }

/** fix leetcode setup code */
public static void main(String[] args) throws Exception {
    Map<String, PlusOneArrayStreams> methods = Arrays.stream(AllOne.class.getDeclaredMethods())
            .collect(Collectors.toMap(Method::getName, Function.identity()));

    AllOne instance = new AllOne();

    // Copy/paste the input here. If the text is to big, you can read a file instead.
    String input = "[\"1\",\"2\",\"3\"]\n" +
            "[[],[],[]]";
    int ind = input.indexOf('\n'); //get limit between method names and parameters
    String[] instructions = trim(input.substring(0, ind),1).split(",");
    String[] params = trim(input.substring(ind + 1), 1).split(",");

    for (int i = 1; i < instructions.length; i++) {
        String instruction = trim(instructions[i], 1);
        Method method = methods.get(instruction);
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length == 0) {
            method.invoke(instance);
        } else {
            String val = trim(params[i], 2);
            method.invoke(instance, val);
        }
    }
}

public static String trim(String s, int trimSize){
    return s.substring(1, s.length()-trimSize);
}

}
