/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pallindrome_check;

/**
 *
 * @author lima
 */
public class String_Pallindrome_Check {
    
    String str="mum";
        String str1="mum";
    char[] ch1=new char[str.length()];
    int i=0;
    int len1=str.length();
    int j=str1.length()-1,f=1;
    char ch;
    char ch2;
    int pallindrome_check()
    {
            
           
            if(str.charAt(i)==str1.charAt(j) && i<3)
            {
          
                i++;
            j--;
            pallindrome_check();
    }
            return 10;
}
}
