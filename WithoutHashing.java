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
import java.io.*;
public class WithoutHashing
{
    public static void main(String[] args) throws IOException
    {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   	String test =br.readLine();
	String duplicate[]=duplicatemethod(test);
        for(String i:duplicate)
        {
            if (i!=null)
                System.out.println(i);
        }
    }
    Each function should have function header as below.
/**************************************************************************
* Function name: duplicatemethod
* Purpose: finding duplicate words in a given string
* Inputs: it is is it now cannot cnnot cannto cannot 
* Outputs:it                                                                                                                                                                              
          is                                                                                                                                                                              
          cannot 
* Limitation if any:
*************************************************************************/
    public static String[] duplicatemethod(String input)
    {
        String words[]=input.split("\\s+");
        int len=words.length;
        String result[]=new String[len];
        int c=0;
        for(int i=0;i<len;i++)
        {
            int count=0;
            for(int j=i+1;j<len;j++)
            {
                if(words[i].equals(words[j]))
                {
                    count++;
                    words[j]="";                
                    
                }
            }
            if(count>=1 && words[i]!="")
            {
                result[c]=words[i];
                c++;
                
            }
        }
        return result;
        
        
    }
}