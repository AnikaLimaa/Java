/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary_search_with_recursion;

/**
 *
 * @author lima
 */
public class Binary_Search_WIth_Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Binary_Search_Pari_nah ob=new Binary_Search_Pari_nah();
        int r=ob.binary_Search_Fun(0, 11, 16);
        System.out.println(r);
        if(r==-1)
        {
            System.out.println("Not Found");
        }
        else
            
        {
            System.out.println("Found!");
        }
    }
    
}
