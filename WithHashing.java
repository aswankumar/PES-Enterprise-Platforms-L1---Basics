/**************************************************************************
* Assignment Title: Finding Duplicate Words with Hashing
* Assignment Description: 
* Algorithmic steps / Design in brief: Taking HashSet in Collections, and checking if it has duplicate values
* Limitation if any:
 * Date of last update: 21/10/2016
*
* Author details: Aswanikumar Yandava
 * emp number:     342377
 * name: Aswanikumar Yandava
* email:aswanikumar.yandava@wipro.com
*************************************************************************/
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.io.*;

public class WithHashing
{
    public static void main(String[] args) throws IOException
    {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String test =br.readLine();
    Set<String> duplicates = duplicateWords(test);
    System.out.println("input : " + test);
    System.out.println("output : " + duplicates);
    }
    Each function should have function header as below.
/**************************************************************************
* Function name: duplicateWords
* Purpose: finding duplicate words in given string with the help of HashSet
* Inputs: this is the first time time first the is this with 
* Outputs: [the, this, is, time, first]
* Limitation if any:
*************************************************************************/
    public static Set<String> duplicateWords(String input)
    {
        if(input == null || input.isEmpty())
        
        {
            
            return Collections.emptySet(); 
            
        } 
        
        Set<String> duplicates = new HashSet<>(); 
        
        String[] words = input.split("\\s+");
        
        Set<String> set = new HashSet<>();
        
        for(String word : words)
        
        { 
            if(!set.add(word))
            { 
                duplicates.add(word);
            }
        }
        return duplicates; 
        
    }
}