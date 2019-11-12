public class PlusOneArray {
    
    private static int[] digits = {}; // {9,9,9}; {9} {} {1, 2, 3};

    //tests ???
    // test [9, 9, 9];
    // test[9]
    
    public static int[] plusOne(int[] digits) //-----------------------------
    {
        int lastIndex = digits.length - 1;
        boolean addOne = false;

        if (digits == null || digits.length == 0 || digits.length == 1){
            return digits;
        }

        for (int i = lastIndex; i >= 0; i--) {
            if (digits[i] == 9) {
                addOne = true;
                digits[i] = 0;
                continue;
            } 
            else {                
                digits[i]++;
                return digits;
            } 
        }

        int[] digitCopiedArray = new int[digits.length + 1];

        if (addOne){          
            
            System.arraycopy (digits, 0, digitCopiedArray, 0, digits.length);

            digitCopiedArray[0] = 1;
            return digitCopiedArray;
        }
        
        
        if (digits.length == 0)
        {
            digitCopiedArray[0] = 1;
            return digitCopiedArray;
        }
        
        return digits; 
    }

    public static void main(String[] args)
    {
        PlusOneArray plusOnedArray = new PlusOneArray();
        int[] digits = plusOnedArray.plusOne(plusOnedArray.getDigits());

        for (int digit : digits){
            System.out.println(digit);
        }
    }

    public static int[] getDigits()
    {
        return digits;
    }

    public static void setDigits(int[] digits)
    {
        digits = digits;
    }
}


/** 
* I/O
* 
* I : array of integer
* O : array of integers
* 
* Examples:
* Input: [1,2,3]  =>	Output: [1,2,4]
* Input: [1, 9]	=>	Output: [2,0]
* Input: [9,9,9]  =>  Output: [1,0,0,0]
* 
*
* Constraints:
* Time Complexity: O(N)]
* Auxiliary Space Complexity: O(1)

*/



