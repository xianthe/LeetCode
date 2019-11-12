// package whatever; // don't place package name!

/*
Valerie's Interview Pad 

Guidelines:
1. You (or I) can google syntax/libraries that
you would like to use for each problem.
2. Try to pseudocode before coding.
3. Explain your thought process as much
as you can.
4. Feel free to ask clarifying questions about the problem.



constructNote(note, letters) - Given a note string,
and a letter string containing available characters,
return whether the note can be constructed from the available letters.

Space complexity: No constraints
Time complexity: No constraints

Example:
(note)  (letters)
banana, baannn -> false
noon, nnooookk ->   true

*/

import java.io.*;
import java.util.*;

// https://medium.com/outco

class Outco {

public static boolean constructNote( String input, String test)
{

    boolean answer = false;
    HashMap<Character, Integer> inputHash = new HashMap<Character, Integer>();
    HashMap<Character, Integer> testHash = new HashMap<Character, Integer>();

    char[] charsInput = input.toCharArray();
    char[] charsTest = test.toCharArray();

    for (Character in : charsInput)
    {
        if (inputHash.containsKey(in))
        {   
            int count = inputHash.get(in) + 1;
            inputHash.put(in, inputHash.get(in) + count);
            System.out.println("in: " + in + " count: " + count);
        }
        else { inputHash.put(in, 1); 
        System.out.println ("added : " + in );
        }

    
    }

    for (Character tested : charsTest)
  {
       if (testHash.containsKey(tested))
        {   
            int count = testHash.get(tested) + 1;
            testHash.put(tested, testHash.get(tested) + count);
            System.out.println("tested: " + tested + " count: " + count);
        }
        else { }
            testHash.put(tested, 1);

    }

    for (Character found : inputHash.keySet())
    {   
        //found input
        //tested testHash
        if (testHash.containsKey(found))
        {
            if (testHash.get(found) >= inputHash.get(found)){
                answer = true;
            }
            else {
                answer = false;
                break;
            }                
        }
    }
    
    //lost audio
    //dialing back in
        

    return answer;
}

  public static void main (String[] args) {
		//System.out.println("Hello Java");
    String testNote = "noon"; 
    String testLetters = "nnooookk"; 
    System.out.println(constructNote(testNote, testLetters));
	
	}
}



